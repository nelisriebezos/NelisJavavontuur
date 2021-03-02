package naamExperiment;
public class checker {
	private String naam;
	private nummer nummer;

	public checker(String nm) {
		naam = nm;
	}

	public String getNaam() {return naam;}
	public void setNaam(String naam) {this.naam = naam;}
//	public void setNummer(naamExperiment.nummer n1) {this.nummer = n1;}
	
	public String onderTienBovenDertig() {
		if (nummer.getNummer() < 10) {
			return  "If the universe is so big, then why won't it fight me?";
		}
		if (nummer.getNummer() > 30) {
			return "CAPT'N... LOOOK";
		} else {
			return ":)";
		}
	}
}
