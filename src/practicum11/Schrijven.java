package practicum11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Schrijven {
	public static void main(String[] args) throws IOException {

		System.out.print("Bronbestand: ");

		Scanner keyboardScanner = new Scanner(System.in);
		keyboardScanner.useLocale(Locale.ENGLISH);
		String bestandsnaam = keyboardScanner.nextLine();
		if (!bestandsnaam.equals("omzetter")) {
			// String out = "";
			// out += "Dit is niet de directory van het bestand en/of het bestand wat je
			// zoekt bestaat niet";
			// System.out.println(out);
			throw new IOException("Het systeem kan het opgegeven bestand niet vinden.");
		}
		System.out.print("Bestemmingsbestand: ");
		String bestemmingsbestand = keyboardScanner.nextLine();
		if (!bestemmingsbestand.equals("omgezet")) {
			// String out = "";
			// out += "Dit is niet de directory van het bestand en/of het bestand wat je
			// zoekt bestaat niet";
			// System.out.println(out);
			throw new IOException("Het systeem kan het opgegeven bestand niet vinden.");
		}
		try {
			System.out.print("Us dollar in Euro: ");
			double dollarineuro = keyboardScanner.nextDouble();

			System.out.println("Bron: " + bestandsnaam);
			System.out.println("Bestemmingsbestand: " + bestemmingsbestand);
			System.out.println("Us dollar in Euro: " + dollarineuro);

			Scanner scanner = new Scanner(new File(bestandsnaam));

			Path path = Path.of(bestandsnaam);
			List<String> alleRegels = Files.readAllLines(path);
			String alleTekst = Files.readString(path);
			Path path2 = Path.of(bestemmingsbestand);
			BufferedWriter out = Files.newBufferedWriter(path2);

			for (String regel : alleRegels) {
				while (scanner.hasNextLine()) {
					String[] tokens = scanner.nextLine().split(" : ");
					String last = (tokens[tokens.length - 1]);
					double conv = Double.parseDouble(last);
					conv = conv * dollarineuro;

					System.out.println(regel.substring(0, regel.indexOf(')')) + ") : " + conv);
					if (!alleRegels.contains((regel.substring(0, regel.indexOf(')')) + ") : "))) {
						out.append((regel.substring(0, regel.indexOf(')')) + ") : ") + conv);
					} else {
					}

					out.newLine();

				}
				// out.flush();
				out.close();

			}
		} catch (InputMismatchException e) {
			System.out.println("Je mag hier alleen getallen invoeren");
		}

	}
}
