package practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig{
	private int framenummer;
	
	public Fiets(String tp, double pr, int jr, int fnr) {
		super(tp, pr, jr);
		framenummer = fnr;
	}

	@Override
	public double huidigeWaarde() {
		int huidigJaar = LocalDate.now().getYear();
		double nuPrijs = nieuwprijs;
		for (int i = 0; i < (huidigJaar - bouwjaar); i++) {
			nuPrijs = (nuPrijs * 0.90);
		}
		return nuPrijs;
	}
	
	public boolean equals(Object obj) {
		boolean gelijkeObjecten = false;
		if (obj instanceof Fiets) {
			gelijkeObjecten = true;
		}
		return gelijkeObjecten;
	}

}
