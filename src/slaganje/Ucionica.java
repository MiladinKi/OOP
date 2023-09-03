package slaganje;

public class Ucionica {
	private final int MAX_EL = 20;
	private int brojUcionice;
	private Racunar[] racunari;
	private int brojRacunara;
	
	public Ucionica() {}
	
	public Ucionica(int brojUcionice) {
		this.brojUcionice = brojUcionice;
		racunari = new Racunar[MAX_EL];
	}

	public int getBrojUcionice() {
		return brojUcionice;
	}

	public void setBrojUcionice(int brojUcionice) {
		this.brojUcionice = brojUcionice;
	}

	public Racunar[] getRacunari() {
		return racunari;
	}

	public void setRacunari(Racunar[] racunari) {
		this.racunari = racunari;
	}

	public int getBrojRacunara() {
		return brojRacunara;
	}

	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}
	
	public void dodajRacunar(Racunar r) {
	    if (brojRacunara < racunari.length) {
	        racunari[brojRacunara++] = r;
	    } else {
	        System.out.println("Učionica je popunjena. Ne možete dodati više računara.");
	    }
	}

	
	public void stampajInventar() {
		System.out.printf("Ucionica broj %d ", getBrojUcionice());
		if (brojRacunara == 0) {
			System.out.println("nema racunara.\n");
		}
		else {
			System.out.println("ima racunare:\n");
			for (int i = 0; i < brojRacunara; i++) {
				racunari[i].podaciORacunaru();
				System.out.println();
			}
			System.out.println("------------------------------");
		}
	}

	

}
