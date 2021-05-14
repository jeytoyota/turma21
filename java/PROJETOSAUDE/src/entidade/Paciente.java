package entidade;

public class Paciente extends Pessoa{
	
	private String tipoSanguineo;
	private boolean emergencia;
	
	public Paciente() {
		
	}

	public Paciente(String nome, int idade, String cpf) {
		super(nome, idade, cpf);
	}
	
	

	public Paciente(String nome, int idade, String cpf, String tipoSanguineo, boolean emergencia) {
		super(nome, idade, cpf);
		this.tipoSanguineo = tipoSanguineo;
		this.emergencia = emergencia;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public boolean isEmergencia() {
		return emergencia;
	}

	public void setEmergencia(boolean emergencia) {
		this.emergencia = emergencia;
	}
	
	

}
