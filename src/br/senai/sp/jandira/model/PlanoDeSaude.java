package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {

	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade;
	
	public PlanoDeSaude (String operadora) {
		this.operadora = operadora;
		this.quantidade++;
	}
	
	public PlanoDeSaude (String operadora, String categoria) {
            this.operadora = operadora;
            this.categoria = categoria;
            this.quantidade++;
	}
	
	public void setOperadora (String operadora) {
		this.operadora = operadora;
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
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	
}

