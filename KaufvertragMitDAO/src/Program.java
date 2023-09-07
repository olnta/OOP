import Dao.VertragspartnerDao;
import Dao.WareDao;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException {
		//Deklaration und Initialisierung einer Instanz von VertragspartnerDao
		VertragspartnerDao vertragspartnerDao = new VertragspartnerDao();

		//read(String nr)-Methode aus VertragsparnterDao aufrufen und
		//das Ergebnis in ein Objekt des Typs Vertragspartner schreiben.
		Vertragspartner vertragspartner = vertragspartnerDao.read("0123456789");
		System.out.println(vertragspartner);

		WareDao wareDao = new WareDao();
		Ware ware = wareDao.read(1);
		System.out.println(ware);
	}
}
