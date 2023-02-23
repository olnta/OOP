package Konto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    /**
     * liest einen Wahrheitswert von der Konsole ein
     *
     * @return Den Wahrheitswert
     * @throws IOException
     */
    public static String readString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = bufferedReader.readLine();
        return eingabe;
    }

    public static int readint() throws IOException {
        while (true) {
            String text = readString();
            try {
                int zahl = Integer.parseInt(text);
                return zahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
            }
        }
    }

    public static double readdouble() throws IOException {
        while (true) {
            String text = readString().replace(",", ".");
            try {
                double zahl = Double.parseDouble(text);
                return zahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
            }
        }
    }

    public static boolean readboolen() throws IOException {
        while (true) {
            String eingabe = readString();
            if (eingabe.equals("J")
                    || (eingabe.equalsIgnoreCase("yes"))
                    || (eingabe.equalsIgnoreCase("ja"))) {
                return true;
            } else if ((eingabe.equals("nein")
                    || (eingabe.equalsIgnoreCase("no"))
                    || (eingabe.equalsIgnoreCase("n")))) {

                return false;


            }
            System.out.println("falsche eingabe.Bitte wiederholen");
        }


    }

    public static int[] readintArray() throws IOException {
        System.out.println(" wie viele werte möchte sie eingeben");
        int anzahl = readint();
        return readintArray(anzahl);

    }

    public static int[] readintArray(int anzahl) throws IOException {
        int[] liste = new int[anzahl];
        for (int i = 0; i < liste.length; i++) {
            System.out.println("wert" + (i + 1) + ": ");
            liste[i] = readint();
        }
        return liste;
    }

    public static double[] readdoubleArray() throws IOException {
        System.out.println(" wie viele werte möchte sie eingeben");
        int anzahl = readint();
        return readdoubleArray(anzahl);

    }

    public static double[] readdoubleArray(int anzahl) throws IOException {
        double[] liste = new double[anzahl];
        for (int i = 0; i < liste.length; i++) {
            System.out.println("wert" + (i + 1) + ": ");
            liste[i] = readint();
        }
        return liste;
    }

    public static String[] readStringArray() throws IOException {
        System.out.println(" wie viele werte möchte sie eingeben");
        int anzahl = readint();
        return readStringArray(anzahl);

    }

    public static String[] readStringArray(int anzahl) throws IOException {
        String[] liste = new String[anzahl];
        for (int i = 0; i < liste.length; i++) {
            System.out.println("wert" + (i + 1) + ": ");
            liste[i] = readString();
        }
        return liste;
    }

}




