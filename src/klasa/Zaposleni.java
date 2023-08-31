package klasa;

public class Zaposleni {
	String ime;
	String prezime;
	double koefRadnogMesta;
	double plata;
	
	void postaviImePrezime(String i, String p) {
		ime = i;
		prezime = p;
	}
	
	void postaviKoefRM(double krm) {
		koefRadnogMesta = krm;
	}
	
	void racunajPlatu() {
		plata = 2500 * koefRadnogMesta;
	}
	
	void stampajPlatu() {
	System.out.printf("%s %s sa koeficijentom od %.2f ima platu: %.2f dinara.%n", ime, prezime, koefRadnogMesta, plata);
	}

}
