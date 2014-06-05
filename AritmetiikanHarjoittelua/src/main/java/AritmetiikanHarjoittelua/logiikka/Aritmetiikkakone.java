package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;

public class Aritmetiikkakone {
    
//    29.5.2014 tämä luokka vain käyttää luokkaa tehtävä mutta
//    on tarpeen jos/kun ohjelmaa laajennetaan luokilla Harjoittelu ja Koe

    private Tehtava tehtava;
    private Laskutoimitustehdas laskutoimitustehdas;

    public Aritmetiikkakone() {
        this.laskutoimitustehdas = new Laskutoimitustehdas();
    }
    
// EXCEPTION    public void luoTehtava(String tyyppi) throws LaskToimTyypEiLoydyException {
    public void luoTehtava(String tyyppi){
        this.tehtava = new Tehtava(this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi));
// EXCEPTION    }
    }
    
    public Tehtava getTehtava(){
        return this.tehtava;
    }
}
