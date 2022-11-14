public class Spieler extends Person {

    private String name;
    private int alter;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler (String name, int alter, int staerke, int torschuss, int motivation, int tore){
        super(name , alter);
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }

    public String getName(){
        return this.name;
    }

    public int getAlter() {
        return this.alter;
    }

    public int getStaerke() {
        return staerke;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public int getMotivation() {
        return motivation;
    }

    public int getTore() {
        return tore;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public void setTore(int tore) {
        this.tore = tore;
    }


    public String toString(){
        String text;
        text = "Name:          " + super.getName();
        text += "\nAlter:         " + super.getAlter();
        text += "\nStärke:        " + getStaerke();
        text += "\nTorschuss:     " + getTorschuss();
        text += "\nMotivation:    " + getMotivation();
        text += "\nTore:          " + getTore();
        text += "\n-----------------------------------";
        return text;
    }

}
