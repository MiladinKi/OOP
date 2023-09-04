package radnoOkruzenje_i_API;

public abstract class Prodavnica {
	private SpisakKlijenata spisakKlijenata;
	
	public void IzracunajPDV() {
		System.out.println("Stopa PDV je 20%");
	}
	
	public abstract String [] uzmiInventar();
	
	public abstract void kupiInventar(String artikal);
	
	public abstract void dodajInventar(String noviArtikal);
	
	public abstract void izbrisiInventar(String izbrisiArtikal);
	
	public abstract void ispisiPodatke();
}
