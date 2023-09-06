package matematika;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LinearnaFunkcija implements Funkcija {
	public double x;
	public double y;
	public double r;
	
	

	public LinearnaFunkcija() {}
	
	

	public LinearnaFunkcija(double xKoordinata, double yKoordinata, double udaljenostOdNule) {
		super();
		this.x = xKoordinata;
		this.y = yKoordinata;
		this.r = udaljenostOdNule;
	}



	@Override
	public void ucitajKoordinate(String imeDatoteke) {
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader(imeDatoteke));
			x = sc.nextDouble();
			y = sc.nextDouble();
		}catch (IOException e) {
			System.out.println("Ne valja datoteka");
			System.out.println(e);
		} finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

	@Override
	public double izracunajUdaljenostOdNule(double udaljenostOdNule) {
		return udaljenostOdNule = Math.sqrt((x*x) + (y*y));
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
		

	}

	@Override
	public void sacuvajTacku(String imeUpisa) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(imeUpisa);
			fw.write("\nUdaljenost od nule iznosi " + izracunajUdaljenostOdNule(r));
		} catch (IOException e) {
			System.out.println("Nesto nece da se upise u datoteku");
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
