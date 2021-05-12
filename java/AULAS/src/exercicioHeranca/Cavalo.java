package exercicioHeranca;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	
	public void correr() {
		System.out.println("Cavalo corre!");
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Cavalo bufa!");
	}
	

}
