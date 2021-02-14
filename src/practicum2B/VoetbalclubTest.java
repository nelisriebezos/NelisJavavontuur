package practicum2B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VoetbalclubTest {
	private Voetbalclub t1;
	private Voetbalclub t2;

	@Test
	void voetbalclubNaamNull() {
		System.out.println("voetbalclubNaamNull");
		t1 = new Voetbalclub(null);
		System.out.println(t1);
	}

	@Test
	void verwerkResultaat() {
		System.out.println("verwerkResultaat");
		t2 = new Voetbalclub("ajax");
		
		t2.verwerkResultaat('w');
		t2.verwerkResultaat('g');
		t2.verwerkResultaat('v');
		
		System.out.println("w = 3");
		System.out.println("g = 1");
		System.out.println("v = 0");
	}
}
