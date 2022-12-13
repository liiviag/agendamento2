package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MedicoDAO {
    
    private final static String URL = "C:\\Users\\22282168\\txt-agendamento\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282168\\txt-agendamento\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    
    
    public static void gravar(Medico e) {
        medicos.add(e);
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, 
                    StandardOpenOption.APPEND, 
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getMedicoSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, 
                    "Ocorreu um ERRO!");
        }
    }
    
    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }
    
    public static Medico getMedico(Integer codigo) {
        for (Medico e : medicos) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        
        return null;
    }    
    public static void excluir(Integer codigo) {
        
        for(Medico e : medicos) {
            if (e.getCodigo().equals(codigo)) {
                medicos.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }
     private static void atualizarArquivo() {

        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(Medico e : medicos) {
                bwTemp.write(e.getMedicoSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void atualizar(Medico medicoAtualizado) {

        for (Medico e : medicos) {
            if (e.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(e),medicoAtualizado);
                break;
            }
        }
        
        atualizarArquivo();
    }
    
    public static ArrayList<Especialidade> separarEspecialidade(String linha) {
        String[] vetor = linha.split(";");
        int codigoEsp = 6;
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        
        while(vetor.length > codigoEsp) {
            especialidades.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[codigoEsp])));
            codigoEsp++;
        }
        return especialidades;
    }
        public static void criarListaDeMedico () {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                
            String[] vetor = linha.split(";");
            
            Especialidade especialidade = new Especialidade();
                
            Medico e = new Medico(
                        vetor[1],
                        vetor[2],
                        vetor[4],
                        vetor[5],
                        LocalDate.parse(vetor[3]),
                        Integer.valueOf(vetor[0]), separarEspecialidade(linha));

                //Guardar a especialidade na linha
                medicos.add(e);

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
   
        public static DefaultListModel<Especialidade> getEspModel() {
            
            DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
            
            try {
                BufferedReader leitor = Files.newBufferedReader(PATH);
                
                String linha = leitor.readLine();
                
                for (Especialidade e : separarEspecialidade(linha)) {
                    especialidadesLista.addElement(e);
                }
                   leitor.close();
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            }
            
            return especialidadesLista;
        }
    
         public static DefaultTableModel getMedicoModel() {

        String[] titulos = {"CÓDIGO", "NOME", "TELEFONE", "CRM"};

        String[][] dados = new String[medicos.size()][4];

        int i = 0;
        for (Medico e : medicos) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getTelefone();
            dados[i][3] = e.getCRM();
            
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);

        return model;
    }

}     

