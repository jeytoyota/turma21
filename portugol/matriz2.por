programa
{
	
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valores do usuário para preencher 
		 * uma matriz 3X3, e em seguida, exiba a soma dos valores dela e 
		 * a soma dos valores da primeira diagonal, ou seja, diagonal 
		 * principal.

		*/

		inteiro tabela[3][3]
		inteiro soma=0
		inteiro diagonal=0

		escreva("Tabela 3x3\n")
		para(inteiro x =0 ; x<3; x++){
			para(inteiro y=0; y<3; y++){
				escreva("Digite um valor: ")
				leia(tabela[x][y])
				
				}
			}

		para(inteiro x =0 ; x<3; x++){
			para(inteiro y=0; y<3; y++){
				escreva(tabela[x][y],"\n")
				
				}
				
			}

		//somatória
		para(inteiro x =0 ; x<3; x++){
			para(inteiro y=0; y<3; y++){
				soma = soma + tabela[x][y]
			}
		}

		para(inteiro x =0 ; x<3; x++){
			para(inteiro y=0; y<3; y++){
				se(x==y){
					diagonal = diagonal + tabela[x][y]
					}
			}
			
		}
		escreva("Soma total: ", soma)
		escreva("\nSoma diagonal: ", diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */