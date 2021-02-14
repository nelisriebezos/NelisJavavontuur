package practicum4B;

public class AutoHuur {
	private int aantalDagen;
	private Auto gehuurdeAuto;
	private Klant klant;
	private String autoHuurInfo1 = "";
	private String autoHuurInfo2 = "";
	
	public AutoHuur() {
	}
	
	public void setAantalDagen(int aD) {this.aantalDagen = aD;}
	public int getAantalDagen() {return this.aantalDagen;}
	
	public void setGehuurdeAuto(Auto gA) {this.gehuurdeAuto = gA;}
	public Auto getGehuurdeAuto() {return this.gehuurdeAuto;}
	
	public void setHuurder(Klant k) {this.klant = k;}
	public Klant getHuurder() {return this.klant;}
	
	public double totaalPrijs() {
		if (gehuurdeAuto == null || klant == null) {return 0.0;}
		else {
		return (aantalDagen * gehuurdeAuto.getPrijsPerDag()) * klant.getKorting();
		}
	}

	@Override
	public String toString() {
		
		if (gehuurdeAuto == null) {
			autoHuurInfo1 = "er is geen auto bekend \n"; }
		else { autoHuurInfo1 = gehuurdeAuto.toString()+"\n";}
		
		if (klant == null) {
			autoHuurInfo2 = "er is geen huurder bekend \n"; }
		else {autoHuurInfo2 = klant.toString()+"\n";}

		return autoHuurInfo1+ autoHuurInfo2+ "aantal dagen: " +aantalDagen+ " en dat kost " +totaalPrijs();
		}
		}

