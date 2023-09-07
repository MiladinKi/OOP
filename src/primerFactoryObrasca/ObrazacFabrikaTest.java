package primerFactoryObrasca;

public class ObrazacFabrikaTest {

	public static void main(String[] args) {
		FabrikaOblika fabrikaOblika = new FabrikaOblika();
		Figura oblik1 = fabrikaOblika.pribaviOblik("KRUG");
		oblik1.crtaj();
		
		Figura oblik2 = fabrikaOblika.pribaviOblik("PRAVOUGAONIK");
		oblik2.crtaj();
		
		Figura oblik3 = fabrikaOblika.pribaviOblik("KVADRAT");
		oblik3.crtaj();
		
	}

}
