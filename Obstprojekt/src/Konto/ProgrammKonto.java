package Konto;

import java.io.IOException;

public class ProgrammKonto {
    //public String auswahl;

    public static void main(String[] args) throws IOException, BetragNichtKorrektException {

        Mitarbeiter m1 = new Mitarbeiter("Daniel", "Beuthner");
        Mitarbeiter m2 = new Mitarbeiter("Franz", "Mülleimer");


        Kunde k1 = new Kunde("jürgen", "Riot", m1);
        Adresse a1 = new Adresse("Bomberstreet", "187", "25898", "Bomber");
        k1.setAdresse(a1);
        Kunde k2 = new Kunde("Leon", "Mehmet", m2);
        Adresse a2 = new Adresse("Thr other street", " 9 3/4", "11111", "Harry poter");
        m1.setAdresse(a2);


        Konto ko1 = new Konto(k1, 2000, 1000);
        Konto ko2 = new Konto(k2, 8000, 16000);

        Girokonto Gi = new Girokonto(k1, 2000, 1000, 16);
        Sparkonto Sp = new Sparkonto(k2, 60);

        ko1.setKontoStand(1187);
        System.out.println(ko1);
        System.out.print("\n");
        System.out.println("Inhaber addresse");
        System.out.println(a1);
        System.out.print("\n");
        System.out.println("Adresse von betreuer");
        System.out.print("\n");
        System.out.println(a2);


        System.out.println(ko1);
        System.out.println("1" + "Für Einzahlen:");
        System.out.println("2" + "Für Auszahlen");
        System.out.println("3" + "Für überweisen");

        System.out.println("Wählen sie aus!");
        String auswahl = IO.readString();

        do {


            if (auswahl.equals("1")) {
                try {
                    System.out.println("Welche Betrag wollen sie auf ihr Konto einzahlen?");
                    double einzahlen = IO.readdouble();
                    ko1.einzahlen(einzahlen);
                    System.out.println("Der neue Kontostand ist nun: " + ko1.getKontoStand());
                } catch (BetragNichtKorrektException e) {
                    System.out.println(e.getMessage());
                }
            } else if (auswahl.equals("2")) {
                try {
                    System.out.println("wie viel abheben du machen looooooooooo!!!!");
                    double auzahlen = IO.readdouble();
                    ko1.auszahlen(auzahlen);
                    System.out.println("Dein konto du haben jetzt: " + ko1.getKontoStand());
                } catch (KreditlimitUeberschrittenException e) {
                    System.out.println(e.getMessage());
                }

            } else if (auswahl.equals("3")) {
                try {
                    System.out.println("Wie viel überweisen  du machen bei mir");
                    double überweisen = IO.readdouble();
                    ko1.auszahlen(überweisen);
                    ko2.einzahlen(überweisen);
                    System.out.println("Dein konto jetzt so viel sein: " + ko1.getKontoStand());
                    System.out.println("überweisung geklappt " + überweisen);
                } catch (KreditlimitUeberschrittenException e) {
                    System.out.println(e.getMessage());
                }

            }
        } while (true);


    }
}
