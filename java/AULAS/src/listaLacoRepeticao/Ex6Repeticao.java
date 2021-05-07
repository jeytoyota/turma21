package listaLacoRepeticao;

import java.util.Scanner;

public class Ex6Repeticao {

	/*
	 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).
	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double soma=0.0;
		int contador=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			if((num%3)==0 &&  num!=0) {
				soma = soma + num;
				contador++;
			}
		}while(num!=0);
		System.out.printf("M�dia: %.2f", (soma/contador));
		
		leia.close();
	}
}
