package pizza;

public class ThinCrust extends Pizza {
	
	protected ThinCrust(String d) {
		description = d;
	}

	protected double price() {
		return 10.0;         // A thin crust pizza starts at $10
	}	

}
