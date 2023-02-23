package Rollenspiel;

public class ProgrammRollenspiel {

    public static void main(String[] args) {

        Elfe elfe = new Elfe("Bloodelf", 5);
        Zauberer zauberer = new Zauberer("Celestial", 5, 5);


        System.out.println(elfe);
        System.out.println(zauberer);
        System.out.println();

        try {
            elfe.rennen();
            zauberer.kaempfen();
            elfe.kaempfen();
            elfe.klettern();
            zauberer.zauber();
            zauberer.laufen();
            zauberer.zauber();
        } catch (KeineKraftException e) {
            System.out.println(e.getMessage());
        }
    }
}
