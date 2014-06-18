package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

import java.util.*;

/**
 * Luokka on yläluokka, jonka aliluokat Summa, Erotus, Tulo ja Osamaara perivät.
 */
public class Laskutoimitus {

    private int operandi1;
    private int operandi2;
    private boolean peruslaskutoimitus;

    public void setOperandi1(int luku1) {
        this.operandi1 = luku1;
    }

    public void setOperandi2(int luku2) {
        this.operandi2 = luku2;
    }
    
    public void setPeruslaskutoimitus(boolean totuusarvo){
        this.peruslaskutoimitus=totuusarvo;
    }

    public int getOperandi1() {
        return this.operandi1;
    }

    public int getOperandi2() {
        return this.operandi2;
    }

    public String operandi1Tekstina() {
        String merkkijono = Integer.toString(this.operandi1);
        return merkkijono;
    }

    public String operandi2Tekstina() {
        String merkkijono=Integer.toString(this.operandi2);
        if (this.operandi2 < 0) {
            merkkijono = "(" + merkkijono + ")";
        }
        return merkkijono;
    }

    public boolean onPeruslaskutoimitus() {
        return this.peruslaskutoimitus;
    }

    public boolean operanditOvatKelvolliset() {
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
