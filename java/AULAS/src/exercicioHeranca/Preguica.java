package exercicioHeranca;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void subirEmArvore() {
		System.out.println("A pregui�a sobe em �rvore!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Bixo pregui�a grita!!");
	}
	

}
