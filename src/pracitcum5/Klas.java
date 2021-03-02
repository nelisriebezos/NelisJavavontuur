package pracitcum5;

import java.util.ArrayList;

public class Klas {
	private String klasCode;
	ArrayList<Leerling> leerlingLijst = new ArrayList<Leerling>();

	public Klas(String kC) {
		klasCode = kC;
	}
	
	public ArrayList<Leerling> getLeerlingen() {return leerlingLijst;}
	
	public void voegLeerlingToe(Leerling l) {
		leerlingLijst.add(l);
	}
	
	public void wijzigCijfer(String nm, double nweCijfer) {
		for (Leerling l : leerlingLijst) {
			if (l.getNaam().equals(nm)) {
				l.setCijfer(nweCijfer);
		}
	}
}

	public int aantalLeerlingen() {
		return leerlingLijst.size();
	}
	
	public String toString() {
		String returnZin = "In klas " + klasCode +"  zitten de volgende leerlingen: \n";
		for (Leerling l : leerlingLijst) {
			returnZin += l + "\n";
		}
		return returnZin;
	}
}
