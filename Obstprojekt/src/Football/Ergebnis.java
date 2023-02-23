package Football;

public class Ergebnis {


    //Deklaration
    private int toreHeim;
    private int toreGast;

    //Konstruktor
    public Ergebnis() {
        this.toreHeim = toreHeim;
        this.toreGast = toreGast;

    }

    //Getter
    public int getToreHeim() {
        return this.toreHeim;
    }

    public int getToreGast() {
        return this.toreGast;
    }

    //Setter
    public void addToreHeim() {
        // toreHeim = toreHeim + 1
        toreHeim++;
    }

    public void addToreGast() {
        toreGast++;
    }

    public String toString() {
        String text;
        text = "\nGast Tore: " + getToreGast();
        text += "\nHeim Tore: " + getToreHeim();
        text += "\n-----------------------------------";
        return text;
    }


}
