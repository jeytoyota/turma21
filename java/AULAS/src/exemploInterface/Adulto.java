package exemploInterface;

public class Adulto implements Pessoa{
	
	private int anoNiver;
	private double valorIngresso;
	private double taxa;
	
	@Override
	public int calculaIdade() {
		return 2021 - anoNiver;
	}
	
	@Override
	public double valorEntrada() {
		return valorIngresso+taxa;
	}

}
