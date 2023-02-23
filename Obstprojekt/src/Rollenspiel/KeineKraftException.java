package Rollenspiel;

public class KeineKraftException extends Exception {

    private String aktion;
    private String name;

    public KeineKraftException(String aktion, String name) {
        this.aktion = aktion;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "\n" + this.name + " ist zu schwach zu" + this.aktion + ".";
    }

}
