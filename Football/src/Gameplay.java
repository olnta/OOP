
import java.util.Random;

public class Gameplay {

    private static final int SPIELZEIT = 90;
    private static final int MAX_NACHSPIELZEIT = 5;
    private static final int MAX_DAUER_BIS_AKTION = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {


        /** int m = mannschaft.getMotivation();
         *  int s = mannschaft.getStaerke();
         *  int t = mannschaft.getTrainer().getErfahrung();
         *  int mannsch = t * s * m;
         */

        int mannschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke() * mannschaft.getTrainer().getErfahrung();
        if (mannschaftswert < 1){
            mannschaftswert = 1;
        }

        return mannschaftswert;
    }


    private static boolean erzieltTor(Spieler schuetze, Torwart torwart){
        Random r = new Random();
        int  staerkeTor = schuetze.getTorschuss() + r.nextInt(5) - 2;

        if (staerkeTor < 1){
            staerkeTor = 1;
        }

        int reaktion = torwart.getReaktion() + r.nextInt(5) - 2;

        if (reaktion < 1){
            reaktion = 1;
        }

        if (staerkeTor > reaktion){
            return true;
        }else {
            return false;
        }
    }

    public static void spielen(Spiel spiel) {
        Random random = new Random();
        Mannschaft angreifer;
        Mannschaft verteidiger;

        int spieldauer = SPIELZEIT + random.nextInt(MAX_NACHSPIELZEIT + 1);
        for(int spielminute = (random.nextInt(MAX_DAUER_BIS_AKTION + 1) + 1);
            spielminute <= spieldauer;
            spielminute += random.nextInt(MAX_DAUER_BIS_AKTION + 1)){
            int mannschaftsWertHeim = ermittelMannschaftsWert(spiel.getHeim());
            int mannschaftsWertGast = ermittelMannschaftsWert(spiel.getGast());
            int zufallMannschaftSpielzug = random.nextInt(mannschaftsWertGast + mannschaftsWertHeim + 1);
            if (zufallMannschaftSpielzug > mannschaftsWertHeim){
                angreifer = spiel.getGast();
                verteidiger = spiel.getHeim();
            } else {
                angreifer = spiel.getHeim();
                verteidiger = spiel.getGast();
            }
            Spieler zufalligerSpielerAngreifer = angreifer.getSpielerliste().get(random.nextInt(angreifer.getSpielerliste().size()));
            if (erzieltTor(zufalligerSpielerAngreifer, verteidiger.getTorwart()) == true){
                zufalligerSpielerAngreifer.addTor();
                if (angreifer == spiel.getGast()){
                    spiel.getErgebnis().addToreGast();
                }else{
                    spiel.getErgebnis().addToreHeim();
                }
                spiel.getSpielbericht().append("\n" + spielminute + ". Spielminute: Der Spieler " + zufalligerSpielerAngreifer.getName() + " hat ein Tor erzielt." + "\t\t");
            } else {
                spiel.getSpielbericht().append("\n" + spielminute + ". Spielminute: Torschuss abgewert durch: " + verteidiger.getTorwart().getName());
            }
        }
        spiel.getSpielbericht().append("\n\n" + spiel.getHeim().getName() +" vs " + spiel.getGast().getName() + spiel.getErgebnis());

    }


    /**
     * ToDo:
     * neue Variable spieldauer = SPIELZEIT + Zufallswert zwischen 0 und maximaler Nachspielzeit --> Java:
     * int spieldauer = SPIELZEIT + ...
     */


    /**
     * ToDo:
     * Zählerschleife für eine neue Variable spielminute
     * a) Startwert: spielminute = Zufallswert zwischen 1(!) und maximaler Dauer bis zur nächsten Aktion + 1
     * (Erklärung: Wenn es bis zur nächsten Aktion 10 Minuten dauert, befinden wir uns in der 11. Spielminute,
     * also in der Spielminute 10 + 1.)
     * b) Endwert: spielminute <= spieldauer
     * c) Schrittweite: spielminute erhöhen um einen Zufallswert zwischen 0 und maximaler Dauer bis zur nächsten
     * Aktion
     */


    /**
     * ToDo:
     * neue Variable mannschaftsWertHeim anlegen
     * und dieser mithilfe der Methode ermittelMannschaftsWert() den Mannschaftswert der Heimmannschaft
     * zuweisen
     */


    /**
     * ToDo:
     * Dasselbe wie vor für eine neue Variable mannschaftsWertGast
     */


    /**
     * ToDo:
     * neue Variable zufallMannschaftSpielzug anlegen -->
     * int zufallMannschaftSpielzug = Zufallswert zwischen 0 und Summe der beiden oben ermittelten
     * Mannschaftswerte
     */


    /**
     * ToDo:
     * Fallunterscheidung:
     * Falls zufallMannschaftSpielzug > mannschaftsWertHeim:
     *     angreifer (Variable) = Gastmannschaft des Spiels; verteidiger (Variable) = Heimmannschaft des Spiels
     * sonst:
     *     angreifer = Heimmannschaft des Spiels; verteidiger  = Gastmannschaft des Spiels
     */


    /**
     * ToDo:
     * neue Variable zufaelligerSpielerAngreifer =
     * mithilfe einer Zufallszahl einen Spieler aus der spielerListe (= ArrayList<Spieler>) von angreifer
     * holen/"getten" [Auf den ersten Blick schwer!]
     */


    /**
     * ToDo:
     * Eine Fallunterscheidung für die existierende Klassenmethode erzieltTor() treffen:
     * Falls erzieltTor() true liefert:
     *     1. zufaelligerSpielerAngreifer ein Tor hinzufügen (Dazu vorher in Spieler eine Methode anlegen,
     *     die die Anzahl der Tore des Spielers um 1 erhöht!)
     *     2. Fallunterscheidung ob angreifer die Gastmannschaft des Spiels ist
     *         a) falls ja: Für ergebnis von spiel (spiel ist der an diese Methode spielen übergebene
     *         Parameter) mithilfe der Methode addToreGast() die Toranzahl der Gastmannschaft erhöhen
     *         (siehe Klassen Spiel und Ergebnis!)
     *         b) sonst: dasselbe wie oben, jedoch bezogen auf die Toranzahl der Heimmannschaft
     *     3. Den Spielbericht von spiel "getten" und diesem mittels der Methode append(...) einen neuen
     *     Eintrag hinzufügen (z. B. "36. Spielminute: Treffer durch Abdel Alleskönner", wobei die Werte
     *     für die Spielminute und der Name des Torschützen natürlich variabel bleiben müssen)
     * sonst:
     *     Dem Spielbericht einen Eintrag ähnlich wie "36. Spielminute: Torschuss abgewehrt durch
     *     Lukas Latte"
     */


    /**
     *  ToDo:
     * Dem Spielbericht das Spielergebnis hinzufügen, z. B.
     * "Spielergebnis:
     * Gröpelinger Grottenschlechte : Huchtinger Höllenhunde
     *  2 : 17"
     * (Natürlich müssen die Mannschaftsnamen und das Spielergebnis variabel bleiben!)
     */
}

