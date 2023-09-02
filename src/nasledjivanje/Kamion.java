package nasledjivanje;

public class Kamion extends Vozilo {
	private int brojOsovina;

	public Kamion() {
		super();
	}

	public Kamion (String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojOsovina) {
		super(marka, tip, registracija, godiste, vlasnik);
		this.brojOsovina = brojOsovina;
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
	
	public void stampajPodatke() {
		System.out.println("Vlasnistvo vozila " + this.marka + " " + this.tip + 
				 " koji ima " + this.brojOsovina + " osovine, se vodi na osobu " + vlasnik.getPrezime() + " " + vlasnik.getIme());
	}
	
	
}
