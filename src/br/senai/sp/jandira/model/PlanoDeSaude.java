package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

        private  static int contador = 1;
        private Integer codigo;
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	
	public PlanoDeSaude (String operadora) {
		this.operadora = operadora;
                this.codigo++;
                gerarCodigo();
	}
	
	public PlanoDeSaude (String operadora, 
                String categoria, String numero, 
                LocalDate validade) {
            this.operadora = operadora;
            this.categoria = categoria;
            this.numero = numero;
            this.validade = validade;
            this.codigo = codigo;
            gerarCodigo();
            
	}
        
        public PlanoDeSaude () {
            this.contador++;
            this.codigo = contador;
        }
  
	public void setOperadora (String operadora) {
		this.operadora = operadora;
                gerarCodigo();
	}
	
	public String getOperadora() {
            return this.operadora;
	}
	
	public void setCategoria (String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setValidade (LocalDate validade) {
		this.validade = validade;
	}
	public LocalDate getValidade() {
		return this.validade;
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
}

