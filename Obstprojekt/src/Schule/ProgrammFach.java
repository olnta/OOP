import java.util.ArrayList;

public class ProgrammFach {

    public static void main(String[] args) {


        Fach bwl = new Fach("Betriebswirtschaftslehre", 2);
        Fach vwl = new Fach("Volkswirtschaftslehre", 2);
        Fach rewe = new Fach("Rechnungswesen", 2);


        Pruefungsfach engl = new Pruefungsfach("Englisch", 2, 180);
        Pruefungsfach deu = new Pruefungsfach("Deutsch", 2, 180);
        Pruefungsfach info = new Pruefungsfach("Informatik", 5, 240);
        Pruefungsfach mathe = new Pruefungsfach("Mathematik", 6, 210);


        ArrayList faecherLemp  = new ArrayList<>();
        faecherLemp.add(vwl);
        faecherLemp.add(bwl);
        faecherLemp.add(deu);

        Lehrer lehrer1 = new Lehrer("Lemple", "Lisa", faecherLemp);

        ArrayList<Fach> faecherDemir = new ArrayList<>();
        faecherDemir.add(mathe);
        faecherDemir.add(rewe);

        Lehrer lehrer2 = new Lehrer("Demirkaya", "Yusuf", faecherDemir);


        System.out.println(lehrer1);
        System.out.println(lehrer2);

    }
}
