package nasledjivanje;

public class Klijent extends Osoba {
	private String jmbg;
	private String brTekucegRacuna;
	private double stanjeRacuna;
	
	public Klijent() {
	}
	
	public Klijent(String ime, String prezime, int starost, String jmbg, String brTekucegRacuna, double stanjeRacuna) {
		super(ime, prezime, starost);
		this.jmbg = jmbg;
		this.brTekucegRacuna = brTekucegRacuna;
		this.stanjeRacuna = stanjeRacuna;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getBrTekucegRacuna() {
		return brTekucegRacuna;
	}

	public void setBrTekucegRacuna(String brTekucegRacuna) {
		this.brTekucegRacuna = brTekucegRacuna;
	}

	public double getStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}

	public void prebacitiIznos(Klijent klijent1, Klijent klijent2, double iznos) {
	    klijent1.stanjeRacuna += iznos;
	    klijent2.stanjeRacuna -= iznos;
	}

	
	
	public void stanjeRacuna() {
		System.out.println("Klijent " + ime + " " + prezime + " sa JMBG: " + jmbg + " ima na racunu " + brTekucegRacuna + ":" + stanjeRacuna +
				" dinara.");
	}
	
	
	

}
