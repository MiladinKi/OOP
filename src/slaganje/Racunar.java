package slaganje;

public class Racunar {
	private String procesor;
	private double memorijaRacunara;
//	private int brojRacunaraUInstituciji;
	private int inventarniBroj;
	
	public Racunar() {}

	public Racunar(String procesor, double memorijaRacunara, int inventarniBroj) {
		this.procesor = procesor;
		this.memorijaRacunara = memorijaRacunara;
		this.inventarniBroj = inventarniBroj;
	}

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public double getMemorijaRacunara() {
		return memorijaRacunara;
	}

	public void setMemorijaRacunara(double memorijaRacunara) {
		this.memorijaRacunara = memorijaRacunara;
	}

	public int getInventarniBroj() {
		return inventarniBroj;
	}

	public void setInventarniBroj(int inventarniBroj) {
		this.inventarniBroj = inventarniBroj;
	}
	

	
	public void podaciORacunaru() {
		System.out.println("Procesor: " + this.procesor);
		System.out.println("Memorija racunara u GB: " + this.memorijaRacunara);
		System.out.println("Inventarni broj racunara: " + this.inventarniBroj);
	}
	
	
	

}
