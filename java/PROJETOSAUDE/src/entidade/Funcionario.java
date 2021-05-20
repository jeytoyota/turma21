package entidade;

public abstract class Funcionario extends Pessoa {

	private String profissao;
	private String setor;
	private int codigoFuncionario;
	protected double valorHora;
	protected int horasTrabalhadas;

	public Funcionario() {

	}

	public Funcionario(String nome, int idade, String cpf, String profissao, String setor, int codigoFuncionario,
			double valorHora, int horasTrabalhadas) {
		super(nome, idade, cpf);
		this.profissao = profissao;
		this.setor = setor;
		this.codigoFuncionario = codigoFuncionario;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Funcionario(String profissao, String setor, int codigoFuncionario, double valorHora, int horasTrabalhadas) {
		super();
		this.profissao = profissao;
		this.setor = setor;
		this.codigoFuncionario = codigoFuncionario;
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas() {
		
	}

	public double calcularSalario() {
		return valorHora * horasTrabalhadas;
	}

}
