package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descricao;
	
	// Métodos de acessos aos atributos
	
		public void setNome (String nome) {
			
			if (nome.length() >= 3) {
				this.nome = nome;
			}else {
				JOptionPane.showMessageDialog(null, nome + " não é um nome válido\nDeve conter pelo menos 3 LETRAS!!");
			}
			
		}
			public String getNome() {
				return nome;
			}
		public void setDescricao (String descricao) {
			
			if (descricao.length() >= 10) {
				this.descricao = descricao;
			}else {
				JOptionPane.showMessageDialog(null, descricao + " não é uma descrição válida\nDeve conter pelo menos 10 LETRAS!!");
			}
		}
			public String getDescricao() {
				return this.descricao;
			}
	
}
