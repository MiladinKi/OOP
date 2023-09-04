package radnoOkruzenje_i_API;

public class Restoran extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String adresaKompanije;

	private String[] ponudaRestorana = { "Teleca corba", "Riblja corba", "Karadjordjeva", "Mesano meso", "Pastrmka" };

	@Override
	public String[] uzmiInventar() {
		// TODO Auto-generated method stub
		return ponudaRestorana;
	}

	@Override
	public void kupiInventar(String artikal) {
		System.out.println("Upravo ste narucili artikal: " + artikal);

	}

	@Override
	public void dodajInventar(String noviArtikal) {
		if (ponudaRestorana == null) {
			ponudaRestorana = new String[1];
			ponudaRestorana[0] = noviArtikal;
		} else {
			String[] novaPonudaRestorana = new String[ponudaRestorana.length + 1];
			for (int i = 0; i < ponudaRestorana.length; i++) {
				novaPonudaRestorana[i] = ponudaRestorana[i];
			}
			novaPonudaRestorana[novaPonudaRestorana.length - 1] = noviArtikal;

			ponudaRestorana = novaPonudaRestorana;
		}

	}

	@Override
	public void izbrisiInventar(String izbrisiArtikal) {
		if (ponudaRestorana != null && ponudaRestorana.length > 0) {
			for (int i = 0; i < ponudaRestorana.length; i++) {
				if (ponudaRestorana[i].equals(izbrisiArtikal)) {
					String[] noviNiz = new String[ponudaRestorana.length - 1];
					int index = 0;

					for (int j = 0; j < ponudaRestorana.length; j++) {
						if (!ponudaRestorana[j].equals(izbrisiArtikal)) {
							noviNiz[index] = ponudaRestorana[j];
							index++;
						}
					}

					System.out.println("Artikal " + izbrisiArtikal + " nije pronađen u ponudi.");
				} else {

					System.out.println("Ponuda je prazna ili nije inicijalizirana.");
				}
			}
		}
	}

	@Override
	public void ispisiPodatke() {
		System.out.println("Restoran " + this.imeKompanije + " se nalazi na adresi " + pribaviAdresu() + ".");

	}

	@Override
	public String pribaviIme() {
		// TODO Auto-generated method stub
		return imeKompanije;
	}

	@Override
	public void postaviIme(String ime) {
		this.imeKompanije = ime;

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

}
