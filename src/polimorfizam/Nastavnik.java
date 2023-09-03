package polimorfizam;

public class Nastavnik extends Zaposleni {
	private String zvanje;
	private int brojSCIradova;
	private double plata;
	
	public Nastavnik() {}

	public Nastavnik(String ime, String prezime, String jmbg, String zvanje, int brojSCIradova) {
		super(ime, prezime, jmbg);
		this.zvanje = zvanje;
		this.brojSCIradova = brojSCIradova;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public int getBrojSCIradova() {
		return brojSCIradova;
	}

	public void setBrojSCIradova(int brojSCIradova) {
		this.brojSCIradova = brojSCIradova;
	}
	
	public void izracunajPlatu() {
		plata = 60000 + brojSCIradova * 3000;
	}
	
	public void podaciZaposlenom() {
		System.out.println("Ime: " + getIme());
		System.out.println("Prezime: " + getPrezime());
		System.out.println("Zvanje: " + getZvanje());
		System.out.println("Plata: " + plata + " dinara.");
	}
	
	
	
	

}
