package practicum8;

public class practicum8Main {
public static void main(String[] args) {
	BedrijfsInventaris b1 = new BedrijfsInventaris("Flip's tandenstoker zaak", 300000.0);
	Computer c1 = new Computer("MacBook", "132412", 1500.0, 2015);
	Computer c2 = new Computer("MacBook", "132412", 1500.0, 2015);
	Fiets f1 = new Fiets("safari", 150.40, 2013, 300);
	Fiets f2 = new Fiets("safari", 150.40, 2013, 300);
	Auto a1 = new Auto("Volvo", 3400.0, 2015, "19-GR-FX");
	Auto a2 = new Auto("Volvo", 3400.0, 2015, "19-GR-FX");
	
	Computer c3 = new Computer("Corsair", "132333", 1700.0, 2010);
	Fiets f3 = new Fiets("WheelGo", 188.30, 2010, 400);
	Auto a3 = new Auto("Volkswagen", 7400.0, 2007, "28-ZF-TX");
	
	b1.schafAan(c1);
	b1.schafAan(c2);
	b1.schafAan(f1);
	b1.schafAan(f2);
	b1.schafAan(a1);
	b1.schafAan(a2);
	b1.schafAan(c3);
	b1.schafAan(f3);
	b1.schafAan(a3);
	
	System.out.println(b1);
}
}
