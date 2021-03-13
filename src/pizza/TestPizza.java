package pizza;

public class TestPizza {

	public static void main(String[] args) {
		
		Pizza thickPizza = new DeepDish("Deep Dish Pizza");
		System.out.println("The price of "+ thickPizza.getDescription() +
				" is "+ thickPizza.price());
		
		thickPizza = new PepperoniDecorator(thickPizza);
		System.out.println("The price of "+ thickPizza.getDescription() +
				" is "+ thickPizza.price());
		
		Pizza thinPizza = new ThinCrust("Thin Crust Pizza");
		System.out.println("The price of "+ thinPizza.getDescription() +
				" is "+ thinPizza.price());
		
		
		// The following pizza shows how the Decorator Pattern kind of uses the idea of recursion.
		
		Pizza thinPineapplePepperoniPizza = new PineappleDecorator(new PepperoniDecorator(new ThinCrust("Thin Crust Pizza")));
		System.out.println("The price of "+ thinPineapplePepperoniPizza.getDescription() +
				" is "+ thinPineapplePepperoniPizza.price());
		
	}

}
