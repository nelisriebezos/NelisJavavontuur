package Opdracht3InCode;

import java.util.ArrayList;

public class VerhuurProduct extends Product {
	private int verhuurPrijs;
	private int borg;
	private static ArrayList<VerhuurProduct> alleVerhuurProducten = new ArrayList<>();
	private ArrayList<Exemplaar>exemplaren = new ArrayList<>();

	public VerhuurProduct() {
	}
	
	public String geefOmschrijving() {
		
	}
	
	public void setExemplaren(Exemplaar exmp) {
		exemplaren.add(exmp);
	}
	
	public Exemplaar geefBeschikbareExemplaren(int serieNr) {
		for (Exemplaar e : exemplaren) {
			if (serieNr == e.getSerieNr())
				return e;
		}
	}
}
