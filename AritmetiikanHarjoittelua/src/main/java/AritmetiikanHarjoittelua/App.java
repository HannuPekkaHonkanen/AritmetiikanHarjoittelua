package AritmetiikanHarjoittelua;

import java.util.Scanner;
import AritmetiikanHarjoittelua.logiikka.Aritmetiikkakone;
import AritmetiikanHarjoittelua.kayttoliittyma.Tekstikayttoliittyma;

public class App {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Aritmetiikkakone hannunHarjoittelu = new Aritmetiikkakone();

        Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija, hannunHarjoittelu);
        kayttoliittyma.kaynnista();
    }
}
