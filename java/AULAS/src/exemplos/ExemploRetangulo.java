package exemplos;

import java.util.Scanner;

public class ExemploRetangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double base1 =0.00, altura1, base2, altura2, resultado1, resultado2;
		
		System.out.println("Digite a base do primeiro retangulo: ");
		base1 = leia.nextDouble();
		
		System.out.println("Digite a base do segundo retangulo: ");
		base2 = leia.nextDouble();
		
		System.out.println("Digite a altura do primeiro retangulo: ");
		altura1 = leia.nextDouble();
		
		System.out.println("Digite a altura do segundo retangulo: ");
		altura2 = leia.nextDouble();
				
				
				resultado1= (base1*altura1);
				resultado2= (base2*altura2);
				
				if(resultado1>resultado2) {
					System.out.println("A �rea do retangulo 1 � maior");
				}else if(resultado2>resultado1){
					System.out.println("A �rea do retangulo 2 � maior");
				}else {
					System.out.println("S�o iguais!");
				}
				
		leia.close();

	}

}
