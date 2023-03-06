package Kaufvertrag;

import java.io.*;

public class ProgrammKaufvertrag {
    public static void main(String[] args) throws FileNotFoundException {


        PrintWriter pw = new PrintWriter("H:\\RP_Text/Test.csv");


        Adresse adresse1 = new Adresse("Moonstr", "28", "36383", "Bremen");
        Vertragspartner verkaeufer1 = new Vertragspartner("Matias", "Tob");

        Adresse adresse2 = new Adresse("Linnstr","54", "35453", "Bremen");
        Vertragspartner kauefer1 = new Vertragspartner("Maria", "Papanikolaou");

        Ware ware1 = new Ware("Kette", 200);


        Kaufvertrag kaufvertrag1 = new Kaufvertrag(verkaeufer1, kauefer1, ware1);

        verkaeufer1.setAdresse(adresse1);
        kauefer1.setAdresse(adresse2);
        kaufvertrag1.setZahlungsModalitaeten("Bar");
        verkaeufer1.setAusweisNr("BM87342532");
        kauefer1.setAusweisNr("KU972362763");
        ware1.setBescheirbung("Gold mit Steinen.");
        ware1.getBesonderheiten().add("Gratis Ohrringe.");
        ware1.getMaengel().add("Einer der Steinen fehlt.");
        System.out.println(kaufvertrag1);

        //pw.println(kaufvertrag1);

        pw.print("Vertragpartner;");
        pw.print("\tName;");
        pw.print("\tStrasse;");
        pw.print("\tPlz;");
        pw.println("\tOrt;");

        pw.print("Verkaeufer;");
        verkaeufer1.erstelleVertragsPartner(verkaeufer1,pw);
        pw.println();
        pw.print("Kaeufer;");
        kauefer1.erstelleVertragsPartner(kauefer1,pw);



        pw.close();

        leseCsvUndSchreibeInArrayList();

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
