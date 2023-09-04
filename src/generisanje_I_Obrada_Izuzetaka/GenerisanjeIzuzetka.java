package generisanje_I_Obrada_Izuzetaka;



public class GenerisanjeIzuzetka {

	public static void main(String[] args) {
		try {
//			System.out.println(koren(0, 1, 2));
//			System.out.println(koren(1, 1, 2));
//			System.out.println(koren(1, 5, 2));
			System.out.println(koren(1, 3, 5));
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
			return;
		}

		
		
	}
	static public double koren (double A, double B, double C) throws IllegalArgumentException{
		if (A == 0) {
			throw new IllegalArgumentException("A ne moze biti 0");
		} else {
			double disk = B*B + 4*A*C;
			if (disk < 0)
				throw new IllegalArgumentException("Diskriminanta manja od 0");
				return (-B + Math.sqrt(disk) / (2*A));
		}

		
	}

}
