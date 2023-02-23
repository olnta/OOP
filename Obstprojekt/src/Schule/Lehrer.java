import java.util.ArrayList;

public class Lehrer{

    private String name;
    private String vorname;
    private ArrayList<Fach> faecher;

    public Lehrer ( String name, String vorname, ArrayList<Fach> faecher){
        this.name = name;
        this.vorname = vorname;
        this.faecher = faecher;
    }

    public String getName() {
        return this.name;
    }

    public String getVorname() {
        return this.vorname;
    }

    public ArrayList<Fach> getFaecher() {
        return this.faecher;
    }

    public String toString () {
        String text;
        text = "===============================";
        text += "\n";
        text += "\nName: " + getName() + ", " + getVorname();
        text += "\nUnterrichtet die folgenden Fächer:";
        for (Fach f: getFaecher()){
            text += "\n" + f;
        }
        text += "\n";
        return text;
   }
}
