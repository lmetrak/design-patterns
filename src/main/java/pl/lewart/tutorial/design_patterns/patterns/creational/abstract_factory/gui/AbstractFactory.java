package pl.lewart.tutorial.design_patterns.patterns.creational.abstract_factory.gui;

import pl.lewart.tutorial.design_patterns.patterns.creational.abstract_factory.gui.auxiliary.Button;
import pl.lewart.tutorial.design_patterns.patterns.creational.abstract_factory.gui.auxiliary.Frame;

public interface AbstractFactory {

	public Button getButton();

	public Frame getFrame();

}
