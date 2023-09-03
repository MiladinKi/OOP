package polimorfizam;

public class OsobaMain {

	public static void main(String[] args) {
		Osoba o = new Osoba("Ivana", "Ivanovic", 55);
		Zena z = new Zena("Ivana", "Ivanovic", 54, "Petrovic");
		
		o.predstaviSe();
		z.predstaviSe();

	}

}
