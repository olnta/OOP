package Dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import java.sql.*;
import java.util.ArrayList;

public class VertragspartnerDao {

    //Deklaration einer DB klasse, die SQLite-Treiberbibliothek zugreift.
    private static final String CLASSNAME = "org.sqlite.JDBC";

    // Deklaration des zugriffs per JDBC-Treiber auf SQLite und dann auf die im Pfad genannten DB.
    private static final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDAO/DB_Kaufvertrag.db";
    private Connection connection;

    public VertragspartnerDao() throws ClassNotFoundException {
        //DB-Klasse angelegt
        Class.forName(CLASSNAME);
    }

    public Vertragspartner read(String nr) {
        PreparedStatement preparedStatement = null;
        Vertragspartner vertragspartner = null;
        connection = null;

        try {
            //DB-Verbindung aufbauen
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //SQL Query vorbereiten, aber noch nicht ausführen.
            String sql = "SELECT * FROM Vertragspartner WHERE AusweisNr = ? ";
            //Sogennantes Prepared Statement erstellen, das nicht weiter veränderbar ist.
            preparedStatement = connection.prepareStatement(sql);
            //Den Parameter dieser Methode (nr) ab deb Parameter (?) des Prepared Statement übergeben.
            preparedStatement.setString(1, nr);
            //SQL Query ausführen und in einem Result Set speichern.
            ResultSet resultSet = preparedStatement.executeQuery();
            //Auf den nächsten Eintrag (hier: den ersten) des Result Set gehen.
            resultSet.next();
            vertragspartner = createObject(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return vertragspartner;
    }

    public ArrayList<Vertragspartner> read() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Vertragspartner vertragspartner = null;
        ArrayList<Vertragspartner> vertragspartnerListe = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM Vertragspartner";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            vertragspartnerListe = new ArrayList<>();
            while (resultSet.next()) {
                vertragspartner = createObject(resultSet);
                vertragspartnerListe.add(vertragspartner);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException();
                }
            }
        }
        return vertragspartnerListe;
    }

    private Vertragspartner createObject(ResultSet resultSet) throws SQLException {
        Vertragspartner vertragspartner = null;
        try {

            String ausweisNr = resultSet.getString("AusweisNr");
            String vorname = resultSet.getString("Vorname");
            String nachname = resultSet.getString("Nachname");
            String strasse = resultSet.getString("Strasse");
            String hausNr = resultSet.getString("HausNr");
            String plz = resultSet.getString("PLZ");
            String ort = resultSet.getString("Ort");
            // Vertragspartner-Objekt und somit auch Afress-Objekt erzeugen und Attributewerte
            vertragspartner = new Vertragspartner(vorname, nachname);
            vertragspartner.setAusweisNr(ausweisNr);
            vertragspartner.setAdresse(new Adresse(strasse, hausNr, plz, ort));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vertragspartner;
    }

    public Vertragspartner update(Vertragspartner vertragspartner) throws SQLException {
        connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "UPDATE vertragspartner SET  Vorname = ?," +
                    "Nachname = ?, Strasse = ?, HausNr = ?, Plz = ?, Ort = ?" +
                    "WHERE AusweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, vertragspartner.getVorname());
            preparedStatement.setString(2, vertragspartner.getNachname());
            preparedStatement.setString(3, vertragspartner.getAdresse().getStrasse());
            preparedStatement.setString(4, vertragspartner.getAdresse().getHausNr());
            preparedStatement.setString(5, vertragspartner.getAdresse().getPlz());
            preparedStatement.setString(6, vertragspartner.getAdresse().getOrt());
            preparedStatement.setString(7, vertragspartner.getAusweisNr());
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return vertragspartner;
    }

    public void delete(String nr) throws SQLException {
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM Vertragspartner WHERE AusweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nr);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Vertragspartner create(Vertragspartner vertragspartner) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "INSERT INTO Vertragspartner (AusweisNr, Vorname, Nachname, Strasse, HausNr, PLZ, ORT) VALUES (?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, vertragspartner.getAusweisNr());
            preparedStatement.setString(2, vertragspartner.getVorname());
            preparedStatement.setString(3, vertragspartner.getNachname());
            preparedStatement.setString(4, vertragspartner.getAdresse().getStrasse());
            preparedStatement.setString(5, vertragspartner.getAdresse().getHausNr());
            preparedStatement.setString(6, vertragspartner.getAdresse().getPlz());
            preparedStatement.setString(7, vertragspartner.getAdresse().getOrt());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return vertragspartner;
    }
}