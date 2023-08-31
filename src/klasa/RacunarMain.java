package klasa;

public class RacunarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racunar r1 = new Racunar();
		r1.postaviProcesorIRadniTakt("Intel", 34);
		r1.postaviKapacitetMemorije(4000);
		r1.racunajIndexPR();
		r1.stampajIndexPerf();
		
		Racunar r2 = new Racunar();
		r2.postaviProcesorIRadniTakt("AMD", 22);
		r2.postaviKapacitetMemorije(3400);
		r2.racunajIndexPR();
		r2.stampajIndexPerf();
		
		Racunar r3 = new Racunar();
		r3.postaviProcesorIRadniTakt("Ryzer", 11);
		r3.postaviKapacitetMemorije(4500);
		r3.racunajIndexPR();
		r3.stampajIndexPerf();
		
		Racunar r4 = new Racunar();
		r4.postaviProcesorIRadniTakt("Commodore", 64);
		r4.postaviKapacitetMemorije(5000);
		r4.racunajIndexPR();
		r4.stampajIndexPerf();
		
		Racunar r5 = new Racunar();
		r5.postaviProcesorIRadniTakt("Nintendo", 2189);
		r5.postaviKapacitetMemorije(2345);
		r5.racunajIndexPR();
		r5.stampajIndexPerf();

	}

}
