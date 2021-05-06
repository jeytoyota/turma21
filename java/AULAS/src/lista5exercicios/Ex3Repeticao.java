package lista5exercicios;

import java.util.Scanner;

public class Ex3Repeticao {
	
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
	 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		int contador21=0;
		int contador50=0;
		
		while(idade!=-99) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade<21 ) {
				contador21++;
			}
			else if(idade>50) {
				contador50++;
			}
			
		}
		
		System.out.printf("Quantidade de pessoas com menos de 21: %d", contador21-1);
		System.out.printf("\nQuantidade de pessoas com mais de 50: %d", contador50);
		
		leia.close();
	}

}
