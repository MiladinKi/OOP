package banka;

public class Racun {
	private float stanje;
	private String valuta;
	
	public Racun() {}
	public Racun(float stanje, String valuta) {
		stanje = stanje;
		this.valuta = valuta;
	}
	public float getStanje() {
		return stanje;
	}
	public void setStanje(double stanjePosaljiaoca) {
		stanjePosaljiaoca = stanjePosaljiaoca;
	}
	public String getValuta() {
		return valuta;
	}
	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

}
