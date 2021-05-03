programa
 {
	
	/*OBJETIVOS
		 * 5 aluno
		 * nome, nota
		 * media nota
		 * maior nota
		 * quanto aluno nota <= 5
		 */
		funcao inicio()
 {
		//var
		cadeia nome
		real nota = 0.00
		real media = 0.00
		real maiorNota = 0.00
		real soma = 0.00
		inteiro totalNotaMenor = 0

		//entradas
		para(inteiro x = 1; x <= 5; x++){
			escreva("Aluno número: "+ x + "\n")
			escreva("Infome sue nome: ")
			leia(nome)
			escreva("Digite sua nota: ")
			leia(nota)
			
			//alunos com nota <=5
			se(nota <= 5) {
				totalNotaMenor = totalNotaMenor + 1
			}
			//maior nota
			se (nota >= maiorNota) {
				maiorNota = nota
			}
			soma = soma + nota		
			
			
		}
		//media
		media = soma / 5
		
		//saidas
		escreva("Numero de alunos com nota <=5: "+ totalNotaMenor + "\n")
		escreva("Média dos alunos foi: " +  media + "\n" )
		escreva("Maior nota foi: " + maiorNota + "\n")

		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */