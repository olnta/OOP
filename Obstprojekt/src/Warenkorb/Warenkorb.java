package Warenkorb;

import java.util.ArrayList;

public class Warenkorb {

    private Kunde kunde;
    private ArrayList<Ware> warenListe;

    public Warenkorb(Kunde kunde) {
        this.kunde = kunde;
        warenListe = new ArrayList<>();
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void addWare(Ware ware) {
        warenListe.add(ware);
    }

    public void removeWare(Ware ware) throws WarenNichtGefundenException {
        if (warenListe.contains(ware)) {
            warenListe.remove(ware);
        } else {
            throw new WarenNichtGefundenException(ware.getWarenNRr());
        }
    }

    public Ware getWare(String warenNr) throws WarenNichtGefundenException {
        for (Ware w : warenListe) {
            if (warenNr == w.getWarenNRr()) {
                return w;
            }
        }
        throw new WarenNichtGefundenException(warenNr);
    }


    public int getAnzahlWaren() {
        int anzahl = 0;
        for (int i = 0; i < warenListe.size(); i++) {
            anzahl = anzahl + 1;
        }
        return anzahl;
    }

    public double getPreisGesamt() {
        double preisgesamt = 0;
        for (Ware w : warenListe) {
            preisgesamt += w.getPreis();
        }
        return preisgesamt;
    }

    public String toString() {
        String text;
        text = "Kunde: " + getKunde();
        text += "\n\nWaren Liste: ";
        for (Ware w : warenListe) {
            text += "\n" + w;
        }
        text += "\n\nAnzahl der Waren: " + getAnzahlWaren();
        text += "\nGesamt Preis berechenen: " + getPreisGesamt() + "€\n";
        return text;
    }
}
