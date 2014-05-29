package AritmetiikanHarjoittelua.logiikka;

import java.util.Random;

public class Arpoja {
    
    private Random arpoja;
    
    public Arpoja(){
        arpoja = new Random();
    }
    
    public int kokonaisluku(){
        return this.arpoja.nextInt(21)-10;
    }
    
}
