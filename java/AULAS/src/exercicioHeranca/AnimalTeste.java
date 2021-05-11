package exercicioHeranca;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Jimmy",10);
		cachorro.correr();
		cachorro.emitirSom("Late");
		System.out.println("Nome cachorro: "+cachorro.getNome()+" \nIdade do cachorro: "+cachorro.getIdade()+"\n");
		
		Cavalo cavalo = new Cavalo("Campeão",6);
		cavalo.correr();
		cavalo.emitirSom("Bufar ou Resfolegar");
		System.out.println("Nome do cavalo: "+cavalo.getNome()+" \nIdade do cavalo: "+cavalo.getIdade()+"\n");
		
		Preguica preguica = new Preguica("Sra Sono",20);
		preguica.emitirSom("Gritinho");
		System.out.println("Nome da preguiça: "+preguica.getNome()+" \nIdade da preguiça: "+preguica.getIdade());
	}	

}
