package practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
	private String kenteken;
	
	public Auto(String tp, double pr, int jr, String kt) {
		super(tp, pr, jr);
		kenteken = kt;
	}

	@Override
	public double huidigeWaarde() {
		int huidigJaar = LocalDate.now().getYear();
		double nuPrijs = nieuwprijs;
		for (int i = 0; i < (huidigJaar - bouwjaar); i++) {
			nuPrijs = (nuPrijs * 0.70);
		}
		return nuPrijs;
	}

	public boolean equals(Object obj) {
		boolean gelijkeObjecten = false;
		if (obj instanceof Auto 
			&& super.equals(obj)
			&& kenteken.equals(((Auto) obj).kenteken)) {
			gelijkeObjecten = true;
		}
		return gelijkeObjecten;
	}
	
}
