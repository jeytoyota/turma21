package lista5exercicios;

import java.util.Scanner;

public class Ex2Repeticao {
	
	/*
	 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int par=0;
		int impar=0;
		int zero=0;
		
		for(int x = 0; x<10; x++) {
			System.out.println("Digite um n�mero: ");
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
		
		System.out.printf("Quantidade de n�meros pares: %d", par);
		System.out.printf("\nQuantidade de n�meros �mpares: %d",impar);
		System.out.printf("\nQuantidade de n�meros zeros: %d",zero);
		
		leia.close();
	}

}
