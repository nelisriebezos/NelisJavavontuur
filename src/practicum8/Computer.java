package practicum8;

import java.time.LocalDate;

public class Computer implements Goed {
	private String type;
	private String macAdres;
	private double aanschafPrijs;
	private int productieJaar;

	public Computer(String tp, String adr, double pr, int jr) {
		type = tp;
		macAdres = adr;
		aanschafPrijs = pr;
		productieJaar = jr;
	}

	public double huidigeWaarde() {
		int huidigJaar = LocalDate.now().getYear();
		double nuPrijs = aanschafPrijs;
		for (int i = 0; i < (huidigJaar - productieJaar); i++) {
			nuPrijs = (nuPrijs * 0.60);
		}
		return nuPrijs;
	}

	public boolean equals(Object obj) {
		boolean gelijkeObjecten = false;
		if (obj instanceof Computer && type.equals(((Computer) obj).type) 
				&& macAdres.equals(((Computer) obj).macAdres)
				&& aanschafPrijs == (((Computer) obj).aanschafPrijs) 
				&& productieJaar == ((Computer) obj).productieJaar) {
			gelijkeObjecten = true;
		}
		return gelijkeObjecten;
	}

	public String toString() {
		return "Computer " + type + " met productiejaar " + productieJaar + " heeft als mac adres " + macAdres
				+ " en heeft een waarde van: " + String.format("%.2f", huidigeWaarde());
	}
}
