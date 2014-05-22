package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Osamaara extends Laskutoimitus {

    @Override
    public int laske() {
        return super.luku1 / super.luku2;
    }

    @Override
    public String tekstina() {
        return super.luku1 + " / " + super.luku2;
    }

}
