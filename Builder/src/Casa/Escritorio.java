package Casa;

public class Escritorio implements PlantaPadrao {

	@Override
	public void largura(int largura) {
		quarto.setLargura(largura);
	}
	@Override
	public void comprimento(int comprimento) {
		quarto.setComprimento(comprimento);
	}
	@Override
	public void arcondicionado() {
		quarto.setArCondicionado(true);
		
	}
	
}
