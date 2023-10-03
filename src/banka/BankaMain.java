package banka;

public class BankaMain {

	public static void main(String[] args) {
		Banka b = new Banka();
		b.ucitajKlijente("bankaUlazniPodaci.txt");
		Racun r = new Racun(1200, "din");
		Klijent k1 = new Klijent("ACA", "Aca", "3456789", r);
		b.dodajKlijenta(k1);
		Racun r2 = new Racun(333, "din");
		Klijent k2 = new Klijent("JJJJ", "ASSSSca", "3456789", r2);
		b.dodajKlijenta(k2);
		b.pisiKlijente("BankaIspis.txt");
		Transakcija t1 = new Transakcija(k1, k2, 55);
		t1.transakcijaRealizuj();
		
		

	}

}
