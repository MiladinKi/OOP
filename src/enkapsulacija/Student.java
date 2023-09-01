package enkapsulacija;

public class Student {
	private String ime;
	private String prezime;
	private double test1;
	private double test2;
	private double prosekP;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	Student(String i, String p, double t1, double t2){
		this.ime = i;
		this.prezime = p; 
		this.test1 = t1;
		this.test2 = t2;
	}
	
	public void setIme(String i) {
		this.ime = i;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setPrezime(String p) {
		this.prezime = p;
	}
	public String getPrezime() {
		return prezime;
	}
	
	public void setTest1(double t1) {
		test1 = t1;
	}
	public double getTest1() {
		return test1;
	}
	
	public void setTest2(double t2) {
		test2 = t2;
	}
	public double getTest2() {
		return test2;
	}
	void racunajProsek() {
		prosekP = (test1+test2)/2;
	}
	void stampajPoene() {
		System.out.println("Student " + this.ime + " " + this.prezime + " je dobio prosecan broj poena na testovima: " + prosekP);
	}
}
