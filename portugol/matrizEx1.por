programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/**
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) 
		 * e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos 
		de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças 
		dos elementos de mesma posição das matrizes N1 e N2.

		*/
		const inteiro linha = 4
		const inteiro coluna = 6
		inteiro N1[linha][coluna]
		inteiro N2[linha][coluna]
		inteiro M1[linha][coluna]
		inteiro M2[linha][coluna]
		

		escreva("Matriz N1\n")
		para(inteiro x =0 ; x<linha; x++){
			para(inteiro y=0; y<coluna; y++){
				N1[x][y] = Util.sorteia(1,10)
				escreva(N1[x][y]," ")
				}

				escreva("\n")
			}
		
		escreva("Matriz N2\n")
		para(inteiro x =0 ; x<linha; x++){
			para(inteiro y=0; y<coluna; y++){
				N2[x][y] = Util.sorteia(1,10)
				escreva(N2[x][y]," ")
				}
				escreva("\n")
			}
		
		escreva("Soma Matriz N1 + N2\n")
		para(inteiro x =0 ; x<linha; x++){
			para(inteiro y=0; y<coluna; y++){
				M1[x][y] = N1[x][y] + N2[x][y]
				escreva(M1[x][y]," ")
				}

				escreva("\n")
			}
		
		escreva("Diferença Matriz N1 - N2\n")
		para(inteiro x =0 ; x<linha; x++){
			para(inteiro y=0; y<coluna; y++){
				M1[x][y] = N1[x][y] - N2[x][y]
				escreva(M1[x][y]," ")
				}

				escreva("\n")
			}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */