package Warenkorb;

public class Kunde {

    private String vorname;
    private String nachname;
    private Adresse adresse;

    public Kunde(String vorname, String nachname, Adresse adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        String text;
        text = "\n\nVorname: " + getVorname();
        text += "\nNachname: " + getNachname();
        text += "\nAdresse: " + getAdresse();
        return text;
    }
}
