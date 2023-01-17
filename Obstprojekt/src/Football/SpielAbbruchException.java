package Football;

public class SpielAbbruchException extends Exception {

    private int spielMinute;

    public SpielAbbruchException(int spielMinute){
        this.spielMinute = spielMinute;
    }

    public int getSpielMinute() {
        return spielMinute;
    }

    public String getMessage(){
        return "Das Spiel muss abgebrochen werden";
    }

}
