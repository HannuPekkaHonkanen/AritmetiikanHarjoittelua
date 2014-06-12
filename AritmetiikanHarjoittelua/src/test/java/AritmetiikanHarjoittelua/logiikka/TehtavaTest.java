package AritmetiikanHarjoittelua.logiikka;

import AritmetiikanHarjoittelua.logiikka.laskutoimitukset.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hannu
 */
public class TehtavaTest {

    KokonaislukuArpoja arpoja;
    Laskutoimitustehdas laskutoimitustehdas;
    Laskutoimitus jakolasku;
    Laskutoimitus jakolaskuVakioArpojalla;

    public TehtavaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        laskutoimitustehdas = new Laskutoimitustehdas();
        arpoja = new KokonaislukuArpoja();

        try {
        jakolasku = laskutoimitustehdas.uusiLaskutoimitus("j", arpoja);
        
        jakolaskuVakioArpojalla = laskutoimitustehdas.uusiLaskutoimitus("j", new TestiArpojaVakioilla(4, 7));
        } catch (Exception exception) {// EXCEPTION 
            System.out.println("Väärä laskutoimitustyyppi");// EXCEPTION
        }
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toimiikoJakolaskuTehtavanLuominen() {
        jakolasku.setLuku1(4);
        jakolasku.setLuku2(7);
        Tehtava jakolaskuTehtava = new Tehtava(jakolasku);
        assertEquals("Laske: 28 / 7", jakolaskuTehtava.tekstina());
    }

    @Test
    public void toimiikoJakolaskuTehtavanLuominen2() {
        Tehtava jakolaskuTehtava = new Tehtava(jakolaskuVakioArpojalla);
        assertEquals("Laske: 28 / 7", jakolaskuTehtava.tekstina());
    }
}
