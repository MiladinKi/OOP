package banka;

public interface RadSaKlijentima {
	public void ucitajKlijente(String imeDatoteke);
	public void pisiKlijente(String imeDatoteke);
	public void dodajKlijenta(Klijent noviKlijent);
	public void izbrisiKllijenta(String jmbg);
	public void traziKlijenta(String jmbg);
	public void stampaKlijenta();

	

}
