package nasledjivanje;

public class OsobaMain {

	public static void main(String[] args) {
		Osoba o1 = new Osoba();
		o1.setIme("Dusan");
		o1.setPrezime("Kovacevic");
		o1.setStarost(33);
		o1.predstaviSe();
		
		Zaposleni z1 = new Zaposleni("Nemanja", "Kovacevic", 22, 33);
		z1.racunajPlatu(22);
		z1.stampajPlatu();
		
		Zaposleni z2 = new Zaposleni();
		z2.setIme("Tanja");
		z2.setPrezime("Krstin");
		z2.setStarost(44);
		z2.racunajPlatu(11);
		z2.stampajPlatu();
		z2.predstaviSe();
		
		Student s1 = new Student("Marko", "Markovic", 22, 3396, 34.8, 11.2);
		s1.racunajProsekPoena();
		s1.stampajPoene();
		Student s2 = new Student();
		s2.setIme("Janko");
		s2.setPrezime("Jankovic");
		s2.setTest1(55);
		s2.setTest2(99);
		s2.racunajProsekPoena();
		s2.stampajPoene();
		
		Klijent k1 = new Klijent("Aca", "Acevic", 44, "12345", "098765", 500);
		Klijent k2 = new Klijent("Ime", "Prezime", 55, "76578", "345678", 100);
		k1.prebacitiIznos(k1, k2, 30);
		k1.stanjeRacuna();
		k2.stanjeRacuna();
		

	}

}
