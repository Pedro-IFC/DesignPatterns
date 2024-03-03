package ex2;

public class Log {
	private String desc;
	private String type;
	public String getdesc() {
		return desc;
	}
	public void setdesc(String desc) {
		this.desc = desc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Log(String desc, String type) {
		super();
		this.desc = desc;
		this.type = type;
	}
	
}
