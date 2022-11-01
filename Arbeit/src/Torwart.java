public class Torwart extends Spieler {

    private int reaktion;


    public Torwart(String name, int alter, int staerke, int motivation,int reaktion ) {
        super(name, alter, staerke, 0, motivation, reaktion);
        this.reaktion = reaktion;
    }


    public void setReaktion(int reaktion){
        this.reaktion = reaktion;
    }

    public String toString;
    String text;
    text ="Name: " + getName();
    text += "\nReaktion:  " + getReaktion();
    return text;

}
