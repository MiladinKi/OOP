package klasa;

public class Student {
	String ime;
	String prezime;
	double test1;
	double test2;
	double prosekP;
	
	void postaviImePrezime(String i, String p) {
		ime = i;
		prezime = p;
	}
	
	void postaviPoene(double t1, double t2) {
		test1 = t1;
		test2 = t2;
	}
	void racunajProsek() {
		prosekP = (test1+test2)/2;
	}
	void stampajPoene() {
		System.out.println("Student " + ime + " " + prezime + " je dobio prosecan broj poena na testovima: " + prosekP);
	}
}
