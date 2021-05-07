package exemplos;

import java.util.Scanner;

public class Exemplo6 {
	
	/*
	 *  inteiro pontos[5]
		 inteiro maiorPontuacao=0

		 para (inteiro x=0; x<5; x++)
		 {
		 	escreva ("Digite sua pontuação nas atividades: ")
		 	leia (pontos[x])

		 	se (maiorPontuacao < pontos[x])
		 	{
		 		maiorPontuacao = pontos[x]
		 	}
		 	
		 }

		 escreva ("\nA maior pontuação de suas atividades é: ", maiorPontuacao)

	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pontos[] = new int [5];
		int maiorPontuacao=0;
		
		 for (int x=0; x<5; x++)
		 {
		 	System.out.println("Digite sua pontuação nas atividades: ");
		 	pontos[x] = leia.nextInt();

		 	if (maiorPontuacao < pontos[x]){
		 		
		 		maiorPontuacao = pontos[x];
		 	}
		 	
		 }
		 
		 System.out.printf("A maior pontuação de suas atividades é: %d", maiorPontuacao);
		
		leia.close();
	}

}
