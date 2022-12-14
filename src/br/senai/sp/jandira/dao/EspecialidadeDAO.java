package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.transform.Source;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282168\\txt-agendamento\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282168\\txt-agendamento\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

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
    public static ArrayList<Especialidade> getEspecialidades() { // READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
    }
    public static void excluir(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }

        atualizarArquivo();
        
    }

    private static void atualizarArquivo() {

        //Passo 01 - Criar uma representa????o de arquivos que ser??o manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {

            // Criar arquivo temporario
            arquivoTemp.createNewFile();

            // Abrir o arquivo tempor??rio para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            //no arquivo tempor??rio, exceto o registro que 
            //n??o queremos mais
            
            for(Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            
            //Excluir o arquivo atual
            arquivoAtual.delete();
            
            //Renomear p arquivo tempor??rio
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidadeAtualizada.getCodigo())) {
                especialidades.set(especialidades.indexOf(e),especialidadeAtualizada);
                break;
            }
        }
        
        atualizarArquivo();
    }

    //Criar lista inicial de especialidades
    //O nome est?? na linha
    public static void criarListaDeEspecialidade() {

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

                //Ler a pr??xima linha
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
    public static DefaultTableModel getEspecialidadesModel() {

        String[] titulos = {"C??DIGO", "NOME DA ESPECIALIDADE", "DESCRI????O"};

        String[][] dados = new String[especialidades.size()][3];

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
    
    public static DefaultListModel<Especialidade> preencherEspecialidade() {
        DefaultListModel<Especialidade> listarEspecialidade = new DefaultListModel<>();
        
        for(Especialidade listar : getEspecialidades()) {
            listarEspecialidade.addElement(listar);
            listarEspecialidade.toString();
        }
        return listarEspecialidade;
    }
}
