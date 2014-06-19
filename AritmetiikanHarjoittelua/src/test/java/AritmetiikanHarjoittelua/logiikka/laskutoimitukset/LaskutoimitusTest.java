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

    @Test
    public void toimiikoSummanLaskeminenPosInt() {
        pluslasku.setOperandi1(new KokonaisLukuOperandi(4));
        pluslasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals(11, pluslasku.laske());
    }

    @Test
    public void toimiikoSummanLaskeminenNegInt() {
        pluslasku.setOperandi1(new KokonaisLukuOperandi(-4));
        pluslasku.setOperandi2(new KokonaisLukuOperandi(-8));
        assertEquals(-12, pluslasku.laske());
    }

    @Test
    public void toimiikoSummaTekstinaPosInt() {
        pluslasku.setOperandi1(new KokonaisLukuOperandi(4));
        pluslasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals("4 + 7", pluslasku.tekstina());
    }

    @Test
    public void toimiikoSummaTekstinaNegInt() {
        pluslasku.setOperandi1(new KokonaisLukuOperandi(-4));
        pluslasku.setOperandi2(new KokonaisLukuOperandi(-7));
        assertEquals("(-4) + (-7)", pluslasku.tekstina());
    }

    @Test
    public void toimiikoErotuksenLaskeminenPosInt() {
        miinuslasku.setOperandi1(new KokonaisLukuOperandi(4));
        miinuslasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals(-3, miinuslasku.laske());
    }

    @Test
    public void toimiikoErotuksenLaskeminenNegInt() {
        miinuslasku.setOperandi1(new KokonaisLukuOperandi(-4));
        miinuslasku.setOperandi2(new KokonaisLukuOperandi(-8));
        assertEquals(4, miinuslasku.laske());
    }

    @Test
    public void toimiikoErotusTekstinaInt1() {
        miinuslasku.setOperandi1(new KokonaisLukuOperandi(4));
        miinuslasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals("4 - 7", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoErotusTekstinaInt2() {
        miinuslasku.setOperandi1(new KokonaisLukuOperandi(-4));
        miinuslasku.setOperandi2(new KokonaisLukuOperandi(-7));
        assertEquals("(-4) - (-7)", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoErotusTekstinaInt3() {
        miinuslasku.setOperandi1(new KokonaisLukuOperandi(-4));
        miinuslasku.setOperandi2(new KokonaisLukuOperandi(-0));
        assertEquals("(-4) - 0", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoTulonLaskeminenPosInt() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(4));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals(28, kertolasku.laske());
    }

    @Test
    public void toimiikoTulonLaskeminenPosIntJaNollaInt() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(4));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(0));
        assertEquals(0, kertolasku.laske());
    }

    @Test
    public void toimiikoTulonLaskeminenNegInt1() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(-4));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(-8));
        assertEquals(32, kertolasku.laske());
    }

    @Test
    public void toimiikoTulonLaskeminenNegInt2() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(4));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(-8));
        assertEquals(-32, kertolasku.laske());
    }

    @Test
    public void toimiikoTuloTekstinaPosInt() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(4));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals("4 x 7", kertolasku.tekstina());
    }

    @Test
    public void toimiikoTuloTekstinaNegInt() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(-4));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(-7));
        assertEquals("(-4) x (-7)", kertolasku.tekstina());
    }

    @Test
    public void toimiikoOsamaaranLaskeminenPosInt() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(28));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(7));
            assertEquals(4, jakolasku.laske());
    }
    
    @Test
    public void toimiikoOsamaaranLaskeminenNegInt() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(-56));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(7));
            assertEquals(-8, jakolasku.laske());
    }
    
    @Test
    public void toimiikoOsamaaraTekstinaNegInt() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(-56));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(-7));
            assertEquals("(-56) / (-7)", jakolasku.tekstina());
    }
    
}
