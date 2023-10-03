package turnir_u_MF;

public class Tim {
	private String imeTima;
	private String grad;
	private int brojIgracaUTimu;
	
	public Tim() {}

	public Tim(String imeTima, String grad, int brojIgracaUTimu) {
		this.imeTima = imeTima;
		this.grad = grad;
		this.brojIgracaUTimu = brojIgracaUTimu;
	}

	public String getImeTima() {
		return imeTima;
	}

	public void setImeTima(String imeTima) {
		this.imeTima = imeTima;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getBrojIgracaUTimu() {
		return brojIgracaUTimu;
	}

	public void setBrojIgracaUTimu(int brojIgracaUTimu) {
		this.brojIgracaUTimu = brojIgracaUTimu;
	}
	
	

}
