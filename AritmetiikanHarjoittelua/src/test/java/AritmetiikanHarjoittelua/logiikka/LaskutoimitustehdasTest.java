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
public class LaskutoimitustehdasTest {

    KokonaislukuArpoja arpoja;
    Laskutoimitustehdas laskutoimitustehdas;
    Laskutoimitus pluslasku;
    Laskutoimitus miinuslasku;
    Laskutoimitus kertolasku;
    Laskutoimitus jakolasku;
    Laskutoimitus miinuslaskuVakioArpojalla;

    public LaskutoimitustehdasTest() {
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
            pluslasku = laskutoimitustehdas.uusiLaskutoimitus("Y", arpoja);
            miinuslasku = laskutoimitustehdas.uusiLaskutoimitus("v", arpoja);
            kertolasku = laskutoimitustehdas.uusiLaskutoimitus("k", arpoja);
            jakolasku = laskutoimitustehdas.uusiLaskutoimitus("J", arpoja);

            miinuslaskuVakioArpojalla = laskutoimitustehdas.uusiLaskutoimitus("V", new TestiArpojaVakioilla(0, -7));
        } catch (Exception exception) {// EXCEPTION 
            System.out.println("Väärä laskutoimitustyyppi");// EXCEPTION
        }

    }

    @After
    public void tearDown() {
    }

    @Test
    public void toimiikoSummanLuominen() {
        pluslasku.setLuku1(4);
        pluslasku.setLuku2(7);
        assertEquals(11, pluslasku.laske());
    }

    @Test
    public void toimiikoErotuksenLuominen() {
        miinuslasku.setLuku1(4);
        miinuslasku.setLuku2(7);
        assertEquals("4 - 7", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoErotuksenLuominen2() {
        assertEquals("0 - (-7)", miinuslaskuVakioArpojalla.tekstina());
    }

    @Test
    public void toimiikoTulonLuominen() {
        kertolasku.setLuku1(4);
        kertolasku.setLuku2(-7);
        assertEquals(-28, kertolasku.laske());
    }

    @Test
    public void toimiikoOsamaaranLuominen() {
        jakolasku.setLuku1(4);
        jakolasku.setLuku2(7);
        assertEquals("28 / 7", jakolasku.tekstina());
    }
}
