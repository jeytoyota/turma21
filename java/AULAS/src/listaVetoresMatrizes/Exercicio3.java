package listaVetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int maior10[] = new int[9];
		int contador = 0;
		int x = 0;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Digite um valor para Matriz[%d][%d]: ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();

				if (matriz[linha][coluna] > 10) {
					contador++;
					maior10[x] = matriz[linha][coluna];
					x++;
				}
			}
		}

		System.out.println("Quantidade de números maior que 10: " + contador);

		for (int lista : maior10) {
			if (lista != 0) {
				System.out.println("Número maior que 10: " + lista);
			}
		}

		leia.close();
	}

}
