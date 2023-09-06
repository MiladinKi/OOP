package osoba;

public class Main {

	public static void main(String[] args) {
		Spisak polaznici = new Spisak();
		polaznici.ucitajListu("spisak.txt");
		polaznici.stampajListu();
		polaznici.sortirajListu();
		polaznici.stampajListu();
		polaznici.upisiListu("uredjeniSpisak.txt");

	}

}
