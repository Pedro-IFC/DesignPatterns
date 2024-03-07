package Document;

public interface DocumentFactory {
	public Document create(); 
	
    public default void processDocument() {
        Document document = create();
        document.process();
    }

}
