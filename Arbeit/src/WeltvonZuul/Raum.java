package WeltvonZuul;

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


    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgänge.
     * @param beschreibung enthält eine Beschreibung in der Form
     *        "in einer Küche" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) {
        this.beschreibung = beschreibung;
        ausgaenge = new HashMap<>();
    }


    public void setAusgang(String richtung, Raum nachbar){
        ausgaenge.put(richtung, nachbar);
    }


    public Raum getAusgang(String richtung)
    {
        return ausgaenge.get(richtung);
    }


    public void ausgaengeToString() {

        for (String s : ausgaenge.keySet()) {
            System.out.print(s + " ");
        }
    }


    public String gibBeschreibung()
    {
        return beschreibung;
    }

}
