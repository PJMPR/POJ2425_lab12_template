# 🧠 Wprowadzenie do Inversion of Control (IoC) i Dependency Injection (DI)

---

## 🔍 Co to jest Inversion of Control?

**Inversion of Control (IoC)** to zasada projektowania, która oznacza "odwrócenie sterowania". W tradycyjnym programowaniu to nasz kod tworzy i zarządza wszystkimi zależnościami (np. tworzy obiekty klas, konfiguruje ich współpracę). W podejściu IoC odpowiedzialność za te zadania **przekazujemy zewnętrznemu mechanizmowi** – np. kontenerowi IoC.

👉 Innymi słowy: **to nie my sterujemy przepływem zależności, ale one są dostarczane z zewnątrz.**

---

## 💡 Przykład klasyczny (bez IoC)

```java
public class Client {
    private Service service;

    public Client() {
        this.service = new ServiceA(); // zależność tworzona wewnątrz klasy
    }
}
```

W tym przykładzie `Client` **sam tworzy swoją zależność** – konkretną implementację `Service`.
To oznacza, że `Client`:

* zależy od konkretnej klasy,
* jest trudny do przetestowania i modyfikacji.

---

## 🔄 Przykład z IoC (wstrzykiwanie zależności)

```java
public class Client {
    private Service service;

    public Client(Service service) {
        this.service = service; // zależność przekazywana z zewnątrz
    }
}
```

Tutaj `Client` **nie tworzy samodzielnie `Service`**, ale otrzymuje go z zewnątrz – np. od kontenera lub innej części programu.
To podejście nazywa się **Dependency Injection**.

---

## 🧩 Dependency Injection (DI) – czyli wstrzykiwanie zależności

**Dependency Injection** to jedna z technik realizacji IoC. Polega na dostarczaniu zależności do obiektów (np. przez konstruktor).

Zalety DI:

* 🔄 łatwa podmiana implementacji,
* 🧪 łatwe testowanie (np. z użyciem tzw. mocków),
* 🔧 większa elastyczność i luźne powiązania między klasami,
* ♻️ możliwość tworzenia wielokrotnego użycia komponentów.

---

## 🧱 Co to jest kontener IoC?

Aby zarządzać zależnościami w większej aplikacji, często stosuje się tzw. **kontener IoC** (czasem nazywany rejestrem). Jest to specjalna klasa, która:

* przechowuje informacje o tym, jak tworzyć poszczególne komponenty,
* pozwala je "rejestrować" pod unikalnymi nazwami lub aliasami,
* tworzy instancje komponentów na żądanie,
* dba o to, żeby zależności były dostarczane w odpowiedni sposób (np. przez konstruktor).

Można powiedzieć, że kontener IoC to **centrum dowodzenia tworzeniem obiektów** w naszej aplikacji.

W tym projekcie zbudujemy bardzo uproszczoną wersję takiego kontenera.

---

## 🧰 Jak to się ma do tego laboratorium?

W tym zadaniu:

* stworzymy prosty kontener IoC,
* użyjemy **Dependency Injection przez konstruktor**, bez refleksji ani frameworków,
* nauczymy się rejestrować komponenty i tworzyć ich instancje z zależnościami,
* poznamy podstawy pisania kodu modularnego i testowalnego.

---

## 🧪 Podsumowanie

| Pojęcie                    | Znaczenie                                                     |
| -------------------------- | ------------------------------------------------------------- |
| IoC (Inversion of Control) | Odwrócenie odpowiedzialności za tworzenie i łączenie obiektów |
| DI (Dependency Injection)  | Wstrzykiwanie zależności z zewnątrz (np. przez konstruktor)   |

To podejście leży u podstaw nowoczesnych frameworków takich jak Spring. My stworzymy jego minimalistyczną wersję! 💡

