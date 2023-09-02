package nasledjivanje;

public class Vozilo {
	protected String marka;
	protected String tip;
	protected String registracija;
	protected int godiste;
	protected Osoba vlasnik;
	
	public Vozilo() {
	}

	public Vozilo(String marka, String tip, String registracija, int godiste, Osoba vlasnik) {
		this.marka = marka;
		this.tip = tip;
		this.registracija = registracija;
		this.godiste = godiste;
		this.vlasnik = vlasnik;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	public void prenosVlasnistva(Osoba noviVlasnik) {
		this.vlasnik = noviVlasnik;
	}
	
	public void stampajPodatke() {
		System.out.println("Vlasnistvo vozila " + this.marka + " " + this.tip + " se vodi na osobu " + vlasnik.getPrezime() + " " + vlasnik.getIme());
	}
	
	
	
}
