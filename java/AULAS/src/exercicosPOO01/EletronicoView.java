package exercicosPOO01;

public class EletronicoView {
	
	public static void main(String[] args) {
		
		Eletronico camera = new Eletronico("Camera","Canon",2000.00,"Eetronico-cameras","i9-semiProfissional","China");
		
		System.out.println("Nome: " + camera.getNome());
		System.out.println("Marca: " + camera.getMarca());
		System.out.println("Valor: " + camera.getValor());
		System.out.println("Categoria: " + camera.getCategoria());
		System.out.println("Modelo: "+ camera.getModelo());
		System.out.println("Origem: " + camera.getOrigem());
		
		System.out.println(camera.calcular(camera.getValor()));
	}

}
