package banka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Banka implements RadSaKlijentima {

	private ArrayList<Klijent> klijenti;
	
	public Banka() {
		klijenti = new ArrayList<>();
	}

	public Banka(ArrayList<Klijent> klijent) {
		this.klijenti = new ArrayList<Klijent>();
	}

	@Override
	public void ucitajKlijente(String imeDatoteke) {
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader(imeDatoteke));
			while (sc.hasNextLine()) {
				Klijent noviKlijent = new Klijent();
				noviKlijent.citaj(sc);
				klijenti.add(noviKlijent);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

	@Override
	public void pisiKlijente(String imeDatoteke) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(imeDatoteke))) {
	        for (Klijent k : klijenti) {
	            bw.write(k.getIme() + " " + k.getPrezime() + " " + k.getJmbg() + " " + k.getBrRacuna().getStanje() + " " + k.getBrRacuna().getValuta());
	            bw.newLine(); // Dodaj novi red između svaka dva klijenta
	        }
	        System.out.println("Podaci o klijentima su uspešno upisani u datoteku.");
	    } catch (IOException e) {
	        System.err.println("Greška pri pisanju u datoteku: " + e.getMessage());
	    }
	}
//	Ova metoda koristi BufferedWriter da otvori datoteku za pisanje i zatim prolazi kroz sve klijente u listi klijenti, zapisujući njihove informacije u datoteku. Nakon što se svi klijenti zapišu, datoteka se zatvara.

//	Napomena: Obratite pažnju da smo koristili try-with-resources blok kako bismo osigurali da se BufferedWriter pravilno zatvori nakon završetka pisanja.







	@Override
	public void dodajKlijenta(Klijent noviKlijent) {

		klijenti.add(noviKlijent);

	}

	@Override
	public void izbrisiKllijenta(String jmbg) {
		for (Klijent k : klijenti) {
			if (k.getJmbg() == jmbg) {
				klijenti.remove(k);
			} else {
				System.out.println("Ne postoji klijent sa tim jmbg");
			}
		}

	}

	@Override
	public void traziKlijenta(String jmbg) {
		for (Klijent k : klijenti) {
			if (k.getJmbg() == jmbg) {
				System.out.println("Podaci trazenog klijenta: " + k.getIme() + " " + k.getPrezime());
			} else {
				System.out.println("Ne postoji klijent sa tim jmbg");
			}
		}

	}

	@Override
	public void stampaKlijenta() {
		for (Klijent k : klijenti) {
			System.out.println("Klijent " + k.getIme() + " " + k.getPrezime() + " im jmbg broj: " + k.getJmbg());
		}

	}



}
