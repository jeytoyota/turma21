programa
{
	
	funcao inicio()
	{

	inteiro totalSeg
	inteiro horas
	inteiro min
	inteiro seg

	escreva("Digite o tempo em segundos: ")
	leia(totalSeg)

	horas = totalSeg / 3600
	min = (totalSeg % 3600) / 60
	seg = (totalSeg % 3600) % 60
	
	escreva("Horas: ", horas, " minutos: ", min, " segundos: ", seg)
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 97; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */