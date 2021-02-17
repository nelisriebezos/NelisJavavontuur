package practicum3A;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import practicum2B.Voetbalclub;

class VoetbalclubTest {
	private Voetbalclub t1;
	private Voetbalclub t2;
	private Voetbalclub t3;
	private Voetbalclub t4;
	int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
	private int resultaatTeller = 0;

	@Test
	void voetbalclubNaamNull() {
		System.out.println("voetbalclubNaamNull:");
		t1 = new Voetbalclub(null);
		if (t1.getClubnaam() == null || t1.getClubnaam() == "") {
			System.out.println("Naam is: null of leeg (Maak automatisch FC van!)");
		} else {System.out.println("De naam word automatisch aangepast!");
		}
		System.out.println();
	}
	
	@Test
	void foutiveInput() {
		System.out.println("foutiveInput:");
		t2 = new Voetbalclub("Testclub");
	
		t2.verwerkResultaat(' ');
		t2.verwerkResultaat('l');
		t2.verwerkResultaat('g');
		
		if (t2.aantalGespeeld() > 1) {
			System.out.println("Foutive invoer beinvloed resultaat!");
		} else {
			System.out.println("Foutive invoer word opgevangen!");
		}
		System.out.println();
	}
	
	@Test
	void verwerkResultaat() {
		System.out.println("verwerkResultaat:");
		t4 = new Voetbalclub("Testclub");
		
		for (int i = 0; i < 10; i++) {
			if (randomNum == 1) {
				t4.verwerkResultaat('w');
				resultaatTeller += 3;
			}
			if (randomNum == 2) {
				t4.verwerkResultaat('g');
				resultaatTeller += 1;
			}
			if (randomNum == 3) {
				t4.verwerkResultaat('v');
			}
		}
		if (resultaatTeller != t4.aantalPunten()) {
			System.out.println("aantalPunten geeft: " +t4.aantalPunten()+ "    (Moet zijn: " +resultaatTeller+ ")");
		} else {
			System.out.println("resultaten worden goed verwerkt!");
		}
		System.out.println();
	}
}

	
