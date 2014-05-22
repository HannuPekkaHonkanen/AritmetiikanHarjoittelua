package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Tulo extends Laskutoimitus {

    @Override
    public int laske() {
        return super.luku1 * super.luku2;
    }

    @Override
    public String tekstina() {
        return super.luku1 + " x " + super.luku2;
    }

}
