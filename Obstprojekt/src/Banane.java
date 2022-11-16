/**
 * a) Unterklasse/Subklasse der Klasse Obst
 * b) VERERBUNG: erbt, also kennt alle Attribute und Methoden die
 * die Oberklasse/Superklasse Obst hat und kann diese ebenfalls verwenden
 * (hat allerdings nur auf öffentliche(!) Attribute und Methoden von Obst
 * direkten Zugriff)
 * c) Die Vererbung wird durch das Schlüsselwort EXTENDS ausgelöst
 */
public class Banane extends Obst{

    /**
     * privates Klassenattribut kruemmung
     */
    private double kruemmung;

    /**
     * Konstruktor der Klasse Banane
     * Die Methode super(...) im Konstruktor ruft den Konstruktor der Oberklasse Obst auf.
     * @param name
     * @param vitaminC_Gehalt
     * @param gewicht
     * @param reif
     * @param kruemmung
     */
    public Banane(String name, double vitaminC_Gehalt, double gewicht, boolean reif, double kruemmung) {
        /**
         * Mit super wird hier der Konstruktor der Oberklasse Obst
         * aufgerufen und die vier Attribute name, vitaminC_Gehalt, gewicht
         * und reif werden dabei mit übergeben.
         */
        super(name, vitaminC_Gehalt, gewicht, reif);
        this.kruemmung = kruemmung;
    }

    /**
     * öffentlicher (wegen public) GETTER für das Attribut kruemmung
     * @return kruemmung
     */
    public double getKruemmung() {
        return kruemmung;
    }

    /**
     * öffentlicher SETTER für das Attribut kruemmung
     * @param kruemmung
     */
    public void setKruemmung(double kruemmung) {
        this.kruemmung = kruemmung;
    }

    /**
     * öffentliche Methode toString()
     * @return text
     */
    @Override
    public String toString() {
        String text;
        text = super.toString(); //Aufruf der Methode toString() der Oberklasse Obst
        text += "\nKrümmung: " + this.getKruemmung();
        return text;
    }
}
