package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private  static int contador = 1;
    private Integer codigo;
    private String nome;
    private String descricao;

    //Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }
    //somente no contador, que for executar o arquivo
    public Especialidade(String nome, String descricao, Integer codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.contador = codigo;
    }
    
    public Especialidade() { //Construtor Default / Padrão 
        gerarCodigo();
    }
    
    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
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
    
    
    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido\nDeve conter pelo menos 3 LETRAS!!");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {

        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, descricao + " não é uma descrição válida\nDeve conter pelo menos 10 LETRAS!!");
        }
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    public String getEspecialidadeSeparadaPorPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }

}
