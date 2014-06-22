package AritmetiikanHarjoittelua.logiikka.laskutoimitukset;

/**
 * Luokka toteuttaa rajapinnan Operandi. Luokan avulla voidaan luoda moniosaisia laskutoimituksia.
 */
public class LaskutoimitusOperandi implements Operandi {

    private int arvo;
    private String merkkijono;
    private boolean onkoLukuoperandi;
    private String laskutoimitustyyppi;
    private String paalaskutoimitustyyppi;

    public LaskutoimitusOperandi(Laskutoimitus laskutoimitus, String paalaskutoimitustyyppi) {
        this.arvo = laskutoimitus.laske();
        this.merkkijono = laskutoimitus.tekstina();
        this.onkoLukuoperandi = false;
        this.laskutoimitustyyppi = laskutoimitus.getTyyppi();
        this.paalaskutoimitustyyppi = paalaskutoimitustyyppi;
    }

    @Override
    public int getArvo() {
        return this.arvo;
    }

    @Override
    public String getMerkkijono() {
        switch (this.paalaskutoimitustyyppi) {
            case "y":
                return this.merkkijono;
            case "v":
                switch (this.laskutoimitustyyppi) {
                    case "y":
                        return "(" + this.merkkijono + ")";
                    case "v":
                        return "(" + this.merkkijono + ")";
                    case "k":
                        return this.merkkijono;
                    case "j":
                        return this.merkkijono;
                    default:
                        return this.merkkijono;
                }
            case "k":
                switch (this.laskutoimitustyyppi) {
                    case "y":
                        return "(" + this.merkkijono + ")";
                    case "v":
                        return "(" + this.merkkijono + ")";
                    case "k":
                        return this.merkkijono;
                    case "j":
                        return this.merkkijono;
                    default:
                        return this.merkkijono;
                }
            case "j":
                return "(" + this.merkkijono + ")";
            default:
                return this.merkkijono;
        }

    }

}
