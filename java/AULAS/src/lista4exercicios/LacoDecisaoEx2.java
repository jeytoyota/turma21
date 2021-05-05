package lista4exercicios;

import java.util.Scanner;

public class LacoDecisaoEx2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		
		if(num1<=num2 && num2<=num3) {
			System.out.printf("Sequencia: %d %d %d ", num1, num2, num3);
		}else if(num1<=num3 && num3<=num2){
			System.out.printf("Sequencia: %d %d %d ", num1, num3, num2);	
		}else if(num2<=num1 && num1<=num3){
			System.out.printf("Sequencia: %d %d %d ", num2, num1, num3);
		}else if(num2<=num3 && num3<=num1){
			System.out.printf("Sequencia: %d %d %d ", num2, num3, num1);
		}else if(num3<=num1 && num1<=num2){
			System.out.printf("Sequencia: %d %d %d ", num3, num1, num2);
		}else if(num3<=num2 && num2<=num1){
			System.out.printf("Sequencia: %d %d %d ", num3, num2, num1);
		}
		
		
		leia.close();
	}

}
