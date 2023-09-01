package enkapsulacija;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.setIme("Marko");
		s.setPrezime("Markovic");
		s.setTest1(34);
		s.setTest2(23);
		s.racunajProsek();
		s.stampajPoene();
		
		Student s1 = new Student();
		s1.setIme("Aca");
		s1.setPrezime("Acovic");
		s1.setTest1(33.4);
		s1.setTest2(12.64);
		s1.racunajProsek();
		s1.stampajPoene();
		
		Student s2 = new Student("Janko", "Jankovic", 111, 11);
		s2.racunajProsek();
		s2.stampajPoene();

	}

}
