package restoran;

import java.util.ArrayList;

public class StavkaJelo {
	private int redniBroj;
	private String naziv;
	private double cena;
	private ArrayList<Namirnica> sastav;
	
	public StavkaJelo() {
		super();
	}
	public StavkaJelo(int redniBroj, String naziv, double cena) {
		super();
		this.redniBroj = redniBroj;
		this.naziv = naziv;
		this.cena = cena;
		this.sastav = new ArrayList<>();
	}
	public int getRedniBroj() {
		return redniBroj;
	}
	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public ArrayList<Namirnica> getSastav() {
		return sastav;
	}
	public void setSastav(ArrayList<Namirnica> sastav) {
		this.sastav = sastav;
	}
	@Override
	public String toString() {
		return "StavkaJelo [redniBroj=" + redniBroj + ", naziv=" + naziv + ", cena=" + cena + ", sastav=" + sastav
				+ "]";
	}
	


}
