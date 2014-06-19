package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

import AritmetiikanHarjoittelua.logiikka.Arpoja;

/**
 * Luokka on aliluokka, joka perii yläluokan Laskutoimitus.
 */
public class Osamaara extends Laskutoimitus {

//    private Operandi jaettava;
//    private Arpoja arpoja;
//    private Operandi jakaja;

    public Osamaara() {
        super();
        this.setTyyppi("j");
    }

    @Override
    public String tekstina() {
        return super.operandi1Tekstina() + " / " + super.operandi2Tekstina();
    }

    @Override
    public int laske() {
        return super.getOperandi1Arvo() / super.getOperandi2Arvo();
    }

//    @Override
//    public void setOperandi2(Operandi operandi2) {
//        if (operandi2.getArvo() == 0) {
//            operandi2.setArvo(1);
//        }
//        super.setOperandi2(operandi2);
//        asetaJaettavaJaJakaja();
//    }
//
//    @Override
//    public boolean operanditOvatKelvolliset() {
//        if (super.getOperandi2Arvo() == 0) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String tekstina() {
//        return this.jaettavaTekstina() + " / " + this.jakajaTekstina();
//    }
//
//    private void asetaJaettavaJaJakaja() {
//        this.jakaja = super.getOperandi2();
//        if (super.getOperandi1().onLuku()) {
//            int arvottuLuku1 = this.arpoja.kokonaisluku(-10, 10);
//            this.jaettava.setArvo(this.jakaja.getArvo() * arvottuLuku1);
//            this.jaettava.setMerkkijono(Integer.toString(this.jaettava.getArvo()));
//        } else { // operandi1 on laskutoimitusoperandi
//            int jaettavanOperandi1Arvo = super.getOperandi1Arvo();
//            int jaettavanOperandi2Arvo = this.arpoja.kokonaisluku(1, 10);
//            switch (super.getOperandi1().getLaskutoimitustyyppi()) {
//                case "y":
//                    jaettavanOperandi2Arvo = this.jaettava.getArvo() - jaettavanOperandi1Arvo;
//                    Summa summa = new Summa();
//                    summa.setOperandi1(new LukuOperandi(jaettavanOperandi1Arvo));
//                    summa.setOperandi2(new LukuOperandi(jaettavanOperandi2Arvo));
//                    this.jaettava = new LaskutoimitusOperandi(summa);
//                    this.jaettava.setArvo(summa.);
//                    break;
//                case "v":
//                    jaettavanOperandi2Arvo = this.jaettava.getArvo() + jaettavanOperandi1Arvo;
//                    Erotus erotus = new Erotus();
//                    erotus.setOperandi1(new LukuOperandi(jaettavanOperandi1Arvo));
//                    erotus.setOperandi2(new LukuOperandi(jaettavanOperandi2Arvo));
//                    this.jaettava = new LaskutoimitusOperandi(erotus);
//                    break;
//                case "k":
//                    jaettavanOperandi2Arvo = this.jaettava.getArvo() / jaettavanOperandi1Arvo;
//                    Tulo tulo = new Tulo();
//                    tulo.setOperandi1(new LukuOperandi(jaettavanOperandi1Arvo));
//                    tulo.setOperandi2(new LukuOperandi(jaettavanOperandi2Arvo));
//                    this.jaettava = new LaskutoimitusOperandi(tulo);
//                    break;
//                case "j":
//                    jaettavanOperandi2Arvo = this.jaettava.getArvo() / jaettavanOperandi1Arvo;
//                    Osamaara osamaara = new Osamaara();
//                    osamaara.setOperandi1(new LukuOperandi(jaettavanOperandi1Arvo));
//                    osamaara.setOperandi2(new LukuOperandi(jaettavanOperandi2Arvo));
//                    this.jaettava = new LaskutoimitusOperandi(osamaara);
//                    break;
//            }
//
//        }
//
//    }
//
//    private String jaettavaTekstina() {
//        return this.jaettava.getMerkkijono();
//    }
//
//    private String jakajaTekstina() {
//        String merkkijono = super.operandi2Tekstina();
//        return merkkijono;
//    }
//
//    @Override
//    public int laske() {
//        return this.jaettava.getArvo() / this.jakaja.getArvo();
//    }
}
