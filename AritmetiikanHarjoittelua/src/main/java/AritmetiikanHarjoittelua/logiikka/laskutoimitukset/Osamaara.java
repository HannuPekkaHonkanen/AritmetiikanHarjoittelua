package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Osamaara extends Laskutoimitus {

    private int jaettava;
    private int jakaja;

    @Override
    public void setLuku2(int luku2) {
        super.setLuku2(luku2);
        asetaJaettavaJaJakaja();
    }

    @Override
    public boolean luvutOvatKelvolliset() {
        if (super.getLuku2() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String tekstina() {
        return this.jaettavaTekstina() + " / " + this.jakajaTekstina();
    }

    private void asetaJaettavaJaJakaja() {
        this.jaettava = super.getLuku1() * super.getLuku2();
        this.jakaja = super.getLuku2();
    }

    private String jaettavaTekstina() {
        String merkkijono = Integer.toString(this.jaettava);
        return merkkijono;
    }

    private String jakajaTekstina() {
        String merkkijono = super.luku2Tekstina();
        return merkkijono;
    }

    @Override
    public int laske() {
        return this.jaettava / this.jakaja;
    }
}
