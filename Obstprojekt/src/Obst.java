/**
 * Klasse Obst, die also Oberklasse/Superklasse der Klassen
 * Apfel, Banane, Weintrauben dienen soll.
 *
 * Wurde als ABSTRAKTE KLASSE deklariert, weil sie nur für
 * die Vererbung dienen soll. Objekte/Instanzen hingegen
 * sollen von dieser Klasse nicht erstellt werden können.
 */
public abstract class Obst {

    /**
     * nicht-öffentliche, d. h. private Klassenattribute
     * a) Klassenattribute: in allen Methoden der Klasse verwendbare Attribute
     * b) nicht-öffentlich: wegen des Zugriffsmodifizierers private,
     * somit nicht von außerhalb der Klasse lesbar oder veränderbar
     */
    private String name;
    private double vitaminC_Gehalt;
    private double gewicht;
    private boolean reif;

    /**
     * Konstruktor der Klasse
     * a) Ist eine Methode der Klasse, aber eine besondere Methode.
     * b) Wird außerhalb der Klasse benötigt, um Instanzen/Objekte der Klasse zu erstellen.
     * c) Bestimmt, für welche Attribute die Instanzen/Objekte der Klasse einen Wert
     * erhalten müssen:
     * c1) Die entsprechenden Attribute sind als Parameter in der Klammer
     * deklariert und werden innerhalb der Konstruktormethode an die
     * Klassenattribute (erkennbar am this.) weitergereicht.
     * d) Der Konstruktor muss exakt so heißen wie die Klasse selbst.
     * e) Ein Konstruktor hat KEINEN Rückgabetyp (KEIN void, int, String, double, boolean etc.)!
     * @param name
     * @param vitaminC_Gehalt
     * @param gewicht
     * @param reif
     */
    public Obst(String name, double vitaminC_Gehalt, double gewicht, boolean reif) {
        this.name = name;
        this.vitaminC_Gehalt = vitaminC_Gehalt;
        this.gewicht = gewicht;
        this.reif = reif;
    }

    /**
     * öffentliche Methode, die das Klassenattribut name zurückgibt/liefert
     * a) öffentlich wegen public
     * b) Datentyp der Methode muss dem Datentyp des Attributs entsprechen,
     * das zurückgegeben wird (hier: String --> Wenn diese Methode
     * aufgerufen wird, liefert sie einen String zurück)
     * c) Ist dazu da, um von außerhalb der Klasse den Wert des
     * Klassenattributs name lesen/auslesen zu können.
     * d) Da die Methode den Wert eines Klassenattributs zurückgibt,
     * ist sie ein sogenannter GETTER
     * e) An die Methode werden keine Parameter übergeben. Die Klammer
     * ist aber trotzdem notwendig, damit erkennbar ist, dass es sich
     * hier um eine Methode handelt.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }


    /**
     * öffentliche Methode, mit der das Klassenattribut gewicht
     * überschrieben, also geändert werden kann
     * a) Datentyp der Methode = void = sogenannter "leerer" Datentyp
     * (Die Methode gibt keine Daten zurück!)
     * b) Ist dazu da, um von außerhalb der Klasse den Wert des
     * Klassenattributs gewicht überschreiben, also verändern, sprich
     * neu setzen zu können.
     * c) Da die Methode den Wert eines Klassenattributs neu setzt
     * ist sie ein sogenannter SETTER.
     * d) Bei Aufruf der Methode muss in Klammern ein Wert mitgegeben werden,
     * der zunächst in der lokalen Variable gewicht gespeichert und
     * dann an das Klassenattribut (erkennbar am this.) gewicht
     * weitergereicht wird.
     *
     * @return gewicht
     */
    public double getGewicht() {
        return this.gewicht;
    }

    /**
     * öffentlicher GETTER für das Attribut vitaminC_Gehalt
     * @return vitaminC_Gehalt
     */
    public double getVitaminC_Gehalt() {
        return this.vitaminC_Gehalt;
    }

    /**
     * öffentlicher GETTER für das Attribut reife
     * @return reife
     */
    public boolean isReif() {
        return this.reif;
    }

    /**
     * öffentlicher SETTER für das Attribut gewicht
     * Wird die Methode setGewicht(...) aufgerufen, wird mit ihr der Wert
     * des Attributs gewicht geschrieben.
     * Die Methode gibt nichts zurück/ liefert nichts. Ihr Datentyp ist
     * somit void (= leer).
     * Die Methode hat allerdings einen Parameter gewicht (Inhalt der Klammer)
     * vom Typ double. Bei Aufruf der Methode setGewicht muss in Klammern
     * ein double-Wert mitgegeben werden, der als "gewicht" zwischengespeichert
     * wird. Dieses zwischengespeichert "gewicht" wird in der Methode an die
     * Klassenvariable gewicht übertragen.
     * @param gewicht
     */
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    /**
     * öffentlicher SETTER für das Attribut vitaminC_Gehalt
     * @param vitaminC_Gehalt
     */
    public void setVitaminC_Gehalt(double vitaminC_Gehalt) {
        this.vitaminC_Gehalt = vitaminC_Gehalt;
    }

    /**
     * öffentlicher SETTER für das Attribut reif
     * @param reif
     */
    public void setReif(boolean reif) {
        this.reif = reif;
    }

    /**
     * öffentliche toString()-Methode
     * Diese überschreibt die von der allgemeinen Oberklasse Object vererbte
     * Methode toString().
     * Jede Klasse ohne deklarierte Oberklasse, also jede Klasse ohne EXTENDS,
     * hat die vordefinierte Java-Klasse Object als Oberklasse.
     * Durch das Hinzufügen der sogenannten Annotation @Override (siehe unten)
     * wird u. a. dem Java-Programm gesagt, dass hier eine bereits geerbte
     * Methode überschrieben wird, also neu definiert wird.
     * Findet das Java-Programm in der Oberklasse Object keine eigene toString()-
     * Methode, meldet es dies!
     * @return text
     */

    public String toString() {
        /**
         * Lokale Variable text
         * D. h. Variable, die nur INNERHALB der toString()-
         * Methode bekannt und damit benutzbar ist.
         */
        String text;
        text = "Obstsorte: " + this.getName();
        text = text + "\nVitamin-C-Gehalt: " + this.getVitaminC_Gehalt();
        /**
         * kürzere Alternative zu 'text = text + ...' -->
         * 'text += ...' [PlusGleich!] -->
         * 'text += "Vitamin-C-Gehalt: " + this.getVitaminC_Gehalt();'
         */
        text = text + "\nGewicht: " + this.getGewicht();
        text = text + "\nreif? - " + this.isReif();
        return text;
    }

}
