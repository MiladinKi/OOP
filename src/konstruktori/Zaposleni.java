package konstruktori;

public class Zaposleni {
	String ime;
	String prezime;
	double koefRadnogMesta;
	double plata;
	
	public Zaposleni() {}
	
	public Zaposleni(String i, String p, double koefRM) {
		this.ime = i;
		this.prezime = p;
		this.koefRadnogMesta = koefRM;
	}
	
	
	void racunajPlatu(int brd) {
		plata = koefRadnogMesta * brd * 100;
	}
	
	void stampajPlatu() {
	System.out.printf("%s %s sa koeficijentom od %.2f ima platu: %.2f dinara.%n", ime, prezime, koefRadnogMesta, plata);
	}

}
