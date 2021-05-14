package exemploPolim;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Locale.setDefault(Locale.US);	
		Terceiro terceiro1 = new Terceiro("456",45,50.20,"Maria",50.50);
		terceiro1.mostrarSalario();
		System.out.println("Nome: "+terceiro1.getNome());
		
		Funcionario func = new Funcionario("4165464",45,50.20,"Jonas");
		func.mostrarSalario();
		
		Funcionario func2 = new Terceiro("545",8,20,"Kelly",15.1);
		func2.mostrarSalario();
		
		List<Funcionario> lista = new ArrayList<>();
		
		for(int x=1; x<=3; x++) {
			System.out.println("Digite 1-Func 2-Func Terceiro: ");
			char op = leia.next().charAt(0);
			
			System.out.println("Digite seu nome: ");
			String nome = leia.next();
			
			System.out.println("Digite sua matrícula: ");
			String matricula = leia.next();
			
			System.out.println("Valor hora: ");
			double salario = leia.nextDouble();
			
			System.out.println("Digite as horas trabalhadas: ");
			int horas = leia.nextInt();
			
			
			if(op =='2') {
				System.out.println("Valor bonus: ");
				double bonus = leia.nextDouble();
				lista.add(new Terceiro(matricula, horas, salario, nome, bonus));
			}
			else {
				lista.add(new Funcionario(matricula, horas, salario, nome));
			}
		}
		
		

		
		for(Funcionario funcio : lista) {
			System.out.println(funcio.getNome()+" seu salario é R$ " );
			funcio.mostrarSalario();
		}
		
		
		
		
		

		
		leia.close();
		
	}

}
