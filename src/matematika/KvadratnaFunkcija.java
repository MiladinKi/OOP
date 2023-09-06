package matematika;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KvadratnaFunkcija implements Funkcija {
	public double x;
	public double y;
	public double z;
	public double r;
	
	

	public KvadratnaFunkcija() {}

	public KvadratnaFunkcija(double xKoordeinata, double yKoordeinata, double zKoordeinata, double udaljenostOdNule) {
		this.x = xKoordeinata;
		this.y = xKoordeinata;
		this.z = xKoordeinata;
		this.r = udaljenostOdNule;
	}

	@Override
	public void ucitajKoordinate(String imeDatoteke) {
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader(imeDatoteke));
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
		} catch (IOException e) {
			System.out.println("Ne valja datoteka");
			System.out.println(e);;
		} finally {
			sc.close();
		}
		

	}

	@Override
	public double izracunajUdaljenostOdNule(double udaljenostOdNule) {
		return udaljenostOdNule = Math.sqrt((x*x) + (y*y) + (z*z));
	}

	@Override
	public void daLiSamOrt() {
		if(r == 1) {
			System.out.println(" ");
			System.out.println("Tacka je vrh jedinicnog vektora");
		} else {
			System.out.println(" ");
			System.out.println("Tacka nije vrh jedinicnog vektora");
		}

	}

	@Override
	public void daLiSamNaKoordinatnojOsi() {
		if(x == 0) {
			System.out.println(" ");
			System.out.println("Jesam na koordinatnoj osi");
			System.out.println(" ");
		} else {
			System.out.println(" ");
			System.out.println("Nisam na koordinatnoj osi");
			System.out.println(" ");
		} 
		if(y == 0) {
			System.out.println(" ");
			System.out.println("Jesam na koordinatnoj osi");
			System.out.println(" ");
		} else {
			System.out.println(" ");
			System.out.println("Nisam na koordinatnoj osi");
			System.out.println(" ");
		} 
		if(x == 0) {
			System.out.println(" ");
			System.out.println("Jesam na koordinatnoj osi");
			System.out.println(" ");
		} else {
			System.out.println(" ");
			System.out.println("Nisam na koordinatnoj osi");
			System.out.println(" ");
		} 

	}

	@Override
	public void sacuvajTacku(String imeUpisa) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(imeUpisa);
			fw.write("Udaljenost od nule iznosi " + izracunajUdaljenostOdNule(r));
		} catch (IOException e) {
			System.out.println("Nece da upise u datoteku");
			System.out.println(e);
		} finally {
			fw.close();
		}

	}

	@Override
	public void pozoviIspis() {
		System.out.println("Udaljenost od nule iznosi " + izracunajUdaljenostOdNule(r));

	}

}
