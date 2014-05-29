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

    Laskutoimitustehdas laskutoimitustehdas;
    Laskutoimitus pluslasku;
    Laskutoimitus miinuslasku;
    Laskutoimitus kertolasku;
    Laskutoimitus jakolasku;

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
        
        pluslasku = laskutoimitustehdas.uusiLaskutoimitus("Y");
        miinuslasku = laskutoimitustehdas.uusiLaskutoimitus("v");
        kertolasku = laskutoimitustehdas.uusiLaskutoimitus("k");
        jakolasku = laskutoimitustehdas.uusiLaskutoimitus("J");
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
    public void toimiikoTulonLuominen() {
        kertolasku.setLuku1(4);
        kertolasku.setLuku2(-7);
        assertEquals(-28, kertolasku.laske());
    }

//    @Test
//    public void toimiikoOsamaaranLuominen() {
//        jakolasku.setLuku1(4);
//        jakolasku.setLuku2(7);
//        assertEquals("28 / 7", jakolasku.tekstina());
//    }
}
