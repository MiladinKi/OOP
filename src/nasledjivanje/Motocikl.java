package nasledjivanje;

public class Motocikl extends Vozilo {
	private boolean registrovan;

	public Motocikl() {
	}

	public Motocikl(String marka, String tip, String registracija, int godiste, Osoba vlasnik, boolean registrovan) {
		super(marka, tip, registracija, godiste, vlasnik);
		this.registrovan = registrovan;
	}

	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
	public void stampajPodatke() {
		System.out.println("Vlasnistvo vozila " + this.marka + " " + this.tip + 
				 " koji je " + this.registrovan + " registrovan, se vodi na osobu " + vlasnik.getPrezime() + " " + vlasnik.getIme());
	}
	
	
}
