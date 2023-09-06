package zaposleni;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RadnikNaBolovanju extends Radnik {

	@Override
	public void ucitajPodatkeIzDatoteke(String imeDatoteke) throws IOException {
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader(imeDatoteke));

			brojRadnika = sc.nextInt();
			cenaRada = sc.nextDouble();
			sc.nextLine();
			while (sc.hasNextLine()) {
				String linija = sc.nextLine();
				if (linija.startsWith("-")) {
					String[] podaci = linija.split(" ");
					ime = podaci[1];
					prezime = podaci[2];
					jmbg = podaci[3];
					tekuciRacuna = podaci[4];
					koefStrucneSpreme = Double.parseDouble(podaci[5]);
					ispisiPlatuUDatoteku("plata2.txt");
				}
			}

		} catch (Exception e) {
			System.out.println("Nesto nece da se iscita iz datoteke");
			System.out.println(e);
		} finally {
			if (sc != null) {

				sc.close();
			}
		}

	}

	@Override
	public void ispisiPlatuUDatoteku(String imeDatoteke) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(imeDatoteke, true);
			fw.write("Plata radnika " + ime + " " + prezime + " ima platu " + izracunajPlatu() + " dinara.\n");

		} catch (Exception e) {
			System.out.println("Nesto nece da se upise u datoteku.");
			System.out.println(e);
		} finally {
			if (fw != null) {
				fw.close();
			}
		}

	}

	@Override
	public double izracunajPlatu() {
		return 0.8 * koefStrucneSpreme * cenaRada;
	}

}
