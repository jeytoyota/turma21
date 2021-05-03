programa
{
	
	funcao inicio()

	{

		inteiro codigo=0
		inteiro matricula=0
		cadeia cpf
		real pontos[4]
		logico status
		caracter movimento
		real total=0.0
		real tiraNota=0.0
		inteiro operacao=0
		caracter continuar
		inteiro x = 0
		real creditoPos=5.0
		real valorCreditoPos=0.0
		
		escreva("ESCOLA SND\n")
		escreva("SLOGAN")
		escreva("\n")
		escreva("1-BÁICO\n")
		escreva("2-MÉIO\n")
		escreva("3-GRADUAÇÃO\n")
		escreva("4-PÓS\n")
		escreva("5-MESTRADO\n")
		escreva("6-SAIR\n")

		escreva("DIGITE O CÓDIGO DA OPERAÇÃO: ")
		leia(codigo)

		se(codigo==1){
			escreva("ESCOLINHA ENSINO BÁSICO ALEGRIA\n")
			escreva("A JORNADA COMEÇA AQUI\n")
			escreva("\n")
			escreva("ENSINO BÁSICO\n")
			escreva("\n")
			
			/**escreva("Matrícula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			escreva("\nStatus(1-Ativo 2-Inativo): ")
			leia(status)
			escreva("\n")
**/
			faca{
				escreva("Pontos totais atual: ", total)
				escreva("\nMOVIMENTOS (I-inclusão de nota ou R-retirada nota: ")
				leia(movimento)
				escreva("\nDigite a nota que deseja incluir ou excluir: ")
				leia(pontos[x])


				se(pontos[x] > 0){
					se(movimento=='I'){
						total = pontos[x] + total
					}
					
					senao{
						total= total - pontos[x]
					}
				}
				senao{
					
					escreva("\nDigite um valor válido(positivo): ")
					leia(pontos[x])
					se(movimento=='I'){
						total = pontos[x] + total
					}
					
					senao{
						total= total - pontos[x]
					}
					
				}		
				
				
				se(creditoPos>0){
				escreva("Solicitar uso de crédito?(S/N): ")
				leia(continuar)
					se(continuar=='S'){
						escreva("Seu crédito atual é de: ",creditoPos ,". Quantos creditos deseja usar?: ")
						leia(valorCreditoPos)
						creditoPos = creditoPos - valorCreditoPos
						}
				}
				senao{
					escreva("Você não possui mais crédito!\n")
					}
				
				x++
				escreva("Continuar S/N?: ")
				leia(continuar)
				
				}enquanto(x<4 e continuar!='N')
					escreva("Movimentos finalizados")
					
					se(creditoPos>0){
						escreva("Solicitar uso de crédito?(S/N): ")
						leia(continuar)
						se(continuar=='S'){
							escreva("Seu crédito atual é de: ",creditoPos ,". Quantos creditos deseja usar?: ")
							leia(valorCreditoPos)
							creditoPos = creditoPos - valorCreditoPos
							}
					}
					escreva(creditoPos)

			
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */