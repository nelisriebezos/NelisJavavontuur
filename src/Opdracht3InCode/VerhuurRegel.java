package Opdracht3InCode;

import java.util.ArrayList;

public class VerhuurRegel extends TransactieRegel {
	private int eindDatum;
	private int aantalDagen;
	private Exemplaar exemplaar;

	public void setExemplaar(Exemplaar exm) {this.exemplaar = exm;}
	
	public Exemplaar getExemplaar() {return exemplaar;}

	public int geefPeriode() {
		return getTransactie().geefDatum();
	}
	
	public void creeer() {
		VerhuurRegel regel = new VerhuurRegel();
	}
}
