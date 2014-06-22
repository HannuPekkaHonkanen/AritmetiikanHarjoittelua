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
    Laskutoimitus jokinLasku;
    Laskutoimitus jokinMoniLasku;
    Laskutoimitus miinuslaskuVakioArpojalla;
    Laskutoimitustehdas LaskutoimitusOperandiTehdas;
    Laskutoimitus lasku;
    Laskutoimitus lasku1;
    Laskutoimitus lasku2;

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
            jokinLasku = laskutoimitustehdas.uusiLaskutoimitus("a");
            jokinMoniLasku = laskutoimitustehdas.uusiLaskutoimitus("m");

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
        pluslasku.setOperandi1(new KokonaisLukuOperandi(4));
        pluslasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals(11, pluslasku.laske());
    }

    @Test
    public void toimiikoErotuksenLuominen() {
        miinuslasku.setOperandi1(new KokonaisLukuOperandi(4));
        miinuslasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals("4 - 7", miinuslasku.tekstina());
    }

    @Test
    public void toimiikoErotuksenLuominen2() {
        assertEquals("0 - (-7)", miinuslaskuVakioArpojalla.tekstina());
    }

    @Test
    public void toimiikoTulonLuominen() {
        kertolasku.setOperandi1(new KokonaisLukuOperandi(4));
        kertolasku.setOperandi2(new KokonaisLukuOperandi(-7));
        assertEquals(-28, kertolasku.laske());
    }

    @Test
    public void toimiikoOsamaaranLuominen() {
        jakolasku.setOperandi1(new KokonaisLukuOperandi(28));
        jakolasku.setOperandi2(new KokonaisLukuOperandi(7));
        assertEquals("28 / 7", jakolasku.tekstina());
    }

    @Test
    public void summaSUMMAsummaLaskeminen() throws LaskToimTyypEiLoydyException {

        lasku = new Summa();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-3, -7));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("y");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-2, -5));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("y");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));

        assertEquals(-17, lasku.laske());
    }
    
    @Test
    public void summaSUMMAsummaTekstina() throws LaskToimTyypEiLoydyException {

        lasku = new Summa();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-3, -7));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("y");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-2, -5));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("y");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));

        assertEquals("(-3) + (-7) + (-2) + (-5)", lasku.tekstina());
    }

    @Test
    public void erotusEROTUSerotus() throws LaskToimTyypEiLoydyException {

        lasku = new Erotus();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-3, -1));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("v");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-9, 8));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("v");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));

        assertEquals(15, lasku.laske());
    }
    
    @Test
    public void erotusEROTUSerotusTekstina() throws LaskToimTyypEiLoydyException {

        lasku = new Erotus();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-3, -1));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("v");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-9, 8));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("v");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));

        assertEquals("((-3) - (-1)) - ((-9) - 8)", lasku.tekstina());
    }

    @Test
    public void summaEROTUStuloLaskeminen() throws LaskToimTyypEiLoydyException {

        lasku = new Erotus();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(3, -7));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("y");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-2, 5));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("k");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));

        assertEquals(6, lasku.laske());
    }

    @Test
    public void summaEROTUStuloTekstina() throws LaskToimTyypEiLoydyException {

        lasku = new Erotus();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(3, -7));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("y");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-2, 5));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("k");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));

        assertEquals("(3 + (-7)) - (-2) x 5", lasku.tekstina());
    }
    
    @Test
    public void summaTULOtuloTekstina() throws LaskToimTyypEiLoydyException {

        lasku = new Tulo();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-3, -7));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("y");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-2, -5));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("k");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));
        
        assertEquals("((-3) + (-7)) x (-2) x (-5)", lasku.tekstina());
    }
    
    @Test
    public void osamaaraTULOerotusTekstina() throws LaskToimTyypEiLoydyException {

        lasku = new Tulo();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-3, -7));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("j");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-2, -5));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("v");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));
        
        assertEquals("21 / (-7) x ((-2) - (-5))", lasku.tekstina());
    }
    
    @Test
    public void osamaaraOSAMAARAerotusTekstina() throws LaskToimTyypEiLoydyException {

        lasku = new Osamaara();
        lasku.setOnPeruslaskutoimitus(false);

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-3, -7));
        lasku1 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("j");
        lasku.setOperandi1(new LaskutoimitusOperandi(lasku1, lasku.getTyyppi()));

        LaskutoimitusOperandiTehdas = new Laskutoimitustehdas(new TestiArpojaVakioilla(-2, -5));
        lasku2 = LaskutoimitusOperandiTehdas.uusiLaskutoimitus("v");
        lasku.setOperandi2(new LaskutoimitusOperandi(lasku2, lasku.getTyyppi()));
        
        assertEquals("(21 / (-7)) / ((-2) - (-5))", lasku.tekstina());
    }
    
}
