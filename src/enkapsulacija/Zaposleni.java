package enkapsulacija;

public class Zaposleni {
	private String ime;
	private String prezime;
	private double koefRadnogMesta;
	private double plata;
	
	public Zaposleni() {}
	
	public Zaposleni(String i, String p, double koefRM) {
		this.ime = i;
		this.prezime = p;
		this.koefRadnogMesta = koefRM;
	}
	
	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getKoefRadnogMesta() {
		return koefRadnogMesta;
	}

	public void setKoefRadnogMesta(double koefRadnogMesta) {
		this.koefRadnogMesta = koefRadnogMesta;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public void racunajPlatu(int brd) {
		plata = koefRadnogMesta * brd * 100;
	}
	
	public void stampajPlatu() {
	System.out.printf("%s %s sa koeficijentom od %.2f ima platu: %.2f dinara.%n", ime, prezime, koefRadnogMesta, plata);
	}

}
