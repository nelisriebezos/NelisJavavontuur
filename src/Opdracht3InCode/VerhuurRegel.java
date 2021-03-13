package Opdracht3InCode;

import java.util.ArrayList;

public class VerhuurRegel extends TransactieRegel {
	private int eindDatum;
	private int aantalDagen;
	private TransactieRegel transactieregel;
	private Exemplaar exemplaar;

	public void setExemplaar(Exemplaar exm) {this.exemplaar = exm;}
	
	public Exemplaar getExemplaar() {return exemplaar;}

	public int geefPeriode() {
		return getTransactie().geefDatum();
	}

	public int getEindDatum() {return eindDatum;}

	public void setEindDatum(int eindDatum) {
		this.eindDatum = eindDatum;
	}
	
	public void creeer() {
		VerhuurRegel regel = new VerhuurRegel();
	}
}
