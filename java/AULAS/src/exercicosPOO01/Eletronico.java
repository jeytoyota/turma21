package exercicosPOO01;

public class Eletronico {
	
	
	private String nome;
	private String marca;
	private double valor;
	private String categoria;
	private String modelo;
	private String origem;
	
	public double calcular(double valorTotal) {
		return valorTotal = valor * 0.3 + valor;
	}
	
	
	public Eletronico(String nome, String marca, double valor, String categoria, String modelo, String origem) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.categoria = categoria;
		this.modelo = modelo;
		this.origem = origem;
	}
	
	public Eletronico() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	
	

}
