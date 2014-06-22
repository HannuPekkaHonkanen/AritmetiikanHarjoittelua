package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;
import AritmetiikanHarjoittelua.logiikka.Laskutoimitustehdas;

/**
 * Luokkassa luodaan tehtävänanto tekstinä.
 */
public class Tehtava {

    private Laskutoimitus laskutoimitus;

    public Tehtava(Laskutoimitus laskutoimitus) {
        this.laskutoimitus = laskutoimitus;
    }

    /**
     * Metodi palauttaa sanallisen tehtävänannon String-tyyppisenä.
     */
    public String tekstina() {
        return "Laske: " + this.laskutoimitus.tekstina();
    }

/**
 * Metodi palauttaa tehtävän oikean vastauksen tekstinä.
 */
    public String oikeaVastaus() {
        return Integer.toString(this.laskutoimitus.laske());
    }

/**
 * Metodi tarkistaa tehtävän laskutoimitukseen annetun vastauksen.
 */
    public boolean onOikein(String vastaus) {
        if (this.oikeaVastaus().equals(vastaus)) {
            return true;
        }
        return false;
    }
}
