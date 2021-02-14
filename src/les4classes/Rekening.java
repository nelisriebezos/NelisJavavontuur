package les4classes;

public class Rekening {
	private int nummer;
	private double saldo = 0.0;
	private Klant rekeninghouder;

	public Rekening(int num) {
		this.nummer = num;
	}
	
	public void setRekeninghouder(Klant k) {
		this.rekeninghouder = k;}
	
	public Klant getRekeninghouder() {
		return this.rekeninghouder;}
	
	public double getSaldo() {return saldo; }
	public double getNummer() {return nummer; }
	public void stort(double bedrag) {saldo += bedrag;}
	public void neemOp(double bedrag) {saldo -= bedrag;}
	
	public String toString() {
		String out = "Op rekening " + nummer + " staat " + saldo;
		if (rekeninghouder == null) {
			out = out +  " en de rekeninghouder is onbekend";
		}
		else {
			out = out + ";\nen de rekeninghouder is: " + rekeninghouder.toString();
		}
		return out;
	}
}
