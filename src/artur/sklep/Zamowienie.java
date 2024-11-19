package artur.sklep;

import java.util.Comparator;

/**
 * @class Zamowienie
 * @brief Klasa reprezentująca zamówienie z produktem, klientem oraz ilością.
 *
 *        Klasa ta implementuje interfejs Cloneable, umożliwiając klonowanie
 *        zamówienia, oraz zawiera klasę
 *        zagnieżdżoną ZamowieniePoCenieComparer, która porównuje zamówienia na
 *        podstawie ceny jednostkowej.
 */
public class Zamowienie implements Cloneable {

    private final Klient klient;
    private final Produkt produkt;
    private int ilosc;

    /**
     * Konstruktor klasy Zamowienie.
     *
     * @param klient  Klient składający zamówienie.
     * @param produkt Produkt, który został zamówiony.
     * @param ilosc   Ilość zamówionego produktu.
     */
    public Zamowienie(Klient klient, Produkt produkt, int ilosc) {
        this.klient = klient;
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    /**
     * Metoda do klonowania obiektu Zamowienie.
     *
     * @return Nowy obiekt Zamowienie, który jest kopią obecnego obiektu.
     */
    @Override
    public Zamowienie clone() {
        try {
            return (Zamowienie) super.clone(); // Wywołanie metody clone() z klasy Object
        } catch (CloneNotSupportedException e) {
            // Jeśli nie można sklonować, rzucamy RuntimeException
            throw new RuntimeException("Nie można sklonować obiektu Zamowienie", e);
        }
    }

    /**
     * Zwraca cenę jednostkową produktu w zamówieniu.
     *
     * @return Cena jednostkowa produktu.
     */
    public double getCenaJednostkowa() {
        return produkt.getCena();
    }

    /**
     * Zwraca pełną cenę zamówienia (ilość * cena jednostkowa).
     *
     * @return Cena całkowita zamówienia.
     */
    public double getCena() {
        return getCenaJednostkowa() * ilosc;
    }

    // Gettery
    public Klient getKlient() {
        return klient;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    /**
     * Ustawia nową ilość zamówionych produktów.
     *
     * @param ilosc Nowa ilość produktów w zamówieniu.
     */
    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Zamowienie: " + ilosc + " x " + produkt.getNazwa() + ", Klient: " + klient.getImie() + " "
                + klient.getNazwisko();
    }

    /**
     * Klasa zagnieżdżona, która implementuje Comparator i porównuje zamówienia na
     * podstawie ceny jednostkowej.
     */
    public static class ZamowieniePoCenieComparer implements Comparator<Zamowienie> {

        /**
         * Porównuje dwa obiekty Zamowienie na podstawie ceny jednostkowej.
         *
         * @param o1 Pierwsze zamówienie.
         * @param o2 Drugie zamówienie.
         * @return Liczba ujemna, zero lub dodatnia, w zależności od tego, czy cena o1
         *         jest mniejsza, równa, czy większa od ceny o2.
         */
        @Override
        public int compare(Zamowienie o1, Zamowienie o2) {
            return Double.compare(o1.getCenaJednostkowa(), o2.getCenaJednostkowa());
        }
    }
}
