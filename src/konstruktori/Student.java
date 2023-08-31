package konstruktori;

public class Student {
	String ime;
	String prezime;
	double test1;
	double test2;
	double prosekP;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	Student(String i, String p, double t1, double t2){
		this.ime = i;
		this.prezime = p; 
		this.test1 = t1;
		this.test2 = t2;
	}
	
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
		System.out.println("Student " + this.ime + " " + this.prezime + " je dobio prosecan broj poena na testovima: " + prosekP);
	}
}
