package pl.tutorial.lewart.design_patterns.patterns.creational.factory_method;

public class ConcreteCreator implements Creator {

	
	public Product factoryMethod() {
		
		return new ConcreteProduct();
	}
}
