package ex2;

public class LogTeste {
	public static void main(String[] args) {
		Log log = new Log("Não encontrado", "404");
		Log log2 = new Log("Sucesso", "200");
		
		RegLog reg1 = RegLog.getInstance();
		reg1.addHistorico(log);
		System.out.println(reg1.getHitorico());
		
		reg1.addHistorico(log2);
		System.out.println(reg1.getHitorico());
		
		RegLog reg2 = RegLog.getInstance();
		System.out.println(reg2.getHitorico());
		
	}
}
