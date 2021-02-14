package les4classes;

public class Main {
	public static void main(String[] args) {
		Rekening r1 = new Rekening(1874382);
		Rekening r2 = new Rekening(5438668);
		r1.stort(1000);
		r2.stort(1503.05);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		
		Klant k1 = new Klant("Wim", "Wijenoord 1", "Utrecht");
		Klant k2 = new Klant("Niels", "Beeklaan 20", "Heveadorp");
		
		r1.setRekeninghouder(k1);
		r2.setRekeninghouder(k2);
		
		System.out.println(r1);
		System.out.println(r1.getRekeninghouder());
		System.out.println();
		System.out.println(r2);
		System.out.println(r2.getRekeninghouder());
	}
}
