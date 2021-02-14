package practicum4A;

public class Huis {
	private String adres;
	private int bouwjaar;
	private Persoon huisbaas;

	public Huis(String ad, int yr) {
		this.adres = ad;
		this.bouwjaar = yr;
	}
	
	public void setHuisbaas(Persoon p1) {this.huisbaas = p1;}
	public Persoon getHuisbaas() {return this.huisbaas;}

	@Override
	public String toString() {
		return "Huis " + adres + " is gebouwd in " + bouwjaar + "\n" + huisbaas.toString();
	}
}
