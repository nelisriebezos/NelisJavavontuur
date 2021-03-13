package Opdracht3InCode;

import java.util.ArrayList;

public class Transactie {
	private int datum;
	private ArrayList<TransactieRegel>regels = new ArrayList<>();
	

	public ArrayList<TransactieRegel> getRegels() {
		return regels;
	}

	public void setRegels(ArrayList<TransactieRegel> regels) {
		this.regels = regels;
	}

	public int geefDatum() {
		return datum;
	}

	public void setDatum(int datum) {
		this.datum = datum;
	}
}
