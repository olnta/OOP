/**
 * Klasse Banane erweitert die Klasse Obst
 * Obst ist die sogenannte Überklasse oder Superklasse.
 * Banane ist die Ünterklasse oder Subklasse.
 * Die Beziehung zwischen Banane und Obst nennt man VERERBUNG.
 * Das bedeutet, Banane besitzt alle öffentlichen Methoden (public!)
 * die Obst besitzt.
 */

public class Banane extends Obst{

    private double kruemmung;

    public Banane (String name, double vitaminC_Gehalt,  double gewicht, boolean reif, double kruemmung){
        /**
         * super() ruft den Konstruktor der Überklasse auf.
         */
        super(name, vitaminC_Gehalt, gewicht, reif);
        this.kruemmung = kruemmung;
    }

    public void setKreummung (double kruemmung){
        this.kruemmung = kruemmung;
    }

    public double getKruemmung(){
        return this.kruemmung;
    }

}
