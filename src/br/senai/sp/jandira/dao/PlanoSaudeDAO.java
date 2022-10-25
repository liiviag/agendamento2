package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PlanoSaudeDAO {
    
   private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
   public static TableModel getPlanoDeSaudeModel;
   
   public static ArrayList<PlanoDeSaude> getPlanoDeSaudes() {
       return planos;
   }
   
   public static PlanoDeSaude getPlanoDeSaude(String operadora) {
       for(PlanoDeSaude e : planos) {
           if(operadora == e.getOperadora()) {
               return e;
           }
       }
       return null;
   }
   //gravar um plano de saúde
   public static void adicionar(PlanoDeSaude e) {
       planos.add(e);
   }
  
   //excluir uma operadora
   public static void excluir(String operadora) {
       for(PlanoDeSaude e : planos) {
           if(operadora == e.getOperadora()) {
               planos.remove(e);
               break;
           }
       }  
   }
   
   public static void atualizar(PlanoDeSaude correto) {
       
       for (PlanoDeSaude e : planos) {
           if(correto.getOperadora() == e.getOperadora()) {
               int posicao = planos.indexOf(e);
              planos.set(posicao, correto);
           }
       }
   }

   //Criando planos de saúde
   public static void criarListaDePlano() {
       PlanoDeSaude p1 = new PlanoDeSaude("Amil", "Premium");
       PlanoDeSaude p2 = new PlanoDeSaude("Notredame", "Premium");
       
       planos.add(p1);
       planos.add(p2);
       
   }
   
   //pegando dados da operadora
   
   public static DefaultTableModel getPlanoDeSaudeModel () {
       
       String[] titulos = {"Operadora", "Categoria", "Numero", "Validade"};
       
       String[][] dados = new String [planos.size()][3];
       
       int i = 0;
       for (PlanoDeSaude e : planos) {
           dados[i][0] = e.getOperadora().toString();
           dados[i][1] = e.getCategoria();
           dados[i][2] = e.getNumero();
           dados[i][3] = e.getValidade().toString();
           i++;
       }
       DefaultTableModel model = new DefaultTableModel(dados, titulos);
       return model;
   }
   
}

