package nasledjivanje;

public class MainVozilo {

	public static void main(String[] args) {
	
		Osoba o1 = new Osoba("Miladin", "Kovacevic", 33);
		Osoba o2 = new Osoba("Tanja", "Kovacevic", 22);
		Vozilo v1 = new Vozilo("Zastava", "Fica", "rtyuio", 2010, o1);
		Automobil a1 = new Automobil("Toyota", "Corrola", "wdfg4567", 2010, o2, 5);
		Kamion k1 = new Kamion("Scania", "SD34", "dfghj", 2000, o1, 8);
		Motocikl m1 = new Motocikl("Suzuki", "AX34", "rgv", 2020, o2, true);
		v1.stampajPodatke();
		v1.prenosVlasnistva(o2);
		v1.stampajPodatke();
		a1.prenosVlasnistva(o1);
		a1.stampajPodatke();
		k1.prenosVlasnistva(o2);
		k1.stampajPodatke();
		m1.stampajPodatke();
		

	}

}
