package AritmetiikanHarjoittelua;

import java.util.Scanner;
import AritmetiikanHarjoittelua.logiikka.Harjoittelu;
import AritmetiikanHarjoittelua.kayttoliittyma.Tekstikayttoliittyma;
//import AritmetiikanHarjoittelua.kayttoliittyma.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner lukija = new Scanner(System.in);
        Harjoittelu hannunHarjoittelu = new Harjoittelu();

        Tekstikayttoliittyma kayttoliittyma = new Tekstikayttoliittyma(lukija, hannunHarjoittelu);
        kayttoliittyma.kaynnista();        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on erittäin hyödyllistä.
    }
}
