programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a, b, c, d
		inteiro a2, b2, c2, d2

		escreva("Digite um número: ")
		leia(a)
		escreva("Digite um número: ")
		leia(b)
		escreva("Digite um número: ")
		leia(c)
		escreva("Digite um número: ")
		leia(d)

		a2 = mat.potencia(a, 2)
		b2 = mat.potencia(b, 2)
		c2 = mat.potencia(c, 2)
		d2 = mat.potencia(d, 2)


		se(c2 >= 1000){
			escreva("Terceiro número: ", c2)
			}
		senao{
			escreva("Primeiro número: ", a2)
			escreva("\nSegundo número: ", b2)
			escreva("\nTerceiro número: ", c2)
			escreva("\nQuarto número: ", d2)
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 95; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */