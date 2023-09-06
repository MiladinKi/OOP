package matematika;

import java.io.IOException;

public interface Funkcija {
	public void ucitajKoordinate(String imeDatoteke);
	public double izracunajUdaljenostOdNule(double udaljenostOdNule);
	public void daLiSamOrt();
	public void daLiSamNaKoordinatnojOsi();
	public void sacuvajTacku(String imeUpisa) throws IOException;
	public void pozoviIspis();

}
