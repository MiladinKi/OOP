package slaganje;

public class Zaposleni extends Osoba {
	private double koefRadnogMesta;
	private double plata;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta) {
		super(ime, prezime, starost);
		this.koefRadnogMesta = koefRadnogMesta;
	}
	
	public void setKoefRM(double koefRM) {
		this.koefRadnogMesta = koefRM;
	}
	public double getKoefRM() {
		return koefRadnogMesta;
	}
	
	public void izracunajPlatu(int brojRadnihDana) {
		plata = koefRadnogMesta * brojRadnihDana;
	}
	
	public void predstaviSe() {
		System.out.println("Ime i prezime: " + this.ime + " " + this.prezime + " sa koef.radnog mesta " + this.koefRadnogMesta + 
				", ima platu "+ plata + " dinara.");
	}
}
