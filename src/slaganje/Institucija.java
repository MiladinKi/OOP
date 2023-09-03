package slaganje;

public class Institucija {
	private final int MAX_EL = 20;
	private Zaposleni[] zaposleni;
	private Ucionica[] ucionice;
	private int brZaposlenih;
	private int brUcionica;
	
	public Institucija() {
	}

	public Institucija(Zaposleni[] zaposleni, Ucionica[] ucionice) {
		this.zaposleni = new Zaposleni[MAX_EL];
		this.ucionice = new Ucionica [MAX_EL];
	}
	
	public void dodajUcionicu(Ucionica ucionica) {
		if(brUcionica<ucionice.length) {
			ucionice[brUcionica++] = ucionica;
		}
		else {
			System.out.println("Ne moze se vise dodavati ucionice!");
		}
	}
	
	public void inventarUcionica() {
		for (int i = 0; i < brUcionica; i++)
			System.out.printf("Ucionica %d sa %d racunara.\n",
				ucionice[i].getBrojUcionice(), ucionice[i].getBrojRacunara());
	}
	
	public void dodajZaposlenika(Zaposleni zaposlenik) {
		if (brZaposlenih < zaposleni.length)
			zaposleni[brZaposlenih++] = zaposlenik;
	}
	
	public void inventarZaposlenih() {
		for (int i = 0; i < brZaposlenih; i++) {
			zaposleni[i].predstaviSe();
			System.out.println();
		}
	}
	
	public void stampajInstituciju() {
		System.out.println("Institucija raspolaze sa " + brUcionica + " ucionice i " + brZaposlenih + " zaposelnih radnika.");
	}
	
	
}
