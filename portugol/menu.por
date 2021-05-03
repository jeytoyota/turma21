programa
{
	inclua biblioteca Util

	
	funcao inicio()
	{
		caracter opcao
		
		faca{
			escreva("\nDigite o cosdigo de sua opção\n")
			escreva("\n1-Basico\n2-Médio\n3-Graduação\n4-Pos\n5-Sair")
			leia(opcao)
			se(opcao=='1'){
				limpa()
				escreva("\nEnsino básico")
				Util.aguarde(1000)
				}
			senao se(opcao=='2'){
				limpa()
				escreva("\nEnsino médio")
				Util.aguarde(1000)
				}
			senao se(opcao=='3'){
				limpa()
				escreva("\nEnsino superior")
				Util.aguarde(1000)
				}
			senao se(opcao=='4'){
				limpa()
				escreva("\nEnsino superior Pos")
				Util.aguarde(1000)
				}
			}enquanto(opcao!='5')
			escreva("\nFim")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */