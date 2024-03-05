package Calculadora;

public class CalcMain {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.print(calc.soma((float) 40).subtrair((float) 10).multiplicar((float) 2).dividir(4).getResultado());
	}

}
