package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

/**
 * Luokka luo uuden Laskutoimitus-luokan ilmentymän.
 */
public class Laskutoimitustehdas {

    private Laskutoimitus laskutoimitus;
    private Arpoja arpoja;
    private int arvottuLuku = 0;

//    public Laskutoimitus uusiLaskutoimitus(String tyyppi, Arpoja arpoja) {
// EXCEPTION    
    public Laskutoimitus uusiLaskutoimitus(String tyyppi, Arpoja arpoja) throws LaskToimTyypEiLoydyException {
        this.arpoja = arpoja;
//        y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku/a=arvo tyyppi/m=moniosainen tehtävä
        switch (tyyppi) {
            case "y":
                this.laskutoimitus = new Summa();
                this.laskutoimitus.setPeruslaskutoimitus(true);
                break;
            case "v":
                this.laskutoimitus = new Erotus();
                this.laskutoimitus.setPeruslaskutoimitus(true);
                break;
            case "k":
                this.laskutoimitus = new Tulo();
                this.laskutoimitus.setPeruslaskutoimitus(true);
                break;
            case "j":
                this.laskutoimitus = new Osamaara();
                this.laskutoimitus.setPeruslaskutoimitus(true);
                break;
            case "a":
                arvottuLuku = this.arpoja.kokonaisluku(1, 4);
                switch (arvottuLuku) {
                    case 1:
                        this.laskutoimitus = new Summa();
                        break;
                    case 2:
                        this.laskutoimitus = new Erotus();
                        break;
                    case 3:
                        this.laskutoimitus = new Tulo();
                        break;
                    case 4:
                        this.laskutoimitus = new Osamaara();
                        break;
                    default:
                        throw new LaskToimTyypEiLoydyException();
                }
                this.laskutoimitus.setPeruslaskutoimitus(true);
                break;
            case "m":
                arvottuLuku = this.arpoja.kokonaisluku(1, 4);
                switch (arvottuLuku) {
                    case 1:
                        this.laskutoimitus = new Summa();
                        break;
                    case 2:
                        this.laskutoimitus = new Erotus();
                        break;
                    case 3:
                        this.laskutoimitus = new Tulo();
                        break;
                    case 4:
                        this.laskutoimitus = new Osamaara();
                        break;
                    default:
                        throw new LaskToimTyypEiLoydyException();
                }
                this.laskutoimitus.setPeruslaskutoimitus(false);
                break;
            default:
                throw new LaskToimTyypEiLoydyException();
        }

        arvoLuvut();
//        arvoLuvutTestNolla();

        while (!this.laskutoimitus.operanditOvatKelvolliset()) {
            arvoLuvut();
        }

        return this.laskutoimitus;
    }

    private void arvoLuvut() {

        this.laskutoimitus.setOperandi1(this.arpoja.kokonaisluku(-10, 10));
        this.laskutoimitus.setOperandi2(this.arpoja.kokonaisluku(-10, 10));
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
