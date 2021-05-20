package programa;

import java.util.ArrayList;
import java.util.List;

import entidade.AuxiliarLimpeza;
import entidade.Enfermeire;
import entidade.Funcionario;
import entidade.Hospital;
import entidade.Medice;
import entidade.Paciente;


public class Programa {
	
	public static void main(String[] args) {
		
		List<Paciente> listaPaciente = new ArrayList<>();
		List<Funcionario> listaFunc = new ArrayList<>();
		
		listaPaciente.add(new Paciente("Vinicius",21,"468486","O+",false));
		listaPaciente.add( new Paciente("Dafhne",19,"656565","A+",true));
		
		listaFunc.add(new Enfermeire("Bruno",29,"564154","Enfermeiro","Cuidados gerais",52,100.10,40,"64445",205.90));
		listaFunc.add(new Medice("Malu",20,"5666552","Médica","Pediátra",53,120.10,40,"25885",205.90));
		listaFunc.add(new AuxiliarLimpeza("Jessica",25,"546226632","Auxiliar de limpeza","Serviços gerais",22,200.00,40,"sala cirurgia"));
		
		
		Hospital hospital = new Hospital("Santa Casa","Público",1000,"5 alas",800,1500,500);
		System.out.println("Nome hospital: "+hospital.getNome());
		System.out.println("Tipo hospital: "+hospital.getTipo());
		System.out.println("Total leitos do hospital: "+hospital.getQtdLeitos());
		System.out.println("Total leitos ocupados do hospital: "+hospital.getQtdPacientes());
		hospital.leitosDisponiveis();
		System.out.println();
		
		for(Paciente paciente : listaPaciente) {
			System.out.println("Nome paciente: " + paciente.getNome());
			System.out.println("Idade paciente: " + paciente.getIdade());
			System.out.println("CPF paciente: " + paciente.getCpf());
			System.out.println("Tipo sanguíneo paciente: " + paciente.getTipoSanguineo());
			System.out.println();
			
		}
		
		for(Funcionario func : listaFunc) {
			System.out.println("Nome funcionário: " + func.getNome());
			System.out.println("Idade funcionário: " + func.getIdade());
			System.out.println("CPF funcionário: " + func.getCpf());
			System.out.println("Profissão funcionário: " + func.getProfissao());
			System.out.println("Setor: " + func.getSetor());
			System.out.println("Salario: " + func.calcularSalario());
			System.out.println();
			
		}
	}
}
