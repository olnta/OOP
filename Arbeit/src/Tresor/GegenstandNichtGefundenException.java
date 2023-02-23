package Tresor;

public class GegenstandNichtGefundenException extends Exception {

    private int id;

    public GegenstandNichtGefundenException(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return getId() + " Id nicht gefunden.";

    }
}
