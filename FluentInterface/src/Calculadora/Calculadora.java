package Calculadora;

public class Calculadora {
	private Float resultado = (float) 0.0;
	
	public Calculadora soma(float a) {
		resultado+=a;
		return this;
	}
	public Calculadora subtrair(float a) {
		resultado-=a;
		return this;
	}
	public Calculadora multiplicar(float a) {
		resultado*=a;
		return this;
	}
	public Calculadora dividir(float a) {
		resultado/=a;
		return this;
	}

	public Float getResultado() {
		return resultado;
	}

	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Calculadora [resultado=" + resultado + "]";
	}
}
