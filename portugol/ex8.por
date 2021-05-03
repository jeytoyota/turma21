programa
{
	
	funcao inicio()
	{	

		/**
		 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 

		**/
		real custoConsumidor=0.00
		real custoFabrica=0.00
		const real custoDistribuidor=0.28
		const real imposto=0.45


		escreva("Digite o valor de fábrica: ")
		leia(custoFabrica)

		custoConsumidor = custoFabrica + (custoFabrica * custoDistribuidor)+(custoFabrica * imposto)

		escreva("Valor total: ", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 38; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */