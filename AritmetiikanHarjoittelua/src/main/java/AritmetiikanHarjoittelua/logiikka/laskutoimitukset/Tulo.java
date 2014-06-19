package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 * Luokka on aliluokka, joka perii yläluokan Laskutoimitus.
 */
public class Tulo extends Laskutoimitus {

    public Tulo(){
        super();
        this.setTyyppi("k");
    }
    
    @Override
    public String tekstina() {
        return super.operandi1Tekstina() + " x " + super.operandi2Tekstina();
    }

    @Override
    public int laske() {
        return super.getOperandi1Arvo() * super.getOperandi2Arvo();
    }
}
