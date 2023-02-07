package Konto;

public class BetragNichtKorrektException extends Exception{
    private double betrag;

    public BetragNichtKorrektException(double betrag){
        this.betrag=betrag;
    }

    @Override
    public String getMessage(){
        return "Betrag nicht korrekt eingegeben: "+betrag;
    }
}
