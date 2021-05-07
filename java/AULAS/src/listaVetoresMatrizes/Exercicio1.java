package listaVetoresMatrizes;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que possua um vetor denominado A que armazene 6 números
		 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
		 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
		 * variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
		 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posição 4,
		 * atribuindo a esta posição o valor 100. (d) Mostre na tela cada valor do vetor
		 * A, um em cada linha.
		 * 
		 */

		int A[] = { 1, 0, 5, -2, -5, 7 };

		int soma = 0;
		int contador = 0;

		for (int x = 0; x < 6; x++) {

			if (x == 0 || x == 1 || x == 5) {

				soma = soma + A[x];

			}

			if (x == 4) {
				A[x] = 100;
			}

		}

		for (int lista : A) {

			System.out.printf("A[%d]: %d \n", contador, lista);
			contador++;
		}

		System.out.println("Soma de A[0], A[1] e A[5]" + soma);
		System.out.println("Novo valor de A[4]: " + A[4]);

	}

}
