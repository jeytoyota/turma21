package listaLacoRepeticao;

import java.util.Scanner;

public class Ex4Repeticao {
	
	/*
	 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2,
	 *  se a pessoa era nervosa e 3, se a pessoa era agressiva).
	 *  o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.

	 */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int qtdPessoas=0;
		int idade;
		char sexo;
		char caracteristica;
		int contadorFN=0;
		int contadorMA=0;
		int contadorOC=0;
		int contador40N=0;
		int contador18C=0;
		
		while(qtdPessoas<5) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("Tipo (1-Feminino / 2-Masculino / 3-Outros)");
			sexo = leia.next().charAt(0);
			System.out.println("Cara (1-Calma/ 2-Nervosa/ 3-Agressiva)");
			caracteristica = leia.next().charAt(0);
			
			if(caracteristica=='2' && sexo=='1'){
				contadorFN++;	
			}
		
			if(sexo=='2' && caracteristica=='3') {
				contadorMA++;
			}
			
			if(sexo=='3' && caracteristica=='1') {
				contadorOC++;
			}
			
			if(idade>40 && caracteristica=='2') {
				contador40N++;
			}
			
			if(idade<18 && caracteristica=='1' ) {
				contador18C++;
			}
			
			qtdPessoas++;
			
		}
		
		System.out.printf("Feminino/Nervosa: %d",contadorFN);
		System.out.printf("\nMaculino/Agressivo: %d",contadorMA);
		System.out.printf("\nOutros/Calmo: %d",contadorOC);
		System.out.printf("\nAcima de 40 anos/Nervoso: %d",contador40N);
		System.out.printf("\nMenor que 18anos/Calmo: %d",contador18C);
		
		leia.close();
	}

}
