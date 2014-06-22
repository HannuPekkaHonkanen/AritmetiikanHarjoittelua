package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

/**
 * Luokka luo uuden Laskutoimitus-luokan ilmentymän.
 */
public class Laskutoimitustehdas {

    private Arpoja arpoja;

    public Laskutoimitustehdas(Arpoja arpoja) {
        this.arpoja = arpoja;
    }

/**
 * Metodi palauttaa uuden Laskutoimitus-luokan ilmentymän.
 */
    public Laskutoimitus uusiLaskutoimitus(String tyyppi) throws LaskToimTyypEiLoydyException {
        Laskutoimitus laskutoimitus;
//        y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku/a=arvo tyyppi/m=moniosainen tehtävä
//        konstruktori asettaa uudelle Laskutoimitukselle this.peruslaskutoimitus = true;
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
                laskutoimitus.setOnPeruslaskutoimitus(false);
                break;
            default:
                throw new LaskToimTyypEiLoydyException();
        }

        asetaOperandit(laskutoimitus);

        return laskutoimitus;
    }

/**
 * Metodi asettaa luotavan laskutoimituksen operandit.
 */
    private void asetaOperandit(Laskutoimitus laskutoimitus) throws LaskToimTyypEiLoydyException {

        int arvottuLuku1 = this.arpoja.kokonaisluku(-10, 10);
        int arvottuLuku2 = this.arpoja.kokonaisluku(-10, 10);

        if (laskutoimitus.onPeruslaskutoimitus()) {
            asetaKokonaisLukuOperandit(laskutoimitus, arvottuLuku1, arvottuLuku2);
        } else if (!laskutoimitus.onPeruslaskutoimitus()) {
            asetaLaskutoimitusOperandit(laskutoimitus, arvottuLuku1);
        } else {
            throw new LaskToimTyypEiLoydyException();
        }
    }

/**
 * Metodi luo kokonaislukuoperandit.
 */
    private void asetaKokonaisLukuOperandit(Laskutoimitus laskutoimitus, int luku1, int luku2) throws LaskToimTyypEiLoydyException {

        Operandi operandi1 = new KokonaisLukuOperandi(luku1);
        Operandi operandi2 = new KokonaisLukuOperandi(luku2);

        // jakolasku
        if (laskutoimitus.getTyyppi().equals("j")) {
            // jakolaskun operandi2 eli jakaja ei saa olla nolla            
            if (luku2 == 0) {
                luku2 = 1;
                operandi2 = new KokonaisLukuOperandi(luku2);
            }
            // asetetaan jakolaskun operandi1 eli jaettava niin että tulos eli osamaara on kokonaisluku
            operandi1 = new KokonaisLukuOperandi(luku1 * luku2);
        }

        laskutoimitus.setOperandi1(operandi1);
        laskutoimitus.setOperandi2(operandi2);
    }

/**
 * Metodi luo laskutoimitusoperandit.
 */
    private void asetaLaskutoimitusOperandit(Laskutoimitus paaLaskutoimitus, int luku1) throws LaskToimTyypEiLoydyException {

        Operandi operandi1 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a"), paaLaskutoimitus.getTyyppi());
        Operandi operandi2 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a"), paaLaskutoimitus.getTyyppi());

        if (paaLaskutoimitus.getTyyppi().equals("j")) {
            // jakaja ei saa olla nolla
            while (operandi2.getArvo() == 0) {
                operandi2 = new LaskutoimitusOperandi(this.uusiLaskutoimitus("a"), paaLaskutoimitus.getTyyppi());
            }
            // yksinkertaistetaan hieman: jakolaskussa operandi1 on aina KokonaisLukuOperandi
            operandi1 = new KokonaisLukuOperandi(operandi2.getArvo() * luku1);
        }

        paaLaskutoimitus.setOperandi1(operandi1);
        paaLaskutoimitus.setOperandi2(operandi2);
    }
}
