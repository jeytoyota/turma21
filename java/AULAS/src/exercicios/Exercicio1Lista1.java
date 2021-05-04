package exercicios;

import java.util.Scanner;

public class Exercicio1Lista1 {
	
	public static void main(String[] args) {
		
		int anos;
		int meses;
		int dias;
		int calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		anos = leia.nextInt();
		
		System.out.println("Digite quantos meses: ");
		meses = leia.nextInt();
		
		System.out.println("Digite quantos dias: ");
		dias = leia.nextInt();
		
		calculo = (365 * anos) + (30 * meses) + dias;
		
		System.out.println("Você tem aproximadamente: "+ calculo + " dias de idade");
		
	}

}
