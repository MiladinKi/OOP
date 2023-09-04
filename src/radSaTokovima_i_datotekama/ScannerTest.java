package radSaTokovima_i_datotekama;

import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vas JMBG:");
		String jmbg = sc.next();
		System.out.println("Unesite Vase ime:");
		String ime = sc.next();
		System.out.println("Unesite vase prezime:");
		String prezime = sc.next();
		System.out.println("Unesite vasu platu:");
		double plata = sc.nextDouble();
		System.out.println("Vase ime je " + ime + ", prezime: " + prezime + ", a vas JMBG je: " + jmbg +
				" i imate platu " + plata + " dinara.");
	}

}
