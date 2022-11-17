package br.senai.sp.jandira.testes;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

//    public static void main(String[] args) {
//        
//        int[] a = {8, 6, 4, 8, 2};
//        int[] b =  new int [4];
//        b[0] = 55;
//        b[1] = 55;
//        b[2] = 11;
//        b[3] = 99;
//        
//        int [][] c = {{4, 6, 5}, 
//            {5, 9, 7}, 
//            {1, 13, 3}, 
//            {9, 5, 8}
//        };
//        
//        String[][] quitanda = {
//            {"Banana", "Maçã", "Uva", "Morango"},
//            {"Alface", "Couve", "Pepino", "Salsinha", "Pimentão", "Brócolis"},
//            {"Abacate", "Tomate", "Jiló", "Abobrinha"}
//        };
//        
//        System.out.println(quitanda[1][4]);
//        
//        System.out.println(c[2][1]);
//         
//        System.out.println("******************************");
//
//        Especialidade e1 = new Especialidade("Cardiologista");
//        //e1.setNome("Cardiologista");
//        e1.setDescricao("Não deixa ter um ataque");
//
//        Especialidade e2 = new Especialidade("Gatroenterologia");
//        //e2.setNome("Gatroenterologia");
//        e2.setDescricao("Não deixa ficar com dor de barriga");
//
//        Especialidade e3 = new Especialidade("Otorrino", "Cuida do Ouvido");
//
//        Especialidade e4 = new Especialidade();
//        e4.setNome("QUALQUER COISA!!");
//        e4.setDescricao("Parte da medicina que estuda as partes da pele!");
//        
//        Especialidade e5 = new Especialidade();
//        e5.setNome("Especialidade 5");
//        
//        EspecialidadeDAO.gravar(e1);
//        EspecialidadeDAO.gravar(e2);
//        
//       // System.out.println("TAMANHO ------>" + EspecialidadeDAO.getEspecialidades().size());
//        
//        
//        EspecialidadeDAO.gravar(e3);
//        EspecialidadeDAO.gravar(e4);
//       // System.out.println("TAMANHO ------>" + EspecialidadeDAO.getEspecialidades().size());
//        // System.out.println("TAMANHO ------>" + EspecialidadeDAO.getEspecialidades().size());
//        
//       //  System.out.println(EspecialidadeDAO.getEspecialidade(100).getNome());
//         
//         EspecialidadeDAO.excluir(102);
//        // System.out.println("TAMANHO --------> " + EspecialidadeDAO.getEspecialidades().size());
//         
////         System.out.println(EspecialidadeDAO.getEspecialidade(103).getNome());
//         
//         Especialidade correta =  new Especialidade("Dermatologista", "Parte da medicina que estuda as partes do rosto");
//         //e4.setNome("Dermatologia");
//        correta.setCodigo(103);
//         EspecialidadeDAO.atualizar(correta);
//         
//        // System.out.println(EspecialidadeDAO.getEspecialidade(103).getNome());
//         
//        //Exibir a quantidade de especialidades criadas até agora
//        
//        System.out.println("Total de Especialidades ------> " + e1.getContador());
//        System.out.println(e1.getCodigo() + " - " + e1.getNome());
//        System.out.println(e2.getCodigo() + " - " + e2.getNome());
//        System.out.println(e3.getCodigo() + " - " + e3.getNome());
//        System.out.println(e4.getCodigo() + " - " + e4.getNome());
//        System.out.println(e5.getCodigo() + " - " + e5.getNome());
//        
//        ArrayList<Especialidade> especialidades = new ArrayList<>();
//        especialidades.add(e1);
//        especialidades.add(e2);
//        System.out.println(especialidades.size());
//
//        // Imprimir no console das especialidades
//        // que estão armazenadas no ArrayList
//        int i = 0;
//        while (i < especialidades.size()) {
//            System.out.println(especialidades.get(i).getNome());
//            i++;
//        }
//
//        // Utilização do for para iteração
//        //for(contador; condição; acumulador) {
//        //	System.out.println();
//        //}
//        System.out.println("------------FOR---------------");
//        for (int x = 0; x < especialidades.size(); x++) {
//            System.out.println(especialidades.get(x).getNome());
//        }
//
//        // FOR EACH -> para cada
//        System.out.println("-------------FOR EACH------------");
//        for (Especialidade e : especialidades) {
//            System.out.println(e.getNome());
//        }
//
//        // Criar 3 planos de saúde, armazenar em um ArrayList
//        // e exibir o nome de cada operadora de cada um deles
//        // usando FOR EACH
//       // PlanoDeSaude p1 = new PlanoDeSaude("Amil");
//       //PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
//      //PlanoDeSaude p3 = new PlanoDeSaude("Notredame");
//
////        ArrayList<PlanoDeSaude> planos = new ArrayList<>();
////        planos.add(p1);
////        planos.add(p2);
////        planos.add(p3);
////
////        System.out.println("-------- for each planos ----------");
////        for (PlanoDeSaude e: planos) {
////            System.out.println(e.getOperadora());
////           // System.out.println(e.getQuantidade());
////        }
//
//        //PlanoDeSaude xpto = new PlanoDeSaude();
//        //PlanoDeSaude xpto1 = new PlanoDeSaude();
//        //PlanoDeSaude xpto2 = new PlanoDeSaude();
//
////        System.out.println("--------" + PlanoDeSaude.getQuantidade());
//
//        AgendaApp.main(args);
//
//      //  System.out.println("--------" + PlanoDeSaude.getQuantidade());
//
//    }

}
