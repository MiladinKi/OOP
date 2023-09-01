package enkapsulacija;

public class VoziloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vozilo v1 = new Vozilo("Toyota", "Corrola", 2016, "KI066NC", 260, 97);
		v1.izracunajCenu();
		v1.stampajPodatke();
		
		Vozilo v2 = new Vozilo("Zastava", "Fica", 1956, "KI33-32", 98, 45);
		v2.izracunajCenu();
		v2.stampajPodatke();
		
		Vozilo v3 = new Vozilo("MIG", "21", 1981, "SRB099", 450, 87);
		v3.izracunajCenu();
		v3.stampajPodatke();

	}

}
