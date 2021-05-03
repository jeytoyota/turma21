programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/***
		 *  A prefeitura de uma cidade fez uma pesquisa entre 20 de seus 
		 *  habitantes, coletando dados sobre o salário e número de 
		 *  filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.

		**/
		const inteiro HABITANTES=5
		real salario=0.0
		real qtdFilhos=0.0
		real somaSalario=0.0
		real somaQtdFilhos=0.0
		real maiorSalario=0.0
		real contador=0.0
		real percentual=0.0
		real mediaFilhos = 0.0
		real mediaSalario=0.0
		
		para(inteiro x = 0; x < HABITANTES; x++){
			escreva("Digite o salário: ")
			leia(salario)
			escreva("Digite a qtd de filhos: ")
			leia(qtdFilhos)

			somaSalario = somaSalario + salario
			somaQtdFilhos = somaQtdFilhos + qtdFilhos

			se(salario > maiorSalario){
				maiorSalario = salario
				}

			se(salario <= 100){
				contador = contador + 1
				percentual = mat.arredondar((contador/HABITANTES)*100,2)
				}

			}

			mediaSalario =  mat.arredondar(somaSalario /HABITANTES,2)
			mediaFilhos = mat.arredondar(somaQtdFilhos / HABITANTES,2)
			escreva("\nMedia salario: ", mediaSalario, " reais")
			escreva("\nMedia filhos: ", mediaFilhos)
			escreva("\nPercentual: ",percentual, " %")
			escreva("\nMaior salário: ",maiorSalario, " reais")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1063; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */