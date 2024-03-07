package Casa;

public class Quarto{
	private int largura;
	private int comprimento;
	private boolean arCondicionado;
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	@Override
	public String toString() {
		return "Quarto [largura=" + largura + ", comprimento=" + comprimento + ", arCondicionado=" + arCondicionado
				+ "]";
	}
	
}
