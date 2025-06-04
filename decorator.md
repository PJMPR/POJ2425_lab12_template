# Wzorzec projektowy: Dekorator

## 🎯 Cel wzorca

Wzorzec **Dekorator** umożliwia dynamiczne dodawanie nowych funkcjonalności do obiektów, bez potrzeby zmieniania ich kodu źródłowego. Pozwala to uniknąć tworzenia dużej liczby klas dziedziczących tylko po to, by wprowadzić drobne zmiany w zachowaniu.

---

## 🧱 Kiedy stosować

* Gdy chcesz dodać nowe zachowania do obiektu w sposób dynamiczny (w czasie działania programu).
* Gdy nie możesz zmieniać oryginalnej klasy (np. pochodzi z biblioteki zewnętrznej).
* Gdy masz wiele kombinacji rozszerzeń i nie chcesz tworzyć dziesiątek klas pochodnych.

---

## 🧩 Struktura wzorca

* **Komponent (interfejs/abstrakcja)** – definiuje wspólny interfejs dla obiektów, które można dekorować.
* **Konkretny komponent** – klasa, której funkcjonalność może być rozszerzana.
* **Dekorator (abstrakcyjna klasa)** – zawiera referencję do komponentu i implementuje ten sam interfejs.
* **Konkretny dekorator** – dodaje nowe zachowanie przed lub po wywołaniu metody komponentu.

---

## 🧪 Przykład: napoje w kawiarni ☕

Załóżmy, że projektujemy system do zamawiania napojów w kawiarni. Klient może wybrać napój bazowy i dodać różne dodatki (np. mleko, cukier, syrop).

### Przykładowe komponenty:

* `Napój` – interfejs z metodą `double koszt()`.
* `Espresso`, `Herbata` – konkretne klasy implementujące `Napój`.

### Dekoratory:

* `DodatkiDecorator` – abstrakcyjna klasa implementująca `Napój` i przechowująca referencję do innego napoju.
* `Mleko`, `Cukier`, `Syrop` – konkretne dekoratory zwiększające koszt napoju.

### Przykład użycia:

#### `Beverage` – interfejs komponentu

Reprezentuje dowolny napój. Definiuje dwie metody: `cost()` zwracającą koszt oraz `description()` zwracającą opis.

```java
public interface Beverage {
    double cost();
    String description();
}
```

#### `Espresso` – konkretny komponent

Implementuje podstawowy napój – espresso. Zwraca stałą cenę i nazwę.

```java
public class Espresso implements Beverage {
    public double cost() {
        return 6.00;
    }
    public String description() {
        return "Espresso";
    }
}
```

#### `AddOnDecorator` – abstrakcyjny dekorator

Służy jako baza dla wszystkich dekoratorów. Przechowuje referencję do innego napoju.

```java
public abstract class AddOnDecorator implements Beverage {
    protected Beverage beverage;

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
```

#### `Milk` – konkretny dekorator

Dodaje mleko do napoju, zwiększa koszt o 1 zł i aktualizuje opis.

```java
public class Milk extends AddOnDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    public double cost() {
        return beverage.cost() + 1.00;
    }
    public String description() {
        return beverage.description() + ", milk";
    }
}
```

#### `Syrup` – konkretny dekorator

Dodaje syrop do napoju, zwiększa koszt o 1.5 zł i aktualizuje opis.

```java
public class Syrup extends AddOnDecorator {
    public Syrup(Beverage beverage) {
        super(beverage);
    }
    public double cost() {
        return beverage.cost() + 1.50;
    }
    public String description() {
        return beverage.description() + ", syrup";
    }
}
```

#### `Cafe` – klasa testowa

Tworzy zamówienie: espresso z mlekiem i syropem. Wyświetla opis oraz koszt.

```java
public class Cafe {
    public static void main(String[] args) {
        Beverage order = new Espresso();
        order = new Milk(order);
        order = new Syrup(order);

        System.out.println("Order: " + order.description());
        System.out.println("Total cost: " + order.cost() + " zł");
    }
}
```

**Expected console output:**

```
Order: Espresso, milk, syrup
Total cost: 8.5 zł
```

Poniżej przykładowa implementacja w języku Java:

```java
public interface Beverage {
    double cost();
    String description();
}

public class Espresso implements Beverage {
    public double cost() {
        return 6.00;
    }
    public String description() {
        return "Espresso";
    }
}

public abstract class AddOnDecorator implements Beverage {
    protected Beverage beverage;

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

public class Milk extends AddOnDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    public double cost() {
        return beverage.cost() + 1.00;
    }
    public String description() {
        return beverage.description() + ", milk";
    }
}

public class Syrup extends AddOnDecorator {
    public Syrup(Beverage beverage) {
        super(beverage);
    }
    public double cost() {
        return beverage.cost() + 1.50;
    }
    public String description() {
        return beverage.description() + ", syrup";
    }
}

public class Cafe {
    public static void main(String[] args) {
        Beverage order = new Espresso();
        order = new Milk(order);
        order = new Syrup(order);

        System.out.println("Order: " + order.description());
        System.out.println("Total cost: " + order.cost() + " zł");
    }
}
```

**Expected console output:**

```
Order: Espresso, milk, syrup
Total cost: 8.5 zł
```

Zamówienie: Espresso z mlekiem i syropem.
System tworzy obiekt `Espresso`, a następnie owija go dekoratorami `Mleko` i `Syrop`, tworząc łańcuch obiektów.

W efekcie wywołanie `koszt()` działa kaskadowo przez dekoratory, każdy z nich dodaje coś od siebie.

---

## ✅ Zalety

* Dynamiczne dodawanie funkcjonalności.
* Unikanie nadmiarowego dziedziczenia.
* Kompozycja zamiast dziedziczenia – bardziej elastyczne projektowanie.

## ⚠️ Wady

* Trudniejsza debugowalność (wiele małych klas owiniętych wokół siebie).
* Wzrost liczby klas.

---

