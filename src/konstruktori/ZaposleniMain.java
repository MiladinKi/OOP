package konstruktori;

public class ZaposleniMain {

	public static void main(String[] args) {
		Zaposleni z1 = new Zaposleni("Dusan", "Kovacevic", 33);
		z1.racunajPlatu(23);
		z1.stampajPlatu();
		
		Zaposleni z2 = new Zaposleni("Nemanja", "Kovacevic", 32.99);
		z2.racunajPlatu(23);
		z2.stampajPlatu();
		
		Zaposleni z3 = new Zaposleni("Tanja", "Krstin", 45);
		z3.racunajPlatu(22);
		z3.stampajPlatu();

	}

}
