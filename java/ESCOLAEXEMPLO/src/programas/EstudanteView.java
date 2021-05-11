package programas;

import java.util.Scanner;

import classes.Pos;

public class EstudanteView {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		char movimento;
		char continuar= ' ';
		//double credito = 5.00;
		double ponto = 0.00;
		int x = 0;

		System.out.println("DIGITE O CÓDIGO DA OPERAÇÃO: ");
		int codigo = leia.nextInt();

		System.out.println("Matricula: ");
		int matricula = leia.nextInt();
		System.out.println("CPF: ");
		String cpf = leia.next();
		System.out.println("Status digite 1-Ativo (true) ou 2-Inativo (false) : ");
		boolean status = leia.nextBoolean();

		System.out.println("\n");

		Pos estudante = new Pos(matricula, cpf, status, ponto);

		do {
			System.out.println("\nMOVIMENTOS (I-Inclusão de nota ou R-Retirada nota: ");
			movimento = leia.next().toUpperCase().charAt(0);
			System.out.println("\nDigite o valor : ");
			double valor = leia.nextDouble();

			if (movimento == 'I') {
				estudante.adicionarNota(valor);
			}

			else {
				estudante.tirarNota(valor);
			}

			if (estudante.getCredito() > 0) {
				System.out.println("Solicitar uso de credito?(S/N): ");
				continuar = leia.next().toUpperCase().charAt(0);
				if (continuar == 'S') {
					System.out.println("Quantos pontos deseja usar?: ");
					double valorCredito = leia.nextDouble();
					estudante.pedirCreditoPos(valorCredito);
				}

			} else {
				System.out.println("Voce nao possui mais credito!\n");

			}
			x++;
			System.out.println("Continuar S/N?: ");
			continuar = leia.next().toUpperCase().charAt(0);
			
		} while (x < 3 && continuar != 'N');

		System.out.println("Movimentos finalizados!\n");
		if (estudante.getCredito() > 0) {
			System.out.println("Solicitar uso de credito?(S/N): ");
			continuar = leia.next().toUpperCase().charAt(0);
			if (continuar == 'S') {
				System.out.println("Quantos pontos deseja usar?: ");
				double valorCredito = leia.nextDouble();
				estudante.pedirCreditoPos(valorCredito);
			}

		} else {
			System.out.println("Voce nao possui mais credito!\n");

		}
	}

}
