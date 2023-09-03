package polimorfizam;

public class ZaposleniMain {

	public static void main(String[] args) {
		Zaposleni z = new Zaposleni("Marko", "Markovic", "12345");
		z.podaciZaposlenom();
		System.out.println("--------------------\n");
		
		Nastavnik n = new Nastavnik("Janko", "Jankovic", "45678", "magistar", 33);
		n.izracunajPlatu();
		n.podaciZaposlenom();
		System.out.println("--------------------\n");
		
		Asistent a = new Asistent("Darko", "Darkovic", "2345678", "da", 4);
		a.izracunajPlatu();
		a.podaciZaposlenom();
		System.out.println("--------------------\n");
		
		NenastavniRadnik nr = new NenastavniRadnik("Aca", "Acevic", "34567", "Domar", 34);
		nr.izracunajPlatu();
		nr.podaciZaposlenom();

	}

}
