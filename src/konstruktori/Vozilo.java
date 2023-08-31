package konstruktori;

public class Vozilo {
	String marka;
	String tip;
	int godiste;
	String registracija;
	int maksBrzina;
	int snaga;
	double cena;
	
	 public Vozilo() {}
	
	public Vozilo(String m, String t, int g, String r, int mb, int s) {
		this.marka = m;
		this.tip = t;
		this.godiste = g;
		this.registracija = r;
		this.maksBrzina = mb;
		this.snaga = s;
	}
	
	void izracunajCenu() {
		cena = maksBrzina * snaga / (2024 - godiste);
	}
	
	void stampajPodatke() {
		System.out.println("Vozilo marke " + this.marka + ", tipa " + this.tip + " regsitarskih oznaka " + 
	this.registracija + " koje je godiste " + this.godiste + " i snage " + this.snaga +
	 " moze da razvije maksimalnu brzinu od " + this.maksBrzina + " vredi " + cena + " evra.");
	}

}
