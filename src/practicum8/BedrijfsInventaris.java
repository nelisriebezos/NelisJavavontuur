package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> alleGoederen = new ArrayList<>();

	public BedrijfsInventaris(String nm, double bud) {
		bedrijfsnaam = nm;
		budget = bud;
	}

	public void schafAan(Goed g) {
		boolean welOfNiet = false;
		for (Goed i : alleGoederen) {
			if (i.equals(g)) {
				welOfNiet = true;
			}
		}
		if (welOfNiet == false) {
			if (budget > g.huidigeWaarde()) {
				alleGoederen.add(g);
				budget -= g.huidigeWaarde();
			}
		}
	}

	public String toString() {
		String returnString = "De inventaris: ";
		for (Goed g : alleGoederen) {
			returnString += "\n" + g;
		}
		return returnString;
	}
}
