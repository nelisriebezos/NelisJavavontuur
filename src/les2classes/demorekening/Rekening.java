package les2classes.demorekening;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nr) {
        nummer = nr;
        saldo = 0;
    }

    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void stort(double bedrag) {
        this.saldo += bedrag;
    }

    public void neemOp(double bedrag) {
        this.saldo -= bedrag;
    }

    public String toString() {
        return "Rekening nummer : " + this.nummer + " heeft " + this.saldo + " op de rekening.";
    }
}
