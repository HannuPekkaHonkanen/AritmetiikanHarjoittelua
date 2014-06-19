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
                return this.merkkijono;
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


//        if (this.paalaskutoimitustyyppi.equals("j")) {
//            return "(" + this.merkkijono + ")";
//        }
//        if (this.laskutoimitustyyppi.equals("y") || this.laskutoimitustyyppi.equals("v") || this.paalaskutoimitustyyppi.equals("j")) {
//            return "(" + this.merkkijono + ")";
//        }
//        return this.merkkijono;
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
