package Veiculo;

public class FordFactory implements VeiculoFactory{

	@Override
	public ICarro criarCarro() {
		// TODO Auto-generated method stub
		return new CarroFord();
	}

	@Override
	public IMoto criarMoto() {
		// TODO Auto-generated method stub
		return new MotoFord();
	}

}
