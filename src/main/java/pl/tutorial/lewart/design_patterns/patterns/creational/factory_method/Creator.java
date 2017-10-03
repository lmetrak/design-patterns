package pl.tutorial.lewart.design_patterns.patterns.creational.factory_method;

public interface Creator {

	
	/*
	 * metoda wytwórcza kapsułkuje informacje o tym którą podklasę klasy Produkt należy utworzyć
	 */
	public Product factoryMethod();
}
