package Kaufvertrag;

import java.util.ArrayList;

public class Ware {

    private String bezeichnung;
    private String bescheirbung;
    private double preis;
    private ArrayList<String> besonderheiten;
    private ArrayList<String> maengel;

    public Ware(String bezeichnung, double preis){
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        besonderheiten = new ArrayList<>();
        maengel = new ArrayList<>();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBescheirbung() {
        return bescheirbung;
    }

    public void setBescheirbung(String bescheirbung) {
        this.bescheirbung = bescheirbung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public ArrayList<String> getMaengel() {
        return maengel;
    }

    public String toString(){
        String text;
        text = "\n\nBezeichnung: " + getBezeichnung();
        text += "\nBeschreibung: " + getBescheirbung();
        text += "\nPreis: " + getPreis();
        text += "\n\nBesonderheiten ";
        for (String b : besonderheiten) {
            text += "\n" + b;
        }
        text += "\n\nMängel";
        for (String m : maengel) {
            text += "\n" + m;
        }
        return text;
    }
}
