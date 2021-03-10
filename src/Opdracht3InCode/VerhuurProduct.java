package Opdracht3InCode;

import java.util.ArrayList;
import java.util.List;

public class VerhuurProduct extends Product {
	private int verhuurPrijs;
	private int borg;
	private static List<VerhuurProduct> alleVerhuurProducten = new ArrayList<>();
	private List<Exemplaar> exemplaren = new ArrayList<>();

	static {
		alleVerhuurProducten.add(new VerhuurProduct("a"));
		alleVerhuurProducten.add(new VerhuurProduct("b"));
		alleVerhuurProducten.add(new VerhuurProduct("c"));
	}

	public VerhuurProduct(String omschrijving) {
		super(omschrijving);

	}

	public static List<String> geefAlle(x) {
		List<String> result = new ArrayList<>();

		for (VerhuurProduct p : alleVerhuurProducten) {
			result.add(p.geefOmschrijving());
		}
		return result;
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
