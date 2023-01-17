package Obst;

/**
 * Unterklasse/Subklasse der Klasse Obst.Obst
 */
public class Orange extends Obst {

    /**
     * privates Klassenattribut kernlos
     */
    private boolean kernlos;

    /**
     * Konstruktor der Klasse Obst.Obst.Orange
     * @param name
     * @param vitaminC_Gehalt
     * @param gewicht
     * @param reif
     * @param kernlos
     */
    public Orange(String name, double vitaminC_Gehalt, double gewicht, boolean reif, boolean kernlos) {
        super(name, vitaminC_Gehalt, gewicht, reif);
        this.kernlos = kernlos;
    }

    /**
     * öffentlicher GETTER für das Attribut kernlos
     * @return kernlos
     */
    public boolean isKernlos() {
        return kernlos;
    }

    /**
     * öffentlicher SETTER für das Attribut kernlos
     * @param kernlos
     */
    public void setKernlos(boolean kernlos) {
        this.kernlos = kernlos;
    }

    /**
     * öffentliche Methode toString()
     * @return text
     */
    @Override
    public String toString() {
        String text;
        text = super.toString(); //Aufruf der Methode toString() der Oberklasse Obst.Obst
        text += "\nkernlos? - " + this.isKernlos();
        return text;
    }

}
