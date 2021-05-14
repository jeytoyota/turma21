package exemploPolim;

public class Terceiro extends Funcionario{
	
	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, String nome, double adicional) {
		super(matricula, horasTrabalhadas, valorHora, nome);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public void mostrarSalario() {
		System.out.println("Salário: "+((horasTrabalhadas * valorHora)+adicional));
	}
	
	@Override
	public double salario() {
		return ((horasTrabalhadas * valorHora)+adicional);
	}

}
