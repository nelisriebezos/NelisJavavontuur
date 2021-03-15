package Les11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class opdracht11punt1 {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("invoer.txt");
		BufferedWriter out = Files.newBufferedWriter(path);

		out.write("" + 2.3);
		out.newLine();
		out.write("" + 3.2);
		out.newLine();
		out.write("" + 4.1);
		out.close();

		BufferedReader in = Files.newBufferedReader(path);
		String line = in.readLine();

		double totaal = 0;
		int aantalRegels = 0;

		while (line != null) {
			totaal += Double.parseDouble(line);
			aantalRegels += 1;
			line = in.readLine();
			if (line != null) {
				System.out.println(line);
			}
		}
		System.out.println("totaal: " + totaal);
		System.out.println(aantalRegels);
		System.out.println("gemiddelde: " +totaal/aantalRegels);
		in.close();
	}
}
