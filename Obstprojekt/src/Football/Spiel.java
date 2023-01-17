package Football;

public class Spiel {

    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis;
    private StringBuilder spielbericht;

    public Spiel(Mannschaft heim, Mannschaft gast){
        this.heim = heim;
        this.gast = gast;
        ergebnis = new Ergebnis();
        spielbericht = new StringBuilder();
    }

    public Mannschaft getHeim(){
        return this.heim;
    }

    public Mannschaft getGast(){
        return this.gast;
    }

    public Ergebnis getErgebnis(){
        return this.ergebnis;
    }

    public StringBuilder getSpielbericht(){
        return this.spielbericht;
    }

    public String toString(){
        String text;
        text = "Heim:"              + getHeim();
        text += "\nGast:"           + getGast();
        text += "\nErgebnis:"       + getErgebnis();
        text += "\nSpielbericht:"   + getSpielbericht();
        return text;
    }

}
