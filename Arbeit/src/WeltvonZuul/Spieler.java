package WeltvonZuul;

public class Spieler {

    private Raum aktuellerRaum;

    public Spieler(Raum aktuellerRaum){
        this.aktuellerRaum = aktuellerRaum;
    }

    public Raum getAktuellerRaum() {
        return aktuellerRaum;
    }

    public void gehezu(Raum neuerRaum) {
        this.aktuellerRaum = neuerRaum;
    }

}
