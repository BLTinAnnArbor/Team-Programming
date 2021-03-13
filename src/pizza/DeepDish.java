package pizza;

public class DeepDish extends Pizza{
	
	public DeepDish(String d) {
		description = d;
	}

	@Override
	public double price() {
		return 15.0;         // A deep dish pizza starts at $15
	}

}
