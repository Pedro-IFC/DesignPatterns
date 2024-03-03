package ex2;
import java.util.ArrayList;
import java.util.List;

public class RegLog {
	private static RegLog log = null;
	private List<Log> hitorico = new ArrayList<>();
	private RegLog() {
		
	}
	public static RegLog getInstance() {
		if(log == null)
			log = new RegLog();
		return log;
	}
	
	public List<Log> getHitorico() {
		return hitorico;
	}
	
	public void addHistorico(Log log) {
		getHitorico().add(log);
	}
	
	public void setHitorico(List<Log> hitorico) {
		this.hitorico = hitorico;
	}
}
