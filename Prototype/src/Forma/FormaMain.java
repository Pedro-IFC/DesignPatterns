package Forma;

public class FormaMain {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.desenhar();
        
        Circulo circuloclone = (Circulo) circulo.clone();
        circuloclone.desenhar();
        
        Quadrado quadrado = new Quadrado();
		quadrado.desenhar();
        
		Quadrado quadradoclone = (Quadrado) quadrado.clone();
        quadradoclone.desenhar();
	}

}
