package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

/**
 * Luokka luo uuden Laskutoimitus-luokan ilmentymän.
 */
public class Laskutoimitustehdas {

    private Laskutoimitus paaLaskutoimitus;
    private Arpoja arpoja;
//    private int arvottuLuku = 0;

//    public Laskutoimitus uusiLaskutoimitus(String tyyppi, Arpoja arpoja) {
// EXCEPTION    
    public Laskutoimitus uusiLaskutoimitus(String tyyppi, Arpoja arpoja) throws LaskToimTyypEiLoydyException {
        this.arpoja = arpoja;
//        y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku/a=arvo tyyppi/m=moniosainen tehtävä
        this.paaLaskutoimitus = new Laskutoimitus();
        switch (tyyppi) {
            case "y":
                this.paaLaskutoimitus = new Summa();
                break;
            case "v":
                this.paaLaskutoimitus = new Erotus();
                break;
            case "k":
                this.paaLaskutoimitus = new Tulo();
                break;
            case "j":
                this.paaLaskutoimitus = new Osamaara();
                break;
            case "a":
//                arvottuLuku = this.arpoja.kokonaisluku(1, 4);
//                System.out.println(arvottuLuku);
                switch (this.arpoja.kokonaisluku(1, 4)) {
                    case 1:
                        this.paaLaskutoimitus = new Summa();
                        break;
                    case 2:
                        this.paaLaskutoimitus = new Erotus();
                        break;
                    case 3:
                        this.paaLaskutoimitus = new Tulo();
                        break;
                    case 4:
                        this.paaLaskutoimitus = new Osamaara();
                        break;
                    default:
                        throw new LaskToimTyypEiLoydyException();
                }
                break;
            case "m":
                this.paaLaskutoimitus = this.uusiLaskutoimitus("a", arpoja);
                this.paaLaskutoimitus.setPeruslaskutoimitus(false);
                break;
            default:
                throw new LaskToimTyypEiLoydyException();
        }

        asetaOperandit();

        return this.paaLaskutoimitus;
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

    private void asetaOperandit() throws LaskToimTyypEiLoydyException {

        int arvottuLuku1 = this.arpoja.kokonaisluku(-10, 10);
        int arvottuLuku2 = this.arpoja.kokonaisluku(-10, 10);

        if (this.paaLaskutoimitus.onPeruslaskutoimitus()) {

            // jakaja ei saa olla nolla            
            if (this.paaLaskutoimitus.getTyyppi().equals("j") && arvottuLuku2 == 0) {
                arvottuLuku2 = 1;
            }
            this.paaLaskutoimitus.setOperandi2(new LukuOperandi(arvottuLuku2));

            this.paaLaskutoimitus.setOperandi1(new LukuOperandi(arvottuLuku1 * arvottuLuku2));

        } else if (!this.paaLaskutoimitus.onPeruslaskutoimitus()) {

            Operandi operandi1 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a", this.arpoja));
            Operandi operandi2 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a", this.arpoja));

            if (this.paaLaskutoimitus.getTyyppi().equals("j")) {
                // jakaja ei saa olla nolla
                while (operandi2.getArvo() == 0) {
                    operandi2 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a", this.arpoja));
                }
                // yksinkertaistetaan hieman: jakolaskussa operandi1 on aina LukuOperandi
                operandi1 = new LukuOperandi(operandi2.getArvo() * arvottuLuku1);
            }

            this.paaLaskutoimitus.setOperandi1(operandi1);
            this.paaLaskutoimitus.setOperandi2(operandi2);

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
