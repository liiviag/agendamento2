package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;

public class Medico {

        private static int contador;
        private Integer codigo;
	private String nome;
	private ArrayList<Especialidade> especialidades;
	private String telefone;
	private String email;
	private String crm;
        private LocalDate dataNascimento;

	public Medico(String nome) {
            this.nome = nome;
            this.codigo++;
            gerarCodigo();
	}

	public Medico(String nome, 
                String telefone,
                String email, 
                String crm,
                LocalDate dataNascimento, ArrayList <Especialidade> especalidades) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.crm = crm;
            this.dataNascimento = dataNascimento;
            this.especialidades = especialidades;
            this.codigo = codigo;
            gerarCodigo();
                     
	}
        
        public Medico(String nome,
                String telefone,
                String email, String crm, 
                LocalDate dataNascimento, Integer codigo, ArrayList<Especialidade> especialidades) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.crm = crm;
            this.dataNascimento = dataNascimento;
            this.especialidades = especialidades;
            this.codigo = codigo;
            this.contador = codigo;
        }
        
        public Medico() {
            this.contador++;
            this.codigo = contador;
        }

         public ArrayList<Especialidade> getEspecialidade() {
            return especialidades;
        }

        public void setEspecialidade(ArrayList<Especialidade> especialidades) {
             this.especialidades = especialidades;
         }
       
        //                 \\
        
         public String getNome() {
             return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCrm() {
            return crm;
        }

        public void setCrm(String crm) {
            this.crm = crm;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public static void setContador(int contador) {
        Medico.contador = contador;
        }

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCRM() {
		return crm;
	}

	public void setCRM(String crm) {
		this.crm = crm;
        }
        
        public void setDataNascimento (LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate dataNascimento() {
		return this.dataNascimento;
	}
      
         // Métodos de acessos aos atributos
    
        public int getContador() {
            return contador;
     
        }
  
         public Integer getCodigo() {
             return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }
        
         private void gerarCodigo () {
            contador++;
            this.codigo = contador;
        }
        
        public String listaToString(ArrayList<Especialidade> lista) {
        ArrayList<String> codigosEspecialidade = new ArrayList<>();
        for (Especialidade e : lista) {
            codigosEspecialidade.add(e.getCodigo().toString());
        }
        
        return String.join(";", codigosEspecialidade);
    }
        
       public String getMedicoSeparadaPorPontoEVirgula() {
           return this.codigo + ";" + 
                   this.nome + ";" + 
                   this.especialidades + ";" +
                   this.dataNascimento + ";" +
                   this.telefone + ";" + 
                   this.email  + ";" + 
                   this.crm;
       }
}
        

