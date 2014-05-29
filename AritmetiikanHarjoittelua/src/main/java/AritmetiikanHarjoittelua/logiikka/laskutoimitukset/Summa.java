package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Summa extends Laskutoimitus {

//    @Override
//    public String tekstina() {
////        if (super.luku2<0){
////        return super.luku1 + " + (" + super.luku2+")";
////        }
////        return super.luku1 + " + " + super.luku2;
//        String l1 = this.luku1Tekstina();
//        String l2 = this.luku2Tekstina();
//        
//        return l1 + " + " + l2;
//    }
    
    @Override
    public String tekstina(){
//        return super.ekaLukuTekstina();
//        return super.tekstina();
        String eka="eka";
        String toka=super.ttekstina();
        return eka +" + " + toka;
//        return this.ekaLukuTekstina() + " + " + this.luku2Tekstina();
        //return this.luku1Tekstina() + " + " + this.luku2Tekstina();
    }

    @Override
    public int laske() {
//        return this.luku1 + this.luku2;
        return super.luku1 + super.luku2;
    }
}
