package exemplos;

import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		
		//instanciar = criar um teclado
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		 int numero1 = 10;
		 int numero2 = 20;
		 int numero3;
		 int numero4;
		 String nome;
		 double salario;
		 char op ='S';
		 
		
		System.out.println("Ol� Mundo!");
		System.out.println("Jessica Yuki Toyota");
		System.out.println("Soma: "+(numero1+numero2));
		
		System.out.println("Digite um n�mero: ");
		numero3 = leia.nextInt();
		System.out.println("Digite um n�mero: ");
		numero4 = leia.nextInt();
		System.out.println("Digite um nome: ");
		nome = leia.next();
		System.out.println("Digite o sal�rio");
		salario = leia.nextDouble();
		
		System.out.println("Soma: "+(numero3+numero4));
		System.out.println("Nome: "+nome);
		System.out.println("Sal�rio: "+salario);
		
		leia.close();
		
	}

}
