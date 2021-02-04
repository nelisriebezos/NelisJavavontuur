package les2classes.demoproduct;

public class Product {
    private String naam;
    private String code;
    private double prijs;
    private double btw;

    public Product(String naam, String code, double prijs) {
        this.naam = naam;
        this.code = code;
        this.prijs = prijs;
        this.btw = 21.0;
    }

    public Product(String naam, String code) {
        this.naam = naam;
        this.code = code;
        this.prijs = 0;
        this.btw = 21.0;
    }

    public void setBTW(double percentage) {
        this.btw = percentage;
    }

    public double getBTW() {
        return btw;
    }

    public void setPrijs(double nieuwePrijs) {
        this.prijs = nieuwePrijs;
    }

    public double getPrijs() {
        return prijs;
    }

    public double btwBedrag() {
        return prijs / 100 * btw;
    }

    public void verhoogPrijsMet(double percentage) {
        double verhoging = (this.prijs / 100) * percentage;
        this.prijs += verhoging;
    }

    public String toString() {
        return naam + " heeft code " + code + " en kost " + prijs + "; de btw is " + btw + "%";
    }
}