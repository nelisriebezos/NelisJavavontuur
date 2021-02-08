package practicum2B;

public class Voetbalclub {
	private String clubnaam;
	private int aantalGewonnen;
	private int aantalGelijk;
	private int aantalVerloren;

	public Voetbalclub(String nm) {
		clubnaam = nm;
	}

	public int getAantalGewonnen() {
		return aantalGewonnen;
	}

	public void setAantalGewonnen(int aantalGewonnen) {
		this.aantalGewonnen = aantalGewonnen;
	}

	public int getAantalGelijk() {
		return aantalGelijk;
	}

	public void setAantalGelijk(int aantalGelijk) {
		this.aantalGelijk = aantalGelijk;
	}

	public int getAantalVerloren() {
		return aantalVerloren;
	}

	public void setAantalVerloren(int aantalVerloren) {
		this.aantalVerloren = aantalVerloren;
	}

	  public void verwerkResultaat(char ch) {
		    if (ch == 'w')
		      aantalGewonnen = aantalGewonnen + 1;
		    if (ch == 'g')
		      aantalGelijk = aantalGelijk + 1;
		    if (ch == 'v')
		      aantalVerloren = aantalVerloren + 1;
		  }
	  
	  public int aantalGespeeld() {
		  return  aantalGelijk + aantalVerloren + aantalGewonnen;
	  }
	  
	  public int aantalPunten() {
		  return aantalGelijk + (aantalGewonnen * 3);
	  }

	@Override
	public String toString() {
		return clubnaam + "          " + aantalGespeeld() + "-" + aantalGewonnen + "-" +  aantalGelijk + "-" + aantalVerloren + "-" + aantalPunten();
	}
	  
	  
}
