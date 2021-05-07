package listaLacoRepeticao;

import java.util.Scanner;

public class Ex5Repeticao {
	/*
	 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num;
		double soma=0.0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextDouble();
			
			soma = soma + num;
			
		}while(num!=0);
		
		System.out.printf("Soma: %f",soma);
		
		leia.close();
	}

}
