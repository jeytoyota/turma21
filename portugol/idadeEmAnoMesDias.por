programa
{
	
	funcao inicio()
	{
		inteiro dias
		inteiro idadeDias
		inteiro mes
		inteiro ano
		inteiro restoAno
		

		escreva("Digite quantos dias em idade: ")
		leia(idadeDias)

		ano = idadeDias / 365
		mes = (idadeDias % 365)/30
		dias = (idadeDias % 365)% 30
		
		escreva("Você tem: ", ano, " anos ", mes, " meses e ", dias, " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */