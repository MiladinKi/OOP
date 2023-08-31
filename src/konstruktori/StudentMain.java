package konstruktori;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.postaviImePrezime("Marko", "Markovic");
		s.postaviPoene(34, 23);
		s.racunajProsek();
		s.stampajPoene();
		
		Student s1 = new Student();
		s1.postaviImePrezime("Aca", "Acovic");
		s1.postaviPoene(33.4, 12.64);
		s1.racunajProsek();
		s1.stampajPoene();
		
		Student s2 = new Student("Janko", "Jankovic", 111, 11);
		s2.racunajProsek();
		s2.stampajPoene();

	}

}
