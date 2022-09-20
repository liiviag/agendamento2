package br.senai.sp.jandira;

import br.senai.sp.jandira.model.*;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologista");
		especialidade1.setDescricao("Cardiologista cuida do coração.");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Otorrinolaringologia cuida da garganta, ouvido, etc.");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Gastroenterologia");
		especialidade3.setDescricao("Gatroenterologista  cuida de todas as doenças relacionadas ao aparelho digestivo.");
		
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("Fisioterapeuta cuida da recuperação dos movimentos do paciente e também atua no trabalho de prevenção de lesões e doenças ocupacionais.");
		
		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Clínico Geral");
		especialidade5.setDescricao("Clínico Geral é responsável por diagnosticar doenças, desde as mais simples até as mais complexas.");
		
		
		//Criar dois médicos, com as caracteristicas a seguir:
		//O medico1 é clinico geral e cardiologista;
		//O medico2 é Fisioterapeuta, cardiologista e clinio geral
		
		
		Medico medico1 = new Medico();
		medico1.setNome("Dra. Luiza");
		Especialidade[] especialidades1 = {especialidade1, especialidade5};
		medico1.setEspecialidade(especialidades1);
		medico1.setTelefone("(11)99947-6812");
		medico1.setEmail("drluizamarechal@gmail.com");
		medico1.setCRM("125.865");
		
		Medico medico2 = new Medico();
		medico2.setNome("Dr. Sérgio");
		Especialidade[] especialidades2 = {especialidade1, especialidade4, especialidade5};
		medico2.setEspecialidade(especialidades2);
		medico2.setTelefone("(11)99853-6541");
		medico2.setEmail("drsergiomarcos@gmail.com");
		medico2.setCRM("965.157");
		
		
		//Exibir os dados dos dois médicos
		//Nome do Médico: ???
		//CRM do médico: ???
		//Especialidades: ????
		
		System.out.println();
		System.out.println("------------ LISTA DE MÉDICOS(AS)------------");
		System.out.println("Nome do(a) médico(a): " + medico1.getNome());
		System.out.println("CRM do(a) médico(a): " + medico1.getCRM());
		System.out.println("Especialidades: ");
		
		int i = 0;
		
		while (i < medico1.getEspecialidade().length) {
			System.out.println(medico1.getEspecialidade()[i].getNome());
			i++;
		}
	
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Nome do(a) médico(a): " + medico2.getNome());
		System.out.println("CRM do(a) médico(a): " + medico2.getCRM());
		System.out.println("Especialidades: ");
		
		i = 0;
		
		while (i < medico2.getEspecialidade().length) {
			System.out.println(medico2.getEspecialidade()[i].getNome() + " ");
			i++;
		}
		
		//Criar dois endereços
		
		Endereco endereco1 = new Endereco();
		
		endereco1.setLogradouro("Rua Daniela");
		endereco1.setCidade("Jandira");
		endereco1.setEstado("São Paulo");
		endereco1.setBairro("Jardim Camila");
		endereco1.setCep("03589-578");
		endereco1.setComplemento("Casa");
		endereco1.setNumero("54");
		
		
		Endereco endereco2 = new Endereco();
		
		endereco2.setLogradouro("Rua Leão de Judá");
		endereco2.setCidade("Barueri");
		endereco2.setEstado("São Paulo");
		endereco2.setBairro("Jardim das Inglesias");
		endereco2.setCep("74521-689");
		endereco2.setComplemento("Apartamento");
		endereco2.setNumero("120");
		
		//Plano de Saúde
		
		PlanoDeSaude planoSaude1 = new PlanoDeSaude();
		planoSaude1.setOperadora("Unimed");
		planoSaude1.setCategoria("Pivativo");
		planoSaude1.setNumero("0568-0398-4582");
		planoSaude1.setValidade(LocalDate.of(2022, 10, 30));
		
		PlanoDeSaude planoSaude2 = new PlanoDeSaude();
		planoSaude2.setOperadora("Allianz");
		planoSaude2.setCategoria("Aplicado 20");
		planoSaude2.setNumero("9875-6245-3568");
		planoSaude2.setValidade(LocalDate.of(2023, 9, 24));
		
		//Criar 2 pacintes.
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Daniela Lino");
		paciente1.setDataNascimento(LocalDate.of(2004, 7, 26));
		paciente1.setCpf("568.922.554-36");
		paciente1.setRg("689.489.3658");
		paciente1.setGenero("Genero Fluido");
		paciente1.setEndereco(endereco2);
		paciente1.setTelefone("(11)99958-4263");
	
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Lívia Gularte");
		paciente2.setDataNascimento(LocalDate.of(2005, 7, 27));
		paciente2.setCpf("236.589.115-02");
		paciente2.setRg("123.879.3698");
		paciente2.setGenero("Feminino");
		paciente2.setEndereco(endereco1);
		paciente2.setTelefone("(11)9985-5748");
		
		//Exibir um relatório com os dados dos pacientes
		//Nome do paciente:
		//Data de nascimento:
		//Telefone do paciente:
		//Cidade do paiente:
		//Estado de residencia:
		//Operadora do plano de saude:
		
		System.out.println();
		System.out.println("-----------LISTA DE PACIENTES---------");
		System.out.println("Nome: " + paciente1.getNome());
		System.out.println("Nascimento: " + paciente1.getDataNascimento());
		System.out.println("CPF: " + paciente1.getCpf());
		System.out.println("RG: " + paciente1.getRg());
		System.out.println("Genero: " + paciente1.getGenero());
		System.out.println("UF: " + paciente1.getEndereco().getCidade());
		System.out.println("Operadora do Plano de Saúde: " + paciente1.getPlanoSaude().getOperadora());
		
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("Nome: " + paciente2.getNome());
		System.out.println("Nascimento: " + paciente2.getDataNascimento());
		System.out.println("CPF: " + paciente2.getCpf());
		System.out.println("RG: " + paciente2.getRg());
		System.out.println("Genero: " + paciente2.getGenero());
		System.out.println("UF: " + paciente2.getEndereco().getCidade());
		System.out.println("Operadora do Plano de Saúde: " + paciente2.getPlanoSaude().getOperadora());
	
	
		// Agendar para o pacente1 uma consulta na fisioterapeuta
		//para o dia 27/09/2023 a 14h45
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidade(especialidade4);
		agenda1.setMedico(medico2);
		agenda1.setData(LocalDate.of(2022, 9, 27));
		agenda1.setHorario(LocalTime.of(15, 45));
		
		//Exibir a agenda do paciente1:
		//Data da consulta:
		//Hora da consulta:
		//Nome do médico:
		//Plano de Saúde:
		
		System.out.println();
		System.out.println("---------AGENDAMENTOS--------");
		System.out.println("Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Data: " + agenda1.getData());
		System.out.println("Horario: " + agenda1.getHorario());
		System.out.println("Dr.: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Plano de Saúde: " + agenda1.getPaciente().getPlanoSaude());
		System.out.println("Telefone: " + agenda1.getPaciente().getTelefone());
	
	}

}
