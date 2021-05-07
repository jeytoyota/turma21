package listaLacoDecisao;

import java.util.Scanner;

public class LacoDecisaoEx3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade<=14 && idade>=10) {
			System.out.printf("Categoria - Infantil. Seu nome é: %s idade %d", nome, idade);
		}else if(idade<=17 && idade>=15){
			System.out.printf("Categoria - Juvenil. Seu nome é: %s idade %d", nome, idade);
		}else if(idade<=25 && idade>=18){
			System.out.printf("Categoria - Adulto. Seu nome é: %s idade %d", nome, idade);
		}else {
			System.out.printf("Categoria - Outro. Seu nome é: %s idade %d", nome, idade);
		}
		
		leia.close();
	}

}
