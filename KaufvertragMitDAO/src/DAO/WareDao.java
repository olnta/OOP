package Dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WareDao {
    private static final String CLASSNAME = "org.sqlite.JDBC";
    private static final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDao/DB_kaufvertrag.db";
    private Connection connection;
    private Ware waren;

    public WareDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }



    public Ware read(String nr) {
        PreparedStatement preparedStatement = null;
        connection = null;
        waren = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * From Waren WHERE WarenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nr);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            waren = createObject(resultSet);

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
        return waren;
    }



    public ArrayList<Ware> read() {
        PreparedStatement preparedStatement = null;
        waren = null;
        ArrayList<Ware> warenListe = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM Waren";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            warenListe = new ArrayList<>();
            while (resultSet.next()) {
                waren = createObject(resultSet);
                warenListe.add(waren);
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
        return warenListe;
    }



    private Ware createObject(ResultSet resultSet) throws SQLException {
        int warenNr = resultSet.getInt("WarenNr");
        String bezeichnung = resultSet.getString("Bezeichnung");
        String beschreibung = resultSet.getString("Beschreibung");
        double preis = resultSet.getDouble("Preis");
        String besonderheiten = resultSet.getString("Besonderheiten");
        String maengel = resultSet.getString("Maengel");

        waren = new Ware(bezeichnung, preis, warenNr);
        waren.setBezeichnung(bezeichnung);
        waren.setBeschreibung(beschreibung);

        if (besonderheiten != null) {
            String[] besonderheitenArray = besonderheiten.split(";");
            for (String bhA: besonderheitenArray) {
                waren.getBesonderheitenListe().add(bhA.trim());
            }
        }

        if (maengel != null) {
            String[] maengelArray = maengel.split(";");
            for (String mA: maengelArray) {
                waren.getMaengelListe().add(mA.trim());
            }
        }
        return waren;
    }

    public void delete(String nr) throws SQLException {
        connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM Waren WHERE WarenNr = ?";
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
}