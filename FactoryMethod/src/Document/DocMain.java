package Document;

public class DocMain {
    public static void main(String[] args) {
        DocumentFactory pdfProcessor = new PDFFactory();
        pdfProcessor.processDocument(); // Processando documento PDF

        DocumentFactory wordProcessor = new WordFactory();
        wordProcessor.processDocument(); // Processando documento do Word
    }
}
