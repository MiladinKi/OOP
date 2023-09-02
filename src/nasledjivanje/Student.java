package nasledjivanje;

public class Student extends Osoba {
	private int brojIndexa;
	private double test1;
	private double test2;
	private double prosekPoeni;
	
	public Student() {}
	
	public Student(String ime, String prezime, int starost, int brojIndexa, double test1, double test2) {
		super(ime, prezime, starost);
		this.brojIndexa = brojIndexa;
		this.test1 = test1;
		this.test2 = test2;
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public double getTest1() {
		return test1;
	}

	public void setTest1(double test1) {
		this.test1 = test1;
	}

	public double getTest2() {
		return test2;
	}

	public void setTest2(double test2) {
		this.test2 = test2;
	}
	
	public void racunajProsekPoena() {
		prosekPoeni = (test1 + test2) / 2;
	}
	
	public void stampajPoene() {
		System.out.println("Student " + ime + " " + prezime + " ciji je indeks broj: " + brojIndexa +
				" je osvojio prosecno " + prosekPoeni + " poena na testovima.");
	}

}
