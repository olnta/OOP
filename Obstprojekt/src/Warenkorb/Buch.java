package Warenkorb;

public class Buch extends Ware {

    private String isbn;

    public Buch(String warenNr, String bezeichung, double preis, double mwst, String isbn) {
        super(warenNr, bezeichung, preis, mwst);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        String text;
        text = super.toString();
        text += "\nIsbn: " + getIsbn();
        return text;
    }
}
