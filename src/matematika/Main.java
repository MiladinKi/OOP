package matematika;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		LinearnaFunkcija lf = new LinearnaFunkcija();
		lf.ucitajKoordinate("funkcija1.txt");
		lf.izracunajUdaljenostOdNule(4);
		lf.daLiSamNaKoordinatnojOsi();
		lf.sacuvajTacku("nule1.txt");
		lf.pozoviIspis();
		
		KvadratnaFunkcija kf = new KvadratnaFunkcija();
		kf.ucitajKoordinate("funkcija2.txt");
		kf.izracunajUdaljenostOdNule(4);
		kf.daLiSamNaKoordinatnojOsi();
		kf.sacuvajTacku("nule2.txt");
		kf.pozoviIspis();

	}

}
