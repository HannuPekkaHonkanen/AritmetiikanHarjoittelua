package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

/**
 * Luokka luo uuden Laskutoimitus-luokan ilmentymän.
 */
public class Laskutoimitustehdas {

    private Arpoja arpoja;
//    private int arvottuLuku = 0;

    public Laskutoimitustehdas(Arpoja arpoja) {
        this.arpoja = arpoja;
    }

//    public Laskutoimitus uusiLaskutoimitus(String tyyppi) {
// EXCEPTION    
    public Laskutoimitus uusiLaskutoimitus(String tyyppi) throws LaskToimTyypEiLoydyException {
        Laskutoimitus laskutoimitus;
//        y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku/a=arvo tyyppi/m=moniosainen tehtävä
        laskutoimitus = new Laskutoimitus();
        switch (tyyppi) {
            case "y":
                laskutoimitus = new Summa();
                break;
            case "v":
                laskutoimitus = new Erotus();
                break;
            case "k":
                laskutoimitus = new Tulo();
                break;
            case "j":
                laskutoimitus = new Osamaara();
                break;
            case "a":
//                arvottuLuku = this.arpoja.kokonaisluku(1, 4);
//                System.out.println(arvottuLuku);
                switch (this.arpoja.kokonaisluku(1, 4)) {
                    case 1:
                        laskutoimitus = new Summa();
                        break;
                    case 2:
                        laskutoimitus = new Erotus();
                        break;
                    case 3:
                        laskutoimitus = new Tulo();
                        break;
                    case 4:
                        laskutoimitus = new Osamaara();
                        break;
                    default:
                        throw new LaskToimTyypEiLoydyException();
                }
                break;
            case "m":
                laskutoimitus = this.uusiLaskutoimitus("a");
                laskutoimitus.setPeruslaskutoimitus(false);
                break;
            default:
                throw new LaskToimTyypEiLoydyException();
        }

        asetaOperandit(laskutoimitus);

        return laskutoimitus;
    }

//    public Laskutoimitus uusiAlilaskutoimitus() throws LaskToimTyypEiLoydyException {
//                switch (this.arpoja.kokonaisluku(1, 4)) {
//                    case 1:
//                        this.paaLaskutoimitus = new Summa();
//                        break;
//                    case 2:
//                        this.paaLaskutoimitus = new Erotus();
//                        break;
//                    case 3:
//                        this.paaLaskutoimitus = new Tulo();
//                        break;
//                    case 4:
//                        this.paaLaskutoimitus = new Osamaara();
//                        break;
//                    default:
//                        throw new LaskToimTyypEiLoydyException();
//                }
//
//        asetaOperandit();
//
//        return this.paaLaskutoimitus;
//    }
    private void asetaOperandit(Laskutoimitus laskutoimitus) throws LaskToimTyypEiLoydyException {

        int arvottuLuku1 = this.arpoja.kokonaisluku(-10, 10);
        int arvottuLuku2 = this.arpoja.kokonaisluku(-10, 10);

        if (laskutoimitus.onPeruslaskutoimitus()) {

            // jakaja ei saa olla nolla            
            if (laskutoimitus.getTyyppi().equals("j") && arvottuLuku2 == 0) {
                arvottuLuku2 = 1;
            }
            laskutoimitus.setOperandi2(new LukuOperandi(arvottuLuku2));

            laskutoimitus.setOperandi1(new LukuOperandi(arvottuLuku1 * arvottuLuku2));

        } else if (!laskutoimitus.onPeruslaskutoimitus()) {

            Operandi operandi1 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a"), laskutoimitus.getTyyppi());
            Operandi operandi2 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a"), laskutoimitus.getTyyppi());

            if (laskutoimitus.getTyyppi().equals("j")) {
                // jakaja ei saa olla nolla
                while (operandi2.getArvo() == 0) {
                    operandi2 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a"), laskutoimitus.getTyyppi());
                }
                // yksinkertaistetaan hieman: jakolaskussa operandi1 on aina LukuOperandi
                operandi1 = new LukuOperandi(operandi2.getArvo() * arvottuLuku1);
            }

            laskutoimitus.setOperandi1(operandi1);
            laskutoimitus.setOperandi2(operandi2);

        } else {
            throw new LaskToimTyypEiLoydyException();
        }
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
