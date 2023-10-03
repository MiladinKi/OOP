package turnir_u_MF;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListaIgraca {
	private ArrayList<Igrac> igraci = new ArrayList<Igrac>();

	public ListaIgraca() {}

	public ListaIgraca(ArrayList<Igrac> igraci) {
		this.igraci = igraci;
	}

	public ArrayList<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(ArrayList<Igrac> igraci) {
		this.igraci = igraci;
	}
	
	public int ucitaj() {
		Scanner s = null;
		int brojac = 0; //za kotizaciju
		try {
			s = new Scanner(new File("igraci.txt"));
			do {
				String ime = s.next();
				ime = ime.replaceAll("(\\r|\\n)", "");
				String prezime = s.next();
				String jmbg = s.next();
				String imeTima = s.next();
				Igrac noviIgrac = new Igrac(ime, prezime, jmbg, imeTima);
				this.igraci.add(noviIgrac);
				brojac++;
				
			} while (s.hasNext());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NoSuchElementException e) {
			
		}  finally {
			if (s != null) {
				s.close();
			}
		}
		return brojac;
	}
	
	public void stampaj() {
		for(Igrac i : igraci) {
			System.out.println(i.getIme() + " " + i.getPrezime() + " " + i.getJmbg() + " je u timu " + i.getImeTima());
		}
	}
	
	public void dodaj(String ime, String prezime, String jmbg, String imeTima) {
		igraci.add(new Igrac(ime, prezime, jmbg, imeTima));
	}
	
	public Igrac trazi(String jmbg) {
		for(Igrac i : igraci) {
			if(i.getJmbg().equalsIgnoreCase(jmbg)) {
				System.out.println(i.getJmbg());
				return i;
			}
		}
		System.out.println("Ne postoji igrac sa takvim jmbg");
		return null;
	}
	
	public void brisi(String jmbg) {
		igraci.remove(trazi(jmbg));
	}
	
	public int brojIgraca() {
		return igraci.size();
	}
	
	
	
}
