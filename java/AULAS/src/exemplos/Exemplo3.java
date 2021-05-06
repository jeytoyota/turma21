package exemplos;

import java.util.Scanner;

public class Exemplo3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor");
		valor = leia.nextInt();
		
		System.out.println((valor==0) ? "sero neutro" : ((valor%2)==0) ? "É par" : "É impar");
		
		leia.close();
	}

}
