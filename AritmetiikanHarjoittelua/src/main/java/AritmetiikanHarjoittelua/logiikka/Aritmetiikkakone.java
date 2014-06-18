package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.Laskutoimitus;
import java.util.ArrayList;

/**
 * Luokka on sovelluslogiikan "pääluokka". Tekstikäyttöliittymä kommunikoi
 * sovelluslogiikan kanssa tämän luokan kautta eli tämä on tavallaan
 * sovelluslogiikan rajapinta.
 */
public class Aritmetiikkakone {

//    29.5.2014 tämä luokka vain käyttää luokkaa tehtävä mutta
//    on tarpeen jos/kun ohjelmaa laajennetaan luokilla Harjoittelu ja Koe
//    tekstikayttoliittymaa varten
    private Tehtava tehtava;
    private ArrayList<AritmetiikanHarjoitus> harjoitukset;
    private AritmetiikanHarjoitus aktiivinenHarjoitus;
//    private Tehtava[] tehtavat;
//    private String[] tulokset;
    private Laskutoimitustehdas laskutoimitustehdas;
    private KokonaislukuArpoja arpoja;
    
    private boolean test;

    public Aritmetiikkakone() {
        this.laskutoimitustehdas = new Laskutoimitustehdas();
        this.arpoja = new KokonaislukuArpoja();
        this.harjoitukset=new ArrayList<AritmetiikanHarjoitus>();
    }

    /**
     * Metodi luo uuden Tehtava luokan ilmentymän, jonka se pyytää
     * Laskutoimitustehdas-oliolta.
     */
    public void luoTehtava(String tyyppi) throws LaskToimTyypEiLoydyException {
        this.tehtava = new Tehtava(this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi, this.arpoja));
    }

    public void luoHarjoitus(String tyyppi, int lkm) throws LaskToimTyypEiLoydyException {
        if (this.aktiivinenHarjoitus != null) {
            this.harjoitukset.add(this.aktiivinenHarjoitus);
            this.aktiivinenHarjoitus = new AritmetiikanHarjoitus(tyyppi, lkm, this.laskutoimitustehdas, this.arpoja);
        } else {
            this.aktiivinenHarjoitus = new AritmetiikanHarjoitus(tyyppi, lkm, this.laskutoimitustehdas, this.arpoja);
        }
    }

//    public void tarkistaTehtavat(String[] vastaukset, int lkm)  {
//        this.tulokset=new String[lkm];
//        for (int i = 0; i < lkm; i++) {
//            if (this.tehtavat[i].onOikein(vastaukset[i])){
//                this.tulokset[i]="Oikein!";
//            }else{
//                this.tulokset[i]="Väärin. Muuta vastausta!";
//            }
//        }
//    }
    public AritmetiikanHarjoitus getAktiivinenHarjoitus() {
        return this.aktiivinenHarjoitus;
    }

    //    tekstikayttoliittymaa varten
    public Tehtava getTehtava() {
        return this.tehtava;
    }
//    public Tehtava[] getTehtavat() {
//        return this.tehtavat;
//    }
//
//    public String[] getTulokset() {
//        return this.tulokset;
//    }
}
