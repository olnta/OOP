package Konto;

public class Girokonto extends Konto {

    private double zinsKredit;

    public Girokonto(Kunde inhaber, double kreditlimit, double zinsGuthaben, double zinsKredit) {
        super(inhaber, kreditlimit, zinsGuthaben);
        this.zinsKredit = zinsKredit;
    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }

    public boolean ueberweisen(double betrag, Girokonto girokonto) throws BetragNichtKorrektException, KreditlimitUeberschrittenException {
        if (auszahlen(betrag) == true) {
            girokonto.einzahlen(betrag);
            return true;
        }
        return false;

    }

    public String toString() {
        String text;
        text = "\n " + " Inhaber " + getKontoStand();
        return text;
    }
}
