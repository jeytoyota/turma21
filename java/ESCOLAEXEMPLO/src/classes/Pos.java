package classes;

public class Pos extends Estudante{
	
	private double credito=5.00;


	public Pos(int matricula, String cpf, double credito) {
		super(matricula, cpf);
		this.credito = credito;
	}
	
	
	
	public Pos(int matricula, String cpf, boolean status, double pontos) {
		super(matricula, cpf, status);
		
	}



	public Pos() {}

	public void pedirCreditoPos(double credito) {
		if (this.credito > 0) {		
			System.out.println(this.credito = (this.credito - credito));
			double total = super.getPontos()+credito;
			System.out.println(total);
						
	} else {
		System.out.println("Voce nao possui mais credito!\n");
			}
	}
	
	

	public double getCredito() {
		return credito;
	}



	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	

}
