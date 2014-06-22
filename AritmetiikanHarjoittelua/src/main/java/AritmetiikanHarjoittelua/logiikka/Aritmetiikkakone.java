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

    private Tehtava tehtava;
    private ArrayList<AritmetiikanHarjoitus> harjoitukset;
    private AritmetiikanHarjoitus aktiivinenHarjoitus;
    private Laskutoimitustehdas laskutoimitustehdas;
    private KokonaislukuArpoja arpoja;

    public Aritmetiikkakone() {
        this.arpoja = new KokonaislukuArpoja();
        this.laskutoimitustehdas = new Laskutoimitustehdas(this.arpoja);
        this.harjoitukset = new ArrayList<AritmetiikanHarjoitus>();
    }

    /**
     * Metodi luo uuden Tehtava luokan ilmentymän, jonka se pyytää
     * Laskutoimitustehdas-oliolta.
     */
    public void luoTehtava(String tyyppi) throws LaskToimTyypEiLoydyException {
        this.tehtava = new Tehtava(this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi));
    }

    /**
     * Metodi lisää aktiivisen harjoituksen harjoituslistaan ja
     * asettaa sitten luomansa uuden harjoituksen aktiiviseksi harjoitukseksi.
     */
    public void luoHarjoitus(String tyyppi, int lkm) throws LaskToimTyypEiLoydyException {
        if (this.aktiivinenHarjoitus != null) {
            AritmetiikanHarjoitus uusiHarjoitus = new AritmetiikanHarjoitus(tyyppi, lkm, this.laskutoimitustehdas, this.arpoja);
            this.harjoitukset.add(this.aktiivinenHarjoitus);
            this.aktiivinenHarjoitus = uusiHarjoitus;
        } else {
            this.aktiivinenHarjoitus = new AritmetiikanHarjoitus(tyyppi, lkm, this.laskutoimitustehdas, this.arpoja);
        }
    }

    public AritmetiikanHarjoitus getAktiivinenHarjoitus() {
        return this.aktiivinenHarjoitus;
    }

    public ArrayList<AritmetiikanHarjoitus> getHarjoitukset() {
        return this.harjoitukset;
    }

    /**
     * Metodi lisää aktiivisen harjoituksen harjoituslistaan ennen ohjelman
     * suorituksen lopettamista.
     */
    public void lopetus(int lkm) {
        if (this.aktiivinenHarjoitus != null) {
            this.harjoitukset.add(this.aktiivinenHarjoitus);
        }
//      LAAJENNUSIDEA tietoja voisi tallentaa tekstitiedostoon tai tietokantaan
//        for (AritmetiikanHarjoitus harjoitus : this.harjoitukset) {
//            for (int i = 0; i < lkm; i++) {
//                System.out.print(harjoitus.getTehtavat()[i].tekstina());
//                System.out.print(" Vastaus: " + harjoitus.getVastaukset()[i]);
//                System.out.println(" Tulos: " + harjoitus.getTulokset()[i]);
//            }
//        }
    }

    //    tekstikayttoliittymaa varten
    public Tehtava getTehtava() {
        return this.tehtava;
    }

}
