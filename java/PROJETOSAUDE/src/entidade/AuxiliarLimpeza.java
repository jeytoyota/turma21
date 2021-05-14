package entidade;

public class AuxiliarLimpeza extends Funcionario {

	private String ala;
	private double adicionalRisco = 0.1;

	public AuxiliarLimpeza() {

	}

	public AuxiliarLimpeza(String nome, int idade, String cpf, String profissao, String setor, int codigoFuncionario,
			double valorHora, int horasTrabalhadas, String ala, double adicionalRisco) {
		super(nome, idade, cpf, profissao, setor, codigoFuncionario, valorHora, horasTrabalhadas);
		this.ala = ala;
		this.adicionalRisco = adicionalRisco;
	}

	public AuxiliarLimpeza(String profissao, String setor, int codigoFuncionario, double valorHora,
			int horasTrabalhadas, String ala, double adicionalRisco) {
		super(profissao, setor, codigoFuncionario, valorHora, horasTrabalhadas);
		this.ala = ala;
		this.adicionalRisco = adicionalRisco;
	}
	

	public AuxiliarLimpeza(String nome, int idade, String cpf, String profissao, String setor, int codigoFuncionario,
			double valorHora, int horasTrabalhadas, String ala) {
		super(nome, idade, cpf, profissao, setor, codigoFuncionario, valorHora, horasTrabalhadas);
		this.ala = ala;
	}

	public AuxiliarLimpeza(String ala) {
		super();
		this.ala = ala;
	}

	public String getAla() {
		return ala;
	}

	public void setAla(String ala) {
		this.ala = ala;
	}

	public double getAdicionalRisco() {
		return adicionalRisco;
	}

	public void setAdicionalRisco(double adicionalRisco) {
		this.adicionalRisco = adicionalRisco;
	}

	@Override
	public double calcularSalario() {
		return ((valorHora * horasTrabalhadas) * adicionalRisco) + (valorHora * horasTrabalhadas);
	}

}
