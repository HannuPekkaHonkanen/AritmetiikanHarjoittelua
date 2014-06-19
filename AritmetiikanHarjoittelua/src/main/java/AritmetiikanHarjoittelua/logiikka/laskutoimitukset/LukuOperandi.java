package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class LukuOperandi implements Operandi {

    private int arvo;
    private String merkkijono;
    private boolean onkoLukuoperandi;
    private String laskutoimitustyyppi;

    public LukuOperandi(int luku) {
        this.arvo = luku;
        this.merkkijono = Integer.toString(luku);
        this.onkoLukuoperandi = true;
        this.laskutoimitustyyppi = "eiLaskutoimitus";
    }

    @Override
    public int getArvo() {
        return this.arvo;
    }

    @Override
    public String getMerkkijono() {
        if (this.arvo < 0) {
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
