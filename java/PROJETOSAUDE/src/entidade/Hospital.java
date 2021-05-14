package entidade;

public class Hospital {
	
	private String nome;
	private String tipo;
	private int capacidadePacientes;
	private String tipoAlas;
	private int qtdLeitos;
	private int qtdFuncionarios;
	private int qtdPacientes;
	
	
	public Hospital() {
	}


	
	public Hospital(String nome, String tipo, int capacidadePacientes, String tipoAlas, int qtdLeitos,
			int qtdFuncionarios, int qtdPacientes) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.capacidadePacientes = capacidadePacientes;
		this.tipoAlas = tipoAlas;
		this.qtdLeitos = qtdLeitos;
		this.qtdFuncionarios = qtdFuncionarios;
		this.qtdPacientes = qtdPacientes;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getCapacidadePacientes() {
		return capacidadePacientes;
	}


	public void setCapacidadePacientes(int capacidadePacientes) {
		this.capacidadePacientes = capacidadePacientes;
	}


	public String getTipoAlas() {
		return tipoAlas;
	}


	public void setTipoAlas(String tipoAlas) {
		this.tipoAlas = tipoAlas;
	}


	public int getQtdLeitos() {
		return qtdLeitos;
	}


	public void setQtdLeitos(int qtdLeitos) {
		this.qtdLeitos = qtdLeitos;
	}


	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}


	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	
	
	public int getQtdPacientes() {
		return qtdPacientes;
	}



	public void setQtdPacientes(int qtdPacientes) {
		this.qtdPacientes = qtdPacientes;
	}



	public void leitosDisponiveis() {
		if(qtdLeitos>qtdPacientes) {
			System.out.println("Leitos disponíveis: "+(qtdLeitos-qtdPacientes));
		}
		else {
			System.out.println("Leitos indisponíveis no momento... ");
		}
	}

}
