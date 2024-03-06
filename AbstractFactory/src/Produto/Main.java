package Produto;

public class Main {

	public static void main(String[] args) {
		FabricaProduto fab = new FabricaExtintor();
		Produto prod = fab.gerarProduto();
		prod.exibirInfo();
	}

}
