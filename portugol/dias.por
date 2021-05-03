programa
{
	
	funcao inicio(){

		inteiro anos
		inteiro meses
		inteiro dias
		inteiro calculo

		escreva("Informe sua idade: \n")
		escreva("Digite quantos anos: ")
		leia(anos)
		escreva("Digite quantos meses: ")
		leia(meses)
		escreva("Digite quantos dias: ")
		leia(dias)

		calculo = (365 * anos) + (30 * meses) + dias

		escreva("Você tem aproximadamente: " , calculo , " dias de idade")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */