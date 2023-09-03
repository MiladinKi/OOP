package polimorfizam;

public class Asistent extends Zaposleni {
	private String mentor;
	private int godinaDoktorskihStudija;
	private double plata;
	
	public Asistent() {}

	public Asistent(String ime, String prezime, String jmbg, String mentor, int godinaDoktorskihStudija) {
		super(ime, prezime, jmbg);
		this.mentor = mentor;
		this.godinaDoktorskihStudija = godinaDoktorskihStudija;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public int getGodinaDoktorskihStudija() {
		return godinaDoktorskihStudija;
	}

	public void setGodinaDoktorskihStudija(int godinaDoktorskihStudija) {
		this.godinaDoktorskihStudija = godinaDoktorskihStudija;
	}
	
	public void izracunajPlatu() {
		plata = 40000 + godinaDoktorskihStudija * 2000;
	}
	
	public void podaciZaposlenom() {
		System.out.println("Ime: " + getIme());
		System.out.println("Prezime: " + getPrezime());
		System.out.println("Mentor: " + getMentor());
		System.out.println("Plata: " + plata + " dinara.");
	}
	
	
	
	

}
