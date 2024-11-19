package artur.sklep;

/**
 * @file Osoba.java
 * @brief Klasa reprezentująca osobę.
 */

import java.time.LocalDate;

public class Osoba implements Comparable<Osoba> {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    /**
     * Konstruktor klasy Osoba.
     * 
     * @param imie         Imię osoby.
     * @param nazwisko     Nazwisko osoby.
     * @param rokUrodzenia Rok urodzenia osoby.
     */
    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    /**
     * Oblicza wiek osoby na podstawie bieżącego roku.
     * 
     * @return Wiek osoby.
     */
    private int obliczWiek() {
        return LocalDate.now().getYear() - rokUrodzenia;
    }

    /**
     * Zwraca dane osoby w formie tekstowej.
     * 
     * @return Dane osoby.
     */
    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + obliczWiek() + " lat)";
    }

    /**
     * Porównuje osoby na podstawie wieku, nazwiska i imienia.
     * 
     * @param o Druga osoba do porównania.
     * @return Wartość określająca porządek.
     */
    @Override
    public int compareTo(Osoba o) {
        int compareWiek = Integer.compare(obliczWiek(), o.obliczWiek());
        if (compareWiek != 0)
            return compareWiek;
        int compareNazwisko = nazwisko.compareTo(o.nazwisko);
        if (compareNazwisko != 0)
            return compareNazwisko;
        return imie.compareTo(o.imie);
    }
}
