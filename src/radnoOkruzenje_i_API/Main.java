package radnoOkruzenje_i_API;

public class Main {

	public static void main(String[] args) {
		Poslasticarnica poslasticarnica1 = new Poslasticarnica();
		Picerija picerija1 = new Picerija();
		
		poslasticarnica1.postaviIme("Evropa");
		picerija1.postaviIme("Ciao");
		
		poslasticarnica1.kupiInventar("Pica");
		picerija1.kupiInventar("Sladoled");
		
		picerija1.postaviAdresu("Bulevar Oslobodjenja");
		picerija1.pribaviAdresu();
		picerija1.ispisiPodatke();
		poslasticarnica1.postaviAdresu("Partizanska");
		poslasticarnica1.ispisiPodatke();
		
		SpisakKlijenata klijent = new SpisakKlijenata(22);
		klijent.dodajKlijenta("Marko");
		klijent.nadjiKlijenta("Marko");
		
		Restoran restoran1 = new Restoran();
		restoran1.postaviIme("Plava frajla");
		restoran1.postaviAdresu("Ustanicka");
		restoran1.ispisiPodatke();
		
		Knjizara knjizara1 = new Knjizara();
		knjizara1.postaviIme("Laguna");
		knjizara1.postaviAdresu("Cara Dusana");
		knjizara1.ispisiPodatke();
		knjizara1.izbrisiInventar("Bele noci");
		knjizara1.dodajInventar("Necista krv");
		knjizara1.ispisiPodatke();

	}

}
