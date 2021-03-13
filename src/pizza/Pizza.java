package pizza;

public abstract class Pizza {
	
	protected String description;   // protected is a little safer than public
	 								// these classes are all in the same package so it's okay to use.
	
	protected String getDescription() {
		return description;
	}
	
	protected abstract double price();
	
}
