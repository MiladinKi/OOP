package klasa;

public class Racunar {
	String procesor;
	double radniTakt;
	int kapacitetMemorije;
	double indexPerformansiRacunara;
	
	void postaviProcesorIRadniTakt(String p, double rt) {
		procesor = p;
		radniTakt = rt;
	}
	
	void postaviKapacitetMemorije(int km) {
		kapacitetMemorije = km;
	}
	
	void racunajIndexPR() {
		indexPerformansiRacunara = 10*radniTakt + kapacitetMemorije;
	}
	
	void stampajIndexPerf() {
		System.out.println(" Racunar sa procesorom " + procesor + " koji ima radni takt " + radniTakt + "  i memoriju "
				+ kapacitetMemorije + " ima indeks performansi: " + indexPerformansiRacunara);
	}

}
