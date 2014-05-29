package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class Summa extends Laskutoimitus {

    @Override
    public String tekstina() {
//        VIRHE (tämä on vain tägi)
//        alla oleva kommentoitu osuus toimii myös testeissä mutta
//        se pitäisi laittaa erikseen jokaiseen laskutoimitukseen summa/erotus/tulo/osamaara
//        if (super.luku2<0){
//        return super.luku1 + " + (" + super.luku2+")";
//        }
//        return super.luku1 + " + " + super.luku2;
        
        return this.luku1Tekstina() + " + " + this.luku2Tekstina(); //ei toimi unit-testeissä
    }


    @Override
    public int laske() {
//        return this.luku1 + this.luku2;
        return super.luku1 + super.luku2;
    }
}
