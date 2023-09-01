package enkapsulacija;

public class RacunarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racunar r1 = new Racunar();
		r1.setProcesor("Intel");
		r1.setRadniTakt(33);
		r1.setKapacitetMemorije(5000);
		r1.racunajIndexPR();
		r1.stampajIndexPerf();
		
		Racunar r2 = new Racunar();
		r2.setProcesor("AMD");
		r2.setRadniTakt(22);
		r2.setKapacitetMemorije(4000);
		r2.racunajIndexPR();
		r2.stampajIndexPerf();
		
		Racunar r3 = new Racunar();
		r3.setProcesor("Reazer");
		r3.setRadniTakt(26);
		r3.setKapacitetMemorije(4500);
		r3.racunajIndexPR();
		r3.stampajIndexPerf();
		
		Racunar r4 = new Racunar();
		r4.setProcesor("Commodore");
		r4.setRadniTakt(64);
		r4.setKapacitetMemorije(5000);
		r4.racunajIndexPR();
		r4.stampajIndexPerf();
		
		Racunar r5 = new Racunar();
		r5.setProcesor("Nintendo");
		r5.setRadniTakt(12);
		r5.setKapacitetMemorije(2345);
		r5.racunajIndexPR();
		r5.stampajIndexPerf();

	}

}
