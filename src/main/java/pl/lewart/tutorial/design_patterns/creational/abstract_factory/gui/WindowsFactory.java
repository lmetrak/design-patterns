package pl.lewart.tutorial.design_patterns.creational.abstract_factory.gui;

import pl.lewart.tutorial.design_patterns.creational.abstract_factory.gui.auxiliary.Button;
import pl.lewart.tutorial.design_patterns.creational.abstract_factory.gui.auxiliary.Frame;
import pl.lewart.tutorial.design_patterns.creational.abstract_factory.gui.auxiliary.WindowsButton;
import pl.lewart.tutorial.design_patterns.creational.abstract_factory.gui.auxiliary.WindowsFrame;

public class WindowsFactory implements AbstractFactory {

	@Override
	public Button getButton() {
		return new WindowsButton();
	}

	@Override
	public Frame getFrame() {
		return new WindowsFrame();
	}

}
