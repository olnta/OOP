public class Spieler {

    private String name;
    private int alter;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int tore;

    public Spieler (String name, int alter, int staerke, int torschuss, int motivation, int tore){
        this.name =name;
        this.alter = alter;
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.tore = tore;
    }

    public String getName(){return this.name;}
    public int getAlter() {return this.alter;}
    public int getStaerke() {return staerke;}
    public int getTorschuss() {return torschuss;}
    public int getMotivation() {return motivation;}
    public int getTore() {return tore;}


    public void setName(String name) {this.name = name;}
    public void setAlter(int alter) {this.alter = alter;}
    public void setStaerke(int staerke) {this.staerke = staerke;}
    public void setTorschuss(int torschuss) {this.torschuss = torschuss;}
    public void setMotivation(int motivation) {this.motivation = motivation;}
    public void setTore(int tore) {this.tore = tore;}

    public String toString;
}
