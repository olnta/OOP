public class ProgrammTrainer {

    public static void main(String[] args) {


        Trainer trainer = new Trainer("Tomas",  30, 8 );
        System.out.println("Name der Trainer: " + trainer.getName());
        System.out.println("Alter der Trainer: " + trainer.getAlter());
        System.out.println("Erfahrung der Trainer: " + trainer.getErfahrung());

        System.out.println("Ein Jahr später:");
        trainer.setAlter(31);
        trainer.setErfahrung(9);
        System.out.println("Alter der Trainer ein Jahr später: " + trainer.getAlter());
        System.out.println("Erfahrung der Trainer ein Jahr später " + trainer.getErfahrung());

        Spieler spieler = new Spieler ("Mathew", 18, 7, 6,8, 19);
        System.out.println("Name der Spieler: " + spieler.getName());
        System.out.println("Alter der Spieler " + spieler.getAlter());
        System.out.println("Stärke der Spieler " + spieler.getStaerke());
        System.out.println("Torschuss der Spieler " + spieler.getTorschuss());
        System.out.println("Motivation der Spieler " + spieler.getMotivation());
        System.out.println("Tore der Spieler " + spieler.getTore());

        System.out.println("Ein Jahr später:");
        spieler.setAlter(19);
        spieler.setStaerke(8);
        spieler.setTorschuss(8);
        spieler.setMotivation(10);
        spieler.setTore(35);
        System.out.println("Name der Spieler ein Jahr später: " + spieler.getName());
        System.out.println("Alter der Spieler ein Jahr später" + spieler.getAlter());
        System.out.println("Stärke der Spieler ein Jahr später" + spieler.getStaerke());
        System.out.println("Torschuss der Spieler ein Jahr später" + spieler.getTorschuss());
        System.out.println("Motivation der Spieler ein Jahr später" + spieler.getMotivation());
        System.out.println("Tore der Spieler ein Jahr später" + spieler.getTore());


    }
}
