package exercicosPOO01;

/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações 
 * deste objeto no console.
 */

public class Aviao {
	
	private String modelo;
	private String cor;
	private String porte;
	private int asas;
	private double peso;
	private double comprimento;
	private double altura;
	private int tremDePouso;
	private String tipo;
	

	public void decolar() {
		System.out.println("Iniciar a decolagem. Decolando....");
	}
	
	public void rota() {
		System.out.println("Seguindo rota para paíse de destino: França.");
	}
	
	public void pousar() {
		System.out.println("Iniciar o procedimento de pouso.");
	}
	
	
	public Aviao() {
		
	}


	public Aviao(String modelo, String cor, String porte, int asas, double peso, double comprimento, double altura,
			int tremDePouso, String tipo) {
		this.modelo = modelo;
		this.cor = cor;
		this.porte = porte;
		this.asas = asas;
		this.peso = peso;
		this.comprimento = comprimento;
		this.altura = altura;
		this.tremDePouso = tremDePouso;
		this.tipo = tipo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public int getAsas() {
		return asas;
	}


	public void setAsas(int asas) {
		this.asas = asas;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public int getTremDePouso() {
		return tremDePouso;
	}


	public void setTremDePouso(int tremDePouso) {
		this.tremDePouso = tremDePouso;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
