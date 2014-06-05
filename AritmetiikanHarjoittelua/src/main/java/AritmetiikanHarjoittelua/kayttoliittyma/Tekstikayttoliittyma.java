package AritmetiikanHarjoittelua.kayttoliittyma;

import java.util.*;
import AritmetiikanHarjoittelua.logiikka.*;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

/**
 * Luokka sisältää tekstikäyttöliittymän, jossa hoidetaan tietojen syöttö ja tulostus.
 */
public class Tekstikayttoliittyma {

//    POISTA enum ? laskutoimitustyyppi piti muuttaa enum:iksi mutta ei vielä onnisstunut
//    private Laskutoimitustyyppi laskutoimitustyyppi;
    private Scanner lukija;
    private Aritmetiikkakone kone;

    public Tekstikayttoliittyma(Scanner lukija, Aritmetiikkakone kone) {
        this.lukija = lukija;
        this.kone = kone;
    }

/**
 * Metodi käynnistää tekstikäyttöliittymän ja kutsuu saman luokan
 * muita metodeja saattaakseen ohjelman suorituksen päätökseen.
 */
    public void kaynnista() {
        ohjeet();
// EXCEPTION        while (true) {
            String tyyppi = kysyLaskutoimitustyyppi();
//    POISTA enum ????
//        this.laskutoimitustyyppi  = kysyLaskutoimitustyyppi();
// EXCEPTION            try {
                this.kone.luoTehtava(tyyppi);
// EXCEPTION                break;
// EXCEPTION            } catch (Exception exception) {
// EXCEPTION                System.out.println("Väärä Anna laskutoimitustyyppi");
// EXCEPTION            }
// EXCEPTION        }
        System.out.println(this.kone.getTehtava().tekstina());
        String vastaus = lueVastaus();
        String tulos = tarkistaVastaus(vastaus);
        System.out.println(tulos);
    }

    public void ohjeet() {
        System.out.println("Aritmetiikan harjoittelua");
        System.out.println("");
        System.out.println("Ohjeet: ...");
        System.out.println("");
        System.out.println("HUOM! CODE REVIEW ja OHJAAJAT. Ks. README.md repositoriossa.");
        System.out.println("HUOM! CODE REVIEW ja OHJAAJAT. Ks. README.md repositoriossa.");
        System.out.println("HUOM! CODE REVIEW ja OHJAAJAT. Ks. README.md repositoriossa.");
        System.out.println("");
    }

/**
 * Metodi pyytää käyttäjää syöttämään laskutoimistustyypin,
 * ja palauttaa sen String-tyyppisenä.
 */
    public String kysyLaskutoimitustyyppi() {
        System.out.println("Anna laskutoimitustyyppi (y=yhteenlasku/v=vähennyslasku/k=kertolasku/j=jakolasku: ");
        String vastaus = lukija.nextLine();
        return vastaus;
    }

    public String lueVastaus() {
//        POISTA Integer i;
//        i.valueOf("22");
//        Integer.
// POISTA       System.out.println(String.valueOf(-9));
        System.out.print("Anna vastaus: ");
        String vastaus = lukija.nextLine();
        return vastaus;

    }

    public String tarkistaVastaus(String vastaus) {
        if (vastaus.equals(this.kone.getTehtava().oikeaVastaus())) { //VIRHE vie tämä logiikan puolelle
            return "Vastaus on oikein.";
        } else {
            return "Vastaus on väärin.";
        }
    }
}
