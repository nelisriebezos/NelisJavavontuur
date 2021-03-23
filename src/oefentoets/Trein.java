package oefentoets;

public class Trein {
	private String variant;


	public void wijzigVariant(String v) {
		if (v.equals("voltijd") || v.equals("deeltijd")) {
		this.variant = v;
		}
}
}
