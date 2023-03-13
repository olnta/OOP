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


    public String toString() {
        String text;
        text = "\n===========================";
        text += "\nVorname: " + getVorname();
        text += "\nNachname: " + getNachname();
        text += "\nAusweis Nummer: " + getAusweisNr();
        text += "\nAdresse: " + getAdresse();
        return text;
    }
}
