package zaposleni;

import java.io.IOException;

public abstract class Radnik {
	protected String ime;
	protected String prezime;
	protected String jmbg;
	protected String tekuciRacuna;
	protected double koefStrucneSpreme;
	protected int brojRadnika;
	protected double cenaRada;

	public Radnik() {
	}

	public Radnik(String ime, String prezime, String jmbg, String tekuciRacuna, double koefStrucneSpreme,
			int brojRadnika, double cenaRada) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.tekuciRacuna = tekuciRacuna;
		this.koefStrucneSpreme = koefStrucneSpreme;
		this.brojRadnika = brojRadnika;
		this.cenaRada = cenaRada;
	}

	public abstract void ucitajPodatkeIzDatoteke(String imeDatoteke) throws IOException;

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

	public String getTekuciRacuna() {
		return tekuciRacuna;
	}

	public void setTekuciRacuna(String tekuciRacuna) {
		this.tekuciRacuna = tekuciRacuna;
	}

	public double getKoefStrucneSpreme() {
		return koefStrucneSpreme;
	}

	public void setKoefStrucneSpreme(double koefStrucneSpreme) {
		this.koefStrucneSpreme = koefStrucneSpreme;
	}

	public int getBrojRadnika() {
		return brojRadnika;
	}

	public void setBrojRadnika(int brojRadnika) {
		this.brojRadnika = brojRadnika;
	}

	public double getCenaRada() {
		return cenaRada;
	}

	public void setCenaRada(double cenaRada) {
		this.cenaRada = cenaRada;
	}

	public abstract void ispisiPlatuUDatoteku(String imeDatoteke) throws IOException;

	public abstract double izracunajPlatu();

}
