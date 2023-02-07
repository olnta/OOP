package Konto;

public class KreditlimitUeberschrittenException extends Exception{
    private double kreditlimit;
    private double kontostand;


    public KreditlimitUeberschrittenException(double kreditlimit,double kontostand){
        this.kreditlimit=kreditlimit;
        this.kontostand=kontostand;




        }

    @Override
    public String getMessage(){
        return kontostand+"Du kannst nicht auszahlen"+this.kreditlimit;
    }




}
