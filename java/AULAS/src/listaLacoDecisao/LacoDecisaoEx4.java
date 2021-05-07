package listaLacoDecisao;

import java.util.Locale;
import java.util.Scanner;

public class LacoDecisaoEx4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double num;
		double calculo;
		
		System.out.println("Digite um número: ");
		num = leia.nextDouble();
		
		if((num%2)==0) {
			System.out.println("É par!");
			calculo = Math.sqrt(num);
			System.out.printf("Raiz: %.2f", calculo);
		}else {
			System.out.println("É ímpar!");
			calculo = Math.pow(num, 2);
			System.out.printf("Quadrado: %.2f", calculo);
		}
		
		leia.close();
	}

}
