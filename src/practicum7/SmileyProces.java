package practicum7;

public class SmileyProces implements OpmaakProces {
	public SmileyProces() {
	}

	@Override
	public String maakOp(String input) {
		return "(: " + input + " :)";
	}

}
