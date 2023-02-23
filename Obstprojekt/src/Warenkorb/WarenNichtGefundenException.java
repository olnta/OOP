package Warenkorb;

public class WarenNichtGefundenException extends Exception {

    private String warenNr;

    public WarenNichtGefundenException(String warenNr) {
        this.warenNr = warenNr;

    }

    public String getWarenNr() {
        return warenNr;
    }

    public String getMessage() {
        return "Unter " + getWarenNr() + "wird ken Waren gefunden;";
    }
}
