package exemplos;

public class Exemplo5 {
	

	
	public static void main(String[] args) {
		
		int contador=233;
		
		do{
			System.out.printf("\ncontagem: %d",contador);
			if(contador >= 300 && contador <= 400){
				contador = contador + 5;
				}

			else{
			contador = contador + 3;
			}
			
			}
			while(contador <= 456 );
				System.out.println("\nFim");
				
	}
	

}
