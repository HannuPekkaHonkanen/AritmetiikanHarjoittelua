package AritmetiikanHarjoittelua.logiikka;

import java.util.Random;

/**
 * Luokka on testaamista varten. Tämän luokan konstruktorissa annetaan
 * vakiot, jotka palautetaan.
 */
public class TestiArpojaVakioilla implements Arpoja {

    private int vakio1;
    private int vakio2;
    private int palautettavanVakionNumero;

    public TestiArpojaVakioilla(int vakio1, int vakio2) {
        this.vakio1 = vakio1;
        this.vakio2 = vakio2;
        this.palautettavanVakionNumero = 1;
    }

    /**
     * Metodi palauttaa konstruktorille annetut kokonaislukuvakiot.
     */
    @Override
    public int kokonaisluku(int min, int max) {

        if (this.palautettavanVakionNumero == 1) {
            this.palautettavanVakionNumero = 2;
            return this.vakio1;
        }

        this.palautettavanVakionNumero = 1;
        return this.vakio2;
    }
}
