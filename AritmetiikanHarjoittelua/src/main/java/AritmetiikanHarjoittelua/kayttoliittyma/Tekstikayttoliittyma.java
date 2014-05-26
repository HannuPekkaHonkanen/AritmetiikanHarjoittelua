package AritmetiikanHarjoittelua.kayttoliittyma;

import java.util.*;
import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Aritmetiikkakone harjoittelu;
//    private Laskutoimitustehdas laskutoimitustehdas = new Laskutoimitustehdas();

    public Tekstikayttoliittyma(Scanner lukija, Aritmetiikkakone harjoittelu) {
        this.lukija = lukija;
        this.harjoittelu = harjoittelu;
    }

    public void kaynnista() {
// POISTA       System.out.println(String.valueOf(-9));
        ohjeet();
        String tyyppi = kysyLaskutoimitustyyppi();
// POISTA       Laskutoimitus laskutoimitus = this.laskutoimitustehdas.uusiLaskutoimitus(tyyppi);
//        this.harjoittelu.luoTehtava(laskutoimitus);
        this.harjoittelu.luoTehtava(tyyppi);
//        this.harjoittelu.luoTehtava(laskutoimitustehdas,tyyppi);
        System.out.println(this.harjoittelu.getTehtava().tekstina());
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

    public String kysyLaskutoimitustyyppi() {
        System.out.println("Anna laskutoimitustyyppi (y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku: ");
        String vastaus = lukija.nextLine();
        return vastaus;
    }

    public String lueVastaus() {
//        POISTA Integer i;
//        i.valueOf("22");
//        Integer.
        System.out.print("Anna vastaus: ");
        String vastaus = lukija.nextLine();
        return vastaus;

    }

    public String tarkistaVastaus(String vastaus) {
        if (vastaus.equals(this.harjoittelu.getTehtava().oikeaVastaus())) {
            return "Vastaus on oikein.";
        } else {
            return "Vastaus on väärin.";
        }
    }
}
