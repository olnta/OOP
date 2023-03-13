package Kaufvertrag;

import java.io.*;

public class ProgrammKaufvertrag {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Kaufvertrag kaufvertrag = erstelleKaufvertrag();
        erstelleTxtfile(kaufvertrag);
        erstelleCsvFile(kaufvertrag);
        leseCsvUndSchreibeInArrayList();
    }

    private static void erstelleCsvFile(Kaufvertrag kaufvertrag) throws FileNotFoundException, UnsupportedEncodingException {
        String csvFile = "H://RP_Text/Test.csv";

        try {
            PrintWriter pw = new PrintWriter(csvFile, "KV");

            pw.print("Vertragpartner;");
            pw.print("Name;");
            pw.print("Nachname;");
            pw.print("AusweisNr;");
            pw.print("Strasse;");
            pw.print("Hausnummer;");
            pw.print("Plz;");
            pw.println("Ort;");

            pw.print("Verkaeufer;");
            erstelleVertragsPartner(kaufvertrag.getVerkaeufer(),pw);

            pw.print("Kaeufer;");
            erstelleVertragsPartner(kaufvertrag.getKaeufer(), pw);
            pw.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static void erstelleTxtfile(Kaufvertrag kaufvertrag) {
    try{ String TxtFile = "H://RP_Text/Test.txt";
        PrintWriter pw = new PrintWriter(TxtFile);
        pw.println(kaufvertrag);
        pw.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

    private static Kaufvertrag erstelleKaufvertrag() {

        //Ware anlegen
        Ware ware1 = new Ware("Kette", 200);
        ware1.setBescheirbung("Gold mit Steinen.");
        ware1.getBesonderheiten().add("Gratis Ohrringe.");
        ware1.getMaengel().add("Einer der Steinen fehlt.");

        //Kauefer anlegen
        Vertragspartner kauefer1 = new Vertragspartner("Maria", "Papanikolaou");
        kauefer1.setAusweisNr("KU972362763");
        kauefer1.setAdresse(new Adresse("Linnstr","54", "35453", "Bremen"));

        //Verkaeufer anlegen
        Vertragspartner verkaeufer1 = new Vertragspartner("Matias", "Tob");
        verkaeufer1.setAusweisNr("BM87342532");
        verkaeufer1.setAdresse(new Adresse("Moonstr", "28", "36383", "Bremen"));

        //Kaufvertrag anlegen
        Kaufvertrag kaufvertrag1 = new Kaufvertrag(verkaeufer1, kauefer1, ware1);
        kaufvertrag1.setZahlungsModalitaeten("Bar");
        return kaufvertrag1;
    }

    private static void erstelleVertragsPartner(Vertragspartner vertragspartner, PrintWriter pw){
        pw.print(vertragspartner.getVorname() + ";"  + vertragspartner.getNachname() + ";");
        pw.print(vertragspartner.getAusweisNr() + ";");
        pw.print(vertragspartner.getAdresse().getStrasse() + ";" + vertragspartner.getAdresse().getHausNr() + ";");
        pw.print(vertragspartner.getAdresse().getPlz() + ";");
        pw.print(vertragspartner.getAdresse().getOrt() + ";");
    }

    private static void leseCsvUndSchreibeInArrayList() {

        try{
            BufferedReader br = new BufferedReader(new FileReader("H:\\RP_Text/Test.csv"));
            String line = "";
            while((line = br.readLine()) != null) {

                for(String csv : line.split(";")) {
                    System.out.print(csv + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
