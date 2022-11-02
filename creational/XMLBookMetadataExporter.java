package creational;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.util.ArrayList;

public class XMLBookMetadataExporter extends BookMetadataExporter {

	@Override
    public void export(PrintStream stream) throws IOException, XMLStreamException {
        ArrayList<Book> bookList = super.getBookList();
        XMLBookMetadataFormatter xmlFormatter = null;
		try {
			xmlFormatter = new XMLBookMetadataFormatter();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for (Book book : bookList){
            xmlFormatter.append(book);
        }
        String filePath = "xmlOutput.xml";
        Writer fileWriter = new FileWriter(filePath);
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(fileWriter);
        xmlStreamWriter.writeCData(xmlFormatter.getMetadataString());
        xmlStreamWriter.flush();
        xmlStreamWriter.close();
    }
}
