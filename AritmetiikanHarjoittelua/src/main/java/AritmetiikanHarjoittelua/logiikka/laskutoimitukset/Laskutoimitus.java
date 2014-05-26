package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Laskutoimitus {
    
    int luku1;
    int luku2;
    
    public void setLuku1(int luku1){
        this.luku1=luku1;
    }
    
    public void setLuku2(int luku2){
        this.luku2=luku2;
    }
    
    public boolean luvutOvatKelvolliset(){
        return true;
    }

    public String tekstina() {
        return "laskutoimitus tekstinä";
    }

    public int laske() {
        return 999999;
    }
}
