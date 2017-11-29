package pl.lewart.tutorial.design_patterns.patterns.creational.abstract_factory.gui;

import pl.lewart.tutorial.design_patterns.patterns.creational.abstract_factory.gui.auxiliary.Button;
import pl.lewart.tutorial.design_patterns.patterns.creational.abstract_factory.gui.auxiliary.Frame;

public class Client {
	
	private AbstractFactory factory;
	//private AbstractFactory factory = new WindowsFactory();
	
	
	public void runExample() {
		
		
		Button b = factory.getButton();
		
		Frame f = factory.getFrame();
		
	}
	

}
