package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;

/**
 * Luokka on sovelluslogiikan "pääluokka". Tekstikäyttöliittymä kommunikoi
 * sovelluslogiikan kanssa tämän luokan kautta eli tämä on tavallaan
 * sovelluslogiikan rajapinta.
 */
public class Aritmetiikkakone {

//    29.5.2014 tämä luokka vain käyttää luokkaa tehtävä mutta
//    on tarpeen jos/kun ohjelmaa laajennetaan luokilla Harjoittelu ja Koe
    private Tehtava tehtava;
    private Laskutoimitustehdas laskutoimitustehdas;
    private KokonaislukuArpoja arpoja;

    public Aritmetiikkakone() {
        this.laskutoimitustehdas = new Laskutoimitustehdas();
        this.arpoja = new KokonaislukuArpoja();
    }

    /**
     * Metodi palauttaa uuden Tehtava luokan ilmentymän, jonka se pyytää
     * Laskutoimitustehdas-oliolta.
     */
// EXCEPTION    public void luoTehtava(String tyyppi) throws LaskToimTyypEiLoydyException {
    public void luoTehtava(String tyyppi) {
        this.tehtava = new Tehtava(this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi,this.arpoja));
// EXCEPTION    }
    }

    public Tehtava getTehtava() {
        return this.tehtava;
    }
}
