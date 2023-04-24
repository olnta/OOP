package WeltvonZuul;

public class Gegenstand {

    private String name;
    private String beschreibung;
    private double gewicht;

    public Gegenstand(String name, String beschreibung, double gewicht){
        this.name = name;
        this.beschreibung = beschreibung;
        this.gewicht = gewicht;
    }

    public String toString(){
        String text;
        text = name + "--" + beschreibung + ", " + gewicht ;
        return text;
    }
}
