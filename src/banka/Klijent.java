package banka;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Klijent implements RadSaFajlovima {

	private String ime;
	private String prezime;
	private String jmbg;
	private Racun brRacuna;
	private String valuta;

	public Klijent(String ime, String prezime, String jmbg, Racun brRacuna) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brRacuna = new Racun();
		this.valuta = valuta;
	}

	public Klijent() {
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public Racun getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(Racun brRacuna) {
		this.brRacuna = brRacuna;
	}

	@Override
	public void citaj(Scanner s) {
		ime = s.next();
		prezime = s.next();
		jmbg = s.next();
		brRacuna.setStanje(s.nextFloat());
	}

	@Override
	public void cuvaj(BufferedWriter bw) {

		System.out.println("Klijent " + this.ime + " " + this.prezime + " ima na racunu " + this.brRacuna.getStanje());

	}

}
