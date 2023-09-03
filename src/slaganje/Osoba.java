package slaganje;

public class Osoba {
	protected String ime;
	protected String prezime;
	protected int starost;
	
	public Osoba() {}
	
	public Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getIme() {
		return ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getPrezime() {
		return prezime;
	}
	
	public void setStarost(int starost ) {
		this.starost = starost;
	}
	public int getStarost() {
		return starost;
	}
	
	public void predstaviSe() {
		System.out.println("Ime i prezime: " + this.ime + " " + this.prezime + ", ima "+ this.starost + " godina.");
	}

}
