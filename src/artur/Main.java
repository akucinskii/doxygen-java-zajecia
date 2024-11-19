package artur;

import artur.sklep.*;
import java.util.*;

/**
 * @file Main.java
 * @brief Główna klasa programu do zarządzania klientami, książkami i zamówieniami.
 */

/**
 * @class Main
 * @brief Klasa główna zawierająca główną metodę do uruchomienia programu.
 */
public class Main {
    /**
     * @brief Główna metoda programu.
     * @param args Argumenty wiersza poleceń.
     */
    public static void main(String[] args) {
        // Tworzenie instancji klasy Klient
        Klient klient1 = new Klient("Jan", "Kowalski", "ul. Kwiatowa 15", "jan.kowalski@example.com");
        Klient klient2 = new Klient("Anna", "Nowak", "ul. Różana 7", "anna.nowak@example.com");

        // Tworzenie instancji klasy Ksiazka
        Ksiazka ksiazka1 = new Ksiazka("Java Programming", "Podręcznik do nauki Javy", 59.99, "John Doe", new Date());
        Ksiazka ksiazka2 = new Ksiazka("Effective Java", "Zaawansowane techniki programowania w Javie", 79.99,
                "Joshua Bloch", new Date());

        // Tworzenie instancji klasy Zamowienie
        Zamowienie zamowienie1 = new Zamowienie(klient1, ksiazka1, 2);
        Zamowienie zamowienie2 = new Zamowienie(klient2, ksiazka2, 1);

        // Wyświetlanie instancji
        System.out.println(klient1);
        System.out.println(klient2);
        System.out.println(ksiazka1);
        System.out.println(ksiazka2);
        System.out.println(zamowienie1);
        System.out.println(zamowienie2);

        // Tworzenie listy obiektów Osoba
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("Jan", "Kowalski", 1985));
        osoby.add(new Osoba("Anna", "Nowak", 1990));
        osoby.add(new Osoba("Piotr", "Zieliński", 1985));
        osoby.add(new Osoba("Maria", "Wiśniewska", 1980));

        // Sortowanie listy osób
        Collections.sort(osoby);

        // Wyświetlanie posortowanej listy osób
        System.out.println("\nPosortowana lista osób:");
        for (Osoba osoba : osoby) {
            System.out.println(osoba);
        }

        // Tworzenie listy zamówień
        List<Zamowienie> zamowienia = new ArrayList<>();
        zamowienia.add(zamowienie1);
        zamowienia.add(zamowienie2);

        // Sortowanie listy zamówień według ceny
        zamowienia.sort(new Zamowienie.ZamowieniePoCenieComparer());

        // Wyświetlanie posortowanej listy zamówień
        System.out.println("\nPosortowana lista zamówień:");
        for (Zamowienie zamowienie : zamowienia) {
            System.out.println(zamowienie);
        }

        // Klonowanie zamówienia
        Zamowienie zamowienieKlon = zamowienie1.clone();
        zamowienieKlon.setIlosc(5);

        // Wyświetlanie oryginału i kopii zamówienia
        System.out.println("\nOryginał zamówienia:");
        System.out.println(zamowienie1);
        System.out.println("Skopiowane zamówienie:");
        System.out.println(zamowienieKlon);
    }
}