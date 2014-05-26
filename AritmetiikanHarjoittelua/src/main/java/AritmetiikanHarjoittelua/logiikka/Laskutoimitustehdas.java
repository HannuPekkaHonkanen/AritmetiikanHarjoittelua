package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

/**
 *
 * @author Hannu
 */
public class Laskutoimitustehdas {

    private Laskutoimitus laskutoimitus;

    public Laskutoimitus uusiLaskutoimitus(String tyyppi) {
//        y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku
        if (tyyppi.equalsIgnoreCase("y") || tyyppi.equalsIgnoreCase("Y")) {
            this.laskutoimitus = new Summa();
        } else if (tyyppi.equalsIgnoreCase("v") || tyyppi.equalsIgnoreCase("V")) {
            this.laskutoimitus = new Erotus();
        } else if (tyyppi.equalsIgnoreCase("k") || tyyppi.equalsIgnoreCase("K")) {
            this.laskutoimitus = new Tulo();
        } else if (tyyppi.equalsIgnoreCase("j") || tyyppi.equalsIgnoreCase("J")) {
            this.laskutoimitus = new Osamaara();
        } else {
            System.out.println("VIRHE laskutoimistustehdas 1");
        }

        arvoLuvut();
//        arvoLuvutTestNolla();

        while (!this.laskutoimitus.luvutOvatKelvolliset()) {
            System.out.println("VIRHE TEST luvut eivät kelvolliset -> luvut arvotaan uudestaan");
            arvoLuvut();
        }

        return this.laskutoimitus;
    }

    private void arvoLuvut() {
        Arpoja arpoja = new Arpoja();

        int luku1 = arpoja.kokonaisluku();
        int luku2 = arpoja.kokonaisluku();

        this.laskutoimitus.setLuku1(luku1);
        this.laskutoimitus.setLuku2(luku2);
    }
//    public void arvoLuvutTestNolla() {
////        TESTI
//        Arpoja arpoja = new Arpoja();
//
//        int luku1 = arpoja.kokonaisluku();
////        int luku2 = arpoja.kokonaisluku();
//        int luku2 = 0;
//
//        this.laskutoimitus.setLuku1(luku1);
//        this.laskutoimitus.setLuku2(luku2);
//    }
}
