package slaganje;

public class Motor {
	private boolean radi;
	private String tip;
	private int snaga;
	private int kubikaza;
	
	Motor(){}
	
	Motor(boolean radi, String tip, int snaga, int kubikaza){
		this.radi = radi;
		this.tip = tip;
		this.snaga = snaga;
		this.kubikaza = kubikaza;
	}

	public boolean getRadi() {
		return radi;
	}

	public void setRadi(boolean radi) {
		this.radi = radi;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	
	public void ukljuci() {
		if(this.getRadi() == false)
			this.setRadi(true);
	}
	
	public void iskljuci() {
		if(this.getRadi() == true)
			this.setRadi(false);
	}
	
	public void stampajPodatke() {
		System.out.println("Informacije o motoru:");
		System.out.println("Ukljucen: " + getRadi() + 
				" Tip: " + getTip() + 
				" Snaga: " + getSnaga() + 
				" Kubikaza: " + getKubikaza());
	}

}
