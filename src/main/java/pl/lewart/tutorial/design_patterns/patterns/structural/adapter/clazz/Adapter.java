package pl.lewart.tutorial.design_patterns.patterns.structural.adapter.clazz;

public class Adapter implements Adaptee, Target {

	@Override
	public void request() {
		this.specificRequest();
		
	}

	@Override
	public void specificRequest() {
		
		// (...)
		// my implementation
		
	}

}
