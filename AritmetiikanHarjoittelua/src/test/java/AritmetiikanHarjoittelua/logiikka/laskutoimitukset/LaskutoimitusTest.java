package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

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
public class LaskutoimitusTest {

    Summa asd;
//    Lasku
    Laskutoimitus pluslasku;
    Laskutoimitus miinuslasku;
    Laskutoimitus kertolasku;
    Laskutoimitus jakolasku;

    public LaskutoimitusTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pluslasku = new Summa();
        miinuslasku = new Erotus();
        kertolasku = new Tulo();
        jakolasku = new Osamaara();
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void toimiikoSummanLaskeminenPosInt() {
        pluslasku.setLuku1(4);
        pluslasku.setLuku2(7);
        assertEquals(11, pluslasku.laske());
    }

    @Test
    public void toimiikoSummanLaskeminenNegInt() {
        pluslasku.setLuku1(-4);
        pluslasku.setLuku2(-8);
        assertEquals(-12, pluslasku.laske());
    }

//    @Test
//    public void toimiikoSummaTekstinaPosInt() {
//        pluslasku.setLuku1(4);
//        pluslasku.setLuku2(7);
//        assertEquals("4 + 7", pluslasku.tekstina());
//    }

//    @Test
//    public void toimiikoSummaTekstinaNegInt() {
//        pluslasku.setLuku1(-4);
//        pluslasku.setLuku2(-7);
//        assertEquals("-4 + (-7)", pluslasku.tekstina());
//    }

    @Test
    public void toimiikoErotuksenLaskeminenPosInt() {
        miinuslasku.setLuku1(7);
        miinuslasku.setLuku2(4);
        assertEquals(3, miinuslasku.laske());
    }

    @Test
    public void toimiikoErotuksenLaskeminenNegInt() {
        miinuslasku.setLuku1(-4);
        miinuslasku.setLuku2(-8);
        assertEquals(4, miinuslasku.laske());
    }

    @Test
    public void toimiikoErotusTekstinaInt1() {
        miinuslasku.setLuku1(4);
        miinuslasku.setLuku2(7);
        assertEquals("4 - 7", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoErotusTekstinaInt2() {
        miinuslasku.setLuku1(-4);
        miinuslasku.setLuku2(-7);
        assertEquals("-4 - (-7)", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoErotusTekstinaInt3() {
        miinuslasku.setLuku1(-4);
        miinuslasku.setLuku2(-0);
        assertEquals("-4 - 0", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoTulonLaskeminenPosInt() {
        kertolasku.setLuku1(4);
        kertolasku.setLuku2(7);
        assertEquals(28, kertolasku.laske());
    }

    @Test
    public void toimiikoTulonLaskeminenPosIntJaNollaInt() {
        kertolasku.setLuku1(4);
        kertolasku.setLuku2(0);
        assertEquals(0, kertolasku.laske());
    }

    @Test
    public void toimiikoTulonLaskeminenNegInt1() {
        kertolasku.setLuku1(-4);
        kertolasku.setLuku2(-8);
        assertEquals(32, kertolasku.laske());
    }

    @Test
    public void toimiikoTulonLaskeminenNegInt2() {
        kertolasku.setLuku1(4);
        kertolasku.setLuku2(-8);
        assertEquals(-32, kertolasku.laske());
    }

    @Test
    public void toimiikoTuloTekstinaPosInt() {
        kertolasku.setLuku1(4);
        kertolasku.setLuku2(7);
        assertEquals("4 x 7", kertolasku.tekstina());
    }

    @Test
    public void toimiikoTuloTekstinaNegInt() {
        kertolasku.setLuku1(-4);
        kertolasku.setLuku2(-7);
        assertEquals("-4 x (-7)", kertolasku.tekstina());
    }

    @Test
    public void toimiikoOsamaaranLaskeminenPosInt() {
        jakolasku.setLuku1(4);
        jakolasku.setLuku2(7);
        //jakolasku.luvutOvatKelvolliset();
        //if (jakolasku.luvutOvatKelvolliset()) {
            assertEquals(4, jakolasku.laske());
        //}
    }
    
//    @Test
//    public void toimiikoOsamaaranLaskeminenPosIntJaNollaInt() {
//        jakolasku.setLuku1(4);
//        jakolasku.setLuku2(0);
//        assertEquals(0, jakolasku.laske());
//    }
//
//    @Test
//    public void toimiikoOsamaaranLaskeminenNegInt1() {
//        jakolasku.setLuku1(-4);
//        jakolasku.setLuku2(-8);
//        assertEquals(32, jakolasku.laske());
//    }
//
//    @Test
//    public void toimiikoOsamaaranLaskeminenNegInt2() {
//        jakolasku.setLuku1(4);
//        jakolasku.setLuku2(-8);
//        assertEquals(-32, jakolasku.laske());
//    }
//    @Test
//    public void toimiikoSummanLaskeminenPosDouble() {
//        pluslasku.setLuku1(4.25);
//        pluslasku.setLuku2(6.9);
//        assertEquals(11.15, pluslasku.laske(), 0.0001);
//    }
}
