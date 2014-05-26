package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;

/**
 *
 * @author Hannu
 */
public class Harjoittelu {

//    Tehtava ekaYhteenlaskuTehtava;
    private Tehtava tehtava;

    public Harjoittelu() {
    }

    public void luoTehtava(Laskutoimitus laskutoimitus) {
        this.tehtava = new Tehtava(laskutoimitus);
    }
    
    public Tehtava getTehtava(){
        return this.tehtava;
    }
}
