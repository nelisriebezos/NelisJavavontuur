package practicum8;

import java.util.Locale;

public class Utils {
	private static int aantalAangeroepen = 0;
	
	public static void main(String[] args) {
		System.out.println(euroBedrag(3.11314));
		System.out.println(euroBedrag(12.562346));
		System.out.println(euroBedrag(1234345.43000));
		System.out.println("Aantal keer aangeroepen: "+getAantalAangeroepen());
		
		System.out.println();
		
		System.out.println(euroBedrag(3.11314, 1));
		System.out.println(euroBedrag(5434.895243, 4));
		System.out.println(euroBedrag(19.76534, 3));
		System.out.println("Aantal keer aangeroepen: "+getAantalAangeroepen());
	}
	
	public static String euroBedrag(double bedrag) {
		aantalAangeroepen++;
		return String.format(new Locale("nl", "NL"), "%.2f", bedrag);
	}

	public static String euroBedrag(double bedrag, int precisie) {
		String formatDouble = "%."+precisie+"f";
		aantalAangeroepen++;
		return String.format(new Locale("nl", "NL"), formatDouble, bedrag);
	}
	
	public static int getAantalAangeroepen() {
		return aantalAangeroepen;
	}
}
