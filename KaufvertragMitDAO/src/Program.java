import Dao.VertragspartnerDao;
import Dao.WareDao;
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

		WareDao wareDao = new WareDao();
		Ware ware = wareDao.read("1");
		System.out.println(ware);

		System.out.println("");

		ArrayList<Vertragspartner> vListe = vertragspartnerDao.read();
		System.out.println("Liste aller Vertragspartner: ");
		for (Vertragspartner v: vListe) {
			System.out.println(v);
		}

		System.out.println("");

		ArrayList<Ware> wListe = wareDao.read();
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
		wareDao.delete("1");
		wListe = wareDao.read();
		System.out.println("Liste aller Waren: ");
		for (Ware w : wListe){
			System.out.println(w);
		}
	}
}


