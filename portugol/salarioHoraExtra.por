programa
{
	
	funcao inicio()
	{
		/**
		 * 2) Elabore um sistema que leia as variáveis C e N, 
		 * respectivamente código e número de horas trabalhadas 
		 * de um operário. E calcule o salário sabendo-se que ele 
		 * ganha R$ 10,00 por hora. Quando o número de horas exceder 
		 * a 50 calcule o excesso de pagamento armazenando-o na variável 
		 * E, caso contrário zerar tal variável. A hora excedente de trabalho 
		 * vale R$ 20,00. No final do processamento 
		 * imprimir o salário total e o salário excedente.
		**/

		inteiro C
		real N
		real E
		real salario
		const real LIMITE=50.0
		const real VALORHORA=10.0
		const real VALOREXTRA=20.0

		escreva("Digite o código do funcionário: ")
		leia(C)
		escreva("Digite as horas trabalhadas: ")
		leia(N)

		salario = LIMITE * VALORHORA

		se(N > LIMITE){
			E = (N - LIMITE) * VALOREXTRA
			
			}
		senao{
			E = 0.0
			}
		escreva("Codigo funcionário: ", C)
		escreva("\nSalário total com hora extra: ", (salario+E), "\nSalário excedente: ", E)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */