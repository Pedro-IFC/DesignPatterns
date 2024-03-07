package Forma;

public class Circulo implements Forma{

    public Forma clone() {
        return new Circulo();
    }
	@Override
	public void desenhar() {
		System.out.println("Desenho de circulo");
	}

}
