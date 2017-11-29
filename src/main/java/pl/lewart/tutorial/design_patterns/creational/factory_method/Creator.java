package pl.lewart.tutorial.design_patterns.creational.factory_method;

public interface Creator {

	
	/*
	 * metoda wytwórcza kapsułkuje informacje o tym którą podklasę klasy Produkt należy utworzyć
	 */
	public Product factoryMethod();
}
