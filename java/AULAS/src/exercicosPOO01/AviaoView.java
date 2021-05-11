package exercicosPOO01;

public class AviaoView {
	
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("Boing737","Branco","Grande",2,10000.50,72.00,24.00,3,"Comercial");
		
		
		System.out.println("Modelo: "+aviao.getModelo());
		System.out.println("Cor: "+aviao.getCor());
		System.out.println("Porte: "+aviao.getPorte());
		System.out.println("Qtd asas: "+aviao.getAsas());
		System.out.println("Peso: "+aviao.getPeso());
		System.out.println("Comprimento: "+aviao.getComprimento());
		System.out.println("Altura: "+aviao.getAltura());
		System.out.println("Qtd trem de pouso: "+aviao.getTremDePouso());
		System.out.println("Tipo: "+aviao.getTipo());
		
		aviao.decolar();
		aviao.rota();
		aviao.pousar();
		
	
	}

}
