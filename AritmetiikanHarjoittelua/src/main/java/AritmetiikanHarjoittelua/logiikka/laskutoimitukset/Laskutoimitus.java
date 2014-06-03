package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

import java.util.*;

/**
 *
 * @author Hannu
 */
public class Laskutoimitus {

    private int luku1;
    private int luku2;

    public void setLuku1(int luku1) {
        this.luku1 = luku1;
    }

    public void setLuku2(int luku2) {
        this.luku2 = luku2;
    }

    public int getLuku1() {
        return this.luku1;
    }

    public int getLuku2() {
        return this.luku2;
    }

    public String luku1Tekstina() {
        String merkkijono = Integer.toString(this.luku1);
        return merkkijono;
    }

    public String luku2Tekstina() {
        String merkkijono=Integer.toString(this.luku2);
        if (this.luku2 < 0) {
            merkkijono = "(" + merkkijono + ")";
        }
        return merkkijono;
    }

    public boolean luvutOvatKelvolliset() {
//        luokassa Osamaara tälle tehdään override
        return true;
    }

    public String tekstina() {
//       tälle tehdään override eri laskutoimituksissa summa/erotus/tulo/osamaara
        return "laskutoimitus tekstinä";
    }

    public int laske() {
//       tälle tehdään override eri laskutoimituksissa summa/erotus/tulo/osamaara
        return 999999;
    }

}
