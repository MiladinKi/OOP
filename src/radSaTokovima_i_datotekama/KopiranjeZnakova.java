package radSaTokovima_i_datotekama;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KopiranjeZnakova {

	public static void main(String[] args) throws IOException {
		FileReader ulaz = null;
		FileWriter izlaz = null;
		
		try {
			ulaz = new FileReader("ulazKarakter.txt");
			izlaz = new FileWriter("izlazKarakter.txt");
			int c;
			while ((c = ulaz.read()) != -1) {
				izlaz.write(c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(ulaz != null) {
				ulaz.close();
			}
			if (izlaz != null) {
				izlaz.close();
			}
		}

	}

}
