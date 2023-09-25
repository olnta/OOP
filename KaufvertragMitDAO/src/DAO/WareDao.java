package Dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.sql.*;
import java.util.ArrayList;

public class WareDAO {

    // Deklaration einer DB-Klasse, die SQLite-Treiberbibliothek zugreift
    private static final String CLASSNAME = "org.sqlite.JDBC";
    // Deklaration des Zugriffs per JDBC-Treiber auf SQLITE und dann auf die im
    // Pfad genannte DB.
    private static final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDAO/DB_Kaufvertrag.db";
    private Connection connection;
    private Ware ware;

    public WareDAO() throws ClassNotFoundException {
        // DB-Klasse angelegt.
        Class.forName(CLASSNAME);
    }

    public Ware read(int nr) {
        PreparedStatement preparedStatement = null;
        connection = null;
        ware = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM Waren WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, nr);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            ware = createObject(resultSet);

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
        return ware;

    }

    public ArrayList<Ware> read() {
        connection = null;
        PreparedStatement preparedStatement = null;
        ware = null;
        ArrayList<Ware> wareListe = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM Waren";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            wareListe = new ArrayList<>();
            while (resultSet.next()) {
                ware = createObject(resultSet);
                wareListe.add(ware);

            }
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
        return wareListe;
    }

    private Ware createObject(ResultSet resultSet) throws SQLException {
        int warenNr = resultSet.getInt("WarenNr");
        String bezeichnung = resultSet.getString("Bezeichnung");
        String beschreibung = resultSet.getString("Beschreibung");
        double preis = resultSet.getDouble("Preis");
        String besonderheiten = resultSet.getString("Besonderheiten");
        String maengel = resultSet.getString("Maengel");

        ware = new Ware(bezeichnung, preis, warenNr);
        ware.setPreis(preis);
        ware.setBeschreibung(beschreibung);
        ware.setBezeichnung(bezeichnung);

        if (besonderheiten != null) {
            // den erhaltenen String (hier : "Tasche; Gaming-Maus") aufsplitten bei den Semikola und die
            // einzelnen Teile in das neue Array besonderheitenArray ablegen
            String[] besonderheitenArray = besonderheiten.split(";");
            // Nun die Elemente des Array (hier: "Tasche" und " Gaming-Maus") einzeln der
            // besonderheitenListe hinzufügen und dabei eventuelle Leerzeichen entfernen mit .trim()
            for (String besonderheit : besonderheitenArray) {
                ware.getBesonderheitenListe().add(besonderheit.trim());
            }



        }
        if (maengel != null) {
            String[] mangelArray = maengel.split(";");
            for (String mangel : mangelArray) {
                ware.getMaengelListe().add(mangel.trim());
            }
        }
        return ware;
    }



    public Ware update(Ware ware) {
        String besonderheitenString = "";
        String maengelString = "";
        connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "UPDATE Waren SET Bezeichnung = ?, " +
                    "Beschreibung = ?, Preis = ?, Besonderheiten = ?, Maengel = ?" +
                    "WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, ware.getBezeichnung());
            preparedStatement.setString(2, ware.getBeschreibung());
            preparedStatement.setDouble(3, ware.getPreis());
            preparedStatement.setString(4, arrayToString(ware.getBesonderheitenListe()));
            preparedStatement.setString(5, arrayToString(ware.getMaengelListe()));
            preparedStatement.setInt(6, ware.getWarenNr());


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
        return ware;
    }


    public void deleteWare(String nr) {
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM WAREN WHERE WarenNr=? ";
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
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }



    public Ware create(Ware ware) {
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "INSERT INTO Waren (Bezeichnung, Beschreibung, Preis, Besonderheiten, Maengel) VALUES (?, ?, ?, ?, ?)";


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ware.getBezeichnung());
            preparedStatement.setString(2, ware.getBeschreibung());
            preparedStatement.setDouble(3, ware.getPreis());
            preparedStatement.setString(4, arrayToString(ware.getBesonderheitenListe()));
            preparedStatement.setString(5, arrayToString(ware.getMaengelListe()));
            preparedStatement.executeUpdate();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT last_insert_rowid()");
            ware.setWarenNr(resultSet.getInt("last_insert_rowid()"));

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
        return ware;
    }

    public String arrayToString (ArrayList<String> s){
        String stringAsArray = "";
        for (String wString : s) {
            if (stringAsArray.isEmpty()) {
                stringAsArray += wString;
            } else {
                stringAsArray += ";" + wString;
            }
        }

        return stringAsArray;
    }
}

