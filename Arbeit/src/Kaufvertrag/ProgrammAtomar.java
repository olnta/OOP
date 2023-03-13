package Kaufvertrag;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProgrammAtomar {

    public static void main(String[] args) {

        try {
            //NEU ArrayList anlegen
            ArrayList<String> datalinesKaufvertrag = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("H:\\RP_Text/Test.csv"));

            String lines;
            while((lines = br.readLine()) != null){
                datalinesKaufvertrag.add(lines);
            }
            //NEU Daten analysieren und Vertragspartner-Objekte erzeugen
            for(String datalines : datalinesKaufvertrag){
                String[] attribute = datalines.split(";");
                //NEU erstes Attribut ausgeben
                System.out.println(attribute[0]);
                //NEU Prüfund, ab erstes Attribut "VERKÄUFER" oder "KÄUFER" enthält,
                // um dann Methode zur erstelleVertragspartner aufzurufen und entweder verkaufer-Objekte
                //oder Kaeufer-Objekte erstellen

                if(attribute[0].equalsIgnoreCase("VERKAEUFER")){
                    Vertragspartner verkaeufer = erstelleVertragspartner(attribute);
                    System.out.println(" " + verkaeufer);
                } else if(attribute[0].equalsIgnoreCase("KAEUFER")){
                    Vertragspartner kaeufer = erstelleVertragspartner(attribute);
                    System.out.println(" " + kaeufer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Vertragspartner erstelleVertragspartner( String[] attribute ) {
        String nachname = attribute[1];
        String vorname = attribute[2];
        String auswwisNr = attribute[3];
        String strasse = attribute[4];
        String hausnummer = attribute[5];
        String plz = attribute[6];
        String ort = attribute[7];
        Vertragspartner vertragspartner = new Vertragspartner(nachname, vorname);
        vertragspartner.setAusweisNr(auswwisNr);
        vertragspartner.setAdresse(new Adresse(strasse, hausnummer, plz,ort));
        return vertragspartner;

    }


}
