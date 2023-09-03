package polimorfizam;

public class Oblik {
	private String boja;
	private String tip;
	private int brojStrana;
	
	public Oblik() {}

	public Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}
	
	public void podaciOObliku() {
		System.out.println("Oblik: " + this.tip + " je boje: " + this.boja + " i ima "
				+ this.brojStrana + " strane.");
	}
	
	
	
}
