package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

import java.util.*;

/**
 *
 * @author Hannu
 */
public class Laskutoimitus {

    private String apu;
    public int luku1;
    public int luku2;

    public void setLuku1(int luku1) {
        this.luku1 = luku1;
        this.apu= "" + this.luku1;
//        this.ekaLukuTekstina2();
    }

    public void setLuku2(int luku2) {
        this.luku2 = luku2;
    }

    private String ekaLukuTekstina() {
//        String merkkijono = "" + this.luku1;
        this.apu = Integer.toString(this.luku1);
        return this.apu;
//        return "apu2";
//        return this.apu;
    }

    public String luku1Tekstina() {
        return this.apu;
        //return "laskutoimitus tekstinä";
    }

    public void ekaLukuTekstina2() {
//        String merkkijono = "" + this.luku1;
//        String merkkijono=Integer.toString(this.luku1);
//        return merkkijono;
        this.apu = "apu";
//        this.apu= luku1 + "";
    }

    public String luku2Tekstina() {
        String merkkijono = "" + this.luku2;
        //String merkkijono=Integer.toString(this.luku2);
        if (this.luku2 < 0) {
            merkkijono = "(" + merkkijono + ")";
        }
        return merkkijono;
    }

    public boolean luvutOvatKelvolliset() {
        return true;
    }

    public String ekaTekstina() {
        return this.apu;
//        return this.ekaLukuTekstina() + " + " + this.luku2Tekstina();
        //return "laskutoimitus tekstinä";
    }

    public String tekstina() {
        return this.apu;
//        return this.ekaLukuTekstina() + " + " + this.luku2Tekstina();
        //return "laskutoimitus tekstinä";
    }

    public String ttekstina() {
        return this.getApu();
//        return this.ekaLukuTekstina() + " + " + this.luku2Tekstina();
        //return "laskutoimitus tekstinä";
    }
    
    public String getApu(){
        return this.apu;
    }

    public int laske() {
        return 999999;
    }
//    public void vainTestiPOISTA(){
//    Integer k=0;
//    k.intValue();
//    
//    
//    String s="";
//    char m=s.charAt(3);
//        
//    }
}
