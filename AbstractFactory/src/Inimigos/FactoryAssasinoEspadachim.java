package Inimigos;

public class FactoryAssasinoEspadachim implements FactoryInimigo{

	@Override
	public IArma createArma() {
		// TODO Auto-generated method stub
		return new Espada();
	}

	@Override
	public IInimigo createInimigo() {
		// TODO Auto-generated method stub
		return new Assasino();
	}
}
