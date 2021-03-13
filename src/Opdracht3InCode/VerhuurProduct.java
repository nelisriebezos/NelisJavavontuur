package Opdracht3InCode;

import java.util.ArrayList;
import java.util.List;

public class VerhuurProduct extends Product {
	private int verhuurPrijs;
	private int borg;
	private static List<VerhuurProduct> alleVerhuurProducten = new ArrayList<>();
	private List<Exemplaar> exemplaren = new ArrayList<>();


public void setExemplaren(Exemplaar exmp) {
		exemplaren.add(exmp);
	}

	public List<Exemplaar> getExemplaren() {
	return exemplaren;
}

	public static List<String> geefAlle() {
		List<String> result = new ArrayList<>();

		for (VerhuurProduct p : alleVerhuurProducten) {
			result.add(p.geefOmschrijving());
		}
		return result;
	}

	public List<Exemplaar> geefBeschikbareExemplaren() {
		for (Exemplaar e : exemplaren) {
			e.geefDetails();
			e.isVerhuurd();
		}
		return beschikbareExemplaren;
	}
}
