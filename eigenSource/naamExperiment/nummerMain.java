package naamExperiment;
import java.util.concurrent.ThreadLocalRandom;

public class nummerMain {
	public static void main(String[] args) {
		int randomNum1 = ThreadLocalRandom.current().nextInt(1, 50);
		int randomNum2 = ThreadLocalRandom.current().nextInt(1, 50);
		
		nummer n1 = new nummer(randomNum1, "Nummer 1");
		nummer n2 = new nummer(randomNum2, "Nummer 2");
		checker c1 = new checker("Checker 1");
		checker c2 = new checker("Checker 2");
		rekenSom r1 = new rekenSom();
		
		c1.setNummer(n1);
		c2.setNummer(n2);
		
		System.out.println(n1);
		System.out.println(n2+ "\n");
		
		System.out.println("Checker 1 geeft jou: " +c1.onderTienBovenDertig());
		System.out.println("Checker 2 geeft jou: " +c2.onderTienBovenDertig());
	}
}
