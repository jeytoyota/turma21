package lista5exercicios;

import java.util.Scanner;

public class Ex2Repeticao {
	
	/*
	 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int par=0;
		int impar=0;
		int zero=0;
		
		for(int x = 0; x<10; x++) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero==0){
				zero++;
			}
			else if((numero%2)==0) {
				par++;
			}
			else {
				impar++;
			}
		
		}
		
		System.out.printf("Quantidade de números pares: %d", par);
		System.out.printf("\nQuantidade de números ímpares: %d",impar);
		System.out.printf("\nQuantidade de números zeros: %d",zero);
		
		leia.close();
	}

}
