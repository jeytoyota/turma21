package listaLacoDecisao;

import java.util.Scanner;

public class LacoDecisaoEx1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int maior=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			maior = num1;
		}else if(num2>num1 && num2>num3){
			maior = num2;
			
		}else {
			maior = num3;
		}
		
		System.out.printf("O maior n�mero �: %d",maior);
		
		leia.close();
		
	}

}
