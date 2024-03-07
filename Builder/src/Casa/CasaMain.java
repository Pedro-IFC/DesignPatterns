package Casa;

public class CasaMain {

	public static void main(String[] args) {
		PlantaPadrao sala = new Escritorio();
		QuartoBuilder casa = new QuartoBuilder(sala);
		casa.construirQuarto(12, 4);
		System.out.println(casa.getQuarto());
		
		PlantaPadrao quarto2 = new Sala();
		casa= new QuartoBuilder(quarto2);
		casa.construirQuarto(16, 10);
		System.out.println(casa.getQuarto());
	}

}
