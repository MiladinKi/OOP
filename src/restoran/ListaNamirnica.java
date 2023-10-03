package restoran;

import java.util.ArrayList;

public class ListaNamirnica {
	private ArrayList<Namirnica> namirnice;

	public ListaNamirnica() {
		super();
		this.namirnice = new ArrayList<>();
	}
	
	public Namirnica traziNamirnicu(String nazivNamirnice) {
		Namirnica ret = null;
		for(Namirnica n : namirnice) {
			if(n.getNaziv().equals(nazivNamirnice)) {
				ret = n;
				break;
			}
		}
		return ret;
	}
	
	public void dodajNamirnicu(Namirnica novaNamirnica) {
		Namirnica postojeca = traziNamirnicu(novaNamirnica.getNaziv());
		if(postojeca == null) {
			namirnice.add(novaNamirnica);
		} else {
			System.out.println("Ova namirnica vec postoji u listi namirnica!");
		}
	}
	
	public void brisiNamirnicu(Namirnica n) {
		namirnice.remove(n);
	}
	
	
}
