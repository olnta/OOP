package Tresor;

import java.util.ArrayList;

public class Tresor {

    private ArrayList<Gegenstand> gegenstaende;

    public Tresor() {
        gegenstaende = new ArrayList<>();
    }

    public ArrayList<Gegenstand> getGegenstaende() {
        return gegenstaende;
    }

    public void addGegenstaende(Gegenstand gegenstand) {
        gegenstaende.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand) throws GegenstandNichtGefundenException {
        if (gegenstaende.contains(gegenstand)) {
            gegenstaende.remove(gegenstand);
        } else {
            throw new GegenstandNichtGefundenException(gegenstand.getId());
        }
    }

    /**
     * public double berechneGesamtwert() {
     * double gesamtWert = 0;
     * for(int i = 0; i < gegenstaende.size(); i++) {
     * gesamtWert += gegenstaende.get(i).getWert();
     * }
     * return gesamtWert;
     * }
     **/

    public double berechneGesamtwert() {
        double gesamtwert = 0;
        for (Gegenstand g : gegenstaende) {
            gesamtwert += g.getWert();
        }
        return gesamtwert;
    }

    public Gegenstand getGegenstand(int id) throws GegenstandNichtGefundenException {
        // Schleife und gefundenen Gegenstand aus der Schleife zurückgeben
        for (Gegenstand g : gegenstaende) {
            if (g.getId() == id) {

            } else {
                throw new GegenstandNichtGefundenException(id);
            }
        }
        return getGegenstand(id);
    }
    // hinter der Schleife (Hier kommt der Ablauf auch NUR DANN HIN, wenn vorher kein erfolgreiches
    // RETURN stattfinden konnte!): Exception werfen


    public String toString() {
        String t;
        t = "Gegenstände Liste: ";
        for (Gegenstand g : gegenstaende) {
            t += "\n" + g;
        }
        t += "\n\nGegestände berechenen: " + berechneGesamtwert();
        return t;
    }
}

