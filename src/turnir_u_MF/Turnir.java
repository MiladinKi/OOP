package turnir_u_MF;

import java.io.IOException;

public class Turnir {
	ListaIgraca igraci;
	ListaTimova timovi;
	ListaUtakmica utakmice = new ListaUtakmica();
	final double KOTIZACIJA_ZA_IGRACA = 100;
	final double KOTIZACIJA_ZA_TIM = 500;
	double fond = 0;
	int brojIgraca;
	int brojTimova;
	
	
	
	public Turnir() {}

	public Turnir(ListaIgraca igraci, ListaTimova timovi, ListaUtakmica utakmice, double fond, int brojIgraca,
			int brojTimova) {
		this.igraci = new ListaIgraca();
		this.timovi = new ListaTimova();
		this.utakmice = utakmice;
		this.brojIgraca = igraci.ucitaj();
		this.brojTimova = timovi.ucitaj("timovi.txt");
		this.fond = brojIgraca*KOTIZACIJA_ZA_IGRACA + brojTimova*KOTIZACIJA_ZA_TIM;
	}
	
	public void dodajIgraca(String ime, String prezime, String jmbg, String imeTima) {
		igraci.dodaj(ime, prezime, jmbg, imeTima);
		fond += KOTIZACIJA_ZA_IGRACA;
	}
	
	public void brisiIgraca(String jmbg) {
		igraci.brisi(jmbg);
		System.out.println("Igrac je izbrisan");
	}
	public Igrac traziIgraca(String jmbg) {
		return igraci.trazi(jmbg);
	}
	
	public void dodajTim(String imeTima, String grad, int brojIgraca) {
	timovi.dodaj(imeTima, grad, brojIgraca);
	fond += KOTIZACIJA_ZA_TIM;
	}
	
	public void brisiTim(String imeTima) {
		timovi.brisi(imeTima);
		System.out.println("Tim je izbrisan");
	}
	
	public Tim traziTim(String imeTima) {
		return timovi.trazi(imeTima);
	}
	
	public void dodajUtakmicu(String imeTima1, String imeTima2) {
		utakmice.dodaj(imeTima1, imeTima2);
	}
	public void brisiUtakmicu(String imeTima1, String imeTima2) {
		utakmice.brisi(imeTima2, imeTima2);
	}
	
	public Utakmica traziUtakmicu(String imeTima1, String imeTima2) {
		return utakmice.trazi(imeTima1, imeTima2);
		 
	}
	
	public void snimiUtakmice(String imeFajla) throws IOException {
		utakmice.snimiUFajl(imeFajla);
	}

	@Override
	public String toString() {
		return "Turnir [brojIgraca=" + brojIgraca + ", brojTimova=" + brojTimova + "]";
	}
	
	public void fondINagrade() {
		System.out.printf("Ukupan fond turnira: %.2f\nPrva nagrada: %.2f\nDruganagrada: %.2f\nTreca nagrada: %.2f\n", fond, fond*0.5, fond*0.3, fond*0.1);
	}
}
