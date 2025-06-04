# 🧪 Laboratorium: Mini IoC Container w Java&#x20;

---

## 🎯 Cel

Celem laboratorium jest implementacja prostego kontenera Inversion of Control (IoC), który umożliwia rejestrację komponentów oraz tworzenie ich instancji wraz ze wstrzykiwaniem zależności. Projekt ma na celu naukę:

* 🧩 projektowania kodu z wykorzystaniem wzorca Dependency Injection,
* ✅ tworzenia i czytania testów jednostkowych (TDD),
* 🛠️ pracy z projektami Maven,
* 🧪 pracy z testami JUnit 5.

---

## 🧱 Struktura zadania (etapy pracy)

### 🔹 Krok 1: `ServiceA`

1. ✍️ Utwórz interfejs `Service` z metodą `String serve()`.
2. 🔨 Zaimplementuj klasę `ServiceA`, która zwraca "ServiceA".
3. ▶️ Uruchom test `ServiceATest`.

### 🔹 Krok 2: `Client`

1. ✍️ Utwórz klasę `Client`, która przyjmuje `Service` w konstruktorze.
2. 🔁 Zaimplementuj metodę `doWork()`, która zwraca wynik `service.serve()`.
3. ▶️ Uruchom test `ClientTest`.

### 🔹 Krok 3: `Factory` i `ServiceAFactory`

1. ✍️ Utwórz interfejs `Factory` z metodą `Object create()`.
2. 🏭 Utwórz klasę `ServiceAFactory`, która tworzy instancję `ServiceA`.
3. ▶️ Uruchom test `ServiceAFactoryTest`.

### 🔹 Krok 4: `IoCContainer` (rejestracja i rozwiązywanie)

1. ✍️ Utwórz klasę `IoCContainer` z metodami:

   * `void register(String name, Factory factory)`
   * `Object resolve(String name)`
2. 🧠 Zaimplementuj prostą mapę rejestracji i logikę tworzenia obiektu przez fabrykę.
3. ▶️ Uruchom test `IoCContainerTest.shouldResolveRegisteredComponent`.

### 🔹 Krok 5: `ClientFactory`

1. ✍️ Utwórz klasę `ClientFactory`, która przyjmuje `IoCContainer`.
2. 🧩 W metodzie `create()` pobierz z kontenera komponent `"service"` i utwórz `Client`.
3. ▶️ Uruchom test `ClientFactoryTest`.

### 🔹 Krok 6: Integracja kontenera

1. 🔗 Zarejestruj `ServiceAFactory` i `ClientFactory` w `IoCContainer`.
2. 🧪 Rozwiąż komponent `"client"` i sprawdź, czy zależność została poprawnie wstrzyknięta.
3. ▶️ Uruchom test `IoCContainerTest.shouldInjectDependencyIntoClient`.

### 🔹 Krok 7: Obsługa błędów

1. ⚠️ W `resolve()` dodaj walidację obecności komponentu w rejestrze.
2. 🚫 Rzuć `IllegalArgumentException`, jeśli komponent nie istnieje.
3. ▶️ Uruchom test `IoCContainerTest.shouldThrowIfComponentNotFound`.

---

## 🚀 Uruchamianie testów

### 💻 Przez terminal (Maven)

```bash
mvn test
```

### 🧠 Przez IntelliJ IDEA

Kliknij zieloną strzałkę obok metody testowej, aby uruchomić pojedynczy test.

---



