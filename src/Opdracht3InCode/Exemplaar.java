package Opdracht3InCode;

import java.util.ArrayList;

public class Exemplaar {
	private int aanschafDatum;
	private int serieNr;
	private boolean status;
	private ArrayList<VerhuurRegel>regels = new ArrayList<>();
	
	public Exemplaar() {
	}

	public int getSerieNr() {
		return serieNr;
	}
	
	public void setRegels(VerhuurRegel rgl) {
		regels.add(rgl);
	}
	
	public VerhuurRegel getRegels() {
		
	}
	
	public int geefDetails() {
		return serieNr + aanschafDatum;
	}

	public boolean isVerhuurd() {
		// TODO Auto-generated method stub
		
	}
	
	private void sysout() {
		// TODO Auto-generated method stub

	}
}
