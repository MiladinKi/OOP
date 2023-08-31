package klasa;

public class PorukaMain {

	public static void main(String[] args) {
		Poruka prvaPoruka = new Poruka(); //napravimo novi objekat prvaPoruka
		prvaPoruka.tekst = "Zdravo svete!";
		prvaPoruka.pribaviTekst();
		prvaPoruka.postaviTekst("Zdravo OOP svete!");
		prvaPoruka.pribaviTekst();
		
		Poruka p, p1, p2, p3;
		p = new Poruka();
		p1 = new Poruka();
		
		p2 = p1;
		
		p3 = null;
		
		p.tekst = "Hello World!";
		p1.tekst = "Helllo Zdravooo!";
		p.pribaviTekst();
		p1.pribaviTekst();
		p2.pribaviTekst();
//		p3.pribaviTekst();
		p1.postaviTekst("Proba");
		p1.pribaviTekst();
		p2.pribaviTekst();
		p2.postaviTekst("Nova proba");
		p1.pribaviTekst();
		p2.pribaviTekst();

	}

}
