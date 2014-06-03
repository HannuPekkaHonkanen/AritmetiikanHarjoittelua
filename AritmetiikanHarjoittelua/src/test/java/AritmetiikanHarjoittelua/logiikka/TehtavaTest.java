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

    Laskutoimitustehdas laskutoimitustehdas;
    Laskutoimitus jakolasku;

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
        jakolasku = laskutoimitustehdas.uusiLaskutoimitus("j");
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
}
