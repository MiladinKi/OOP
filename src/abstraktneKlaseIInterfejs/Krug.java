package abstraktneKlaseIInterfejs;

public class Krug extends Oblik implements Figura{
	private double poluprecnik;
	
	public Krug() {}

	public Krug(String boja, double poluprecnik) {
		super(boja, "krug", 0);
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	@Override
	public double izracunajPovrsinu() {
		return this.poluprecnik * this.poluprecnik * Math.PI;
	}

	@Override
	public double izracunajObim() {
		return 2 * this.poluprecnik * Math.PI;
	}
	
//	public double izracunajPovrsinu() {
//		return this.poluprecnik * this.poluprecnik * Math.PI;
//	}
//	
//	public double izracunajObim() {
//		return 2 * this.poluprecnik * Math.PI;
//	}
	
	public void podaciOObliku() {
		System.out.println(getBoja() + " " + getTip() + " " + getBrojStrana() + " " + izracunajObim() + " " + izracunajPovrsinu());
	}
	
	

}
