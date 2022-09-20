package br.senai.sp.jandira.model;

public class Endereco {

	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String complemento;
	private String estado;
	private String cep;
	
	public void setLogradouro (String logradouro) {
		this.logradouro = logradouro;
	}
	public String getLogradouro() {
		return this.logradouro;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}
	public String getBairro() {
		return this.bairro;
	}
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	public String getCidade() {
		return this.cidade;
	}
	
	public void setComplemento (String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento() {
		return this.complemento;
	}
	
	public void setEstado (String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return this.estado;
	}
	public String getCep() {
		return this.cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
