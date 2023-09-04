package radnoOkruzenje_i_API;

public class Poslasticarnica extends Prodavnica implements Imenovanje {
	private String imeKompanije;

	private String adresaKompanije;

	private String[] stavkaMenija = { "Sladoled", "Torta", "Krofna", "Kafa", "Caj", "Limunada" };

	@Override
	public String pribaviIme() {
		// TODO Auto-generated method stub
		return imeKompanije;
	}

	@Override
	public void postaviIme(String ime) {
		imeKompanije = ime;

	}

	@Override
	public String[] uzmiInventar() {
		// TODO Auto-generated method stub
		return stavkaMenija;
	}

	@Override
	public void kupiInventar(String artikal) {
		System.out.println("Upravo ste narucili artikal: " + artikal);

	}

	@Override
	public String pribaviAdresu() {
		// TODO Auto-generated method stub
		return adresaKompanije;
	}

	@Override
	public void postaviAdresu(String adresa) {
		this.adresaKompanije = adresa;

	}

	@Override
	public void dodajInventar(String noviArtikal) {
		if (stavkaMenija == null) {
			stavkaMenija = new String[1];
			stavkaMenija[0] = noviArtikal;
		} else {
			String[] novaStavkaMenija = new String[stavkaMenija.length + 1];
			for (int i = 0; i < stavkaMenija.length; i++) {
				novaStavkaMenija[i] = stavkaMenija[i];
			}
			novaStavkaMenija[novaStavkaMenija.length - 1] = noviArtikal;
			stavkaMenija = novaStavkaMenija;
		}

	}

	@Override
	public void izbrisiInventar(String izbrisiArtikal) {
		if (stavkaMenija == null && stavkaMenija.length > 0) {

			for (int i = 0; i < stavkaMenija.length; i++) {
				if (stavkaMenija[i].equals(izbrisiArtikal)) {
					String[] noviNiz = new String[stavkaMenija.length - 1];
					int index = 0;

					for (int j = 0; j < stavkaMenija.length; j++) {
						if (stavkaMenija[j].equals(izbrisiArtikal)) {
							noviNiz[index] = stavkaMenija[j];
							index++;
						}
					}

					stavkaMenija = noviNiz;
					System.out.println("Artikal " + izbrisiArtikal + " je izbrisan.");
					return;
				}
			}

			System.out.println("Artikal " + izbrisiArtikal + " nije pronađen u ponudi.");
		} else {

			System.out.println("Ponuda je prazna ili nije inicijalizirana.");
		}
	}

	@Override
	public void ispisiPodatke() {
		System.out.println("Poslasticarnica " + this.imeKompanije + " se nalazi na adresi " + pribaviAdresu() + ".");

	}

}
