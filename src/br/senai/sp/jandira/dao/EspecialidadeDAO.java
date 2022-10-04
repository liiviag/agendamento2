
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
}
