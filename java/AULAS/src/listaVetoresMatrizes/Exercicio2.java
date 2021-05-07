package listaVetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeros[] = new int[6];
		int pares[] = new int[6];
		int impares[] = new int[6];
		int soma = 0;
		int qtdImpares = 0;

		for (int x = 0; x < numeros.length; x++) {

			System.out.println("Digite um núemro inteiro: ");
			numeros[x] = leia.nextInt();

			if ((numeros[x] % 2) == 0) {
				pares[x] = numeros[x];
				soma = pares[x] + soma;
			} else {
				impares[x] = numeros[x];
				if (numeros[x] != 0) {

					qtdImpares++;
				}
			}

		}

		for (int lista : pares) {
			if (lista != 0) {
				System.out.println("Número par: " + lista);
			}
		}

		System.out.println("Soma num pares: " + soma);

		for (int lista : impares) {
			if (lista != 0) {
				System.out.println("Número ímpar: " + lista);
			}
		}

		System.out.println("Qtd num ímpares: " + qtdImpares);

		leia.close();
	}

}
