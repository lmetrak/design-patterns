package pl.lewart.tutorial.design_patterns.patterns.creational.builder.rtf;

import java.awt.Font;

public interface TextConverter { 
	//inheriting of this class can accrete

	//accrete - narastać
	
	public void convertCharacter(char c);
	
	public void convertFontChange(Font f);
	
	public void convertParagraph();
	
	public String build();
	
}
