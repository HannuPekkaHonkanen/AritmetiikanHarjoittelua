package AritmetiikanHarjoittelua.logiikka;

import java.util.Random;

/**
 * Luokka arpoo kokonaislukuja.
 */
public class Arpoja {
    
    private Random arpoja;
    
    public Arpoja(){
        arpoja = new Random();
    }
    
/**
 * Metodi palauttaa kokonaisluvun väliltä -10...10.
 */
    public int kokonaisluku(){
        return this.arpoja.nextInt(21)-10;
    }
    
}
