package enkapsulacija;

public class UcionickiRacunari {
	private String procesor;
	private double radniTakt;
	private int kapacitetMemorije;
	private double indexPerformansiRacunara;
	
	public UcionickiRacunari() {
	}

	public UcionickiRacunari(String procesor, double radniTakt, int kapacitetMemorije,
			double indexPerformansiRacunara) {
		this.procesor = procesor;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
		this.indexPerformansiRacunara = indexPerformansiRacunara;
	}

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public double getRadniTakt() {
		return radniTakt;
	}

	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}

	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}

	public void setKapacitetMemorije(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public double getIndexPerformansiRacunara() {
		return indexPerformansiRacunara;
	}

	public void setIndexPerformansiRacunara(double indexPerformansiRacunara) {
		this.indexPerformansiRacunara = indexPerformansiRacunara;
	}
	public void racunajIndexPR() {
		indexPerformansiRacunara = 10*radniTakt + kapacitetMemorije;
	}
	
	public void stampajIndexPerf() {
		System.out.println(" Racunar sa procesorom " + this.procesor + " koji ima radni takt " + this.radniTakt + "  i memoriju "
				+ this.kapacitetMemorije + " ima indeks performansi: " + indexPerformansiRacunara);
	}
	
	
	
}


