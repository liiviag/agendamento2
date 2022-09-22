package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWhapper {

	public static void main(String[] args) {

		int a = 5;

		Integer b = 5;

		Double x = 2.9;
		
		ArrayList<Especialidade> especialidades =  new ArrayList<>();
		
		
		Especialidade e1 = new Especialidade("Cardiologista");
		//e1.setNome("Cardiologista");
		e1.setDescricao("Não deixa ter um ataque");
		
		Especialidade e2 = new Especialidade("Gatroenterologia");
		//e2.setNome("Gatroenterologia");
		e2.setDescricao("Não deixa ficar com dor de barriga");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade("Fisioterapia");
		//e3.setNome("Fisioterapia");
		e3.setDescricao("Não deixa ficar com dor nas costas");

		especialidades.add(e3);
		
		Especialidade e4 = new Especialidade();
		e4.setNome("Clinico Geral");
		e4.setDescricao("Sabe de tudo um pouco e um puco de tudo");
	
		//Especialidade[] especialidades = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade();
		e5.setNome("Pediatria");
		e5.setDescricao("Sabe cuidar das criancinhas");
		
		//especialidades[4] =
		
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(12);
		notas.add(25);
		notas.add(13);
		System.out.println(notas.size());
		
		notas.add(26);
		notas.add(42);
		System.out.println(notas.size());
		
		//Queremos ver o nome da especialidade que está
		//Na posição 3 arraylist especialidades
		System.out.println(especialidades.get(3).getNome());
		
		//Trocar o nome da especialidade que está
		//na posição 1 do arraylist especialidades
		//para "teste", exibir logo em seguida
		
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
		
		Especialidade nova = especialidades.get(2);
		System.out.println(nova.getNome());
		
		nova.setNome("Não é mais fisio");
		System.out.println(nova.getNome());
		
		Especialidade xy = new Especialidade();		
		
	}

}
