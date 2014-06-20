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

}
