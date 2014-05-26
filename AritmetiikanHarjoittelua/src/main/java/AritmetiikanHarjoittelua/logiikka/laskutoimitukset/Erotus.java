package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Erotus extends Laskutoimitus {

    @Override
    public String tekstina() {
        return super.luku1 + " - " + super.luku2;
    }

    @Override
    public int laske() {
        return super.luku1 - super.luku2;
    }
}
