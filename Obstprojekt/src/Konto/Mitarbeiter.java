package Konto;

public class Mitarbeiter extends Person{

    public Mitarbeiter(String vorname, String nachname){
        super(vorname, nachname);

    }
    public String toString(){
        String text;
        text="\n"+  "Vorname: "+ getVorname();
        text+="\n"+ "Name: " + getNachname();
        return text;
    }


}
