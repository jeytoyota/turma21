package exercicioHeranca;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Jimmy",10);
		cachorro.correr();
		cachorro.emitirSom();
		System.out.println("Nome cachorro: "+cachorro.getNome()+" \nIdade do cachorro: "+cachorro.getIdade()+"\n");
		
		Cavalo cavalo = new Cavalo("Campeão",6);
		cavalo.correr();
		cavalo.emitirSom();
		System.out.println("Nome do cavalo: "+cavalo.getNome()+" \nIdade do cavalo: "+cavalo.getIdade()+"\n");
		
		Preguica preguica = new Preguica("Sra Sono",20);
		preguica.emitirSom();
		System.out.println("Nome da preguiça: "+preguica.getNome()+" \nIdade da preguiça: "+preguica.getIdade()+"\n");
		
		Animal dog = new Cachorro("Bidu",5);
		dog.emitirSom();
		System.out.println("Nome cachorro: "+dog.getNome()+" \nIdade do cachorro: "+dog.getIdade());
	}	

}
