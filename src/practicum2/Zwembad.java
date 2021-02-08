package src.practicum2;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    private double inhoud;

    public Zwembad(double br, double le, double di) {
        breedte = br;
        lengte = le;
        diepte = di;
        berekenInhoud();
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

    public void berekenInhoud(){
    	inhoud = this.breedte * this.diepte * this.lengte;
    }
}
