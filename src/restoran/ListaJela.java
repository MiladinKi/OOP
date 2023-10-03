package restoran;

import java.util.ArrayList;

public class ListaJela {
	private ArrayList<StavkaJelo> jela;

	public ListaJela() {
		super();
		jela = new ArrayList<>();
	}
	
	public void dodajStavku(StavkaJelo sj) {
		jela.add(sj);
	}
	
	public void izbrisiStavku(StavkaJelo sj) {
		jela.remove(sj);
	}
	
	public StavkaJelo traziStavku(String naziv) {
		StavkaJelo sj = null;
		for(StavkaJelo s : jela) {
			if(s.getNaziv().equals(naziv)) {
				sj = s;
				break;
			}
		}
		return sj;
	}
	
	private StavkaJelo traziStavku(int rbr) {
		StavkaJelo sj = null;
		for(StavkaJelo s : jela) {
			if(s.getRedniBroj() == rbr) {
				sj = s;
				break;
			}
		}
		return sj;
	}
	
	public void ispisiJelovnik() {
		System.out.println("Jelovnik:");
		for(StavkaJelo sj : jela) {
			System.out.println(sj.getRedniBroj() + ". " + sj.getNaziv() + " " + sj.getCena() + " dinara.");
		}
	}

	

}
