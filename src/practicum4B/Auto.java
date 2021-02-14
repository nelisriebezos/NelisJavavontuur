package practicum4B;

public class Auto {
	private String type;
	private double prijsPerDag;
	
		public Auto(String tp, int prPd) {
		this.type = tp;
		this.prijsPerDag = prPd;
	}
		public void setPrijsPerDag(double prPd) {this.prijsPerDag = prPd;}
		public double getPrijsPerDag() {return this.prijsPerDag;}
		
		@Override
		public String toString() {return "autotype: " +type+ " met prijs per dag: " +prijsPerDag;}
}
