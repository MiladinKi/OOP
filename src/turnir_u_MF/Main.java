package turnir_u_MF;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ListaTimova timovi = new ListaTimova();
		timovi.ucitaj("timovi.txt");
		timovi.dodaj("fghj", "dfghjk", 11);
		timovi.brisi("fghj");
		timovi.trazi("Partizan");
//		timovi.stampaj();
		
		ListaIgraca igraci = new ListaIgraca();
		igraci.ucitaj();
		igraci.dodaj("Marko", "Markovic", "345678", "Partizan");
//		igraci.brisi("345678");
//		igraci.stampaj();
		
		ListaUtakmica utakmice = new ListaUtakmica();
		utakmice.dodaj("Partizan", "Celzi");
		utakmice.dodaj("OFKKikinda", "Inter");
//		utakmice.stampaj();
//		utakmice.snimiUFajl("odigraneUtakmice.txt");
	
		
		
		Turnir t = new Turnir();
		t.dodajTim("Milan", "Milano", 10);
//		t.dodajUtakmicu("Partizan", "Inter");
		System.out.println(t);
		t.fondINagrade();

	}

}
