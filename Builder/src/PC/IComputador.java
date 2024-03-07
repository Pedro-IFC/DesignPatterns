package PC;

public interface IComputador {
	Computador computador = new Computador();
	public void ram(int ram);
	public void placaMae(String placaMae);
	public void placaDeVideo(String placaDeVideo);
	public void ssd(boolean ssd);
	public void armazenamento(int armazenamento);
	public default Computador build() {
		return computador;
	}
}
