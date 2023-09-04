package radnoOkruzenje_i_API;

public class Knjizara extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String adresaKompanije;
	private String[] ponudaKnjiga = { "Grof Monte Kristo", "Na Drini cuprija", "Prokleta avlija", "Zlocin i kazna",
			"Bele noci" };

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

		return adresaKompanije;
	}

	@Override
	public void postaviAdresu(String adresa) {
		this.adresaKompanije = adresa;

	}

	@Override
	public String[] uzmiInventar() {

		return ponudaKnjiga;
	}

	@Override
	public void kupiInventar(String artikal) {
		System.out.println("Upravo ste narucili artikal: " + artikal);

	}

	@Override
	public void dodajInventar(String noviArtikal) {
		if (ponudaKnjiga == null) {
			ponudaKnjiga = new String[1];
			ponudaKnjiga[0] = noviArtikal;
		} else {
			String[] novaPonudaKnjiga = new String[ponudaKnjiga.length + 1];
			for (int i = 0; i < ponudaKnjiga.length; i++) {
				novaPonudaKnjiga[i] = ponudaKnjiga[i];
			}
			novaPonudaKnjiga[novaPonudaKnjiga.length - 1] = noviArtikal;
			ponudaKnjiga = novaPonudaKnjiga;
		}

	}

	@Override
	public void izbrisiInventar(String izbrisiArtikal) {
		if (ponudaKnjiga != null && ponudaKnjiga.length > 0) {
			for (int i = 0; i < ponudaKnjiga.length; i++) {
				if (ponudaKnjiga[i].equals(izbrisiArtikal)) {
					String[] noviNiz = new String[ponudaKnjiga.length - 1];
					int index = 0;

					for (int j = 0; j < ponudaKnjiga.length; j++) {
						if (!ponudaKnjiga[j].equals(izbrisiArtikal)) {
							noviNiz[index] = ponudaKnjiga[j];
							index++;
						}
					}
					ponudaKnjiga = noviNiz;
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
		System.out.println("Knjizara " + this.imeKompanije + " se nalazi na adresi " + pribaviAdresu() + ".");
		System.out.println("U svojoj ponudi ima ");
		for(int i = 0; i<ponudaKnjiga.length; i++) {
			System.out.println(ponudaKnjiga[i]);
		}

	}

}
