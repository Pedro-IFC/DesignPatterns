package Inimigos;

public class InimigoMain {

	public static void main(String[] args) {
		FactoryInimigo inimigofab = new FactoryAssasinoPadrao();
		IInimigo inimigo = inimigofab.createInimigo();
		IArma arma = inimigofab.createArma();
		inimigo.atacar();
		arma.sideEfect();
	}

}
