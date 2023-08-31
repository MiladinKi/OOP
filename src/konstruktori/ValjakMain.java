package konstruktori;

public class ValjakMain {

	public static void main(String[] args) {
		Valjak cev = new Valjak(2.0f, 22.9f);
		
		System.out.println("Ovaj valjak ima poluprecnik " + cev.poluprecnik + " i visine je " + cev.visina);
		
		cev.poluprecnik = 33.33f;
		System.out.println("Ovaj valjak ima poluprecnik " + cev.poluprecnik + " i visine je " + cev.visina);

	}

}
