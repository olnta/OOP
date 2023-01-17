package Rollenspiel;

public class Elfe extends Spielfigur {


    public Elfe(String name, int staerkepunkte) {
        super(name, staerkepunkte);
    }

    public void rennen () throws KeineKraftException{
       if (getStaerkepunkte() >= 2){
           System.out.println("\n" + getName() + " rennt!");
           setStaerkepunkte(getStaerkepunkte() - 2);
       }else {
            throw new KeineKraftException("Rennen", getName());
       }
    }

    public String toString(){
        String text;
        text = super.toString();
        return text;
    }

}
