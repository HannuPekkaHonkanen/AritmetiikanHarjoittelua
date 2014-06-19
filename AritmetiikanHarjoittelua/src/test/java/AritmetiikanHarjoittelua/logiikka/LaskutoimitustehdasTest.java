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
    Laskutoimitustehdas vakioLaskutoimitustehdas;
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
        this.arpoja = new KokonaislukuArpoja();
        laskutoimitustehdas = new Laskutoimitustehdas(this.arpoja);
        vakioLaskutoimitustehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(0, -7));

        try {
            pluslasku = laskutoimitustehdas.uusiLaskutoimitus("y");
            miinuslasku = laskutoimitustehdas.uusiLaskutoimitus("v");
            kertolasku = laskutoimitustehdas.uusiLaskutoimitus("k");
            jakolasku = laskutoimitustehdas.uusiLaskutoimitus("j");

            miinuslaskuVakioArpojalla = vakioLaskutoimitustehdas.uusiLaskutoimitus("v");
        } catch (Exception exception) {// EXCEPTION 
            System.out.println("Väärä laskutoimitustyyppi");// EXCEPTION
        }

    }

    @After
    public void tearDown() {
    }

    @Test
    public void toimiikoSummanLuominen() {
        pluslasku.setOperandi1(new KokonaisLukuOperandi(4, true));
        pluslasku.setOperandi2(new KokonaisLukuOperandi(7, false));
        assertEquals(11, pluslasku.laske());
    }

    @Test
    public void toimiikoErotuksenLuominen() {
        miinuslasku.setOperandi1(new KokonaisLukuOperandi(4, true));
        miinuslasku.setOperandi2(new KokonaisLukuOperandi(7, false));
        assertEquals("4 - 7", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoErotuksenLuominen2() {
        assertEquals("0 - (-7)", miinuslaskuVakioArpojalla.tekstina());
    }

    @Test
    public void toimiikoTulonLuominen() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(4, true));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(-7, false));
        assertEquals(-28, kertolasku.laske());
    }

    @Test
    public void toimiikoOsamaaranLuominen() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(28, true));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(7, false));
        assertEquals("28 / 7", jakolasku.tekstina());
    }
}
