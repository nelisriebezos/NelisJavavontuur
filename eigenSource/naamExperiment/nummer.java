package naamExperiment;

public class nummer {
	private int nummer;
	private String naam;

	public nummer(int rnm, String nm) {
		this.nummer = rnm;
		this.naam = nm;
	}

	public void setNummer(int nm) {this.nummer = nm;}
	public int getNummer() {return nummer;}
	public String getNaam() {return naam;}
	public void setNaam(String nm) {this.naam = nm;}
	
	@Override
	public String toString() {
		return naam+ " is:  " + nummer + "!";
	}

	
}
