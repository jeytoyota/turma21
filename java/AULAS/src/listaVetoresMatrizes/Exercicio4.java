package listaVetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		char op;
		double constante=0.0;

		Scanner leia = new Scanner(System.in);
		
		//CRIA MATRIZ 1 E 2
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("Digite um valor para Matriz1[%d][%d]: ", linha, coluna);
				matriz1[linha][coluna] = leia.nextDouble();
				System.out.printf("Digite um valor para Matriz2[%d][%d]: ", linha, coluna);
				matriz2[linha][coluna] = leia.nextDouble();
			}
		}

		
		//ESCOLHE OPERACAO
		System.out.println(
				"Digite uma opção: \n(1) somar as duas matrizes \r\n" + "(2) subtrair a primeira matriz da segunda \r\n"
						+ "(3) adicionar uma constante as duas matrizes\r\n" + "(4) imprimir as matrizes \r" + "");
		op = leia.next().charAt(0);
		
		//SOMA 
		if (op == '1') {
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					matriz3[linha][coluna] = (matriz1[linha][coluna] + matriz2[linha][coluna]);
				}
			}
			
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.printf("MatrizSoma[%d][%d]: %.2f", linha, coluna,matriz3[linha][coluna]);
				}
			}
		}
		
		//SUBTRAI
		else if(op=='2') {
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					matriz3[linha][coluna] = (matriz2[linha][coluna] - matriz1[linha][coluna] );
				}
			}
			

			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.printf("MatrizSubtrai[%d][%d]: %.2f", linha, coluna,matriz3[linha][coluna]);
				}
			}
		}
		
		//ADICIONA VALOR
		else if(op=='3') {
			System.out.println("Digite uma constante: ");
			constante = leia.nextDouble();
			
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					matriz1[linha][coluna] = (matriz1[linha][coluna] + constante );
					matriz2[linha][coluna] = (matriz2[linha][coluna] + constante );
				}
			}
			
			
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.printf("\nMatriz1[%d][%d]: %.2f", linha, coluna,matriz1[linha][coluna]);
				}
			}
			
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.printf("\nMatriz2[%d][%d]: %.2f", linha, coluna,matriz2[linha][coluna]);
				}
			}
				
			
		}
		
		//IMPRIME
		else if(op=='4') {
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.printf("Matriz1[%d][%d]: %.2f", linha, coluna,matriz1[linha][coluna]);
				}
			}
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.printf("Matriz2[%d][%d]: %.2f", linha, coluna,matriz2[linha][coluna]);
				}
			}
		}
		
		leia.close();

	}

}
