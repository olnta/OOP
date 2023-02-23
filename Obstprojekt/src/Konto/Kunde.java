package Konto;

public class Kunde extends Person {
    public Mitarbeiter betreuer;


    public Kunde(String vorname, String nachname, Mitarbeiter betreuer) {
        super(vorname, nachname);
        this.betreuer = betreuer;
    }

    public String toString() {
        String text;
        text = "\n" + "Vorname   " + getVorname();
        text += "\n" + "Nachname  " + getNachname();
        text += "\n" + "Mitarbeiter   " + betreuer;
        return text;
    }
}
