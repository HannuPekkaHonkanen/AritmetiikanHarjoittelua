package AritmetiikanHarjoittelua.logiikka;

import java.util.Random;

/**
 * Luokka arpoo kokonaislukuja.
 */
public class KokonaislukuArpoja implements Arpoja {

    private Random arpoja;

    public KokonaislukuArpoja() {
        arpoja = new Random();
    }

    /**
     * Metodi palauttaa kokonaisluvun väliltä min...max.
     */
    @Override
    public int kokonaisluku(int min, int max) {
        return this.arpoja.nextInt(max - min + 1) + min;
    }
}
