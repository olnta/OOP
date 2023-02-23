package Warenkorb;


public class Programm {
    public static void main(String[] args) {


        Adresse adresse1 = new Adresse("Moonstr", "28", "36383", "Bremen");
        Kunde kunde1 = new Kunde("Matias", "Tob", adresse1);

        Buch buch1 = new Buch("32323", "Lillies", 20, 3, "2343792903");
        Buch buch2 = new Buch("98633", "Moon and Stars", 15, 3, "8478399934");
        Cd cd1 = new Cd("73645", "The Beatles", 10, 3, 30);
        Cd cd2 = new Cd("34572", "Nirvana", 12, 3, 45);

        Warenkorb warenkorb = new Warenkorb(kunde1);

        warenkorb.addWare(buch1);
        warenkorb.addWare(buch2);
        warenkorb.addWare(cd1);
        warenkorb.addWare(cd2);
        System.out.println(warenkorb);


        try {
            warenkorb.removeWare(cd2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            warenkorb.getWare("32323");
        } catch (WarenNichtGefundenException e) {
            e.printStackTrace();
        }

        System.out.println(warenkorb);
    }
}