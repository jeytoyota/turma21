programa
{
	
	funcao inicio()
	{
	/**
	 * 1) João, homem de bem, comprou um microcomputador para controlar o 
	 * rendimento diário de seu trabalho. Toda vez que ele traz um peso de 
	 * tomate maior que o estabelecido pelo regulamento do estado de São 
	 * Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	 * João precisa que você faça um sistema que leia a variável P 
	 * (peso de tomates) e verifique se há excesso. Se houver, gravar na 
	 * variável E (Excesso) e na variável M o valor da multa que João 
	 * deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo 
	 * ZERO.

	**/
		const real LIMITE=50.0
		const real MULTA=4.0
		real P
		real E
		real M

		escreva("Digite a quantidade de quilos: ")
		leia(P)

		

		se(P > LIMITE){
			E = P - LIMITE
			M = E * MULTA
			}
		senao{
			E = 0
			M = 0
			}

		escreva("Excesso: ", E, "\nValor multa: ", M)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */