package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;

/**
 *
 * @author Hannu
 */
public class Aritmetiikkakone {

//    Tehtava ekaYhteenlaskuTehtava;
    private Tehtava tehtava;
    private Laskutoimitustehdas laskutoimitustehdas;

    public Aritmetiikkakone() {
        this.laskutoimitustehdas = new Laskutoimitustehdas();
    }

//    public void luoTehtava(Laskutoimitus laskutoimitus) {
//        this.tehtava = new Tehtava(laskutoimitus);
//    }
    
    public void luoTehtava(String tyyppi) {
        this.tehtava = new Tehtava(this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi));
    }
    
    public Tehtava getTehtava(){
        return this.tehtava;
    }
}
