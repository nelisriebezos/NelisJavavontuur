package practicum11;

import java.io.IOException;

public class Main11 {
	public static void main(String[] args) throws Exception {
		
		BestandsLezer b1 = new BestandsLezer();
		
		try {
		b1.lezer();
		System.out.println();
		} catch (Exception e) {
			System.out.println(e  + "\n");
		}
		
		try {
			b1.prijsOmzetter();
			System.out.println();
		} catch (Exception e) {
			System.out.println(e + "\n");
		}
		
		try {
			b1.schrijver();
			System.out.println();
		} catch (Exception e) {
			System.out.println(e + "\n");
		}
	}
}