programa
{
	
	funcao inicio()
	{
		/*Elaborar um programa que efetue a leitura sucessiva de 
		 * valores numéricos e apresente no final o total do somatório, 
		 * a média e o total de valores lidos. O programa deve fazer as 
		 * leituras dos valores enquanto o usuário estiver fornecendo 
		 * valores positivos. Ou seja, o programa deve parar quando o 
		 * usuário fornecer um valor negativo.*/

		real numero=0.0
		inteiro qtdNum=1
		real soma=0.0
		real media=0.0

		enquanto(numero >= 0){
			escreva("\nDigite um número: ")
			leia(numero)
			
			soma = soma + numero
			qtdNum ++
			media = soma/qtdNum

			escreva("Soma: "+ soma)
			escreva("\nQtd num: ",qtdNum)
			escreva("\nMédia: ",media)
			
			}
		escreva("\nFim")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */