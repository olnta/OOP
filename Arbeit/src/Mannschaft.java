import java.util.ArrayList;

public class Mannschaft {

    //Deklaration
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerliste;

    //Konstruktor
    public Mannschaft( String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerliste){
        super();
        this.name =name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.spielerliste = spielerliste;

    }


    //Getter
    public String getName() {
        return this.name;
    }

    public Trainer getTrainer() {
        return this.trainer;
    }

    public Torwart getTorwart() {
        return this.torwart;
    }

    public ArrayList<Spieler> getSpielerliste() {
        return this.spielerliste;
    }

    public void getStaerke(){
        int gesamtStaerke = 0;
        for (int i = 0; i < spielerliste.size(); i++){
            gesamtStaerke += spielerliste.get(i).getStaerke();
        }
        gesamtStaerke = gesamtStaerke / spielerliste.size();



    }

    public void getMotivation(){
        int teamMotivation = 0;
        int summeMotivation = 0;

        /**for (Spieler s = spielerliste)
         */
        for (int i = 0; i < spielerliste.size(); i++){
            summeMotivation += spielerliste.get(i).getMotivation();
        }
        summeMotivation = summeMotivation / spielerliste.size();
    }




    //Setter
    public void setName (String name){
        this.name = name;
    }

    public void setTrainer (Trainer trainer){
        this.trainer = trainer;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public void setSpielerliste(ArrayList<Spieler> spielerliste){
        this.spielerliste = spielerliste;
    }


    public String toString(){
        String text;
        text = "Name:" + getName();
        text += "\nTrainer: " + getTrainer();
        text += "\nTorwart: " + getTorwart();
        text += "\nListe der Spieler: " + getSpielerliste();
        return text;
    }





}
