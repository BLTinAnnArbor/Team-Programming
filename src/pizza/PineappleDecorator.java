package pizza;

public class PineappleDecorator extends DecoratedPizza{
	
	Pizza currentPizza;
	
	public PineappleDecorator(Pizza p) {
		this.currentPizza = p;
	}
	
	public String getDescription() {
		return currentPizza.getDescription() + " with pineapple ($1.50),";
	}

	@Override
	public double price() {
		// add $1.50 for the item
		return this.currentPizza.price() + 1.5;
	}
	
}
