package Konto;

public class Konto {
    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kreditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;

    }

    public double getKontoStand() {
        return kontoStand;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public void setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public void einzahlen(double betrag) throws BetragNichtKorrektException{
        if(betrag>=0) {
            this.kontoStand += betrag;
        }else{
            throw new BetragNichtKorrektException(betrag);
        }
    }

    public boolean auszahlen(double betrag) throws KreditlimitUeberschrittenException {
        if (kontoStand + kreditLimit >= betrag) {
            kontoStand = kontoStand - betrag;
            System.out.println("" + kontoStand);
            return true;

        } else {
            throw new KreditlimitUeberschrittenException(this.kreditLimit,this.kontoStand);

            }

    }
    public String toString(){
        String text;
        text="\n"+"Inhaber "  +getInhaber();
        text+="\n"+"kontostand " +   getKontoStand();
        text+="\n"+"Kreditlimit "  +  getKreditLimit();
        text+="\n"+"Zinsguthaben "+ getZinsGuthaben();
        return text;
    }
}