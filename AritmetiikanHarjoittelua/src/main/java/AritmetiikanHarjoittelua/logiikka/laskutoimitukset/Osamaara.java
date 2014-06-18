package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 * Luokka on aliluokka, joka perii yläluokan Laskutoimitus.
 */
public class Osamaara extends Laskutoimitus {

    private int jaettava;
    private int jakaja;

    @Override
    public void setOperandi2(int luku2) {
        super.setOperandi2(luku2);
        asetaJaettavaJaJakaja();
    }

    @Override
    public boolean operanditOvatKelvolliset() {
        if (super.getOperandi2() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public String tekstina() {
        return this.jaettavaTekstina() + " / " + this.jakajaTekstina();
    }

    private void asetaJaettavaJaJakaja() {
        this.jaettava = super.getOperandi1() * super.getOperandi2();
        this.jakaja = super.getOperandi2();
    }

    private String jaettavaTekstina() {
        String merkkijono = Integer.toString(this.jaettava);
        return merkkijono;
    }

    private String jakajaTekstina() {
        String merkkijono = super.operandi2Tekstina();
        return merkkijono;
    }

    @Override
    public int laske() {
        return this.jaettava / this.jakaja;
    }
}
