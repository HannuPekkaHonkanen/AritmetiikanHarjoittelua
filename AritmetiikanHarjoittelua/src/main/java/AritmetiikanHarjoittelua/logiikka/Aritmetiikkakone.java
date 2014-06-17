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
    private Tehtava[] tehtavat;
    private String[] tulokset;
    private Laskutoimitustehdas laskutoimitustehdas;
    private KokonaislukuArpoja arpoja;

    public Aritmetiikkakone() {
        this.laskutoimitustehdas = new Laskutoimitustehdas();
        this.arpoja = new KokonaislukuArpoja();
    }

    /**
     * Metodi luo uuden Tehtava luokan ilmentymän, jonka se pyytää
     * Laskutoimitustehdas-oliolta.
     */
// EXCEPTION
    public void luoTehtava(String tyyppi) throws LaskToimTyypEiLoydyException {
//    public void luoTehtava(String tyyppi) {
        this.tehtava = new Tehtava(this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi, this.arpoja));
// EXCEPTION
    }

    public void luoTehtavat(String tyyppi, int lkm) throws LaskToimTyypEiLoydyException {
        this.tehtavat=new Tehtava[lkm];
        for (int i = 0; i < lkm; i++) {
            this.tehtavat[i] = new Tehtava(this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi, this.arpoja));
        }
    }

    public void tarkistaTehtavat(String[] vastaukset, int lkm)  {
        this.tulokset=new String[lkm];
        for (int i = 0; i < lkm; i++) {
            if (this.tehtavat[i].onOikein(vastaukset[i])){
                this.tulokset[i]="Oikein!";
            }else{
                this.tulokset[i]="Väärin. Muuta vastausta!";
            }
        }
    }

    public Tehtava getTehtava() {
        return this.tehtava;
    }

    public Tehtava[] getTehtavat() {
        return this.tehtavat;
    }

    public String[] getTulokset() {
        return this.tulokset;
    }
}
