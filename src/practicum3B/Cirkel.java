package practicum3B;

public class Cirkel {
	private int radius;
	private int xPositie;
	private int yPositie;

	public Cirkel(int rad, int x, int y)  {		
		if (rad <= 0) {
			throw new IllegalArgumentException("Radius moet groter zijn dan 0.");
		}
		radius = rad;
		xPositie = x;
		yPositie = y;
	}

	@Override
	public String toString() {
		return "Cirkel (" +xPositie+ ", " +yPositie+ ") met radius: " +radius;
	}
}
