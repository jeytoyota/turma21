package exemploPolim;

public class Funcionario {
	
	private String matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	private String nome;
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora, String nome) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.nome = nome;
	}

	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void mostrarSalario() {
		System.out.println("Salário: "+(horasTrabalhadas * valorHora));
	}
	
	public double salario() {
		return (horasTrabalhadas * valorHora);
	}

}
