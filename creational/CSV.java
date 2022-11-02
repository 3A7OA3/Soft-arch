package creational;

import java.io.IOException;

public class CSV implements formatterFactoryInterface {
	
	public BookMetadataFormatter createBook() {
		BookMetadataFormatter formatter = null;
		try {
			formatter = new CSVBookMetadataFormatter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return formatter;
	};

}
