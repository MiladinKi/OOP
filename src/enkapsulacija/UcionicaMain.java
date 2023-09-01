package enkapsulacija;

public class UcionicaMain {

	public static void main(String[] args) {
		
		UcionickiRacunari[] racunari = new UcionickiRacunari[4];
		
		racunari[0] = new UcionickiRacunari("AMD", 22, 3, 15);
		racunari[1]= new UcionickiRacunari("AMD", 18, 2, 32);
		racunari[2] = new UcionickiRacunari("Intel", 30, 2, 16);
		racunari[3] = new UcionickiRacunari("Intel",45, 2, 32);
		
		Ucionica ucionica1 = new Ucionica(1, racunari.length, racunari);
		
		System.out.println("Ucionica broj " + ucionica1.getBrojUcionice() + " sadrzi " + ucionica1.getBrojRacunara()
		 + " racunara: ");
		for(int i=0; i<racunari.length; i++) {
			racunari[i].stampajIndexPerf();
		}

	}

}
