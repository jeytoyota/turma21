package lista1exercicios;

import java.util.Scanner;

public class Exercicio2Lista1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano;
		int mes;
		int dias;
		int idadeDias;
		
		
		System.out.println("Digite quantos dias de idade: ");
		idadeDias = leia.nextInt();
		
		ano = idadeDias / 365;
		mes = (idadeDias % 365)/30;
		dias = (idadeDias % 365) % 30;
		
		System.out.println("Você tem: " + ano +" anos "+ mes +" meses e "+ dias + " dias");
		
		leia.close();
		
	}

}
