package zaposleni;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AktivanRadnik extends Radnik {
    private double varijabilniKoeficijent;

    @Override
    public void ucitajPodatkeIzDatoteke(String imeDatoteke) {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(imeDatoteke));

            brojRadnika = sc.nextInt(); // Čitanje broja radnika
            cenaRada = sc.nextDouble(); // Čitanje cene rada
            sc.nextLine(); // Preskakanje praznog reda

            while (sc.hasNextLine()) {
                String linija = sc.nextLine();
                if (linija.startsWith("+")) {
                    String[] podaci = linija.split(" ");
                    ime = podaci[1];
                    prezime = podaci[2];
                    jmbg = podaci[3];
                    tekuciRacuna = podaci[4];
                    koefStrucneSpreme = Double.parseDouble(podaci[5]);
                    varijabilniKoeficijent = Double.parseDouble(podaci[6]);
//                    ispisiPlatuUDatoteku("plata.txt");
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
            fw.write("Plata radnika " + ime + " " + prezime + " iznosi " + izracunajPlatu() + " dinara.\n");
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
        return (koefStrucneSpreme + varijabilniKoeficijent) * cenaRada;
    }
}
