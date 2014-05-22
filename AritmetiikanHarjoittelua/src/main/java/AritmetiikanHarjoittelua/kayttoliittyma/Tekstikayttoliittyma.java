package AritmetiikanHarjoittelua.kayttoliittyma;

import java.util.*;
import AritmetiikanHarjoittelua.logiikka.Harjoittelu;
import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

public class Tekstikayttoliittyma {

    private Scanner lukija;
    private Harjoittelu harjoittelu;

    public Tekstikayttoliittyma(Scanner lukija, Harjoittelu harjoittelu) {
        this.lukija = lukija;
        this.harjoittelu = harjoittelu;
    }

    public void kaynnista() {
        System.out.println("Aritmetiikan harjoittelua");
        System.out.println("");

        int luku1 = 1;
        int luku2 = 2;
        int summa;

//        Laskutoimitus summaLasku = new Summa();
//        summaLasku.setLuku1(luku1);
//        summaLasku.setLuku2(luku2);
//        System.out.println(summaLasku.tekstina());
//        summa = summaLasku.laske();

        this.harjoittelu.tehtava.laskutoimitus = new Summa();
//        Laskutoimitus summaLasku = new Summa();
        this.harjoittelu.tehtava.laskutoimitus.setLuku1(luku1);
        this.harjoittelu.tehtava.laskutoimitus.setLuku2(luku2);


//        System.out.println(summa);

        ohjeet();
        tehtavananto();
        String vastaus=lueVastaus();
//        System.out.println(lueVastaus());
//        int oikeaVastaus = laske();
        System.out.println(tarkistaVastaus(vastaus));
//        kilpailu();
//        tulokset();

    }

    public void ohjeet() {
        System.out.println("Ohjeet: ...");
        System.out.println("");
    }

    public void tehtavananto() {
        System.out.println("Laske: " + this.harjoittelu.tehtava.laskutoimitus.tekstina());
    }

    public String lueVastaus() {
        System.out.print("Anna vastaus: ");
        String vastaus = lukija.nextLine();
        return vastaus;

    }

//    public int laske() {
//        int summa = this.harjoittelu.tehtava.laskutoimitus.laske();
//        return summa;
//    }
    public String tarkistaVastaus(String vastaus) {
        if (vastaus.equals(this.harjoittelu.tehtava.oikeaVastaus())) {
            return "Vastaus on oikein.";
        } else {
            return "Vastaus on väärin.";
        }
    }
//    private void lueHyppaajat() {
//        System.out.println("Syötä kilpailun osallistujat yksi kerrallaan, tyhjällä merkkijonolla siirtyy hyppyvaiheeseen.");
//        while (true) {
//            System.out.print("  Osallistujan nimi: ");
//            String hyppaaja = lukija.nextLine();
//            if (hyppaaja.equals("")) {
//                return;
//            } else {
//                makihyppykilpailu.lisaaHyppaaja(hyppaaja);
//            }
//        }
//    }
//
//    private void kilpailu() {
//        System.out.println("Kilpailu alkaa!");
//        int kierros = 0;
//        while (true) {
//        System.out.println("");
//            System.out.print("Kirjoita \"hyppaa\" niin hypätään, muuten lopetetaan: ");
//            String komento = lukija.nextLine();
//            System.out.println("");
//            if (komento.equals("hyppaa")) {
//                kierros++;
//                hyppykierros(kierros);
//            } else {
//                return;
//            }
//        }
//    }
//
//    private void hyppykierros(int kierros) {
//        System.out.println(kierros + ". kierros");
//        System.out.println("");
//        System.out.println("Hyppyjärjestys:");
//        System.out.print(this.makihyppykilpailu.hyppaajatJarjestysnumeroin());
//        System.out.println("");
//        System.out.println("Kierroksen "+kierros+" tulokset");
//        System.out.print(this.makihyppykilpailu.uusiKierrosHypataan());
//    }
//
//    private void tulokset() {
//        System.out.println("Kiitos!");
//        System.out.println("");
//        System.out.println("Kilpailun lopputulokset:");
//        System.out.println("Sija    Nimi");
//        System.out.print(this.makihyppykilpailu.hyppaajienTuloksetJarjestysnumeroin());
//    }
}
