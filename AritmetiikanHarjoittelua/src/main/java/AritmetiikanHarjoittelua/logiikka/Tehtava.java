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

    private String oikeaVastaus() {
        return Integer.toString(this.laskutoimitus.laske());
//        POISTA (<- tägi) mahdollinen laajennus
//        return Double.toString(this.laskutoimitus.laske());
    }

    public boolean onOikein(String vastaus) {
        if (this.oikeaVastaus().equals(vastaus)) {
            return true;
        }
        return false;
    }
}
