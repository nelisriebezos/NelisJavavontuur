package practicum3A;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

import practicum2B.Voetbalclub;

class VoetbalclubTest {
	private Voetbalclub t1;
	private Voetbalclub t2;
	int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
	private int resultaatTeller = 0;

	@Test
	void voetbalclubNaamNull() {
		System.out.println("voetbalclubNaamNull");
		t1 = new Voetbalclub(null);
		if (t1.getClubnaam() == null || t1.getClubnaam() == "") {
			System.out.println("Naam is: null of leeg (Maak automatisch FC van!) \n");
		} else {System.out.println("De naam word automatisch aangepast! \n");
		}
	}
	
	@Test
	void verwerkPuntResultaat() {
		System.out.println("verwerkResultaat");
		t2 = new Voetbalclub("ajax");
		
		for (int i = 0; i < 10; i++) {
			if (randomNum == 1) {
				t2.verwerkResultaat('w');
				resultaatTeller += 3;
			}
			if (randomNum == 2) {
				t2.verwerkResultaat('g');
				resultaatTeller += 1;
			}
			if (randomNum == 3) {
				t2.verwerkResultaat('v');
			}
		}
		if (resultaatTeller != t2.aantalPunten()) {
			System.out.println("aantalPunten geeft: " +t2.aantalPunten()+ "    (Moet zijn: " +resultaatTeller+ ") \n");
		} else {
			System.out.println("resultaten worden goed verwerkt!");
		}
	}
}

	
