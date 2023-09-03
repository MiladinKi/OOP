package polimorfizam;

public class NenastavniRadnik extends Zaposleni {
	private String radnoMesto;
	private int godinaStaza;
	private double plata;
	
	public NenastavniRadnik(){}

	public NenastavniRadnik(String ime, String prezime, String jmbg, String radnoMesto, int godineStaza) {
		super(ime, prezime, jmbg);
		this.radnoMesto = radnoMesto;
		this.godinaStaza = godineStaza;
	}

	public String getRadnoMesto() {
		return radnoMesto;
	}

	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public int getGodinaStaza() {
		return godinaStaza;
	}

	public void setGodinaStaza(int godinaStaza) {
		this.godinaStaza = godinaStaza;
	}
	
	public void izracunajPlatu() {
		plata = 30000 + godinaStaza * 500;
	}
	
	public void podaciZaposlenom() {
		System.out.println("Ime: " + getIme());
		System.out.println("Prezime: " + getPrezime());
		System.out.println("Radno mesto: " + getRadnoMesto());
		System.out.println("Plata: " + plata + " dinara.");
	}
	
	
}
