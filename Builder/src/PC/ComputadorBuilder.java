package PC;

public class ComputadorBuilder {

	private IComputador builder;
	public ComputadorBuilder ( IComputador computador ) {
		this.builder = computador ;
	}
	public void construirComp(int ram, String placaMae, String placaDeVideo, boolean ssd, int armazenamento) {
		builder.ram(ram);
		builder.placaMae(placaMae);
		builder.placaDeVideo(placaDeVideo);
		builder.ssd(false);
		builder.armazenamento(armazenamento);
	}
	public Computador getComputador() {
		return this.builder.build();
	}
}
