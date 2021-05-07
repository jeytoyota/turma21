package exemplos;

import java.util.Scanner;

public class Exemplo9 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String alunos[] = {"Alexandre Salerno","Alexsander da Silva Sousa","Aline Moreira Brilhante","Ana Flávia Porto Silva Neves","Andára Finot da Silva","arthur reis allen","Barbara dos Santos","Bruno Wesley Callachi Rocha","Dafhne Noemi da Silva Novais","David da Costa Mariano","Elielthon Soares de Souza","Erika Rosany de Almeida Lima","Fabricio Siqueira Macedo","Fernando Salomão Constancio","Giovanna Cirillo Torres","Guilherme Mendes Carvalho","Guilherme Monteiro Lopes","Isabelli Santos Silva","Israel Dantas da Silva","Jessica Yuki Toyota","Jonatas Michel de Cardoso Vieira","José Luis Correia dos Santos","Juliana Brito Favero Ribeiro","Lorrans Matildes Facca","Lucas Teodoro de Sousa","Maria Luísa Maricato","Mateus Rosendo Firmino de Oliveira","Matheus de Souza Barbosa","Nathalia Beatriz Silva Pereira","Pedro Henrique de Azevedo Magalhães","Renato Novais da Silva","Renato Yukio Ossiama Nakamura","Robson de Jesus Vasconcelos","Tainah Vinha","Vinicius Martins Santos"};
		
		String matriculaLista[] = new String[35];
		
		int matricula =0;
		
		double notas[] = new double[5];
		
		for(int x =1; x<=35; x++) {
			System.out.println(matriculaLista[x] = "G8" + (x)) ;
		}
		
		for(int x=1; x<=alunos.length; x++) {
			System.out.println("Digite a matrícula: ");
			matricula = leia.nextInt(); 
			System.out.println(alunos[matricula]);
		}

	}

}
