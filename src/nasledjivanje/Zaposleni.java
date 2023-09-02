package nasledjivanje;

public class Zaposleni extends Osoba {
	private double koefRadnogMesta;
	private double plata;
	
	Zaposleni(){}
	
	Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta){
		super(ime, prezime, starost);
		this.koefRadnogMesta = koefRadnogMesta;
	}
	
	public void racunajPlatu(int brojDana) {
		plata = koefRadnogMesta * brojDana;
	}
	
	public void stampajPlatu() {
		System.out.println("Zaposleni " + this.ime + " " + this.prezime + " koji radi na radnom mestu sa koeficijentom "
				+ this.koefRadnogMesta + " ima platu " + plata);
	}

}
