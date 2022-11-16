/**
 * a) Unterklasse/Subklasse der Klasse Obst
 * b) VERERBUNG: erbt, also kennt alle Attribute und Methoden die
 * die Oberklasse/Superklasse Obst hat und kann diese ebenfalls verwenden
 * (hat allerdings nur auf öffentliche(!) Attribute und Methoden von Obst
 * direkten Zugriff)
 * c) Die Vererbung wird durch das Schlüsselwort EXTENDS ausgelöst
 */
public class Apfel extends Obst{

    /**
     * Konstruktor der Klasse Apfel
     * @param name
     * @param vitaminC_Gehalt
     * @param gewicht
     * @param reif
     */
    public Apfel(String name, double vitaminC_Gehalt, double gewicht, boolean reif) {
        /**
         * Mit super wird hier der Konstruktor der Oberklasse Obst
         * aufgerufen und die vier Attribute name, vitaminC_Gehalt, gewicht
         * und reif werden dabei mit übergeben.
         */
        super(name, vitaminC_Gehalt, gewicht, reif);
    }

}
