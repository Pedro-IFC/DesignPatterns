package Casa;

public class QuartoBuilder {
	private PlantaPadrao builder;
	public QuartoBuilder ( PlantaPadrao quarto ) {
		this.builder = quarto ;
	}
	public void construirQuarto(int larg, int comp) {
		builder.largura(larg);
		builder.comprimento(comp);
		builder.arcondicionado();
	}
	public Quarto getQuarto() {
		return this.builder.build();
	}
}
