package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class KokonaisLukuOperandi implements Operandi {

    private int arvo;
    private String merkkijono;
    private boolean onkoLukuoperandi;
    private boolean ensimmainenOperandi;
    private String laskutoimitustyyppi;

    public KokonaisLukuOperandi(int luku, boolean ensimmainenOperandi) {
        this.arvo = luku;
        this.merkkijono = Integer.toString(luku);
        this.onkoLukuoperandi = true;
        this.ensimmainenOperandi = ensimmainenOperandi;
        this.laskutoimitustyyppi = "eiLaskutoimitus";
    }

    @Override
    public int getArvo() {
        return this.arvo;
    }

    @Override
    public String getMerkkijono() {
        if (this.arvo < 0 && !this.ensimmainenOperandi) {
            this.merkkijono = "(" + this.merkkijono + ")";
        }
        return this.merkkijono;
    }

    @Override
    public boolean onLuku() {
        return this.onkoLukuoperandi;
    }

    @Override
    public void setArvo(int luku) {
        this.arvo = luku;
    }

    @Override
    public void setMerkkijono(String merkkijono) {
        this.merkkijono = merkkijono;
    }

    public String getLaskutoimitustyyppi() {
        return this.laskutoimitustyyppi;
    }
}
