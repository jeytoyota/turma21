package exemploPolim;

public class Teste {

	public static void main(String[] args) {


		Terceiro terceiro1 = new Terceiro("456",45,50.20,"Maria",50.50);
		terceiro1.mostrarSalario();
		
		Funcionario func = new Funcionario("4165464",45,50.20,"Jonas");
		func.mostrarSalario();
		
		Funcionario func2 = new Terceiro("545",8,20,"Kelly",15.1);
		func2.mostrarSalario();
		
		
	}

}
