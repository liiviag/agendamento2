
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;
    
    public EspecialidadeDialog(
            java.awt.Frame parent, 
            boolean modal, Especialidade e,
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        this.operacao = operacao;
        
        preencherFormulario();
        
        preencherTitulo();
        
    }
    
    public EspecialidadeDialog(
            java.awt.Frame parent, 
            boolean modal,
            OperacaoEnum operacao) {
           
     super(parent, modal);
     initComponents();
     this.operacao = operacao;
   
     preencherTitulo();
        
    }

    private void preencherFormulario() {
   
       jTextFieldCodigo.setText(especialidade.getCodigo().toString());
       jTextFieldNomeEspec.setText(especialidade.getNome());
       jTextFieldDescricao.setText(especialidade.getDescricao());
       
    }
    
    private void preencherTitulo() {
        
     labelTitulo.setText("Especialidade - " + operacao);
     
     if(operacao == OperacaoEnum.EDITAR) {
     labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/atualizar (1).png")));
     } else {
    
     labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png")));
     }
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdicionar = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanelDetalhesEspec = new javax.swing.JPanel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomeEspec = new javax.swing.JLabel();
        jTextFieldNomeEspec = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExclur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelAdicionar.setBackground(new java.awt.Color(255, 204, 102));
        jPanelAdicionar.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png"))); // NOI18N
        labelTitulo.setText("     Especialidades - ADICIONAR");
        jPanelAdicionar.add(labelTitulo);
        labelTitulo.setBounds(130, 10, 380, 40);

        getContentPane().add(jPanelAdicionar);
        jPanelAdicionar.setBounds(0, 0, 680, 60);

        jPanelDetalhesEspec.setBackground(new java.awt.Color(204, 204, 204));
        jPanelDetalhesEspec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanelDetalhesEspec.setForeground(new java.awt.Color(204, 204, 204));
        jPanelDetalhesEspec.setLayout(null);

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescricao.setText("Descrição da Especialidade");
        jPanelDetalhesEspec.add(jLabelDescricao);
        jLabelDescricao.setBounds(50, 210, 260, 20);

        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });
        jPanelDetalhesEspec.add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(50, 230, 300, 20);

        jLabelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo.setText("Código");
        jPanelDetalhesEspec.add(jLabelCodigo);
        jLabelCodigo.setBounds(50, 70, 130, 20);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanelDetalhesEspec.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(50, 90, 110, 22);

        jLabelNomeEspec.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNomeEspec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNomeEspec.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNomeEspec.setText("Nome da Especialidade");
        jPanelDetalhesEspec.add(jLabelNomeEspec);
        jLabelNomeEspec.setBounds(50, 140, 250, 20);

        jTextFieldNomeEspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeEspecActionPerformed(evt);
            }
        });
        jPanelDetalhesEspec.add(jTextFieldNomeEspec);
        jTextFieldNomeEspec.setBounds(50, 160, 300, 22);

        jButtonSalvar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar-arquivo.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelDetalhesEspec.add(jButtonSalvar);
        jButtonSalvar.setBounds(510, 270, 40, 40);

        jButtonExclur.setBackground(new java.awt.Color(255, 0, 51));
        jButtonExclur.setForeground(new java.awt.Color(255, 51, 51));
        jButtonExclur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/botao-x.png"))); // NOI18N
        jButtonExclur.setToolTipText("Excluir");
        jButtonExclur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExclurActionPerformed(evt);
            }
        });
        jPanelDetalhesEspec.add(jButtonExclur);
        jButtonExclur.setBounds(450, 270, 40, 40);

        getContentPane().add(jPanelDetalhesEspec);
        jPanelDetalhesEspec.setBounds(40, 80, 600, 340);

        setBounds(0, 0, 694, 484);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldNomeEspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeEspecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeEspecActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      
      if(operacao == OperacaoEnum.ADICIONAR) {
          adicionar();
      } else {
          editar();
      }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
    private void editar () {
        especialidade.setNome(jTextFieldNomeEspec.getText());
        especialidade.setDescricao(jTextFieldDescricao.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null, 
                "A especialidade foi ATUALIZADA com sucesso!!", 
                "Especialidades", 
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    
    private void adicionar() {
      // Criar um objeto Especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(jTextFieldNomeEspec.getText());
        novaEspecialidade.setDescricao(jTextFieldDescricao.getText());
        
        //Gravar o objeto, atraves do DAO
        EspecialidadeDAO.gravar(novaEspecialidade);
        
        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com SUCESSO", 
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }
    private void jButtonExclurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExclurActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExclurActionPerformed

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExclur;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNomeEspec;
    private javax.swing.JPanel jPanelAdicionar;
    private javax.swing.JPanel jPanelDetalhesEspec;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNomeEspec;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
