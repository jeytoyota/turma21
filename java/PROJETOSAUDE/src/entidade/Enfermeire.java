package entidade;

public class Enfermeire extends Funcionario {

	private String coren;
	private double adicionalNoturno;

	public Enfermeire() {
	}

	public Enfermeire(String nome, int idade, String cpf, String profissao, String setor, int codigoFuncionario,
			double valorHora, int horasTrabalhadas, String coren, double adicionalNoturno) {
		super(nome, idade, cpf, profissao, setor, codigoFuncionario, valorHora, horasTrabalhadas);
		this.coren = coren;
		this.adicionalNoturno = adicionalNoturno;
	}

	public Enfermeire(String profissao, String setor, int codigoFuncionario, double valorHora, int horasTrabalhadas,
			String coren, double adicionalNoturno) {
		super(profissao, setor, codigoFuncionario, valorHora, horasTrabalhadas);
		this.coren = coren;
		this.adicionalNoturno = adicionalNoturno;
	}

	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		this.coren = coren;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	@Override
	public double calcularSalario() {
		return (valorHora * horasTrabalhadas) + adicionalNoturno;
	}

}
