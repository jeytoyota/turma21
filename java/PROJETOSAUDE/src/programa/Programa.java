package programa;

import java.util.ArrayList;
import java.util.List;

import entidade.AuxiliarLimpeza;
import entidade.Enfermeire;
import entidade.Funcionario;
import entidade.Hospital;
import entidade.Medice;

public class Programa {
	
	public static void main(String[] args) {
		
		List<Funcionario> listaFunc = new ArrayList<>();
		
		listaFunc.add(new Enfermeire("Bruno",29,"564154","Enfermeiro","Cuidados gerais",52,100.10,40,"64445",205.90));
		listaFunc.add(new Medice("Malu",20,"5666552","Médica","Pediátra",53,120.10,40,"25885",205.90));
		listaFunc.add(new AuxiliarLimpeza("Jessica",25,"546226632","Auxiliar de limpeza","Serviços gerais",22,200.00,40,"sala cirurgia"));
		
		for(Funcionario funcio : listaFunc) {
			System.out.println(funcio.getNome());
			
		}
		
		Hospital hospital = new Hospital("Santa Casa","Público",1000,"5 alas",800,1500);
		hospital.leitosDisponiveis(500);
	}
}
