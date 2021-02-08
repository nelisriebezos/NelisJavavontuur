package practicum2;

public class Zwembad {
	private double breedte;
	private double lengte;
	private double diepte;
	private double inhoud;

	public Zwembad(double br, double le, double di) {
		breedte = br;
		lengte = le;
		diepte = di;
	}

	public Zwembad() {
	}

	public double getBreedte() {
		return breedte;
	}

	public void setBreedte(double breedte) {
		this.breedte = breedte;
	}

	public double getLengte() {
		return lengte;
	}

	public void setLengte(double lengte) {
		this.lengte = lengte;
	}

	public double getDiepte() {
		return diepte;
	}

	public void setDiepte(double diepte) {
		this.diepte = diepte;
	}

	public double inhoud() {
		return inhoud = breedte * lengte * diepte;
	}

	@Override
	public String toString() {
		return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
	}

}
