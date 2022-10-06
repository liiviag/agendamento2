
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

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
    public static void criarListaDeEspecialidade () {
        Especialidade e1 = new Especialidade("Cardiologia", "Parte da medicina que cuida do coração ");
        Especialidade e2 = new Especialidade("Nefrologia", "Parte da medicina responsável por filtrar e retirar dejetos do sangue ");
        Especialidade e3 = new Especialidade("Otorrinolaringologia", "Parte da medicina responsável pelo estudo e tratamento das doenças do ouvido, nariz, garganta  ");
        Especialidade e4 = new Especialidade("Pediatria", " lida com a saúde e o atendimento médico de bebês, crianças e adolescentes");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e3);
    }
}
