package artur.sklep;

import java.util.Date;

/**
 * @class Ksiazka
 * @brief Reprezentuje produkt książkowy z dodatkowymi atrybutami, takimi jak
 *        autor i data publikacji.
 *
 *        Klasa Ksiazka rozszerza klasę Produkt, dodając specyficzne atrybuty i
 *        funkcjonalności dla książek.
 */
public class Ksiazka extends Produkt {

    /**
     * @brief Autor książki.
     */
    private final String autor;

    /**
     * @brief Data publikacji książki.
     */
    private final Date dataPublikacji;

    /**
     * @brief Konstruktor klasy Ksiazka.
     *
     * @param nazwa          Nazwa książki.
     * @param opis           Krótki opis książki.
     * @param cena           Cena książki.
     * @param autor          Autor książki.
     * @param dataPublikacji Data publikacji książki.
     */
    public Ksiazka(String nazwa, String opis, double cena, String autor, Date dataPublikacji) {
        super(nazwa, opis, cena);
        this.autor = autor;
        this.dataPublikacji = dataPublikacji;
    }

    /**
     * @brief Zwraca tekstową reprezentację książki.
     *
     * @return Ciąg znaków zawierający nazwę książki, autora, datę publikacji i
     *         cenę.
     */
    @Override
    public String toString() {
        return "Ksiazka: " + this.getNazwa() + ", autor: " + autor + ", dataPublikacji: " + dataPublikacji + ", cena: "
                + this.getCena();
    }

    /**
     * @brief Pobiera autora książki.
     *
     * @return Autor książki.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @brief Pobiera datę publikacji książki.
     *
     * @return Data publikacji książki.
     */
    public Date getDataPublikacji() {
        return dataPublikacji;
    }
}
