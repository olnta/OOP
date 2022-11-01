public class ProgrammObst {

    /**
     * Main-Methode enthält alles, was beim Aufrufen der Klasse automatisch ausgeführt wird.
     * @param args
     */

    public static void main(String[] args) {
        Banane banane; // Deklaration von Banane als etwas vom Datentyp Banane

        /**
         * Instanziierung (!!!) (Initialisierung) einer banane d. h. erstellen
         * eines neuen Objektes von Typ Banane.
         */

        banane = new Banane("Kochbanane", 8.7,120.3, true, 11.3 );

        System.out.println("Name Des Obstes:" + banane.getName());
        System.out.println("Gewicht:"  + banane.getGewicht());
        System.out.println("VitaminC:" + banane.getVitaminC_Gehalt());
        System.out.println("Reif:" + banane.isReif());
        System.out.println("Krümmung:" + banane.getKruemmung());
        System.out.println("1 Monat später (Es wurde auf die Banane getreten):");
        banane.setKreummung(2);
        banane.setVitaminC_Gehalt(6.3);
        System.out.println("VitaminC:" + banane.getVitaminC_Gehalt());
        System.out.println("Krümmung:" + banane.getKruemmung());

        // apfel erstellen und daten geben

        Obst apfel = new Obst("Boskoapfel", 4.6,175, true);

        // daten auslesen
        System.out.println("Name des Obstes:" +apfel.name);
        System.out.println("Gewicht:"  + apfel.getGewicht());
        System.out.println("VitaminC:" + apfel.getVitaminC_Gehalt());
        System.out.println("Reif:" + apfel.isReif());

        System.out.println("1 Monat später (Es wurde auf die Boskoapfel getreten):");
        apfel.setVitaminC_Gehalt(2.9);

        System.out.println("VitaminC:" + apfel.getVitaminC_Gehalt());
        apfel.setGewicht(120.4);
        System.out.println();

    }
}
