package exercicosPOO01;

public class PacienteView {
	
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente("Marcus de Oliveira",35,"Amil","123.456.789.-00","12.123.456.-1",1.50,80.00, '1');
		
		paciente.situacao();
		paciente.atendimento();
		
		System.out.println("Nome: "+paciente.getNome());
		System.out.println("Idade: "+paciente.getIdade());
		System.out.println("Convênio: "+paciente.getConvenio());
		System.out.println("CPF: "+paciente.getCpf());
		System.out.println("RG: "+paciente.getRg());
		System.out.println("Altura: "+paciente.getAltura());
		System.out.println("Peso: "+paciente.getPeso());
	}

}
