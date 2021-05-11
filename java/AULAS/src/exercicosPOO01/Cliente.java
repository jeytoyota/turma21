package exercicosPOO01;

	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
	 * informações deste objeto no console.
	 */
public class Cliente {
	
	public String nome;
	public int idade;
	public String cpf;
	public char genero;
	
	
	
	public Cliente(String nome, int idade, String cpf, char genero) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
	}
	
	public Cliente() {
		
	}



	public void desconto() {
		
		if(idade>=18 && idade<50) {
			System.out.println("Você possui 10% de desconto!");
		}else if(idade>=50){
			System.out.println("Você possui 30% de desconto!");
		}else {
			System.out.println("Você possui não possui desconto!");
			}
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



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public char getGenero() {
		return genero;
	}



	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
}
