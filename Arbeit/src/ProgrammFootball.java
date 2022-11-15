import java.util.ArrayList;

public class ProgrammFootball {

    public static void main(String[] args) {


        Trainer trainer = new Trainer("Tomas",  30, 8 );
        Torwart torwart = new Torwart("Bob", 27, 6,8, 10);
        Spieler spieler1 = new Spieler ("Mathew", 18, 7, 20,8, 19);
        Spieler spieler2 = new Spieler("Peter", 20, 8, 30, 7, 25 );
        Spieler spieler3 = new Spieler ("John", 24,7, 20,8,17);
        Spieler spieler4 = new Spieler("Tom", 18, 9, 35, 10, 30 );
        Spieler spieler5 = new Spieler("Max", 25, 8,40,10,30);



        ArrayList spielerlisteBarcelona = new ArrayList();
        spielerlisteBarcelona.add(spieler1);
        spielerlisteBarcelona.add(spieler2);
        spielerlisteBarcelona.add(spieler3);
        spielerlisteBarcelona.add(spieler4);
        spielerlisteBarcelona.add(spieler5);

        Mannschaft mannschaftheim = new Mannschaft("Barcelona",trainer , torwart, spielerlisteBarcelona);


        Trainer trainer1 = new Trainer("Markos", 40, 9);
        Torwart torwart1 = new Torwart("Tim", 22, 8,10,22);
        Spieler spieler6 = new Spieler("Chris", 20,8,18,10,15);
        Spieler spieler7 = new Spieler("Alex", 21, 8,20,8,18);
        Spieler spieler8 = new Spieler("Adrian", 22,9,25,8,23);
        Spieler spieler9 = new Spieler("Maximillan", 20,9,22,9,20);
        Spieler spieler10 = new Spieler("Jimmy", 24,8,20,8,18);

        ArrayList spilerListeMadrid = new ArrayList();
        spilerListeMadrid.add(spieler6);
        spilerListeMadrid.add(spieler7);
        spilerListeMadrid.add(spieler8);
        spilerListeMadrid.add(spieler9);
        spilerListeMadrid.add(spieler10);

        Mannschaft mannschaftgast = new Mannschaft("Madrid", trainer1,torwart1, spilerListeMadrid);

        Spiel spiel = new Spiel(mannschaftheim,mannschaftgast);
        System.out.println(spiel);

         






    }
}
