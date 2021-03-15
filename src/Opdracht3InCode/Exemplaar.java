package Opdracht3InCode;

import java.util.ArrayList;

public class Exemplaar {
	private int aanschafDatum;
	private int serieNr;
	private boolean status = true; //true wanneer exemplaar verhuurd is
	private ArrayList<VerhuurRegel>regels = new ArrayList<>();
	
	public void setRegels(VerhuurRegel rgl) {
		regels.add(rgl);
	}
	
	public ArrayList<VerhuurRegel> getRegels() {
		return regels;
	}
	
	public boolean isVerhuurd() {
//		for (VerhuurRegel r : regels) {
//			if (r.geefPeriode() == currentDate);
//			status = true;
//			}
		return status;
		}

	public int geefDetails() {
		return aanschafDatum + serieNr;
	}
}
