package pl.tutorial.lewart.design_patterns.patterns.structural.adapter.object;

public class Adapter implements Target {

	private Adaptee adaptee;

	
	public Adapter(Adaptee adaptee) {
		
		this.adaptee = adaptee;
		
	}
	
	
	@Override
	public void request() {

		adaptee.specificRequest();

	}

}
