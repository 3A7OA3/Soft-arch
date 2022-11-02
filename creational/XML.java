package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XML implements formatterFactoryInterface {
	public BookMetadataFormatter createBook() {
		BookMetadataFormatter formatter = null;
		try {
			formatter = new XMLBookMetadataFormatter();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return formatter;
	};
}
