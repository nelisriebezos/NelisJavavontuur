package practicum4B;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutoHuurTest {
	private AutoHuur aht;
	private Klant kt;
	private Auto at;

	@BeforeEach
	void innit() {
		aht = new AutoHuur();
		kt = new Klant("testklant");
		at = new Auto("testtype", 50);
	}

	@Test
	void welHwelKwelA() {
		List<String>toStringLijst = new ArrayList<String>();
		kt.setKorting(10.0);
		aht.setHuurder(kt);
		aht.setGehuurdeAuto(at);
		aht.setAantalDagen(4);
		int prijs = (int) ((4 * 50) * 0.9);

		assertThat(aht.toString(), containsString("testtype" + "50" + "testklant" + "10" + "4" + prijs));
	}
}
