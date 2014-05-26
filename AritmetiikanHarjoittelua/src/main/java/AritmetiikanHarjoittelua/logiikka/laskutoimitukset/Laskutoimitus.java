package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

import java.util.*;

/**
 *
 * @author Hannu
 */
public class Laskutoimitus {

    public int luku1;
    public int luku2;
    
    public void setLuku1(int luku1) {
        this.luku1 = luku1;
    }

    public void setLuku2(int luku2) {
        this.luku2 = luku2;
    }

    public String luku1Tekstina() {
//        String merkkijono = "" + this.luku1;
        String merkkijono=Integer.toString(this.luku1);
        return merkkijono;
    }

    public String luku2Tekstina() {
//        String merkkijono = "" + this.luku2;
        String merkkijono=Integer.toString(this.luku2);
        if (this.luku2 < 0) {
            merkkijono = "(" + merkkijono + ")";
        }
        return merkkijono;
    }

    public boolean luvutOvatKelvolliset() {
        return true;
    }

    public String tekstina() {
        return "laskutoimitus tekstinä";
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
