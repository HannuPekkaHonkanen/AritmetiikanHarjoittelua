package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 * Luokka on aliluokka, joka perii yläluokan Laskutoimitus.
 */
public class Summa extends Laskutoimitus {

    public Summa(){
        super();
        this.setTyyppi("y");
    }
    
    @Override
    public String tekstina() {
        return super.operandi1Tekstina() + " + " + super.operandi2Tekstina();
    }

    @Override
    public int laske() {
        return super.getOperandi1Arvo() + super.getOperandi2Arvo();
    }
}
