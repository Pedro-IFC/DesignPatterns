package PC;

public class Computador {
	private String placaMae;
	private int ram;
	private String placaDeVideo;
	private boolean ssd = false;
	private int armazenamento;
	public String getPlacaMae() {
		return placaMae;
	}
	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getPlacaDeVideo() {
		return placaDeVideo;
	}
	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}
	public boolean isSsd() {
		return ssd;
	}
	public void setSsd(boolean ssd) {
		this.ssd = ssd;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	@Override
	public String toString() {
		return "Computador [placaMae=" + placaMae + ", ram=" + ram + ", placaDeVideo=" + placaDeVideo + ", ssd=" + ssd
				+ ", armazenamento=" + armazenamento + "]";
	}
	
}
