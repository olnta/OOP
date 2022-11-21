import java.util.ArrayList;

public class Gameplay {

    private static final int spielzeit = 90;
    private static final int max_nachspielzeit = 5;
    private static final int max_dauer_bis_aktion = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {
        int m = mannschaft.getMotivation();
        int s = mannschaft.getStaerke();
        int t = mannschaft.getTrainer().getErfahrung();

        int mannsch = t * s * m;
        return mannsch;
    }

    private static boolean erzieltTor(Spieler schuetze, Torwart torwart){


        if (torwart.getReaktion() < schuetze.getTorschuss()) {
          double r = Math.random();
            r.(5) -2
        }
        else if (torwart.getReaktion() > schuetze.getTorschuss()){

        }
    }


}
