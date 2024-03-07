package Casa;

public interface PlantaPadrao {
	Quarto quarto = new Quarto();
	public void largura (int largura );
	public void comprimento (int comprimento);
	public void arcondicionado ();
	public default Quarto build (){
		return quarto ;
	}
}
