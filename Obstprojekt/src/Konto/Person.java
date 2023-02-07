package Konto;

public abstract class Person {

    private String vorname ;
    private String nachname;
    private Adresse adresse;

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname(){
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public String toString(){
        String text;
        text = "\nName: " + getVorname();
        text += "\nNachname: " + getNachname();
        text += "\nAdresse: " + getAdresse();
        return text;
    }

}
