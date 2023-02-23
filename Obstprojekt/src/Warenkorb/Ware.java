package Warenkorb;


public class Ware {

    private String warenNRr;
    private String bezeichnung;
    private double preis;
    private double mwst;

    public Ware(String warenNRr, String bezeichnung, double preis, double mwst) {
        this.warenNRr = warenNRr;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.mwst = mwst;
    }

    public String getWarenNRr() {
        return warenNRr;
    }


    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getMwst() {
        return mwst;
    }

    public void setMwst(double mwst) {
        this.mwst = mwst;
    }

    public String toString() {
        String text;
        text = "\nWarennummer: " + getWarenNRr();
        text += "\nBezeichnung: " + getBezeichnung();
        text += "\nPreis: " + getPreis() + "€";
        text += "\nMehrwertsteuer: " + getMwst() + "€";
        return text;
    }
}
