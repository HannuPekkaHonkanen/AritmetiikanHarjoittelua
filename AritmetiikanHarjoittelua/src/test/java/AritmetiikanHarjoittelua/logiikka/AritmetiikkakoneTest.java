package AritmetiikanHarjoittelua.logiikka;

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
public class AritmetiikkakoneTest {

    Aritmetiikkakone kone;
    String[] lasketutTulokset;
    String[] testiTulokset;
    final int lkm = 100;

    public AritmetiikkakoneTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.kone = new Aritmetiikkakone();

        lasketutTulokset = new String[lkm];
        testiTulokset = new String[lkm];

    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void testLuoHarjoitusJaTarkistaTehtavat() {

        boolean oikeinMeni = true;

        try {
            this.kone.luoHarjoitus("m", lkm);
        } catch (Exception exception) {// EXCEPTION 
            System.out.println("Airmetiikkakone.luoHarjoitus-virhe");// EXCEPTION
        }
        for (int i = 0; i < lkm; i++) {
            this.kone.getAktiivinenHarjoitus().setVastaus(i, this.kone.getAktiivinenHarjoitus().getTehtavat()[i].oikeaVastaus());
        }
        this.kone.getAktiivinenHarjoitus().tarkistaTehtavat();
        for (int i = 0; i < lkm; i++) {
            if (!this.kone.getAktiivinenHarjoitus().getTulokset()[i].equals("Oikein!")) {
                oikeinMeni = false;
            }
        }
        this.kone.lopetus(lkm);
        assertEquals(true, oikeinMeni);

    }
}
