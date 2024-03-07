package Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex");
        System.out.println("Cachorro 1: " + cachorro1.getNome());

        
        Cachorro cachorro2 = (Cachorro) cachorro1.clone();
        System.out.println("Cachorro 2: " + cachorro2.getNome());

        cachorro2.setNome("Max");
        System.out.println("Cachorro 2: " + cachorro2.getNome());
    }
}
