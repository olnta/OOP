import java.util.ArrayList;

public class Gameplay {

    private static final int SPIELZEIT = 90;
    private static final int MAX_NACHSPIELZEIT = 5;
    private static final int MAX_DAUER_BIS_AKTION = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {


        /** int m = mannschaft.getMotivation();
         *  int s = mannschaft.getStaerke();
         *  int t = mannschaft.getTrainer().getErfahrung();
         *  int mannsch = t * s * m;
         */

        int mannschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke() * mannschaft.getTrainer().getErfahrung();
        if (mannschaftswert < 1){
            mannschaftswert = 1;
        }

        return mannschaftswert;
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
