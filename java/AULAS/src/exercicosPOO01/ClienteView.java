package exercicosPOO01;

import java.util.Scanner;

public class ClienteView {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		String nome = leia.next();
		System.out.println("Digite a idade: ");
		int idade = leia.nextInt();
		System.out.println("Digite o cpf: ");
		String cpf = leia.next();
		System.out.println("Digite o genero(F/M/O): ");
		char genero = leia.next().toUpperCase().charAt(0);
		
		Cliente cliente = new Cliente(nome, idade, cpf, genero);
		
		
		System.out.println("Nome cliente: " + cliente.nome);
		System.out.println("Idade cliente: " + cliente.idade);
		cliente.desconto();
		System.out.println("CPF cliente: " + cliente.cpf);
		System.out.println("Genero cliente: " + cliente.genero);
		
		
		leia.close();
	}

}
