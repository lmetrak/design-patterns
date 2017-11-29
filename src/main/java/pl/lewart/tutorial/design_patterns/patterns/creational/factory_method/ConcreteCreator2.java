package pl.lewart.tutorial.design_patterns.patterns.creational.factory_method;

public class ConcreteCreator2  implements Creator {

	
	public Product factoryMethod() {
		
		return new ConcreteProduct2();
	}
}
