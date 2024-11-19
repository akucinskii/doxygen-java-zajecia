package artur.sklep;

/**
 * @class Klient
 * @brief Reprezentuje klienta w systemie.
 *
 *        Klasa Klient przechowuje informacje o osobie, w tym jej imię,
 *        nazwisko, adres i adres e-mail.
 */
public class Klient {

    /**
     * @brief Imię klienta.
     */
    private final String imie;

    /**
     * @brief Nazwisko klienta.
     */
    private final String nazwisko;

    /**
     * @brief Adres klienta.
     */
    private final String adres;

    /**
     * @brief Adres e-mail klienta.
     */
    private final String email;

    /**
     * @brief Tworzy nowy obiekt Klient z podanymi danymi.
     *
     * @param imie     Imię klienta.
     * @param nazwisko Nazwisko klienta.
     * @param adres    Adres klienta.
     * @param email    Adres e-mail klienta.
     */
    public Klient(String imie, String nazwisko, String adres, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
    }

    /**
     * @brief Zwraca tekstową reprezentację klienta.
     *
     * @return Ciąg znaków zawierający pełne imię, nazwisko, adres i e-mail klienta.
     */
    @Override
    public String toString() {
        return "Klient: " + imie + " " + nazwisko + ", adres: " + adres + ", email: " + email;
    }

    /**
     * @brief Pobiera imię klienta.
     *
     * @return Imię klienta.
     */
    public String getImie() {
        return imie;
    }

    /**
     * @brief Pobiera nazwisko klienta.
     *
     * @return Nazwisko klienta.
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * @brief Pobiera adres klienta.
     *
     * @return Adres klienta.
     */
    public String getAdres() {
        return adres;
    }

    /**
     * @brief Pobiera adres e-mail klienta.
     *
     * @return Adres e-mail klienta.
     */
    public String getEmail() {
        return email;
    }
}
