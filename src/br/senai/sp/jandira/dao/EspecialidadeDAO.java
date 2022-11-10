
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.transform.Source;

public class EspecialidadeDAO {
    
    private final static String URL = "C:\\Users\\22282168\\txt-agendamento\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    public static TableModel getEspecialidadesModel;

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo) {
        for(Especialidade e : especialidades){
            if(codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }
    
    public static void gravar(Especialidade e) {
        especialidades.add(e);
        
        //GRAVAR EM ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um ERRO!");
            
        }
         
    }
    
    public static void excluir(Integer codigo) {
        
        for(Especialidade e : especialidades) {
            if(codigo == e.getCodigo()){
                especialidades.remove(e);
                break;
            }
        
        }
    
    }
    
    public static void atualizar(Especialidade correta) {
        
        for(Especialidade e : especialidades) {
            if(correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
            }
        }
    
    }
    
    //Criar lista inicial de especialidades
    //O nome está na linha
    
    public static void criarListaDeEspecialidade () {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while (linha != null) {
            
            //Transformar os dados da linha em uma especialidade
            //Antes criar um vetor, pois o split retorna um vetor de 
            //String, e nele colocar o caracter que vai cortar
            //valueOf passa um vetor de string para um Integer
            String[] vetor = linha.split(";");
            Especialidade e = new Especialidade(
                    vetor[1],
                    vetor[2], 
                    Integer.valueOf(vetor[0]));
            
            
            //Guardar a especialidade na linha
            especialidades.add(e);
            
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

    //pegando os dados da especialidade
    
    public static DefaultTableModel getEspecialidadesModel () {
        
        String[] titulos = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};
        
        String[][] dados = new String [especialidades.size()][3];
        
        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }
}
