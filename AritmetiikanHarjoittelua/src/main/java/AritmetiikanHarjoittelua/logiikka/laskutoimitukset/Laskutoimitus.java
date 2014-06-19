package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

import java.util.*;

/**
 * Luokka on yläluokka, jonka aliluokat Summa, Erotus, Tulo ja Osamaara perivät.
 */
public class Laskutoimitus {

    private Operandi operandi1;
    private Operandi operandi2;
    private boolean peruslaskutoimitus;
    private String tyyppi;

    public Laskutoimitus() {
        this.peruslaskutoimitus = true;
    }

    public String getTyyppi() {
        return this.tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public void setOperandi1(Operandi operandi) {
        this.operandi1 = operandi;
    }

    public void setOperandi2(Operandi operandi) {
        this.operandi2 = operandi;
    }

    public void setPeruslaskutoimitus(boolean totuusarvo) {
        this.peruslaskutoimitus = totuusarvo;
    }

    public Operandi getOperandi1() {
        return this.operandi1;
    }

    public Operandi getOperandi2() {
        return this.operandi2;
    }

    public int getOperandi1Arvo() {
        return this.operandi1.getArvo();
    }

    public int getOperandi2Arvo() {
        return this.operandi2.getArvo();
    }

    public String operandi1Tekstina() {
        return this.operandi1.getMerkkijono();
    }

    public String operandi2Tekstina() {
        return this.operandi2.getMerkkijono();
    }

    public boolean onPeruslaskutoimitus() {
        return this.peruslaskutoimitus;
    }

//    public boolean operanditOvatKelvolliset() {
////        luokassa Osamaara tälle tehdään override
//        return true;
//    }
    public String tekstina() {
//       tälle tehdään override eri laskutoimituksissa summa/erotus/tulo/osamaara
        return "laskutoimitus tekstinä";
    }

    public int laske() {
//       tälle tehdään override eri laskutoimituksissa summa/erotus/tulo/osamaara
        return 999999;
    }
}
