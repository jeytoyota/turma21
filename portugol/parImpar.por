programa
{
	
	funcao inicio()
	{
		/**
		 * Faça um sistema que leia um número inteiro e mostre uma mensagem 
		 * indicando 
		 * se este número é par ou ímpar, e se é positivo ou negativo.
		**/

		inteiro valor

		escreva("Digite um valor: ")
		leia(valor)

		se(valor == 0){
			escreva("É neutro!")
			}
		senao se(valor%2 == 0){
			escreva("É par!")
			
			}
		senao{
			escreva("É ímpar!")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */