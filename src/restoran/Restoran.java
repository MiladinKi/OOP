package restoran;

import java.io.FileReader;
import java.util.Scanner;

public class Restoran {
	private String nazivRestorana;
	private ListaNamirnica listaNamirnica;
	private ListaJela listaJela;
	
	public Restoran(String nazivRestorana) {
		this.nazivRestorana = nazivRestorana;
		this.listaNamirnica = new ListaNamirnica();
		this.listaJela = new ListaJela();
	}

	public ListaNamirnica getListaNamirnica() {
		return listaNamirnica;
	}

	public void setListaNamirnica(ListaNamirnica listaNamirnica) {
		this.listaNamirnica = listaNamirnica;
	}

	public ListaJela getListaJela() {
		return listaJela;
	}

	public void setListaJela(ListaJela listaJela) {
		this.listaJela = listaJela;
	}
	
	
	
	public String getNazivRestorana() {
		return nazivRestorana;
	}

	public void setNazivRestorana(String nazivRestorana) {
		this.nazivRestorana = nazivRestorana;
	}

	public void ispisiPodatke(String imeDatoteke) {
		Scanner sc = null;
//		try {
//			sc = new Scanner(new FileReader(imeDatoteke));
//			nazivRestorana = sc.next();
//			
//		}
	}
	
	
}
