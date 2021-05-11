package programas;

import classes.Basico;

public class BasicoTeste {
	
	public static void main(String[] args) {
		
		Basico alunoBasico = new Basico(111,"111.111.222-22",true,15);
		alunoBasico.adicionarNota(10);
		System.out.println("Ponto anterior: "+alunoBasico.getPontos());
		alunoBasico.bonusAniversario(15);
		System.out.println("Pontos atuais: "+alunoBasico.getPontos());
	}

}
