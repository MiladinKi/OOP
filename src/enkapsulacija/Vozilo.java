package enkapsulacija;

public class Vozilo {
	private String marka;
	private String tip;
	private int godiste;
	private String registracija;
	private int maksBrzina;
	private int snaga;
	private double cena;
	
	 public Vozilo() {}
	
	public Vozilo(String m, String t, int g, String r, int mb, int s) {
		this.marka = m;
		this.tip = t;
		this.godiste = g;
		this.registracija = r;
		this.maksBrzina = mb;
		this.snaga = s;
	}
	
	public void izracunajCenu() {
		cena = maksBrzina * snaga / (2024 - godiste);
	}
	
	public void stampajPodatke() {
		System.out.println("Vozilo marke " + this.marka + ", tipa " + this.tip + " regsitarskih oznaka " + 
	this.registracija + " koje je godiste " + this.godiste + " i snage " + this.snaga +
	 " moze da razvije maksimalnu brzinu od " + this.maksBrzina + " vredi " + cena + " evra.");
	}

}
