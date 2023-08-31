package klasa;
/*Potrebno je kreirati klasu Poruka sa atributom "tekst" i metodama postaviTekst i pribaviTekst
 * Potom testiramo nasu klasu kreiranjem objekta klase (tipa) Poruka u okviru glavnog programa,
 * pracenog postavljanjem i prikazivanjem njenog sadrzaja
 */

public class Poruka {
	String tekst;
	
	void postaviTekst(String noviTekst) {
		tekst = noviTekst;
	}
	
	void pribaviTekst() {
		System.out.println(tekst);
	}
}
