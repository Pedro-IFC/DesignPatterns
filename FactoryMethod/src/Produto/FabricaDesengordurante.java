package Produto;

public class FabricaDesengordurante implements FabricaProduto{

	public Produto gerarProduto() {
		return new Desengordurante();
	}

}
