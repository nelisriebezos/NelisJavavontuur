package practicum3A;

import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import practicum2B.Voetbalclub;

class VoetbalclubTest {
	private Voetbalclub t1;
	int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
	private int resultaatTeller = 0;

	@BeforeEach
	void innit() {
		t1 = new Voetbalclub("testClub");
	}
	
	@Test
	void voetbalclubNaamNull() {
		t1 = new Voetbalclub(null);
		
		assertFalse(t1.getClubnaam() == null || t1.getClubnaam() == "", "Naam is leeg, pas automatisch aan naar FC");
	}
	
	@Test
	void foutiveInput() {
		t1.verwerkResultaat(' ');
		t1.verwerkResultaat('l');
		t1.verwerkResultaat('g');
		
		assertTrue(t1.aantalGespeeld() == 1, "Foutive invoer beinvloed resultaat");
	}
	
	@Test
	void toStringTest() {
		t1.verwerkResultaat('g');
		t1.verwerkResultaat('w');
		
		assertEquals("testClub: 2-1-1-0-4", t1.toString(), "De resultaten worden niet goed geprint");
	}
	
	@Test
	void verwerkResultaat() {
		for (int i = 0; i < 10; i++) {
			if (randomNum == 1) {
				t1.verwerkResultaat('w');
				resultaatTeller += 3;
			}
			if (randomNum == 2) {
				t1.verwerkResultaat('g');
				resultaatTeller += 1;
			}
			if (randomNum == 3) {
				t1.verwerkResultaat('v');
			}
		}
		assertTrue(resultaatTeller == t1.aantalPunten(), "De resultaten worden niet goed bewerkt");
	}
}

	
