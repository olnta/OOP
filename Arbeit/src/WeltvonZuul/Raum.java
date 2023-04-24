package WeltvonZuul;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 *
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den
 * benachbarten Raum.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Raum {

    public String beschreibung;
    private HashMap<String, Raum> ausgaenge;
    private ArrayList<Gegenstand> gegenstaende;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgänge.
     * @param beschreibung enthält eine Beschreibung in der Form
     *        "in einer Küche" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) {
        this.beschreibung = beschreibung;
        ausgaenge = new HashMap<>();
        gegenstaende = new ArrayList<Gegenstand>();
    }

    public void setAusgang(String richtung, Raum nachbar){
        ausgaenge.put(richtung, nachbar);
    }

    public Raum getAusgang(String richtung)
    {
        return ausgaenge.get(richtung);
    }

    public String ausgaengeToString() {
        String allausgaenge = "";
        for (String s : ausgaenge.keySet()) {
            allausgaenge += s + " ";
        }
        return allausgaenge;
    }

    public String gibBeschreibung() {
        String text = "";
        text += "Sie sind " + this.beschreibung + "\nAusgänge: | " + ausgaengeToString();
        text += "\nGegenstände an diesem Ort: ";
        if(this.gegenstaende.isEmpty()) {
            text += "\nkeine Gegenstände vorhanden";
        } else {
            for(Gegenstand g: gegenstaende) {
                text += "\n" + g.toString();
            }
        }
        return text;
    }

    public void gegenstandAblegen(Gegenstand g)
    {
        gegenstaende.add(g);
    }

    public ArrayList<Gegenstand> getAlleGegenstaende()
    {
        return gegenstaende;
    }

    public void entferneGegenstand(Gegenstand g)
    {
        gegenstaende.remove(g);
    }


}
