package Document;

public class PDFFactory implements DocumentFactory{
	public Document create() {
		return new PDF();
	}
	
}