package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;

/**
 *
 * @author Hannu
 */
public class Tehtava {
    
    public Laskutoimitus laskutoimitus;
//    public int oikeaVastaus;
    
    public Tehtava(){
//        laskutoimitus=new Laskutoimitus();
    }
    
    public String oikeaVastaus(){
        return Integer.toString(this.laskutoimitus.laske());
    }
    
}
