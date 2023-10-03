package banka;

public class Transakcija implements RadSaTransakcijama {

	private Klijent primalac;
	private Klijent posiljalac;
	private double iznos;

//	public Transakcija() {
//	}

	public Transakcija(Klijent primalac, Klijent posiljalac, double iznos) {
		this.primalac = primalac;
		this.posiljalac = posiljalac;
		this.iznos = iznos;
	}

	public Klijent getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Klijent primalac) {
		this.primalac = primalac;
	}

	public Klijent getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Klijent posiljalac) {
		this.posiljalac = posiljalac;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

	double stanjePosaljiaoca = posiljalac.getBrRacuna().getStanje();
	double stanjePrimaoca = primalac.getBrRacuna().getStanje();

	@Override
	public void transakcijaRealizuj() {

		double stanjePosaljiaoca = posiljalac.getBrRacuna().getStanje();
		double stanjePrimaoca = primalac.getBrRacuna().getStanje();
		if (posiljalac == null || primalac == null || posiljalac.getBrRacuna() == null
				|| primalac.getBrRacuna() == null) {
			System.out.println("Transakcija nije mogla biti realizovana zbog nedostajućih podataka.");
			return;
		}

		if (stanjePosaljiaoca < iznos) {
			System.out.println("Nemate dovoljno sredstava na računu za transakciju.");
			return;
		}

		stanjePosaljiaoca -= iznos;
		stanjePrimaoca += iznos;

		posiljalac.getBrRacuna().setStanje(stanjePosaljiaoca);
		primalac.getBrRacuna().setStanje(stanjePrimaoca);

		System.out.println("Transakcija uspešno realizovana.");

		System.out.println("Posiljalac sa jmbg " + posiljalac.getJmbg() + " je prebacio iznos " + iznos
				+ " na racun primaoca sa jmbg " + primalac.getJmbg() + " i sada on ima na stanju " + stanjePrimaoca);
	}

}
