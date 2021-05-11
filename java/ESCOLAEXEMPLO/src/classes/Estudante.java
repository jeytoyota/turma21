package classes;

public class Estudante {
	
	private int matricula;
	private String cpf;
	private boolean status;
	private double pontos;
	private char continuar;
	
	
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}


	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}


	public Estudante(int matricula, String cpf, boolean status, double pontos) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
		this.pontos = pontos;
	}


	public Estudante() {
		super();
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public double getPontos() {
		return pontos;
	}
	
	

	public char getContinuar() {
		return continuar;
	}


	public void setContinuar(char continuar) {
		this.continuar = continuar;
	}


	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	public void tirarNota(double pontos) {
		if(this.getPontos()> pontos)
		this.pontos = this.pontos - pontos;
		else {
			System.out.println("Não é possível tirar essa nota.");
		}
	}
	
	

}
