package turnir_u_MF;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListaUtakmica {
	private ArrayList<Utakmica> utakmice;

	public ListaUtakmica() {
		this.utakmice = new ArrayList<>();
	}

	public ListaUtakmica(ArrayList<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}
	
	public void dodaj(String prviTim, String drugiTim) {
		String [] rezultat = {"prvi pobedio", "drugi pobedio", "nereseno", "nije odigrano"};
		utakmice.add(new Utakmica(prviTim, drugiTim, rezultat[(int)((Math.random()*(rezultat.length - 0) + 0))]));
	}
	
	public void stampaj() {
		for(Utakmica u : utakmice) {
			System.out.println(u.getImeTima1() + " : " + u.getImeTima2() + " = " + u.getRezultat());
		}
	}
	
	public void brisi(String tim1, String tim2) {
		utakmice.remove(trazi(tim1, tim2));
	}
	
	public Utakmica trazi(String tim1, String tim2) {
		for(Utakmica u : utakmice) {
			if(tim1.equalsIgnoreCase(u.getImeTima1()) && tim2.equalsIgnoreCase(u.getImeTima2())) {
				return u;
			}
		}
		return null;
	}
	
	public void snimiUFajl(String imeFajla) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter(imeFajla);
			for(Utakmica u : utakmice) {
				fw.write(u.toString() + "\n");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fw != null) {
				try {
				fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				
				}
			}
		}
	}



}
