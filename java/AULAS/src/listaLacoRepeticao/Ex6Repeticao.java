package listaLacoRepeticao;

import java.util.Scanner;

public class Ex6Repeticao {

	/*
	 * Escrever um programa que receba vários números inteiros no teclado. 
	 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		double soma=0.0;
		int contador=0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if((num%3)==0 &&  num!=0) {
				soma = soma + num;
				contador++;
			}
		}while(num!=0);
		System.out.printf("Média: %.2f", (soma/contador));
		
		leia.close();
	}
}
