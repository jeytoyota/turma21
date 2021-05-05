package lista1exercicios;

import java.util.Scanner;

public class Exercicio5Lista1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float mediaPond;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		mediaPond = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		
		System.out.println("Média ponderada: " + mediaPond);
		
		leia.close();
		
	}

}
