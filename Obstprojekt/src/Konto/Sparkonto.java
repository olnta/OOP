package Konto;

public class Sparkonto extends Konto{

    public Sparkonto(Kunde inhaber,double zinssatz){
        super(inhaber,zinssatz,0);
    }
    public String toString(){
        String text;
        text="\n"+"Inhaber"+getInhaber();
        text+="\n"+"Zinssatz"+getZinsGuthaben();
        return text;
    }
}
