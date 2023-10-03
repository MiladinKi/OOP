package turnir_u_MF;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ListaTimova {
	private ArrayList<Tim> timovi = new ArrayList<Tim>();

	public ListaTimova() {
	}

	public ListaTimova(ArrayList<Tim> timovi) {
		this.timovi = timovi;
	}

	public ArrayList<Tim> getTimovi() {
		return timovi;
	}

	public void setTimovi(ArrayList<Tim> timovi) {
		this.timovi = timovi;
	}
	
	public int ucitaj(String imeFajla) {
		Scanner s = null;
		int brojac = 0;
		try {
			s = new Scanner(new File(imeFajla));
			s.useDelimiter(";");
			do {
				String imeTima = s.next();
				imeTima.replaceAll("(\\r|\\n)", "");
				String grad = s.next();
				int brojIgraca = s.nextInt();
				Tim noviTim = new Tim(imeTima, grad, brojIgraca);
				timovi.add(noviTim);
				brojac++;
			} while (s.hasNext());
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (NoSuchElementException e) {
			
		} finally {
			if (s != null) {
				s.close();
			}
		}
		return brojac;
	}
	
	public void stampaj() {
		for(Tim t : timovi) {
			System.out.println(t.getImeTima() + " iz grada " + t.getGrad() + " ima " + t.getBrojIgracaUTimu() + " igraca u timu.");
		}
		
	}
	
	public void dodaj(String imeTima, String grad, int brojIgraca) {
		timovi.add(new Tim(imeTima, grad, brojIgraca));
	}
	public Tim trazi(String imeTima) {
		for(Tim t : timovi) {
			if(t.getImeTima().equalsIgnoreCase(imeTima)) {
				
				return t;
			}
		}
		System.out.println("Ne postoji tim sa takvim imenom.");
		return null;
	}
	
	public void brisi(String imeTima) {
		timovi.remove(trazi(imeTima));
	}
	
	public int brojTimova() {
		return timovi.size();
	}
}
