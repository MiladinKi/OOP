package polimorfizam;

public class Kvadrat extends Oblik {
	private double duzinaStranice;
	
	public Kvadrat() {}

	public Kvadrat(String boja, int brojStrana, double duzinaStranice) {
		super(boja, "kvadrat", 4);
		this.duzinaStranice = duzinaStranice;
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
	
	public double izracunajPovrsinu() {
		return this.duzinaStranice * this.duzinaStranice;
	}
	
	public double izracunajObim() {
		return 2 * this.duzinaStranice;
	}
	
	public void podaciOObliku() {
		System.out.println(getBoja() + " " + getTip() + " " + getBrojStrana() + " " + izracunajObim() + " " + izracunajPovrsinu());
	}
	
	
}
