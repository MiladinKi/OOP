package turnir_u_MF;

public class Utakmica {
	private String imeTima1;
	private String imeTima2;
	private String rezultat;

	public Utakmica() {
	}

	public Utakmica(String imeTima1, String imeTima2, String rezultat) {
		this.imeTima1 = imeTima1;
		this.imeTima2 = imeTima2;
		this.rezultat = rezultat;
	}

	public String getImeTima1() {
		return imeTima1;
	}

	public void setImeTima1(String imeTima1) {
		this.imeTima1 = imeTima1;
	}

	public String getImeTima2() {
		return imeTima2;
	}

	public void setImeTima2(String imeTima2) {
		this.imeTima2 = imeTima2;
	}

	public String getRezultat() {
		return rezultat;
	}

	public void setRezultat(String rezultat) {
		this.rezultat = rezultat;
	}

	@Override
	public String toString() {
		return "Utakmica [imeTima1=" + imeTima1 + ", imeTima2=" + imeTima2 + ", rezultat=" + rezultat + "]";
	}

}
