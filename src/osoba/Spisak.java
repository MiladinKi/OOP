package osoba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Spisak {
	ArrayList<Osoba> listaPolaznika;
	
	public void ucitajListu(String imeFajla) {
		Scanner s = null;
		
		 this.listaPolaznika = new ArrayList<Osoba>();
		try {
			s = new Scanner(new File(imeFajla));
			do {
				String ime = s.next();
				String prezime = s.next();
				String jmbg = s.next();
				Osoba noviPolaznik = new Osoba(ime, prezime, jmbg);
				listaPolaznika.add(noviPolaznik);
			} while (s.hasNext());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if(s != null) {
			s.close();
			}
		}
	}
	public void sortirajListu() {
		Collections.sort(this.listaPolaznika, new MojKomparator());
	}
	public void stampajListu() {
		System.out.println(Arrays.toString(this.listaPolaznika.toArray()));
	}
	
	public void upisiListu(String imeFajla) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeFajla));
			for(Osoba polaznik : this.listaPolaznika) {
				pw.println(polaznik.getIme() + " " + polaznik.getPrezime() + " " + polaznik.getJmbg());
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
