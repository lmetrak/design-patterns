package pl.lewart.tutorial.design_patterns.creational.prototype;

import java.util.Map;

public class Client {

	private Prototype cloneable = new ConcretePrototype1();
	//this field/list can be dynamically changed
	private Prototype cloneable2 = new ConcretePrototype2();
	private Prototype cloneable1 = new ConcretePrototype1();
	
	private Map<String, Prototype> menedzerPrototypow;
	
	public Prototype operation() throws CloneNotSupportedException {
		
		return (Prototype) cloneable.clone();
		
	}
	
	public Prototype operation(int i) throws CloneNotSupportedException {
		
		if (i == 0) {
			return (Prototype) cloneable1.clone();
		} else if (i == 1) {
			return (Prototype) cloneable2.clone();
		} else {
			return null;
		}
		
	}

	public Map<String, Prototype> getMenedzerPrototypow() {
		return menedzerPrototypow;
	}

	public void setMenedzerPrototypow(Map<String, Prototype> menedzerPrototypow) {
		this.menedzerPrototypow = menedzerPrototypow;
	}
	
}
