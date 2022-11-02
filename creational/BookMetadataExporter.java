package creational;


import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import javax.xml.stream.XMLStreamException;


public abstract class BookMetadataExporter extends BookCollection {
	
	private final ArrayList<Book> bookList = new ArrayList<Book>();
    public abstract void export(PrintStream stream) throws IOException, XMLStreamException;

    public ArrayList<Book> getBookList(){
        return bookList;
    }

    public void add(Book book){
        bookList.add(book);
    }
}
