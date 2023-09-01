package enkapsulacija;

public class KlijentMain {

	public static void main(String[] args) {
		Klijent klijent = new Klijent("Marko", "Markovic", "123455", "Kikinda", "B.Tatica 20", "12-21-12", 560);
		klijent.podaciKlijenta();
		System.out.println("-----------------------------\n");
		Klijent []klijenti = new Klijent[5];
		klijenti[0] = new Klijent("Aca", "Acevic", "9999", "Beograd", "Terazije 20", "44-11-22", 456);
		klijenti[0].podaciKlijenta();
		klijenti[0].setIme("Aleksandar");
		klijenti[0].podaciKlijenta();
		System.out.println("-----------------------------\n");
		klijenti[1] = new Klijent("Ime", "Prezime", "2222", "Grad", "Adresa", "111111", 0);
		klijenti[2] = new Klijent("Dusan", "Kovacevic", "2004", "Novi Sad", "Oslobodjenja", "20-04", 456.98);
		klijenti[3] = new Klijent("Nemanja", "Kovacevic", "0503", "Doljani", "BB", "0503", 23456);
		klijenti[4] = new Klijent("Tanja", "Krstin", "2806", "Mokrin", "ACarnojevica 16", "89-09-90", 3456);
		
		for(int i=0; i<klijenti.length; i++) {
			klijenti[i].podaciKlijenta();
		}
		
		

	}

}
