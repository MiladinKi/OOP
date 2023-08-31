package klasa;

public class ZaposleniMain {

	public static void main(String[] args) {
		Zaposleni z1 = new Zaposleni();
		z1.postaviImePrezime("Dusan", "Kovacevic");
		z1.postaviKoefRM(23);
		z1.racunajPlatu();
		z1.stampajPlatu();
		
		Zaposleni z2 = new Zaposleni();
		z2.postaviImePrezime("Nemanja", "Kovacevic");
		z2.postaviKoefRM(22.99);
		z2.racunajPlatu();
		z2.stampajPlatu();
		
		Zaposleni z3 = new Zaposleni();
		z3.postaviImePrezime("Tanja", "Krstin");
		z3.postaviKoefRM(35);
		z3.racunajPlatu();
		z3.stampajPlatu();

	}

}
