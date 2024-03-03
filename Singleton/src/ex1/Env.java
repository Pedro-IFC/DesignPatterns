package ex1;

public class Env {
	private static Env environment = null;
	private final String dbHost = "localhost";
	private final String dbUser = "admin";
	private final String dbPass = "admin";
	private boolean debug = true; 
	private final String apiUrl = "localhost:8080";
	
	private Env() {
	}
	public static Env getInstance(){
		if(environment == null) {
			environment = new Env();
		}
		return environment;
	}

	public String getDbHost() {
		return dbHost;
	}

	public String getDbUser() {
		return dbUser;
	}

	public String getDbPass() {
		return dbPass;
	}

	public boolean isDebug() {
		return debug;
	}

	public String getApiUrl() {
		return apiUrl;
	}
	public void setDebug(boolean debug) {
		this.debug = debug;
	}
	
}
