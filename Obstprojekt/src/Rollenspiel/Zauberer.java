package Rollenspiel;

public class Zauberer extends Spielfigur{

    private int zauberpunkte;

    public Zauberer(String name, int staerkepunkte, int zauberpunkte) {
        super(name, staerkepunkte);
        this.zauberpunkte = zauberpunkte;

    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public void zauber() throws KeineKraftException{
        if (zauberpunkte >= 1){
            System.out.println("\n" + getName() + " zaubert!");
            zauberpunkte--;
        } else {
            throw new KeineKraftException("Zaubern", getName());
        }

    }

    public String toString(){
        String text;
        text = super.toString();
        text += "\nZauberpunkte: " + getZauberpunkte();
        return text;
    }
}
