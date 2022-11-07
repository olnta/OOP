import java.util.ArrayList;

public class ProgrammFootball {

    public static void main(String[] args) {


        Trainer trainer1 = new Trainer("Tomas",  30, 8 );
        System.out.println("Name: " + trainer1.getName());
        System.out.println("Alter: " + trainer1.getAlter());
        System.out.println("Erfahrung: " + trainer1.getErfahrung());
        System.out.println("------");

        System.out.println("Ein Jahr später");
        trainer1.setAlter(31);
        trainer1.setErfahrung(9);
        System.out.println("Alter: " + trainer1.getAlter());
        System.out.println("Erfahrung: " + trainer1.getErfahrung());
        System.out.println("------");

        Spieler spieler1 = new Spieler ("Mathew", 18, 7, 6,8, 19);
        System.out.println("Name: " + spieler1.getName());
        System.out.println("Alter: " + spieler1.getAlter());
        System.out.println("Stärke: " + spieler1.getStaerke());
        System.out.println("Torschuss: " + spieler1.getTorschuss());
        System.out.println("Motivation : " + spieler1.getMotivation());
        System.out.println("Tore:" + spieler1.getTore());
        System.out.println("------");

        System.out.println("Ein Jahr später");
        spieler1.setAlter(19);
        spieler1.setStaerke(8);
        spieler1.setTorschuss(8);
        spieler1.setMotivation(10);
        spieler1.setTore(35);
        System.out.println("Name: " + spieler1.getName());
        System.out.println("Alter:" + spieler1.getAlter());
        System.out.println("Stärke:" + spieler1.getStaerke());
        System.out.println("Torschuss:" + spieler1.getTorschuss());
        System.out.println("Motivation:" + spieler1.getMotivation());
        System.out.println("Tore:" + spieler1.getTore());

        Torwart torwart = new Torwart("Bob", 27, 6,8, 10);

        Spieler spieler2 = new Spieler("Peter", 20, 8, 9, 7, 25 );
        Spieler spieler3 = new Spieler ("John", 24,7, 7,8,17);
        Spieler spieler4 = new Spieler("Tom", 18, 9, 9, 10, 30 );
        Spieler spieler5 = new Spieler("Max", 25, 8,10,10,30);



        ArrayList spielerlisteBarcelona = new ArrayList();
        spielerlisteBarcelona.add(spieler1);
        spielerlisteBarcelona.add(spieler2);
        spielerlisteBarcelona.add(spieler3);
        spielerlisteBarcelona.add(spieler4);
        spielerlisteBarcelona.add(spieler5);


    }
}
