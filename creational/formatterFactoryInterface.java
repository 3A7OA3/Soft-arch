package creational;

import java.io.IOException;
import java.text.Format;

import javax.xml.parsers.ParserConfigurationException;


public interface formatterFactoryInterface {
	
	public static BookMetadataFormatter getBookMetadataFormatter(Format format)
            throws IOException, ParserConfigurationException {
       
		return null;
        }

	public BookMetadataFormatter createBook();
	
}
