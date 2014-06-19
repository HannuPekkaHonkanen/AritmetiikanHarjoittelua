package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 *
 * @author Hannu
 */
public class LaskutoimitusOperandi implements Operandi {

    private int arvo;
    private String merkkijono;
    private boolean onkoLukuoperandi;
    private String laskutoimitustyyppi;

    public LaskutoimitusOperandi(Laskutoimitus laskutoimitus) {
        this.arvo = laskutoimitus.laske();
        this.merkkijono = laskutoimitus.tekstina();
        this.onkoLukuoperandi = false;
        this.laskutoimitustyyppi = laskutoimitus.getTyyppi();
    }

    @Override
    public int getArvo() {
        return this.arvo;
    }

    @Override
    public String getMerkkijono() {
        if (this.laskutoimitustyyppi.equals("y") || this.laskutoimitustyyppi.equals("v")) {
            return "(" + this.merkkijono + ")";
        }
        return this.merkkijono;
    }

    @Override
    public void setArvo(int luku) {
        this.arvo = luku;
    }

    @Override
    public void setMerkkijono(String merkkijono) {
        this.merkkijono = merkkijono;
    }

    @Override
    public boolean onLuku() {
        return this.onkoLukuoperandi;
    }

    public String getLaskutoimitustyyppi() {
        return this.laskutoimitustyyppi;
    }
}
