package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Summa extends Laskutoimitus {

    @Override
    public String tekstina() {
//        if (super.luku2<0){
//        return super.luku1 + " + (" + super.luku2+")";
//        }
//        return super.luku1 + " + " + super.luku2;
        
        return super.luku1Tekstina() + " + " + super.luku2Tekstina();
    }

    @Override
    public int laske() {
//        return this.luku1 + this.luku2;
        return super.luku1 + super.luku2;
    }
}
