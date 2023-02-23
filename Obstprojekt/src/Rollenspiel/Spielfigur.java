package Rollenspiel;

public class Spielfigur {

    private String name;
    private int staerkepunkte;

    public Spielfigur(String name, int staerkepunkte) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }


    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public void laufen() throws KeineKraftException {
        if (this.staerkepunkte >= 1) {
            System.out.println("\n" + this.name + " läuft!");
            this.staerkepunkte--;  // für genau um -1
        } else {
            throw new KeineKraftException("Laufen", this.name);
        }
    }

    public void klettern() throws KeineKraftException {
        if (this.staerkepunkte >= 2) {
            System.out.println("\n" + this.name + " klettert!");
            staerkepunkte -= 2;
        } else {

            throw new KeineKraftException("Klettern", this.name);
        }
    }

    public void kaempfen() throws KeineKraftException {
        if (this.staerkepunkte >= 3) {
            System.out.println("\n" + this.name + " kämpft!");
            staerkepunkte = staerkepunkte - 3;
        } else {
            throw new KeineKraftException("Kämpfen", this.name);
        }
    }

    public String toString() {
        String text;
        text = "==========================";
        text += "\nName: " + getName();
        text += "\nStärke: " + getStaerkepunkte();
        return text;
    }

}
