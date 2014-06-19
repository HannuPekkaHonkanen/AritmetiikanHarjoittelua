package AritmetiikanHarjoittelua.logiikka;

/**
 *
 * @author Hannu
 */
public class AritmetiikanHarjoitus {

    private Tehtava[] tehtavat;
    private String[] vastaukset;
    private String[] tulokset;

//EXCEPTION vai ei???
    public AritmetiikanHarjoitus(String tyyppi, int lkm, Laskutoimitustehdas tehdas, KokonaislukuArpoja arpoja) throws LaskToimTyypEiLoydyException {
        this.tehtavat = new Tehtava[lkm];
        for (int i = 0; i < lkm; i++) {
            this.tehtavat[i] = new Tehtava(tehdas.uusiLaskutoimitus(tyyppi));
        }

        this.vastaukset = new String[lkm];
        this.tulokset = new String[lkm];

    }

    public void tarkistaTehtavat(String[] vastaukset, int lkm) {
//        this.vastaukset = vastaukset;
        for (int i = 0; i < lkm; i++) {
            this.vastaukset[i] = vastaukset[i];
            if (this.tehtavat[i].onOikein(this.vastaukset[i])) {
                this.tulokset[i] = "Oikein!";
            } else {
                this.tulokset[i] = "Väärin. Muuta vastausta!";
            }
        }
    }

    public Tehtava[] getTehtavat() {
        return this.tehtavat;
    }

    public String[] getTulokset() {
        return this.tulokset;
    }

    public String[] getVastaukset() {
        return this.vastaukset;
    }
//    public String toString(){
//        return "";
//    }
}
