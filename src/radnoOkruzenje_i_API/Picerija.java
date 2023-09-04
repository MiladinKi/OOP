package radnoOkruzenje_i_API;

public class Picerija extends Prodavnica implements Imenovanje {
	
	private String imeKompanije;
	
	private String adresaKompanije;
	
	private String [] ponudaHrane = {
			"Pica",
			"Pasta",
			"Salata",
			"Kalcona",
			"Sok",
			"Pivo"
	};
	

	@Override
	public String pribaviIme() {
	
		return imeKompanije;
	}

	@Override
	public void postaviIme(String ime) {
		imeKompanije = ime;

	}

	@Override
	public String[] uzmiInventar() {
	
		return ponudaHrane;
	}

	@Override
	public void kupiInventar(String artikal) {
		System.out.println("Upravo ste narucili artikal: " + artikal);

	}

	
	@Override
	public void dodajInventar(String noviArtikal) {
	    // Prvo provjerite da li postoji dovoljno mjesta za dodavanje novog artikla
	    if (ponudaHrane == null) {
	        ponudaHrane = new String[1];
	        ponudaHrane[0] = noviArtikal;
	    } else {
	        // Ako niz nije prazan, trebate stvoriti novi niz s povećanim kapacitetom.
	        String[] novaPonudaHrane = new String[ponudaHrane.length + 1];
	        
	        // Kopirajte postojeće artikle u novi niz
	        for (int i = 0; i < ponudaHrane.length; i++) {
	        	novaPonudaHrane[i] = ponudaHrane[i];
	        }
	        
	        // Dodajte novi artikal na kraj niza
	        novaPonudaHrane[novaPonudaHrane.length - 1] = noviArtikal;
	        
	        // Zamijenite postojeći niz s novim nizom
	        ponudaHrane = novaPonudaHrane;
	    }
	}

	@Override
	public void izbrisiInventar(String izbrisiArtikal) {
	    // Provjerite da li niz postoji i nije prazan
	    if (ponudaHrane != null && ponudaHrane.length > 0) {
	        // Prolazimo kroz niz i tražimo artikal koji želimo izbrisati
	        for (int i = 0; i < ponudaHrane.length; i++) {
	            if (ponudaHrane[i].equals(izbrisiArtikal)) {
	                // Artikal je pronađen, sada ćemo izbrisati element iz niza
	                // To možete postići stvaranjem novog niza bez pronađenog artikla
	                String[] noviNiz = new String[ponudaHrane.length - 1];
	                int index = 0; // Indeks za novi niz
	                
	                // Kopirajte sve elemente osim pronađenog artikla u novi niz
	                for (int j = 0; j < ponudaHrane.length; j++) {
	                    if (!ponudaHrane[j].equals(izbrisiArtikal)) {
	                        noviNiz[index] = ponudaHrane[j];
	                        index++;
	                    }
	                }
	                
	                // Zamijenite postojeći niz s novim nizom bez izbrisanog artikla
	                ponudaHrane = noviNiz;
	                System.out.println("Artikal " + izbrisiArtikal + " je izbrisan.");
	                return; // Izlazimo iz petlje jer smo izbrisali artikal
	            }
	        }
	        
	        // Ako nismo pronašli artikal za brisanje, možete ispisati odgovarajuću poruku ili poduzeti druge akcije
	        System.out.println("Artikal " + izbrisiArtikal + " nije pronađen u ponudi.");
	    } else {
	        // Ako niz nije inicijaliziran ili je prazan, ispišite odgovarajuću poruku
	        System.out.println("Ponuda je prazna ili nije inicijalizirana.");
	    }
	}

	@Override
	public String pribaviAdresu() {
	
		return this.adresaKompanije;
	}

	@Override
	public void postaviAdresu(String adresa) {
		this.adresaKompanije = adresa;
		
	}

	@Override
	public void ispisiPodatke() {
		System.out.println("Picerija " + this.imeKompanije + " se nalazi na adresi " + pribaviAdresu() + ".");
		
	}
	
	

	
	


}
