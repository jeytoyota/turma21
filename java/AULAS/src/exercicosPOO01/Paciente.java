package exercicosPOO01;

public class Paciente {
	
	private String nome;
	private int idade;
	private String convenio;
	private String cpf;
	private String rg;
	private double altura;
	private double peso;
	private boolean urgencia;
	private char estado;
	
	
	public void situacao() {
		if (estado=='1') {
			urgencia = true;
		}else {
			urgencia = false;
		}
		
	}
	
	public void atendimento() {
		if(urgencia==true) {
			System.out.println("Estado urgente!Será atendido primeiro.");
		}else {
			System.out.println("Sem urgência.Será atendido confore a fila de espera.");
		}
	}
	
	
	public Paciente(String nome, int idade, String convenio, String cpf, String rg, double altura, double peso, char estado) {
		this.nome = nome;
		this.idade = idade;
		this.convenio = convenio;
		this.cpf = cpf;
		this.rg = rg;
		this.altura = altura;
		this.peso = peso;
		this.estado=estado;
	}
	
	public Paciente() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isUrgencia() {
		return urgencia;
	}

	public void setUrgencia(boolean urgencia) {
		this.urgencia = urgencia;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}


	
	
	
	

}
