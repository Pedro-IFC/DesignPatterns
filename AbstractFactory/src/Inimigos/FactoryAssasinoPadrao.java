package Inimigos;

public class FactoryAssasinoPadrao implements FactoryInimigo{

	@Override
	public IArma createArma() {
		// TODO Auto-generated method stub
		return new Adaga();
	}

	@Override
	public IInimigo createInimigo() {
		// TODO Auto-generated method stub
		return new Assasino();
	}
}
