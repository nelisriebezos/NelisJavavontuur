package practicum4A;

public class Persoon {
	private String name;
	private int leeftijd;

	public Persoon(String nm, int age) {
		this.name = nm;
		this.leeftijd = age;
	}

	@Override
	public String toString() {
		return "en heeft huisbaas " + name + "; " + " leeftijd " + leeftijd + " jaar";
	}
}
