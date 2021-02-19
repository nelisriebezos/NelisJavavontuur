package practicum4B;

public class Klant {
	private String naam;
	private double kortingsPercentage;

	public Klant(String nm) {
		this.naam = nm;
	}
	
	public void setKorting(double kP) {this.kortingsPercentage = kP ;}
	public double getKorting() {return (100 - this.kortingsPercentage) / 100;}
	
	@Override
	public String toString() {
		return "Op naam van: Mijnheer " +naam+ " (korting: " +kortingsPercentage+ "%)";}
}