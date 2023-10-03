package turnir_u_MF;

public class Igrac {
	private String ime;
	private String prezime;
	private String jmbg;
	private String imeTima;

	public Igrac() {
		super();
	}

	public Igrac(String ime, String prezime, String jmbg, String imeTima) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.imeTima = imeTima;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getImeTima() {
		return imeTima;
	}

	public void setImeTima(String imeTima) {
		this.imeTima = imeTima;
	}

}
