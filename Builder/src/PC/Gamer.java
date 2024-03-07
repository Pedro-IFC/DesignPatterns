package PC;

public class Gamer implements IComputador{

	@Override
	public void ram(int ram) {
		computador.setRam(ram);
	}

	@Override
	public void placaMae(String placaMae) {
		computador.setPlacaMae(placaMae);
	}

	@Override
	public void placaDeVideo(String placaDeVideo) {
		computador.setPlacaDeVideo(placaDeVideo);
	}

	@Override
	public void ssd(boolean ssd) {
		computador.setSsd(ssd);
	}

	@Override
	public void armazenamento(int armazenamento) {
		computador.setArmazenamento(armazenamento);
		
	}
	
}
