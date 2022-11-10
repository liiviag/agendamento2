package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planos;
    private OperacaoEnum operacao;

    public PlanoSaudeDialog(
            java.awt.Frame parent,
            boolean modal, PlanoDeSaude e,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        planos = e;
        this.operacao = operacao;

        preencherFormulario();

        preencherTitulo();

    }

    public PlanoSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;

        preencherTitulo();

    }

    private void preencherFormulario() {

        jTextFieldOperadora.setText(planos.getOperadora());
        jTextFieldNumero.setText(planos.getNumero());
        jTextFieldCategoria.setText(planos.getCategoria());
        formattedTextFieldValidade.setText(planos.getValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

    private void preencherTitulo() {

        labelTitulo.setText("Plano de Saúde - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/atualizar (1).png")));
        } else {

            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png")));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDetalhesPlano = new javax.swing.JPanel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelOperadora = new javax.swing.JLabel();
        jTextFieldOperadora = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelCategoria = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabelValidade = new javax.swing.JLabel();
        formattedTextFieldValidade = new javax.swing.JFormattedTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jPanelAdicionar = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelDetalhesPlano.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDetalhesPlano.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanelDetalhesPlano.setForeground(new java.awt.Color(204, 204, 204));
        jPanelDetalhesPlano.setLayout(null);

        jLabelNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNumero.setText("Número");
        jPanelDetalhesPlano.add(jLabelNumero);
        jLabelNumero.setBounds(50, 190, 260, 20);

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        jPanelDetalhesPlano.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(50, 210, 300, 20);

        jLabelOperadora.setBackground(new java.awt.Color(0, 0, 0));
        jLabelOperadora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelOperadora.setForeground(new java.awt.Color(102, 102, 102));
        jLabelOperadora.setText("Operadora");
        jPanelDetalhesPlano.add(jLabelOperadora);
        jLabelOperadora.setBounds(50, 80, 250, 20);

        jTextFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOperadoraActionPerformed(evt);
            }
        });
        jPanelDetalhesPlano.add(jTextFieldOperadora);
        jTextFieldOperadora.setBounds(50, 100, 300, 22);

        jButtonSalvar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar-arquivo.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelDetalhesPlano.add(jButtonSalvar);
        jButtonSalvar.setBounds(510, 270, 40, 40);

        jButtonExcluir.setBackground(new java.awt.Color(255, 0, 51));
        jButtonExcluir.setForeground(new java.awt.Color(255, 51, 51));
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/botao-x.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelDetalhesPlano.add(jButtonExcluir);
        jButtonExcluir.setBounds(450, 270, 40, 40);

        jLabelCategoria.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCategoria.setText("Categoria");
        jPanelDetalhesPlano.add(jLabelCategoria);
        jLabelCategoria.setBounds(50, 140, 250, 20);

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });
        jPanelDetalhesPlano.add(jTextFieldCategoria);
        jTextFieldCategoria.setBounds(50, 160, 300, 22);

        jLabelValidade.setBackground(new java.awt.Color(0, 0, 0));
        jLabelValidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelValidade.setForeground(new java.awt.Color(102, 102, 102));
        jLabelValidade.setText("Validade");
        jPanelDetalhesPlano.add(jLabelValidade);
        jLabelValidade.setBounds(50, 250, 250, 20);

        formattedTextFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldValidadeActionPerformed(evt);
            }
        });
        jPanelDetalhesPlano.add(formattedTextFieldValidade);
        formattedTextFieldValidade.setBounds(50, 270, 300, 22);
        //Macara de formato para o input - Atualiza como esta aqui
        try{
            formattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        }catch(java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCodigo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo.setText("Código");
        jPanelDetalhesPlano.add(jLabelCodigo);
        jLabelCodigo.setBounds(50, 30, 250, 20);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanelDetalhesPlano.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(50, 50, 300, 22);

        getContentPane().add(jPanelDetalhesPlano);
        jPanelDetalhesPlano.setBounds(40, 80, 600, 340);

        jPanelAdicionar.setBackground(new java.awt.Color(255, 204, 102));
        jPanelAdicionar.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png"))); // NOI18N
        labelTitulo.setText("     Planos De Saúde - ADICIONAR");
        jPanelAdicionar.add(labelTitulo);
        labelTitulo.setBounds(130, 10, 380, 40);

        getContentPane().add(jPanelAdicionar);
        jPanelAdicionar.setBounds(0, 0, 680, 60);

        setBounds(0, 0, 694, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOperadoraActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }

    private void editar() {

        //Formatacao da data
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        planos.setCategoria(jTextFieldCategoria.getText());
        planos.setNumero(jTextFieldNumero.getText());
        planos.setOperadora(jTextFieldOperadora.getText());
        planos.setValidade(LocalDate.parse(formattedTextFieldValidade.getText(), formatted));

        PlanoSaudeDAO.atualizar(planos);

        JOptionPane.showMessageDialog(null,
                "O Plano de Saúde foi ATUALIZADO com Sucesso!!",
                "Planos",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void adicionar() {

        PlanoDeSaude planoDeSaude = new PlanoDeSaude();

        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        planoDeSaude.setCategoria(jTextFieldCategoria.getText());
        planoDeSaude.setNumero(jTextFieldNumero.getText());
        planoDeSaude.setOperadora(jTextFieldOperadora.getText());
        planoDeSaude.setValidade(LocalDate.parse(formattedTextFieldValidade.getText(), formatted));

        PlanoSaudeDAO.adicionar(planoDeSaude);

        JOptionPane.showMessageDialog(this,
                "Plano de Saúde gravado com SUCESSO!",
                "Plano de Saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }


    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void formattedTextFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldValidadeActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField formattedTextFieldValidade;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelOperadora;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JPanel jPanelAdicionar;
    private javax.swing.JPanel jPanelDetalhesPlano;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldOperadora;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
