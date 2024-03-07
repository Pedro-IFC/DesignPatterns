package PC;

public class MainComputador {
	
	public static void main(String[] args) {
		IComputador comp1 = new Gamer();
		ComputadorBuilder compbu = new ComputadorBuilder(comp1);
		compbu.construirComp(8, "MSI B560M PRO-E, Intel LGA 1200, mATX, DDR4", " RX 6600 CLD 8G", true, 120);
		System.out.println(compbu.getComputador());
		
		IComputador comp2 = new Escritorio();
		compbu = new ComputadorBuilder(comp2);
		compbu.construirComp(8, "MSI B560M PRO-E, Intel LGA 1200, mATX, DDR4", " RX 6600 CLD 8G", true, 120);
		System.out.println(compbu.getComputador());
		
	}
}
