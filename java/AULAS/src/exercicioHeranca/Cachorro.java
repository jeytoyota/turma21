package exercicioHeranca;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void correr() {
		System.out.println("Cachorro corre!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro late!");
	}
	

}
