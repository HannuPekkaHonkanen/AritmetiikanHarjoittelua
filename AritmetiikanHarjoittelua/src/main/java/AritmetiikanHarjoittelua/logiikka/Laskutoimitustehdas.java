package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

/**
 * Luokka luo uuden Laskutoimitus-luokan ilmentymän.
 */
public class Laskutoimitustehdas {

    private Laskutoimitus laskutoimitus;

    public Laskutoimitus uusiLaskutoimitus(String tyyppi) {
// EXCEPTION     public Laskutoimitus uusiLaskutoimitus(String tyyppi) throws LaskToimTyypEiLoydyException {
//        y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku
        if (tyyppi.equalsIgnoreCase("y")) {
            this.laskutoimitus = new Summa();
        } else if (tyyppi.equalsIgnoreCase("v")) {
            this.laskutoimitus = new Erotus();
        } else if (tyyppi.equalsIgnoreCase("k")) {
            this.laskutoimitus = new Tulo();
        } else if (tyyppi.equalsIgnoreCase("j")) {
            this.laskutoimitus = new Osamaara();
        } else {
// EXCEPTION throw new LaskToimTyypEiLoydyException();
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
    
//    POISTA
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
