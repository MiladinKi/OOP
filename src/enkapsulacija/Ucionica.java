package enkapsulacija;

public class Ucionica {
	private int brojUcionice;
	private int brojRacunara;
	private UcionickiRacunari [] racunari = new UcionickiRacunari[brojRacunara];

	public Ucionica() {}
	
	public Ucionica(int bu, int br, UcionickiRacunari [] racunari) {
		this.brojUcionice = bu;
		this.brojRacunara = br;
		this.racunari = racunari;
	}

	public int getBrojUcionice() {
		return brojUcionice;
	}

	public void setBrojUcionice(int brojUcionice) {
		this.brojUcionice = brojUcionice;
	}

	public int getBrojRacunara() {
		return brojRacunara;
	}

	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}

	public UcionickiRacunari[] getRacunari() {
		return racunari;
	}

	public void setRacunari(UcionickiRacunari[] racunari) {
		this.racunari = racunari;
	}
	
}
