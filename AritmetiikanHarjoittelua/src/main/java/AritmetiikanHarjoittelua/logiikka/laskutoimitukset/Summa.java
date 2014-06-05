package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 * Luokka on aliluokka, joka perii yläluokan Laskutoimitus.
 */
public class Summa extends Laskutoimitus {

    @Override
    public String tekstina() {
        return super.luku1Tekstina() + " + " + super.luku2Tekstina();
    }

    @Override
    public int laske() {
        return super.getLuku1() + super.getLuku2();
    }
}
