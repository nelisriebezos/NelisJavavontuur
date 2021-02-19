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
		kt.setKorting(0.0);
		aht.setAantalDagen(4);
	}

	@Test
	void welKortingTest() {
		kt.setKorting(10.0);
		aht.setHuurder(kt);
		aht.setGehuurdeAuto(at);
		int prijs = (int) ((4 * 50) * 0.9);
		
		assertEquals(prijs, aht.totaalPrijs(), "De totaalprijs klopt niet");
	}

	@Test
	void geenKortingTest() {
		aht.setHuurder(kt);
		aht.setGehuurdeAuto(at);
		int prijs = (int) ((4 * 50) * 1);
		
		assertEquals(prijs, aht.totaalPrijs(), "De totaalprijs klopt niet");
	}

	@Test
	void welHuurderWelAuto() {
		aht.setHuurder(kt);
		aht.setGehuurdeAuto(at);
		
		assertEquals("""
				autotype: testtype met prijs per dag: 50.0
				Op naam van: Mijnheer testklant (korting: 0.0%)
				aantal dagen: 4 en dat kost 200.0""", aht.toString(), "Error");
	}
	
	@Test
	void welHuurderGeenAuto() {
		aht.setHuurder(kt);
		aht.setAantalDagen(0);
		
		assertEquals("""
				er is geen auto bekend \nOp naam van: Mijnheer testklant (korting: 0.0%)
				aantal dagen: 0 en dat kost 0.0""", aht.toString(), "Errort");
	}
	
	@Test
	void geenHuurderWelAuto() {
		aht.setGehuurdeAuto(at);
		aht.setAantalDagen(0);
		
		assertEquals("""
				autotype: testtype met prijs per dag: 50.0
				er is geen huurder bekend \naantal dagen: 0 en dat kost 0.0""", aht.toString(), "Error");
	}
	
	@Test
	void geenHuurderGeenAuto() {
		aht.setAantalDagen(0);
		
		assertEquals("""
				er is geen auto bekend \ner is geen huurder bekend \naantal dagen: 0 en dat kost 0.0""", aht.toString(), "Error");
	}
}
