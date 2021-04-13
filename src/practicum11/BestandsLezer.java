package practicum11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayNameGenerator.Standard;

public class BestandsLezer {
	private String bronBestand;
	private String bestemmingsBestand;
	private double eurocenten;
	List<String> artikelenLijst = new ArrayList<>();

	public BestandsLezer() {
	}

	public void prijsOmzetter() {
		System.out.print("Hoeveel eurocenten is 1 US dollar?: ");
		Scanner inputLezer = new Scanner(System.in);
		if (inputLezer.hasNextDouble()) {
			eurocenten = inputLezer.nextDouble();

			for (String a : artikelenLijst) {
				String[] parts = a.split(" : ");
				String artikel = parts[0];
				String prijs = parts[1];

				artikelenLijst.set(artikelenLijst.indexOf(a), artikel + " : " + String.format(new Locale("nl", "NL"),
						"%.2f", Double.parseDouble(prijs) * (eurocenten / 100)));
			}
		} else {
			throw new IllegalArgumentException("Verkeerde invoer; voer een getal in");
		}
	}

	public void schrijver() throws IOException {
		if (bronBestand == null) {
			System.out.println("Er is geen bestand gegeven om van te kopiëren");
		} else {
			System.out.print("Wat is het bestemmingsbestand?: ");
			Scanner inputLezer = new Scanner(System.in);
			bestemmingsBestand = inputLezer.next() + ".txt";

			try {
				Path path = Path.of(bestemmingsBestand);
				BufferedWriter br = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

				for (String artikel : artikelenLijst) {
					br.write(artikel + "\n");
				}
				br.close();
			} catch (IOException e) {
				System.out.println("Het bestand is niet gevonden");
			}
		}
	}

	public void lezer() throws IOException {
		System.out.print("Wat is het bronbestand?: ");
		Scanner inputLezer = new Scanner(System.in);
		bronBestand = inputLezer.next() + ".txt";

		if (!bronBestand.equals("artikelenLijstUSDollars.txt")) {
			bronBestand = null;
			throw new IOException("Het bestand kan niet gevonden worden");
		}
		Path path = Path.of(bronBestand);
		BufferedReader br = Files.newBufferedReader(path);
		String artikelEnPrijs = br.readLine();

		while (artikelEnPrijs != null) {
			artikelenLijst.add(artikelEnPrijs);
			artikelEnPrijs = br.readLine();
		}
		br.close();
	}
}
