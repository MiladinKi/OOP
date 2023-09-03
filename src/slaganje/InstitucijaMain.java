package slaganje;

public class InstitucijaMain {

	public static void main(String[] args) {
		Osoba o1 = new Osoba("Osoba1", "Osoba1", 33);
		o1.predstaviSe();
		
		Zaposleni z1 = new Zaposleni("Zaposleni1", "Zaposleni1", 22, 2500);
		z1.izracunajPlatu(22);
		z1.predstaviSe();
		
		Racunar r1 = new Racunar("Intel", 5000, 1);
		r1.podaciORacunaru();
		
		Ucionica u1 = new Ucionica(1);
		u1.dodajRacunar(r1);
		u1.stampajInventar();
		
		Zaposleni[] zaposleni = {z1};
		Ucionica[] ucionica = {u1};

		Institucija i1 = new Institucija(zaposleni, ucionica);
		i1.dodajUcionicu(u1);
		i1.inventarUcionica();
		i1.dodajZaposlenika(z1);
		i1.inventarZaposlenih();
		i1.stampajInstituciju();
		
	}

}
