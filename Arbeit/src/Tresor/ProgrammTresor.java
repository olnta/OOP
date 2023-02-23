package Tresor;

import java.util.ArrayList;

public class ProgrammTresor {

    public static void main(String[] args) {

        Tresor tresor = new Tresor();

        Schmuck schmuck1 = new Schmuck(1234567, 200, "Gold Kette");
        Schmuck schmuck2 = new Schmuck(7654321, 250, "Gold Ring");
        Aktie aktie1 = new Aktie(1726354, 20000, "KTO", 5000);
        Aktie aktie2 = new Aktie(192837, 50000, "Gamestop", 500);


        tresor.addGegenstaende(schmuck1);
        tresor.addGegenstaende(schmuck2);
        tresor.addGegenstaende(aktie1);
        tresor.addGegenstaende(aktie2);


        System.out.println(tresor);

    }
}
