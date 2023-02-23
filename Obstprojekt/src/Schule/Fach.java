public class Fach {

    private String bezeichnung;
    private int wochenstundenzahl;

    public Fach (String bezeichnung, int wochenstundenzahl){
        this.bezeichnung = bezeichnung;
        this.wochenstundenzahl = wochenstundenzahl;

    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public int getWochenstundenzahl() {
        return this.wochenstundenzahl;
    }

    public void setWochenstundenzahl( int wochenstundenzahl){
        this.wochenstundenzahl = wochenstundenzahl;
    }

    public String toString(){
        String text;
        text = "\nUnterrichtsfach: " +  getBezeichnung();
        text += "\nWochenstundenzahl: "  + getWochenstundenzahl();
        text += "\n";
        return text;
    }


}
