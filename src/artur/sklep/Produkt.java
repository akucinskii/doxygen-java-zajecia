package artur.sklep;

/**
 * @class Produkt
 * @brief Reprezentuje produkt z nazwą, opisem i ceną.
 *
 *        Klasa Produkt służy jako klasa bazowa dla różnych typów produktów w
 *        systemie. Przechowuje podstawowe
 *        atrybuty wspólne dla wszystkich produktów, takie jak nazwa, opis i
 *        cena.
 */
public abstract class Produkt {

    /**
     * @brief Nazwa produktu.
     */
    private final String nazwa;

    /**
     * @brief Opis produktu.
     */
    private final String opis;

    /**
     * @brief Cena produktu.
     */
    private final double cena;

    /**
     * @brief Tworzy nowy obiekt Produkt z określoną nazwą, opisem i ceną.
     *
     * @param nazwa Nazwa produktu.
     * @param opis  Krótki opis produktu.
     * @param cena  Cena produktu.
     */
    public Produkt(String nazwa, String opis, double cena) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
    }

    /**
     * @brief Zwraca tekstową reprezentację produktu, zawierającą jego nazwę, opis i
     *        cenę.
     *
     * @return Ciąg znaków zawierający nazwę, opis i cenę produktu.
     */
    @Override
    public String toString() {
        return "Produkt: " + nazwa + ", opis: " + opis + ", cena: " + cena;
    }

    /**
     * @brief Pobiera nazwę produktu.
     *
     * @return Nazwa produktu.
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * @brief Pobiera opis produktu.
     *
     * @return Opis produktu.
     */
    public String getOpis() {
        return opis;
    }

    /**
     * @brief Pobiera cenę produktu.
     *
     * @return Cena produktu.
     */
    public double getCena() {
        return cena;
    }
}