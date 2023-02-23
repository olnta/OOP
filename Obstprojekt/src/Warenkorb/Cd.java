package Warenkorb;


public class Cd extends Ware {

    private int spieldauer;

    public Cd(String warenNr, String bezeichung, double preis, double mwst, int spieldauer) {
        super(warenNr, bezeichung, preis, mwst);
        this.spieldauer = spieldauer;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public String toString() {
        String text;
        text = super.toString();
        text += "\nSpieldauer: " + getSpieldauer();
        return text;
    }
}
