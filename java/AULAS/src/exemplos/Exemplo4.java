package exemplos;

import java.util.Scanner;

public class Exemplo4 {
	
	/*programa
{
	
	funcao inicio()
	{
	
		
		inteiro numero=1, somatorio=0, media=0, totalValoresLidos=0, qtdVezes=0

		enquanto (numero != 0)
		{
			escreva ("Informe um numero positivo: ")
			leia (numero)

		somatorio = somatorio + numero

			se (numero>0)
			{
				totalValoresLidos++
			}

		media = somatorio / totalValoresLidos
		
		}

		escreva ("\nA soma dos valores informados é de: ", somatorio)
		escreva ("\nA quantidade de vezes que foram informados numeros !=0 foi de: ",totalValoresLidos, " vezes")
		escreva ("\nA média dos numeros informados é: ", media)
		 
	}
}

	 * 
	 * */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=1, somatorio=0, totalValoresLidos=0, qtdVezes=0, media=0;
		
		
		while (numero >= 0)
		{
			System.out.println("Informe um numero positivo: ");
			numero = leia.nextInt();

			somatorio = somatorio + numero;			
			totalValoresLidos++;
			

			media = somatorio / totalValoresLidos;
		
		}
		
		System.out.printf("\nA soma dos valores informados é de: %d", somatorio);
		System.out.printf("\nA quantidade de vezes que foram informados numeros !=0 foi de: %d vezes",totalValoresLidos);
		System.out.printf("\nA média dos numeros informados é: %d", media);
		
	}

}
