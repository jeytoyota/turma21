programa
{
	
	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é 
		 * anotado. Faça um programa que gere um vetor com os lançamentos, 
		 * escreva esse vetor. A seguir determine e imprima a média 
		 * aritmética dos lançamentos, contabilize e apresente também 
		 * quantas foram as ocorrências da maior pontuação.

		*/

		real valores[10]
		real media=0.0
		real maior=0.0
		real soma=0.0
		inteiro ocorrencia=0

		para(inteiro x=0; x<10; x++){
			escreva("Digite um valor: ")
			leia(valores[x])
	
			}
			
		para(inteiro x=0; x<10; x++){
			escreva("Valor: ",valores[x],"\n")
			soma = soma + valores[x]
			se(valores[x] > maior){
				maior = valores[x]
			}	
		}

		para(inteiro y=0; y<10; y++){
			se(valores[y]==maior){
			ocorrencia = ocorrencia + 1
			}
		}
		media = soma / 10
		escreva("Média: ", media)
		escreva("\nMaior valor : ",maior)
		escreva("\nOcorrência do maior valor: ", ocorrencia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */