package programas;

import classes.Estudante;

public class ProgramaTeste {
	
	public static void main(String[] args) {
		
		Estudante aluno = new Estudante(45789,"111.111.111-11");
		aluno.adicionarNota(9);
		
		System.out.println("Matrícula: "+aluno.getMatricula()+" Pontos: "+aluno.getPontos());
		
		
	}

}
