package nasledjivanje;

public class Automobil extends Vozilo {
	private int brojVrata;

	public Automobil() {
	}

	public Automobil(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojVrata) {
		super(marka, tip, registracija, godiste, vlasnik);
		this.brojVrata = brojVrata;
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	

		public void stampajPodatke() {
			System.out.println("Vlasnistvo vozila " + this.marka + " " + this.tip + 
					 " koji ima " + this.brojVrata + " vrata, se vodi na osobu " + vlasnik.getPrezime() + " " + vlasnik.getIme());
		}
	}

	
	
	
	
	


