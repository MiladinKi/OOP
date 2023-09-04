package radnoOkruzenje_i_API;

public class SpisakKlijenata {
	private String[] ime;
	private int trenutniBrojKlijenata;
	private int maxBrojKlijenata;
	
	public SpisakKlijenata() {}
	
	public SpisakKlijenata(int maxBrojKlijenata) {
		this.maxBrojKlijenata = maxBrojKlijenata;
		this.trenutniBrojKlijenata = 0;
		this.ime = new String[maxBrojKlijenata];
	}
	
	public String nadjiKlijenta (String ime) {
		for(int i = 0; i<this.trenutniBrojKlijenata; i++) {
			if(this.ime[i].equals(ime)) {
				return this.ime[i];
			}
		}
		return ("Klijent nije pronadjen");
	}
	
	public void dodajKlijenta(String ime) {
		if(this.trenutniBrojKlijenata < this.maxBrojKlijenata) {
			this.ime[this.trenutniBrojKlijenata++] = ime;
			
		}
		else {
			System.out.println("Nema vise mesta u spisku klijenata!");
		}
	}

}
