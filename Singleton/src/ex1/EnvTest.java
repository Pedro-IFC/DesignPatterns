package ex1;

public class EnvTest {
	public static void main(String[] args) {
		Env environment = Env.getInstance();
		environment.setDebug(true);
		System.out.println(environment.getInstance().isDebug());
		Env environment2 = Env.getInstance();
		environment2.setDebug(false);
		System.out.println(environment.getInstance().isDebug());
	}
}
