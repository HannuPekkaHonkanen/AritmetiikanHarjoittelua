package AritmetiikanHarjoittelua.kayttoliittyma;

import java.util.*;
import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Harjoittelu harjoittelu;

    public Tekstikayttoliittyma(Scanner lukija, Harjoittelu harjoittelu) {
        this.lukija = lukija;
        this.harjoittelu = harjoittelu;
    }

    public void kaynnista() {

        ohjeet();

//        this.harjoittelu.tehtava.laskutoimitus = new Summa();
//        this.harjoittelu.tehtava.laskutoimitus = new Erotus();
        this.harjoittelu.tehtava.laskutoimitus = new Tulo();
//        this.harjoittelu.tehtava.laskutoimitus = new Osamaara();

        arvoLuvut();
//        arvoLuvutTestNolla();
        while (!this.harjoittelu.tehtava.laskutoimitus.luvutOvatKelvolliset()) {
            System.out.println("luvut eivät kelvolliset -> luvut arvotaan uudestaan");
            arvoLuvut();
        }
//        tarkistaLuvut();

        tehtavananto();
        String vastaus = lueVastaus();
        String tulos = tarkistaVastaus(vastaus);
        System.out.println(tulos);

    }

    public void ohjeet() {
        System.out.println("Aritmetiikan harjoittelua");
        System.out.println("");
        System.out.println("Ohjeet: ...");
        System.out.println("");
    }

    public void arvoLuvut() {
        Arpoja arpoja = new Arpoja();

        int luku1 = arpoja.kokonaisluku();
        int luku2 = arpoja.kokonaisluku();

        this.harjoittelu.tehtava.laskutoimitus.setLuku1(luku1);
        this.harjoittelu.tehtava.laskutoimitus.setLuku2(luku2);

    }

    public void arvoLuvutTestNolla() {
        Arpoja arpoja = new Arpoja();

        int luku1 = arpoja.kokonaisluku();
//        int luku2 = arpoja.kokonaisluku();
        int luku2 = 0;

        this.harjoittelu.tehtava.laskutoimitus.setLuku1(luku1);
        this.harjoittelu.tehtava.laskutoimitus.setLuku2(luku2);

    }

//    public void tarkistaLuvut() {
//
//        if (this.harjoittelu.tehtava.laskutoimitus.luvutOvatKelvolliset()) {
//        }
//    }
    public void tehtavananto() {

        System.out.println("Laske: " + this.harjoittelu.tehtava.laskutoimitus.tekstina());
    }

    public String lueVastaus() {
//        Integer i;
//        i.valueOf("22");
//        Integer.
        System.out.print("Anna vastaus: ");
        String vastaus = lukija.nextLine();
        return vastaus;

    }

    public String tarkistaVastaus(String vastaus) {
        if (vastaus.equals(this.harjoittelu.tehtava.oikeaVastaus())) {
            return "Vastaus on oikein.";
        } else {
            return "Vastaus on väärin.";
        }
    }
}