package exemplos;

import java.util.Scanner;

public class Exemplo6 {
	
	/*
	 *  inteiro pontos[5]
		 inteiro maiorPontuacao=0

		 para (inteiro x=0; x<5; x++)
		 {
		 	escreva ("Digite sua pontua��o nas atividades: ")
		 	leia (pontos[x])

		 	se (maiorPontuacao < pontos[x])
		 	{
		 		maiorPontuacao = pontos[x]
		 	}
		 	
		 }

		 escreva ("\nA maior pontua��o de suas atividades �: ", maiorPontuacao)

	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pontos[] = new int [5];
		int maiorPontuacao=0;
		
		 for (int x=0; x<5; x++)
		 {
		 	System.out.println("Digite sua pontua��o nas atividades: ");
		 	pontos[x] = leia.nextInt();

		 	if (maiorPontuacao < pontos[x]){
		 		
		 		maiorPontuacao = pontos[x];
		 	}
		 	
		 }
		 
		 System.out.printf("A maior pontua��o de suas atividades �: %d", maiorPontuacao);
		
		leia.close();
	}

}
