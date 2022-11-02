package creational;

import java.io.IOException;
import java.io.PrintStream;

import javax.xml.stream.XMLStreamException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.*;
import java.util.ArrayList;
public class CSVBookMetadataExporter extends BookMetadataExporter {

	@Override
	public void export(PrintStream stream) throws IOException, XMLStreamException {
		   ArrayList<Book> bookList = super.getBookList();
	        CSVBookMetadataFormatter csvFormatter = new CSVBookMetadataFormatter();
	        for (Book book : bookList){
	            csvFormatter.append(book);
	        }
	        String[] text = csvFormatter.getMetadataString().split(" \n ");

	        try (CSVPrinter printer = new CSVPrinter(new FileWriter("csvOutput.csv"), CSVFormat.DEFAULT)) {
	            for (String s : text){
	                printer.printRecord(s.split(","));
	            }

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

}
