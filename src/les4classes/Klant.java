package les4classes;

public class Klant {
	private String naam;
	private String adres;
	private String plaats;

	public Klant(String nm, String adr, String pl) {
		this.naam = nm;
		this.adres = adr;
		this.plaats = pl;
	}
	
	public void setAdres(String ad) {adres = ad;}
	public void setPlaats (String pl) {plaats = pl;}

	public String getNaam() {return naam;}
	public String getAdres() {return adres;}
	public String getPlaats() {return plaats;}
	
	public String toString() {
		return naam + " woont op " + adres + " in " + plaats;
	}
	
}
