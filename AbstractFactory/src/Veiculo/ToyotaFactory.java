package Veiculo;

public class ToyotaFactory implements VeiculoFactory{

	@Override
	public ICarro criarCarro() {
		// TODO Auto-generated method stub
		return new CarroToyota();
	}

	@Override
	public IMoto criarMoto() {
		// TODO Auto-generated method stub
		return new MotoToyota();
	}

}
