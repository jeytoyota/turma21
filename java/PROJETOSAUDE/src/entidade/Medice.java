package entidade;

public class Medice extends Funcionario {

	private String crm;
	private double valorTotalExtra;

	public Medice() {
		super();
	}

	public Medice(String nome, int idade, String cpf, String profissao, String setor, int codigoFuncionario,
			double valorHora, int horasTrabalhadas, String crm, double valorTotalExtra) {
		super(nome, idade, cpf, profissao, setor, codigoFuncionario, valorHora, horasTrabalhadas);
		this.crm = crm;
		this.valorTotalExtra = valorTotalExtra;
	}

	public Medice(String profissao, String setor, int codigoFuncionario, double valorHora, int horasTrabalhadas,
			String crm, double valorTotalExtra) {
		super(profissao, setor, codigoFuncionario, valorHora, horasTrabalhadas);
		this.crm = crm;
		this.valorTotalExtra = valorTotalExtra;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public double getValorTotalExtra() {
		return valorTotalExtra;
	}

	public void setValorTotalExtra(double valorTotalExtra) {
		this.valorTotalExtra = valorTotalExtra;
	}

	@Override
	public double calcularSalario() {
		return (valorHora * horasTrabalhadas) + valorTotalExtra;
	}

}
