package Kaufvertrag;

import java.io.PrintWriter;

public class Vertragspartner {

    private String vorname;
    private String nachname;
    private String ausweisNr;
    private Adresse adresse;

    public Vertragspartner(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
        this.ausweisNr = ausweisNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void erstelleVertragsPartner(Vertragspartner vertragspartner, PrintWriter pw){
        pw.print(vertragspartner.getVorname() + "," + vertragspartner.getNachname() + ";");
        pw.print(vertragspartner.getAdresse().getStrasse() + " " + vertragspartner.getAdresse().getHausNr() + ";");
        pw.print(vertragspartner.getAdresse().getPlz() + ";");
        pw.print(vertragspartner.getAdresse().getOrt() + ";");
    }

    public String toString() {
        String text;
        text = "\n\nVorname: " + getVorname();
        text += "\nNachname: " + getNachname();
        text += "\nAusweis Nummer: " + getAusweisNr();
        text += "\nAdresse: " + getAdresse();
        return text;
    }
}
