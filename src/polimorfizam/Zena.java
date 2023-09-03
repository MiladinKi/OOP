package polimorfizam;

import polimorfizam.Osoba;

public class Zena extends Osoba {
	private String devojackoPrezime;
	
	public Zena() {}

	public Zena(String ime, String prezime, int starost, String devojackoPrezime) {
		super(ime, prezime, starost);
		this.devojackoPrezime = devojackoPrezime;
	}

	public String getDevojackoPrezime() {
		return devojackoPrezime;
	}

	public void setDevojackoPrezime(String devojackoPrezime) {
		this.devojackoPrezime = devojackoPrezime;
	}
	
	public void predstaviSe() {
		System.out.println("Ime: " + this.ime + " Prezime: " + this.prezime + " Devojacko prezime: " + this.devojackoPrezime);
	}
	
	
	
	

}
