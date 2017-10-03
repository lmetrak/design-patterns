package pl.tutorial.lewart.design_patterns.patterns.creational.prototype;

public abstract class Prototype {
	
	// clone methond from class Object is protected
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
