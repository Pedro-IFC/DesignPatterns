package Produto;

public class FabricaExtintor implements FabricaProduto{

	public Produto gerarProduto() {
		return new Extintor();
	}

}
