package restoran;

public class Namirnica {
	private String naziv;
	private int kolicina;
	public Namirnica() {
		super();
	}
	public Namirnica(String naziv, int kolicina) {
		super();
		this.naziv = naziv;
		this.kolicina = kolicina;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
	public void dodajKolicinu(int dodataKolicina) {
		this.kolicina +=dodataKolicina;
	}
	
	public void oduzmiKolicinu(int oduzetaKolicina) {
		if(kolicina>oduzetaKolicina) {
			kolicina -= oduzetaKolicina;
		} else {
			System.out.println("Nema dovoljno kolicine da bi se oduzela zadata kolicina.");
		}
	}
	@Override
	public String toString() {
		return "Namirnica [naziv=" + naziv + ", kolicina=" + kolicina + "]";
	}
	
}
