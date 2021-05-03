programa
{
	
	funcao inicio()
	{
		/*Faça um programa que crie um vetor por leitura com 5 valores 
		 * de pontuação de uma atividade ,e o escreva em seguida. 
		 * Encontre após a maior pontuação e a apresente.
		*/

		real pontuacao[5]
		real maior=0.0

		para(inteiro x=0; x<5; x++){
			escreva("Digite a pontuação: ")
			leia(pontuacao[x])
	
			
			}
		para(inteiro x=0; x<5; x++){
			escreva("Pontuação: ",pontuacao[x],"\n")
			se(pontuacao[x] > maior){
				maior = pontuacao[x]
				}
			}
		escreva("Maior pontuação : ",maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 360; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */