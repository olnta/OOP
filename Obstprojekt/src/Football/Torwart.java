package Football;

public class Torwart extends Spieler {

    private int reaktion;


    public Torwart(String name, int alter, int staerke, int motivation, int reaktion) {
        super(name, alter, staerke, 0, motivation, reaktion);
        this.reaktion = reaktion;
    }


    public int getReaktion() {
        return this.reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

    public String toString() {
        String text;
        text = super.toString();
        text += "\nReaktion: " + getReaktion();
        return text;
    }


}
