package exemploInterface;

public class Crianca implements Pessoa{
	
	private int anoNiver;
	private int valorIngresso;
	
	@Override
	public int calculaIdade() {
		return (2021 - anoNiver)*365;
	}
	
	@Override
	public double valorEntrada() {
		return valorIngresso/2;
	}


}
