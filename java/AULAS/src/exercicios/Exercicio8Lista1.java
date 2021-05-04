package exercicios;

import java.util.Scanner;

public class Exercicio8Lista1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoConsumidor;
		double custoFabrica;
		double custoDistribuidor= 0.28;
		double imposto = 0.45;
		
		System.out.println("Digite o valor de fábrica: ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica * custoDistribuidor) + (custoFabrica + imposto);
		
		System.out.println("Valo total: "+ custoConsumidor);
		
	}

}
