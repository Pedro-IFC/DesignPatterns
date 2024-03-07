package Veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
        VeiculoFactory fordFactory = new FordFactory();
        ICarro fordcarro = fordFactory.criarCarro();
        IMoto fordmoto = fordFactory.criarMoto();
        fordcarro.dirigir();
        fordmoto.empinar();
        

        VeiculoFactory toyotaFactory = new ToyotaFactory();
        ICarro toyotacarro = toyotaFactory.criarCarro();
        IMoto toyotamoto = toyotaFactory.criarMoto();
        toyotacarro.dirigir();
        toyotamoto.empinar();
	}

}
