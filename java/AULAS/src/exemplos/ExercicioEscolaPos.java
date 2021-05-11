package exemplos;

import java.util.Scanner;

public class ExercicioEscolaPos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo = 0;
		int matricula = 0;
		String cpf;
		double pontos[] = new double[3];
		boolean status;
		char movimento;
		double total = 0.00;
		char continuar;
		int x = 0;
		double creditoPos = 5.0;
		double valorCreditoPos = 0.0;

		System.out.println("DIGITE O CÓDIGO DA OPERAÇÃO: ");
		codigo = leia.nextInt();

		if (codigo == 4) {

			System.out.println("POS-GRADUAÇÃO UNI10\n");
			System.out.println("SEU FUTURO É AQUI !!!\n");
			System.out.println("\n");
			System.out.println("POS-GRADUAÇÃO\n");
			System.out.println("\n");

			System.out.println("Matricula: ");
			matricula = leia.nextInt();
			System.out.println("\nCPF: ");
			cpf = leia.next();
			System.out.println("\nStatus digite 1-Ativo (verdadeiro) ou 2-Inativo (falso) : ");
			status = leia.nextBoolean();
			System.out.println("\n");

			do {
				System.out.println("Pontos totais atual: " + total);

				if (x == 0) {
					System.out.println("\nPrimeira operacao incluir nota!");
					System.out.println("\nDigite a nota que deseja incluir: ");
					pontos[x] = leia.nextDouble();
					total = pontos[x] + total;
				}

				else {
					System.out.println("\nMOVIMENTOS (I-inclusão de nota ou R-retirada nota: ");
					movimento = leia.next().toUpperCase().charAt(0);
					System.out.println("\nDigite a nota que deseja incluir ou excluir: ");
					pontos[x] = leia.nextDouble();

					if (pontos[x] > 0) {
						if (movimento == 'I') {
							total = pontos[x] + total;
						}

						else {
							total = total - pontos[x];
						}
					} else {
						System.out.println("\nDigite um valor valido(positivo): ");
						pontos[x] = leia.nextDouble();
						if (movimento == 'I') {
							total = pontos[x] + total;
						}

						else {
							total = total - pontos[x];
						}

					}
				}

				if (creditoPos > 0) {
					System.out.println("Solicitar uso de credito?(S/N): ");
					continuar = leia.next().toUpperCase().charAt(0);
					if (continuar == 'S') {
						System.out
								.println("Seu credito atual e de: " + creditoPos + ". Quantos creditos deseja usar?: ");
						valorCreditoPos = leia.nextDouble();
						creditoPos = creditoPos - valorCreditoPos;
						total = total + valorCreditoPos;
					}
				} else {
					System.out.println("Voce nao possui mais credito!\n");
				}
				x++;
				System.out.println("Continuar S/N?: ");
				continuar = leia.next().toUpperCase().charAt(0);

			} while (x < 3 && continuar != 'N');
			System.out.println("Movimentos finalizados!\n");

			if (creditoPos > 0) {
				System.out.println("Solicitar uso de credito?(S/N): ");
				continuar = leia.next().toUpperCase().charAt(0);
				if (continuar == 'S') {
					System.out.println("Seu credito atual e de: " + creditoPos + ". Quantos creditos deseja usar?: ");
					valorCreditoPos = leia.nextDouble();
					creditoPos = creditoPos - valorCreditoPos;
					total = total + valorCreditoPos;
				}
			}
			System.out.println("Creditos restantes: " + creditoPos);
			System.out.println("\nTotal de pontos: " + total);

		}
		
		leia.close();
	}

}
