public class ProgrammObst {

    /**
     * Methode, die beim Laden der Klasse Programm automatisch ausgeführt wird.
     * @param args
     */
    public static void main(String[] args) {
        Banane banane; // Deklaration - Der Datentyp der banane ist Obst.
        banane = new Banane("Babybanane", 8.7, 120, true, 11); // Instanziierung
                            // Ein neues OBJEKT/ eine neue INSTANZ der KLasse Obst wird erstellt.
        System.out.println();
        /**
         * Aufruf der toString()-Methode von Banane
         * 'System.out.println(banane)' ist gleichbedeutend mit
         * 'System.out.println(banane.toString())'
         */
        System.out.println(banane);
        banane.setGewicht(90.9);
        System.out.println();
        System.out.println("Name des Obstes: " + banane.getName());
        System.out.println("Gewicht des Obstes: " + banane.getGewicht());

        Apfel apfel = new Apfel("Boskopapfel", 4.6, 275, false);
        // = Deklaration UND Instanziierung in einer einzigen Anweisung
        System.out.println();
        System.out.println(apfel);
        apfel.setReif(true);
        apfel.setGewicht(211.3);
        System.out.println();
        System.out.println("Name des Obstes: " + apfel.getName());
        System.out.println("Gewicht des Obstes: " + apfel.getGewicht());
        System.out.println("Ist das Obst reif? - " + apfel.isReif());

        Orange orange = new Orange("Saftorange", 53.2, 175, true, false);
        System.out.println();
        System.out.println(orange);
        orange.setKernlos(true);
        System.out.println();
        System.out.println("Ist das Obst kernlos? - " + orange.isKernlos());

        Banane bananeNeu = new Banane("Kochbanane", 25.2, 110.4, false, 13.1);
    }
}
