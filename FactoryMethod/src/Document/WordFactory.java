package Document;

public class WordFactory implements DocumentFactory{
	public Document create() {
		return new Word();
	}
}
