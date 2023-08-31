package WeltvonZuul;

/**
 *  Dies ist die Hauptklasse der Anwendung "Die Welt von Zuul".
 *  "Die Welt von Zuul" ist ein sehr einfaches, textbasiertes
 *  Adventure-Game. Ein Spieler kann sich in einer Umgebung bewegen,
 *  mehr nicht. Das Spiel sollte auf jeden Fall ausgebaut werden,
 *  damit es interessanter wird!
 *
 *  Zum Spielen muss eine Instanz dieser Klasse erzeugt werden und
 *  an ihr die Methode "spielen" aufgerufen werden.
 *
 *  Diese Instanz erzeugt und initialisiert alle anderen Objekte
 *  der Anwendung: Sie legt alle Räume und einen Parser an und
 *  startet das Spiel. Sie wertet auch die Befehle aus, die der
 *  Parser liefert, und sorgt für ihre Ausführung.
 *
 * @author  Michael Kölling und David J. Barnes
 * @version 2008.03.30
 */

public class Spiel
{
    private Parser parser;
    private Spieler spieler;

    /**
     * Erzeuge ein Spiel und initialisiere die interne Raumkarte.
     */
    public Spiel(Spieler spieler){


        this.spieler = spieler;
        raeumeAnlegen();
        parser = new Parser();
    }

    /**
     * Erzeuge alle Räume und verbinde ihre Ausgänge miteinander.
     */
    private void raeumeAnlegen()
    {
        Raum lichtung, waldstueck, taverne, hexenhaus, dorfplatz, gaestezimmer,
                keller, geheimgang, piratenhoehle;
        Gegenstand korb, bierkrug, teller, schatztruhe, schwert, pilz;

        //die Gegenstände erzeugen
        korb = new Gegenstand("Korb", "ein Weidenkorb gefüllt mit Brot", 4);
        bierkrug = new Gegenstand("Bierkrug", "ein leckeres dunkles Pils in einem edlen Krug", 2.2);
        teller = new Gegenstand("Teller", "ein Teller mit deftigem Wildschweinfleisch mit Soße", 5.5);
        schatztruhe = new Gegenstand("Schatztruhe", "eine mit Gold gefüllte Holzkiste", 40);
        schwert = new Gegenstand("Schwert", "das Schwert des alten Piratenkapitäns", 10);
        pilz = new Gegenstand("Pilz", "seltsam aussehender Pilz", 1.2);

        // die Räume erzeugen
        lichtung = new Raum("auf einer Lichtung, umgeben von dunklen Tannen");
        waldstueck = new Raum("im dunklen Wald");
        taverne = new Raum("in der Taverne, mit zwielichtigen Gestalten an der Theke");
        hexenhaus = new Raum("im Hexenhaus");
        dorfplatz = new Raum("auf dem Dorfplatz");
        gaestezimmer = new Raum("in Gästezimmer");
        keller = new Raum(" in Keller");
        geheimgang = new Raum("in Geheimgang");
        piratenhoehle = new Raum("in Piratenhöhle");

        //die Gegenstände initialisieren
        lichtung.gegenstandAblegen(korb);
        taverne.gegenstandAblegen(bierkrug);
        taverne.gegenstandAblegen(teller);
        piratenhoehle.gegenstandAblegen(schatztruhe);
        piratenhoehle.gegenstandAblegen(schwert);
        waldstueck.gegenstandAblegen(pilz);

        // die Ausgänge initialisieren
        lichtung.setAusgang("west", waldstueck);
        lichtung.setAusgang("down", piratenhoehle);
        waldstueck.setAusgang("east", lichtung);
        waldstueck.setAusgang("south", dorfplatz);
        taverne.setAusgang("north", dorfplatz);
        taverne.setAusgang("up", gaestezimmer);
        taverne.setAusgang("down", keller);
        hexenhaus.setAusgang("east", dorfplatz);
        dorfplatz.setAusgang("north" , waldstueck);
        dorfplatz.setAusgang("south", taverne);
        dorfplatz.setAusgang("west", hexenhaus);
        gaestezimmer.setAusgang("down", taverne);
        keller.setAusgang("up", taverne);
        keller.setAusgang("north", geheimgang);
        geheimgang.setAusgang("south", keller);
        geheimgang.setAusgang("east", piratenhoehle);
        piratenhoehle.setAusgang("up", lichtung);
        piratenhoehle.setAusgang("west", geheimgang);
        gaestezimmer.setAusgang("window", dorfplatz);
        spieler.gehezu(lichtung); // das Spiel startet auf der Lichtung

    }



    /**
     * Die Hauptmethode zum Spielen. Läuft bis zum Ende des Spiels
     * in einer Schleife.
     */
    public void spielen()
    {
        willkommenstextAusgeben();

        // Die Hauptschleife. Hier lesen wir wiederholt Befehle ein
        // und führen sie aus, bis das Spiel beendet wird.

        boolean beendet = false;
        while (! beendet) {
            Befehl befehl = parser.liefereBefehl();
            beendet = verarbeiteBefehl(befehl);
        }
        System.out.println("Danke für dieses Spiel! Auf Wiedersehen!");
    }

    /**
     * Einen Begrüßungstext für den Spieler ausgeben.
     */
    private void willkommenstextAusgeben()
    {
        System.out.println();
        System.out.println("Willkommen zu Zuul!");
        System.out.println("Entdecken Sie die Welt von Zuul. Doch Vorsicht, überall lauern Gefahren!");
        System.out.println("Tippen Sie 'help', wenn Sie Hilfe brauchen.");
        System.out.println();
        raumInfoAusgeben();
    }

    /**
     * Verarbeite einen gegebenen Befehl (führe ihn aus).
     * @param befehl Der zu verarbeitende Befehl.
     * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
     */
    private boolean verarbeiteBefehl(Befehl befehl)
    {
        boolean moechteBeenden = false;

        if(befehl.istUnbekannt()) {
            System.out.println("Ich weiß nicht, was Sie meinen...");
            return false;
        }

        String befehlswort = befehl.gibBefehlswort();
        if (befehlswort.equals("help"))
            hilfstextAusgeben();
        else if (befehlswort.equals("go"))
            wechsleRaum(befehl);
        else if (befehlswort.equals("look"))
            raumInfoAusgeben();
        else if (befehlswort.equals("quit")) {
            moechteBeenden = beenden(befehl);

        }
        return moechteBeenden;
    }

    // Implementierung der Benutzerbefehle:

    /**
     * Gib Hilfsinformationen aus.
     * Hier geben wir eine etwas alberne und unklare Beschreibung
     * aus, sowie eine Liste der Befehlswörter.
     */
    private void hilfstextAusgeben()
    {
        System.out.println("Sie haben sich verlaufen. Sie sind allein.");
        System.out.println("Sie irren auf dem Unigelände herum.");
        System.out.println();
        System.out.println("Ihnen stehen folgende Befehle zur Verfügung:");
        System.out.println("|" + parser.getAlleBefehle());
    }

    /**
     * Versuche, den Raum zu wechseln. Wenn es einen Ausgang gibt,
     * wechsele in den neuen Raum, ansonsten gib eine Fehlermeldung
     * aus.
     */
    private void wechsleRaum(Befehl befehl)
    {
        if(!befehl.hatZweitesWort()) {
            // Gibt es kein zweites Wort, wissen wir nicht, wohin...
            System.out.println("Wohin möchten Sie gehen?");
            return;
        }

        String richtung = befehl.gibZweitesWort();

        // Wir versuchen den Raum zu verlassen.
        Raum naechsterRaum = null;
        naechsterRaum = this.spieler.getAktuellerRaum().getAusgang(richtung);

        if (naechsterRaum == null) {
            System.out.println("Dort ist keine Tür!");
        }
        else {
            spieler.gehezu(naechsterRaum);
            raumInfoAusgeben();
        }
    }

    /**
     * "quit" wurde eingegeben. Überprüfe den Rest des Befehls,
     * ob das Spiel wirklich beendet werden soll.
     * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
     */
    private boolean beenden(Befehl befehl)
    {
        if(befehl.hatZweitesWort()) {
            System.out.println("Was soll beendet werden?");
            return false;
        }
        else {
            return true;  // Das Spiel soll beendet werden.
        }
    }

    private void raumInfoAusgeben(){
        System.out.println("Sie sind " + spieler.getAktuellerRaum().gibBeschreibung());
        this.spieler.getAktuellerRaum().ausgaengeToString();
    }
}
