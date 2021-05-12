package exercicioHeranca;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void subirEmArvore() {
		System.out.println("A preguiça sobe em árvore!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Bixo preguiça grita!!");
	}
	

}
