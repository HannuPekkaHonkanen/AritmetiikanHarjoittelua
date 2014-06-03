package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Tulo extends Laskutoimitus {

    @Override
    public String tekstina() {
        return super.getLuku1() + " x " + super.getLuku2();
    }

    @Override
    public int laske() {
        return super.getLuku1() * super.getLuku2();
    }
}
