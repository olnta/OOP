public class Pruefungsfach extends Fach {

    private int pruefungsdauerInMinuten;

    public Pruefungsfach(String bezeichnung, int wochenstundenzahl, int pruefungsdauerInMinuten) {
        super(bezeichnung, wochenstundenzahl);
        this.pruefungsdauerInMinuten = pruefungsdauerInMinuten;
    }

    public int getPruefungsdauerInMinuten() {
        return this.pruefungsdauerInMinuten;
    }

    public void setPruefungsdauerInMinuten(int pruefungsdauerInMinuten) {
        this.pruefungsdauerInMinuten = pruefungsdauerInMinuten;
    }

    public String toString(){
        String text;
        text = super.toString();
        text += "Prüfungsdauer in Minuten: " + getPruefungsdauerInMinuten();
        return text;
    }
}