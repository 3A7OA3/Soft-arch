package creational;

public class JSON implements formatterFactoryInterface {
	public BookMetadataFormatter createBook() {
		BookMetadataFormatter formatter = null;
		formatter = new JSONBookMetadataFormatter();
        return formatter;
	};
}
