package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmailApp {
    public static void main(String[] args) {

        /*
         * PRZYPADEK 1: Prosta wiadomość z nagłówkiem i stopką
         * Zadanie:
         * - Zaimplementuj klasę EmailBuilder, która umożliwia ustawienie tematu, treści i stopki.
         * - Zaimplementuj klasę Email z odpowiednimi getterami (getSubject(), getBody(), getFooter()).
         */
//        IBuildEmail emailBuilder = new EmailBuilder();
//        Email email1 = emailBuilder
//                .setSubject("Witaj!")
//                .setBody("To jest prosty e-mail testowy.")
//                .setFooter("Zespół Testowy")
//                .build();
//
//        EmailSender sender1 = new BasicEmailSender();
//        System.out.println("\n--- Przypadek 1: Basic + Footer ---");
//        sender1.send(email1);
//
//        if (email1.getFooter() != null && email1.getFooter().contains("Zespół")) {
//            System.out.println("✅ Stopka została dodana");
//        } else {
//            System.out.println("❌ Brak stopki");
//        }

        /*
         * PRZYPADEK 2: Wiadomość z załącznikami i logowaniem
         * Zadanie:
         * - Dodaj do EmailBuilder metodę addAttachment(String).
         * - W klasie Email przechowuj listę załączników.
         * - Zaimplementuj dekorator LoggingDecorator, który loguje wysyłkę.
         */
//        Email email2 = new EmailBuilder()
//                .setSubject("Dokumentacja projektu")
//                .setBody("W załączniku znajdziesz wymagane pliki.")
//                .addAttachment("specyfikacja.pdf")
//                .addAttachment("diagram.png")
//                .build();
//
//        EmailSender sender2 = new BasicEmailSender();
//        sender2 = new LoggingDecorator(sender2);
//        System.out.println("\n--- Przypadek 2: Logging + Attachments ---");
//        sender2.send(email2);
//
//        if (email2.getAttachments().size() == 2) {
//            System.out.println("✅ Załączniki zostały dodane");
//        } else {
//            System.out.println("❌ Błąd w załącznikach");
//        }

        /*
         * PRZYPADEK 3: Szyfrowanie + podgląd + stopka
         * Zadanie:
         * - Zaimplementuj dekorator EncryptionDecorator, który zaszyfruje treść e-maila (np. odwróci stringa).
         * - Zaimplementuj dekorator PreviewDecorator, który wyświetli HTML-preview treści.
         * - Sprawdź czy treść zaczyna się od "[SZYFROWANE]".
         */
//        Email email3 = new EmailBuilder()
//                .setSubject("Poufna wiadomość")
//                .setBody("Hasło: 12345678")
//                .setFooter("Do użytku wewnętrznego")
//                .build();
//
//        EmailSender sender3 = new BasicEmailSender();
//        sender3 = new EncryptionDecorator(sender3);
//        sender3 = new PreviewDecorator(sender3);
//        System.out.println("\n--- Przypadek 3: Encryption + Preview + Footer ---");
//        sender3.send(email3);
//
//        if (email3.getBody().startsWith("[SZYFROWANE]")) {
//            System.out.println("✅ Treść została zaszyfrowana");
//        } else {
//            System.out.println("❌ Treść nie została zaszyfrowana");
//        }

        /*
         * PRZYPADEK 4: Pełna kombinacja dekoratorów
         * Zadanie:
         * - Połącz dekoratory LoggingDecorator, TrackingDecorator, EncryptionDecorator, PreviewDecorator.
         * - Upewnij się, że wiadomość zawiera dodany załącznik.
         */
//        Email email4 = new EmailBuilder()
//                .setSubject("Raport miesięczny")
//                .setBody("W załączniku znajduje się raport sprzedaży.")
//                .setFooter("Dział Finansów")
//                .addAttachment("raport.pdf")
//                .build();
//
//        EmailSender sender4 = new BasicEmailSender();
//        sender4 = new LoggingDecorator(sender4);
//        sender4 = new TrackingDecorator(sender4);
//        sender4 = new EncryptionDecorator(sender4);
//        sender4 = new PreviewDecorator(sender4);
//        System.out.println("\n--- Przypadek 4: Full pipeline ---");
//        sender4.send(email4);
//
//        if (email4.getAttachments().contains("raport.pdf")) {
//            System.out.println("✅ Załącznik 'raport.pdf' obecny");
//        } else {
//            System.out.println("❌ Brak oczekiwanego załącznika");
//        }
    }
}
