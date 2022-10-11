public class Obst {

    /**
     * Klassenattribute der Klasse Obst
     * sind in jeder Methode vn Obst
     * verwenbar
     */

    //daten für obst erstellen

    public String name;
    public double  VitaminC_Gehalt;
    public double gewicht;;
    public boolean reif;

    /**
     * Methode, die der sogenannte Konstruktor der
     * Klasse ist.
     * Heißt wie die Klasse selbst und legt den Ausgangzustand von Objekten diser Klasse fest.
     * @param name
     */


    public Obst(String name, double vitaminC_Gehalt, double gewicht, boolean reif){
        this.name = name;
        this.gewicht = gewicht;
        this.VitaminC_Gehalt = vitaminC_Gehalt;
        this.reif = reif;

    }

    /**
     * öffentlicher Getter für das Klassenattribut name
     * (Mit diesem kann der Wert von Name von außerhalb der Klasse gelesen werden)
     * Heißt wie die Klasse selbst und legt  dann Ausgangszustand von Objektendieser Klasse fest.
     * @return
     */

    public String getName () {
        return this.name;
    }

    public double getVitaminC_Gehalt() {
        return this.VitaminC_Gehalt;
    }

    public double getGewicht() {
        return this.gewicht;
    }

    public boolean isReif() {
        return this.reif;
    }

    /**
     * öffentlicher SETTER für das Klassenattribut vitaminC_Gehalt
     * (Mit diesem kann der Wert von vitaminC_Gehalt von außerhalb
     * der Klasse Obst geändert, also neu geschrieben werden.)
     * void bedeutet, dass die Methode nichts zurückgbibt
     * void = leerer kein datentyp
     * @param vitaminC_Gehalt
     */

    public void setVitaminC_Gehalt(double vitaminC_Gehalt) {
        this.VitaminC_Gehalt = vitaminC_Gehalt;
    }

    public void setReif(boolean reif) {
        this.reif = reif;
    }

    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }


}
