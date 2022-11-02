package creational;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;


public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, XMLStreamException {

        // Current usage
        BookMetadataFormatter formatter = null;
        formatterFactoryInterface format = new XML();
        formatter = format.createBook();
		//formatter = ((CSV) format).createBook();
		formatter.append(TestData.dragonBook);
		formatter.append(TestData.dinosaurBook);
		System.out.print(formatter.getMetadataString());
        
        
		BookMetadataExporter exporterCSV = new CSVBookMetadataExporter();
        exporterCSV.add(TestData.sailboatBook);
        exporterCSV.add(TestData.GoFBook);
        exporterCSV.export(System.out);
		
		
		 BookMetadataExporter exporterXML = new XMLBookMetadataExporter();
	     exporterXML.add(TestData.sailboatBook);
	     exporterXML.add(TestData.GoFBook);
	     exporterXML.export(System.out);
	     
	     BookMetadataExporter exporter = new JSONBookMetadataExporter();
	     exporter.add(TestData.sailboatBook);
	     exporter.add(TestData.GoFBook);
	     exporter.export(System.out);
    }
}
