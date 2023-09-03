package polimorfizam;

public class ObimMain {

	public static void main(String[] args) {
		Kvadrat kv = new Kvadrat("bela", 4, 23);
		kv.izracunajObim();
		kv.izracunajPovrsinu();
		kv.podaciOObliku();
		
		Krug kg = new Krug("crna", 4);
		kg.izracunajPovrsinu();
		kg.izracunajPovrsinu();
		kg.podaciOObliku();

	}

}
