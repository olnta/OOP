import Dao.VertragspartnerDao;
import Dao.WareDAO;
import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.sql.SQLException;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Deklaration und Initialisierung einer Instanz von VertragspartnerDao
		VertragspartnerDao vertragspartnerDao = new VertragspartnerDao();
		//read(String nr)-Methode aus VertragsparnterDao aufrufen und
		//das Ergebnis in ein Objekt des Typs Vertragspartner schreiben.
		Vertragspartner vertragspartner = vertragspartnerDao.read("0123456789");
		System.out.println(vertragspartner);

		System.out.println("");

		WareDAO wareDAO = new WareDAO();
		Ware ware = wareDAO.read(1);
		System.out.println(ware);

		System.out.println("");

		ArrayList<Vertragspartner> vListe = vertragspartnerDao.read();
		System.out.println("Liste aller Vertragspartner: ");
		for (Vertragspartner v: vListe) {
			System.out.println(v);
		}

		System.out.println("");

		ArrayList<Ware> wListe = wareDAO.read();
		System.out.println("Liste jeder Ware: ");
		for (Ware w: wListe) {
			System.out.println(w);
		}

		System.out.println("");

		//VertragpartnerDao.delete() testen
		vertragspartnerDao.delete("0123456789");
		vListe = vertragspartnerDao.read();
		System.out.println("Liste aller Vertragspartner: ");
		for (Vertragspartner v : vListe){
			System.out.println(v);
		}

		System.out.println("");

		//WareDao.delete() testen
		wareDAO.deleteWare("1");
		wListe = wareDAO.read();
		System.out.println("Liste aller Waren: ");
		for (Ware w : wListe){
			System.out.println(w);
		}

		//VertragspartnerDAO.update testen:
		System.out.println("------------------------------------------------\nVertragspartnerDAO.update testen:");

		System.out.println("\nVertragspartner mit der AusweisNr 9876543210 VOR der Änderung: ");
		vertragspartner = vertragspartnerDao.read("9876543210");
		System.out.println(vertragspartner);
		vertragspartner.setNachname("Possehl");
		vertragspartner.setAdresse(new Adresse("Schlossallee", "1", "22587", "Hamburg"));
		vertragspartner = vertragspartnerDao.update(vertragspartner);
		System.out.println("\nVertragspartner mit der AusweisNr 9876543210 NACH der Änderung von " +
				"Nachname und Adresse: ");
		System.out.println(vertragspartner);

		//WareDAO.update()
		System.out.println("------------------------------------------------\n//WareDAO.update():");
		System.out.println("\nWare mit der WarenNr 4 Vor der Änderung: ");
		ware = wareDAO.read(4);
		System.out.println(ware);
		ware.setBeschreibung("Super krasser office-Laptop");
		ware.getMaengelListe().add("1 cm kratzer auf Display rechts unten");
		ware.getBesonderheitenListe().add("Ledertasche");
		ware = wareDAO.update(ware);
		System.out.println("\nWare mit der WarenNr 4 NACH der Änderung von " +
				"Beschreibung, Mängeln, Besonderheiten: ");
		System.out.println(ware);


		//VertragspartnerDao.create() testen:
		System.out.println("\nAnlegen eines neuen Vertragpartners:");
		vertragspartner = new Vertragspartner("Hugo", "Habicht");
		vertragspartner.setAusweisNr("ABCDEFGHIJ");
		vertragspartner.setAdresse(new Adresse("Waldweg","3a","28865","Lilienthal"));
		vertragspartnerDao.create(vertragspartner);
		System.out.println(vertragspartner);


		// wareDao.create() testen:
		System.out.println("\nAnlegen einer neuen Ware:");
		ware = new Ware("3D-Fernseher", 129, ware.getWarenNr());
		ware.setBeschreibung("50 Zoll 3D-Fernseher, Samsung, Baujahr 20014");
		ware.getBesonderheitenListe().add("2 Stk. 3D-Brillen");
		ware.getBesonderheitenListe().add("inkl. externer 1 GB HDD");
		ware.getMaengelListe().add("Keine Smart-Updates mehr verfügbar");
		ware = wareDAO.create(ware);
		System.out.println(ware);

	}
}


