package Opdracht3InCode;

public class VerhuurRegel extends TransactieRegel {
	private int eindDatum;
	private int aantalDagen;
	private TransactieRegel transactieregel;
	private Exemplaar exemplaar;

	public void setExemplaar(Exemplaar exm) {
		this.exemplaar = exm;
	}
	
	public Exemplaar getExemplaar() {
		return exemplaar;
	}

	private int geefPeriode() {
		return getTransactie().getDatum();
	}
}
