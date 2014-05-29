package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;
import AritmetiikanHarjoittelua.logiikka.Laskutoimitustehdas;

public class Tehtava {

    private Laskutoimitus laskutoimitus;

    public Tehtava(Laskutoimitus laskutoimitus) {
        this.laskutoimitus = laskutoimitus;
    }
    
    public String tekstina(){
        return "Laske: " + this.laskutoimitus.tekstina();
    }

    public String oikeaVastaus() {
        return Integer.toString(this.laskutoimitus.laske());
//        POISTA (<- tägi) mahdollinen laajennus
//        return Double.toString(this.laskutoimitus.laske());
    }
}
