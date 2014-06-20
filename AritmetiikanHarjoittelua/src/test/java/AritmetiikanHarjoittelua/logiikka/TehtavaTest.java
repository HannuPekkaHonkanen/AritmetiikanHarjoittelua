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

    Laskutoimitustehdas vakioLaskutoimitustehdas;


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
        this.arpoja = new KokonaislukuArpoja();
        laskutoimitustehdas = new Laskutoimitustehdas(arpoja);
        vakioLaskutoimitustehdas =new Laskutoimitustehdas(new TestiArpojaVakioilla(4,7));

        try {
        jakolasku = laskutoimitustehdas.uusiLaskutoimitus("j");
        
        jakolaskuVakioArpojalla = vakioLaskutoimitustehdas.uusiLaskutoimitus("j");
        } catch (Exception exception) {// EXCEPTION 
            System.out.println("Väärä laskutoimitustyyppi");// EXCEPTION
        }
    }

    @After
    public void tearDown() {
    }

    @Test
    public void toimiikoJakolaskuTehtavanLuominen() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(28));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(7));
        Tehtava jakolaskuTehtava = new Tehtava(jakolasku);
        assertEquals("Laske: 28 / 7", jakolaskuTehtava.tekstina());
    }

    @Test
    public void toimiikoJakolaskuTehtavanLuominen2() {
        Tehtava jakolaskuTehtava = new Tehtava(jakolaskuVakioArpojalla);
        assertEquals("Laske: 28 / 7", jakolaskuTehtava.tekstina());
    }

    @Test
    public void toimiikoJakolaskuTehtavanTarkistaminen() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(-35));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(7));
        Tehtava jakolaskuTehtava = new Tehtava(jakolasku);
        assertEquals(true, jakolaskuTehtava.onOikein("-5"));
    }

    @Test
    public void toimiikoJakolaskuTehtavanTarkistaminen2() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(-35));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(7));
        Tehtava jakolaskuTehtava = new Tehtava(jakolasku);
        assertEquals(false, jakolaskuTehtava.onOikein("5"));
    }

}
