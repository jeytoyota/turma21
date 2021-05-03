programa
{
	
	funcao inicio()
	{
		/**
		 * 6) Elabore um sistema que dada a idade de um nadador 
		 * classifique-o em uma das seguintes categorias:
	Infantil A = 5 a 7 anos
	Infantil B = 8 a 11 anos
	Juvenil A = 12 a 13 anos
	Juvenil B = 14 a 17 anos
	Adultos = Maiores de 18 anos

		**/
		inteiro idade

		escreva("Digite sua idade: ")
		leia(idade)

		se(idade <= 7 e idade >= 5){
			escreva("Categoria: Infantil A")
			}
		senao se(idade<=11 e idade >= 8){
			escreva("Categoria: Infantil B")
			}
		senao se(idade<=13 e idade >= 12){
			escreva("Categoria: Juvenil A")
			}
		senao se(idade<=17 e idade >= 14){
			escreva("Categoria: Juvenil B")
			}
		senao se(idade>=18){
			escreva("Categoria: Adulto")
			}
		senao{
			escreva("Não se encaixa em nenhuma categoria")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 661; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */