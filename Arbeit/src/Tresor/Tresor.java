package Tresor;

import java.util.ArrayList;

public class Tresor {

    private ArrayList<Gegenstand> gegestaende;

    public Tresor(){
        gegestaende = new ArrayList<>();

    }

    public ArrayList<Gegenstand> getGegestaende() {
        return gegestaende;
    }

    public void setGegestaende(ArrayList<Gegenstand> gegestaende) {
        this.gegestaende = gegestaende;
    }

    public void removeGegestand(Gegenstand gegenstand){
        this.gegestaende = gegestaende;
    }

    public double berechneGesamtwert_1(){
        double gesamtwert = 0;
        for(int i = 0; i < gegestaende.size(); i++){
            gesamtwert += gegestaende.get(i).getWert();
        }
        return gesamtwert;
    }

    public double berechneGesamtwert_2(){
        double gesamtwert = 0;
        for (Gegenstand g : gegestaende){
            gesamtwert += g.getWert();
        }
        return gesamtwert;
    }


}
