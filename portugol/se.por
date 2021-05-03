programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter genero
		inteiro anoNascimento
		inteiro idade

		escreva("Escreva o nome: ")
		leia(nome)
		escreva("Escreva o ano de nascimento: ")
		leia(anoNascimento)
		escreva("Escreva o genero(F/M/O): ")
		leia(genero)

		idade = 2021 - anoNascimento

		se (idade <= 18){
			escreva(nome+ " sua idade é "+ idade + " , você é Jovem")
		}
		
		senao se (idade <= 50){
			se(genero == 'F' ou genero == 'f'){
				escreva(nome +  " sua idade é "+ idade +" você é Adulta")
				}
			senao se (genero == 'M'ou genero == 'm'){
				escreva(nome +  " sua idade é "+ idade +" você é Adulto")
				}
			senao {
				escreva(nome +  " sua idade é "+ idade +" você é Adulte")
			}
		}
		senao {
			se(genero == 'F'ou genero == 'f'){
				escreva(nome +  " sua idade é "+ idade +" você é Idosa")
				}
			senao se (genero == 'M'ou genero == 'm'){
				escreva(nome +  " sua idade é "+ idade +" você é Idoso")
				}
			senao{
				escreva(nome +  " sua idade é "+ idade +" você é Idose")
		}
	}
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */