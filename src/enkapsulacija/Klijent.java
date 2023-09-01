package enkapsulacija;

 class Klijent {
	private String ime;
	private String prezime;
	private String jmbg; 
	private String grad;
	private String adresa;
	private String brojRacuna;
	private double stanjeRacuna;
	
	public Klijent() {}
	
	public Klijent (String i, String p, String jmbg, String g, String a, String br, double sr) {
		this.ime = i; 
		this.prezime = p; 
		this.jmbg = jmbg;
		this.grad = g;
		this.adresa = a;
		this.brojRacuna = br;
		this.stanjeRacuna = sr;
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
	public String getPrezime () {
		return prezime;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getJmbg() {
		return jmbg;
	}
	
	public void setGrad(String g) {
		this.grad = g;
	}
	public String getGrad() {
		return grad;
	}
	
	public void setAdresa(String a) {
		this.adresa = a;
	}
	public String getAdresa() {
		return adresa;
	}
	
	public void setBrojRacuna(String br) {
		this.brojRacuna = br;
	}
	public String getBrojRacuna() {
		return brojRacuna;
	}
	
	public void setStanjeRacuna(double sr) {
		this.stanjeRacuna = sr;
	}
	public double getStanjeRacuna() {
		return stanjeRacuna;
	}
	
	public void podaciKlijenta() {
		System.out.println("Klijent " + this.ime + " " + this.prezime + ", ciji je jmbg: " 
				+ this.jmbg + ", koji zivi u gradu " + this.grad + " na adresi " + this.adresa
				 + " ima otvoren racun br: " + this.brojRacuna + ". Na racunu ima " + this.stanjeRacuna + " dinara.");
	}

}
 

		
