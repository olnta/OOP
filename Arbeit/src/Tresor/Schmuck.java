package Tresor;

public class Schmuck extends Gegenstand{

    private String bezeichnung;

    public Schmuck(int id, double wert, String bezeichnung){
        super(id, wert);
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String toString(){
        String text;
        super.toString();
        text = "\nBezeichnung: " + getBezeichnung();
        return text;
    }
}
