package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Osamaara extends Laskutoimitus {

    private int jaettava;
    private int jakaja;

    @Override
    public boolean luvutOvatKelvolliset() {
        if (super.luku2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String tekstina() {
        asetaJaettavaJaJakaja();
        return this.jaettava + " / " + this.jakaja;
    }

    private void asetaJaettavaJaJakaja() {
        this.jaettava = super.luku1 * super.luku2;
        this.jakaja = super.luku2;
    }

    @Override
    public int laske() {
        return this.jaettava / this.jakaja;
    }
}
