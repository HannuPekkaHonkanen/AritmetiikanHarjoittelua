AritmetiikanHarjoittelua
========================

Ohjelmoinnin harjoitustyö, touko/kesäkuu 2014


29.5.2014 Unit-testeissä ei edelleenkään toimi alla oleva metodi. Ko. unit-testit kommentoitu pois testiluokasta LaskutoimitusTest.

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
...