public class Trainer extends Person {

    private String name;
    private int alter;
    private int erfahrung;

    public Trainer (String name, int alter, int erfahrung){
        super(name,alter);
        this.erfahrung =erfahrung;
    }

    public String getName() {
        return this.name;
    }

    public int getAlter() {
        return this.alter;
    }

    public int getErfahrung() {
        return this.erfahrung;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }


    public String toString(){
        String text;
        text = "Name:          " + super.getName();
        text+= "\nAlter:         " + super.getAlter();
        text+= "\nErfahrung:     " + getErfahrung();
        text += "\n-----------------------------------";
        return text;
    }

}
