package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); 
		
		String nome;
		char tipo;
		boolean emergencial;
		double salarioTotal;
		double salarioAnual;
		int resposta = 0;
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		
		System.out.print("Digite o tipo(F/M/O): ");
		tipo = leia.next().charAt(0);
		
		System.out.print("Digite o sal�rio anual: ");
		salarioAnual = leia.nextDouble();
		
		System.out.print("Recebe sal�rio emergencial(0-n�o 1-sim)? ");
		resposta = leia.nextInt();
		
		emergencial = (resposta==1);
		
		
		if(salarioAnual < 60000) {
			System.out.println("Isento de importo.");
			if(emergencial == true) {
				System.out.println("Est� certo tem direito ao emergencial!");
				salarioTotal = salarioAnual + (600 * 5);
			}else {
				System.out.println("Voc� tem direito ao emergencial! Seu sal�rio com o emergial �: ");
				salarioTotal = salarioAnual + (600 * 5);
			}
			System.out.println(salarioTotal);
			
		}
		else if(salarioAnual >= 60000) {
			System.out.println("Importo de 15%");
			if(salarioAnual <= 72000) {
				if(emergencial == true) {
					System.out.println("Voc� n�o tem direito ao emergencial! Devolva!");
					salarioTotal = salarioAnual + (salarioAnual * 0.15) - (600 * 5);
				}else {
					salarioTotal = salarioAnual + (salarioAnual * 0.15);
				}
				System.out.println(salarioTotal);
				
			}else if(salarioAnual <120000) {
				System.out.println("Importo de 17%");
				if(emergencial == true) {
					System.out.println("Voc� n�o tem direito ao emergencial! Devolva!");
					salarioTotal = salarioAnual + (salarioAnual * 0.17) - (600 * 5);
				}else {
					salarioTotal = salarioAnual + (salarioAnual * 0.17);
				}
				System.out.println(salarioTotal);
			
			}else {
				
				System.out.println("Importo de 25%");
				if(emergencial == true) {
					System.out.println("Voc� n�o tem direito ao emergencial! Devolva!");
					salarioTotal = salarioAnual + (salarioAnual * 0.25) - (600 * 5);
				}else {
					salarioTotal = salarioAnual + (salarioAnual * 0.25);
				}
				System.out.println(salarioTotal);
				
			}
		}
		
		
		
	}
	
	

}
