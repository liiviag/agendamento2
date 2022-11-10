package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DateFormatter;

public class PlanoSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282168\\txt-agendamento\\PlanoSaude.txt";
    private final static Path PATH = Paths.get(URL);
    
   private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
   public static TableModel getPlanoDeSaudeModel;
   
   public static ArrayList<PlanoDeSaude> getPlanoDeSaudes() {
       return planos;
   }
   
   public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
       for(PlanoDeSaude e : planos) {
           if(e.getCodigo() == codigo) {
               return e;
           }
       }
       return null;
   }
   
   //gravar um plano de saúde
   public static void adicionar(PlanoDeSaude e) {
       planos.add(e);
       
       //GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getPlanoDeSaudeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um ERRO!");
            
        }
   }
  
   //excluir uma operadora
   public static void excluir(Integer codigo) {
       for(PlanoDeSaude e : planos) {
           if(codigo == e.getCodigo()) {
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

   //Criar lista inicial de especialidades
    //O nome está na linha
    
    public static void criarListaDePlanos () {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while (linha != null) {
            
            //Transformar os dados da linha em um plano
            //Antes criar um vetor, pois o split retorna um vetor de 
            //String, e nele colocar o caracter que vai cortar
            //mudar o localdate 
            //valueOf passa um vetor de string para um Integer
            String[] vetor = linha.split(";");
            
            String[] data = vetor[3].split("/");
            PlanoDeSaude e = new PlanoDeSaude(
                    vetor[0],
                    vetor[1], 
                    vetor[2],
                    LocalDate.of(Integer.parseInt(data[2]), 
                            Integer.parseInt(data[1]), 
                            Integer.parseInt(data[0])),
                    Integer.valueOf(vetor[4]));
            
            
            //Guardar a especialidade na linha
            planos.add(e);
            
            //Ler a próxima linha
            linha = leitor.readLine();
        }
            
            //Fechar o arquivo
            leitor.close();
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Ocorreu um ero ao ler o arquivo!!");
        }
    }
    
   //Criando planos de saúde
   public static void criarListaDePlano() {
       PlanoDeSaude p1 = new PlanoDeSaude("Amil", "Premium", "158742", LocalDate.of(2005, 5, 1));
       
       planos.add(p1);
       
       
   }
   
   //pegando dados da operadora
   
   public static DefaultTableModel getPlanoDeSaudeModel () {
       
       String[] titulos = {"Codigo", "Operadora", "Categoria", "Numero", "Validade"};
       
       String[][] dados = new String [planos.size()][5];
       
       int i = 0;
       for (PlanoDeSaude e : planos) {
           dados[i][0] = e.getCodigo().toString();
           dados[i][1] = e.getOperadora();
           dados[i][2] = e.getCategoria();
           dados[i][3] = e.getNumero();
           DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyy");
           dados[i][4] = e.getValidade().format(formatacao);
         i++;  
       }
       return new DefaultTableModel(dados, titulos);
       
   }
   
}

