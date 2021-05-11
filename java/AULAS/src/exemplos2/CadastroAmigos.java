package exemplos2;

import java.util.Scanner;

public class CadastroAmigos {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char estado = ' ';
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Nome do amigo: ");
		pessoa.nome = leia.next();
		System.out.println("Ano de nascimento: ");
		pessoa.anoNascimento = leia.nextInt();
		System.out.println("Gnero(F/M/O) :");
		pessoa.genero = leia.next().toUpperCase().charAt(0);
		System.out.print("O amigo está vivo? (1 - Sim / 2 - Não): ");
		estado = leia.next().charAt(0);
		
		if (estado == '1') {
			pessoa.vivo = true;
		}
		else {
			pessoa.vivo = false;
		}
		
		System.out.println();
		System.out.println("Seu amigo se chama " + pessoa.nome);
		pessoa.idade();
		System.out.println("Genero: " + pessoa.genero);
		if (pessoa.vivo) {
			System.out.println("Seu amigo está vivo!");
		}
		else {
			System.out.println("Seu amigo não está vivo..");
		}
		
		leia.close();
		
		
	}

}
