package Forma;

public class Quadrado implements Forma {

    public Forma clone() {
        return new Quadrado();
    }
	@Override
	public void desenhar() {
		System.out.println("Desenho de quadrado");
	}
}
