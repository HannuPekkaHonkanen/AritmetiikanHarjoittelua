package AritmetiikanHarjoittelua.kayttoliittyma;

import java.util.*;
import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Harjoittelu harjoittelu;
    private Laskutoimitustehdas laskutoimitustehdas=new Laskutoimitustehdas();

    public Tekstikayttoliittyma(Scanner lukija, Harjoittelu harjoittelu) {
        this.lukija = lukija;
        this.harjoittelu = harjoittelu;
    }

    public void kaynnista() {


        ohjeet();

        String laskutoimitustyyppi=kysyLaskutoimitustyyppi();
        
        Laskutoimitus laskutoimitus = this.laskutoimitustehdas.uusiLaskutoimitus(laskutoimitustyyppi);
        
        this.harjoittelu.luoTehtava(laskutoimitus);

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
    
    public String kysyLaskutoimitustyyppi(){
        System.out.print("Anna laskutoimitustyyppi (y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku: ");
        String vastaus = lukija.nextLine();
        return vastaus;
    }

    public void tehtavananto() {
        System.out.println(this.harjoittelu.getTehtava().tekstina());
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
        if (vastaus.equals(this.harjoittelu.getTehtava().oikeaVastaus())) {
            return "Vastaus on oikein.";
        } else {
            return "Vastaus on väärin.";
        }
    }
}
