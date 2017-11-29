package pl.lewart.tutorial.design_patterns.patterns.creational.builder.rtf;

import java.awt.Font;
import java.util.Collection;

public class RTFReader {

	private TextConverter converter;

	public void parceRTF(Collection<Object> objectCollection) {

		for (Object o : objectCollection) {

			if (o instanceof char[]) {
				converter.convertCharacter((char) o); 	// build part
			} else if (o instanceof Font) {
				converter.convertFontChange((Font) o); 	// build part
			} else if (o instanceof String) {
				converter.convertParagraph(); 			// build part
			}
		}
		
		converter.build(); // or getResult()
	}
	
}
