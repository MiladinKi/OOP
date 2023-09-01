package enkapsulacija;

public class Racunar {
	private String procesor;
	private double radniTakt;
	private int kapacitetMemorije;
	private double indexPerformansiRacunara;
	
	public void setProcesor(String p) {
		this.procesor = p;
	}
	public String getProcesor(){
		return procesor;
	}
	
	public void setRadniTakt(double rt) {
		this.radniTakt = rt;
	}
	public double getRadniTakt() {
		return radniTakt;
	}
	
	public void setKapacitetMemorije(int km) {
		this.kapacitetMemorije = km;
	}
	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}
	
	void racunajIndexPR() {
		indexPerformansiRacunara = 10*radniTakt + kapacitetMemorije;
	}
	
	void stampajIndexPerf() {
		System.out.println(" Racunar sa procesorom " + this.procesor + " koji ima radni takt " + this.radniTakt + "  i memoriju "
				+ this.kapacitetMemorije + " ima indeks performansi: " + indexPerformansiRacunara);
	}

}
