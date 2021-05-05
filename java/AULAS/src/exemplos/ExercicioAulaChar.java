package exemplos;

import java.util.Scanner;

public class ExercicioAulaChar {

	/*
	 * Nome, ano nasc, M - masculino, F - Feminino O - outro
	 * 
	 * MOSTRAR NOME, IDADE, M/F/O
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.next();
		
		System.out.print("Ano Nascimento: ");
		int anoNasc = sc.nextInt();
		
		System.out.print("Código: ");
		char codigo = sc.next().toUpperCase().charAt(0);
		
		int idade = 2021 - anoNasc;
		
		// %s - string
		// %d - int
		// %.2f - double(2 casas)
		// %c - char
		
		System.out.printf("Nome: %s\nIdade: %d\nCódigo: %s", nome, idade, codigo);
	}
}
