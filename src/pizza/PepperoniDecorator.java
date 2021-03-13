package pizza;

public class PepperoniDecorator extends DecoratedPizza { 
	
	Pizza currentPizza;   //This  PepperoniDecorator is a Pizza     
	
	public PepperoniDecorator(Pizza p) {
		this.currentPizza = p;
	}
	
	public String getDescription() {
		return currentPizza.getDescription() + " with pepperoni ($2),";
	}

	@Override
	public double price() {
		// add $2 for the item
		return this.currentPizza.price() + 2;
	}
	
}
