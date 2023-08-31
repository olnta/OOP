package Dao;

public class VertragspartnerDao {

    //Deklaration einer DB klasse, die SQLite-Treiberbibliothek zugreift
    private static final String CLASSNAME="org.sqlite.JDBC";

    // Deklaration des zugriffs per JDBC-Treiber auf SQLite und dann auf die im Pfad genannten DB.
    private static final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragmitDao:DB_Kaufvertrag.db" ;

    public VertragspartnerDao() throws ClassNotFoundException {
        //DB-Klasse angelegt
        Class.forName(CLASSNAME);
    }
}
