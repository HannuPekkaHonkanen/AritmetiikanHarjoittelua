package AritmetiikanHarjoittelua.logiikka;

/**
 *
 * @author Hannu
 */
public class AritmetiikanHarjoitus {

    private Tehtava[] tehtavat;
    private String[] vastaukset;
    private String[] tulokset;
    private int lkm;

//EXCEPTION vai ei???
    public AritmetiikanHarjoitus(String tyyppi, int lkm, Laskutoimitustehdas tehdas, KokonaislukuArpoja arpoja) throws LaskToimTyypEiLoydyException {
        this.lkm=lkm;
        this.tehtavat = new Tehtava[this.lkm];
        for (int i = 0; i < this.lkm; i++) {
            this.tehtavat[i] = new Tehtava(tehdas.uusiLaskutoimitus(tyyppi));
        }

        this.vastaukset = new String[this.lkm];
        this.tulokset = new String[this.lkm];

    }

    public void tarkistaTehtavat() {
//        this.vastaukset = vastaukset;
        for (int i = 0; i < this.lkm; i++) {
//            this.vastaukset[i] = vastaukset[i];
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
    
    public void setVastaus (int i, String vastaus){
        this.vastaukset[i]=vastaus;
    }
//    public String toString(){
//        return "";
//    }
}
