
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.lang.management.ManagementFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanoSaudePanel extends javax.swing.JPanel {

       private int linha;
    
    public PlanoSaudePanel() {
        initComponents();
        PlanoSaudeDAO.criarListaDePlano();
        preencherTabela();
    }

    private int getLinha() {
        linha = tablePlanos.getSelectedRow();
        return linha;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonAdicionar = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        scroolPlanos = new javax.swing.JScrollPane();
        tablePlanos = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Planos de Saúde"));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 330));
        jPanel1.setLayout(null);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Editar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionar);
        buttonAdicionar.setBounds(610, 250, 70, 70);

        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/atualizar (1).png"))); // NOI18N
        buttonAtualizar.setToolTipText("Atualizar");
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAtualizar);
        buttonAtualizar.setBounds(690, 250, 70, 70);

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira-de-reciclagem.png"))); // NOI18N
        buttonExcluir.setToolTipText("Apagar");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExcluir);
        buttonExcluir.setBounds(530, 250, 70, 70);

        tablePlanos.setBackground(new java.awt.Color(204, 204, 204));
        tablePlanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroolPlanos.setViewportView(tablePlanos);

        jPanel1.add(scroolPlanos);
        scroolPlanos.setBounds(40, 20, 710, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        PlanoSaudeDialog planoDialog =
        new PlanoSaudeDialog(null, 
                true, 
                OperacaoEnum.ADICIONAR);

        planoDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed

        if(getLinha() != -1) {
            atualizarPlano();
        } else {
            JOptionPane.showConfirmDialog(this,
                "Por Favor, selecione o que você deseja editar!",
                "Plano De Saúde",
                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        if (getLinha() != -1) {
            excluirPlano();
        }else {
            JOptionPane.showMessageDialog(
                    this, 
                    "Por Favor, selecione o "
                + "plano que você deseja excluir!",
                "EXCLUIR", JOptionPane.OK_OPTION);

        }
    }
        
    //Excluir Plano
    
    private void excluirPlano() {
    

    int resposta = JOptionPane.showConfirmDialog(this, 
            "Você confirma a exclusão?", 
            "Atenção", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
    
    if(resposta == 0) {
       
        PlanoSaudeDAO.excluir(getCodigo());
        preencherTabela(); 
     }
    
    }
 
     //Método Código
    
    private Integer getCodigo(){
        
    String codigoStr = tablePlanos.getValueAt(getLinha(), 0).toString();
    Integer codigo = Integer.valueOf(codigoStr);
    return codigo;
    
    }//GEN-LAST:event_buttonExcluirActionPerformed

      
    //Editar Especialidades
    
    private void atualizarPlano () {
        PlanoDeSaude planos = PlanoSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanoSaudeDialog planoSaudeDialog =
                new PlanoSaudeDialog(null, true, planos,OperacaoEnum.EDITAR);
        
        planoSaudeDialog.setVisible(true);
        preencherTabela();
    }
    
    //Método Operadora
    
      private void preencherTabela() {
 
       tablePlanos.setModel(PlanoSaudeDAO.getPlanoDeSaudeModel());
       ajustarTabela();
   }
    
    private void ajustarTabela() {
        
        //Impedir que o usuario movimente as colunas
        tablePlanos.getTableHeader().setReorderingAllowed(false);
        
        //Bloquaer as ediçoes das células da tabela
        tablePlanos.setDefaultEditor(Object.class, null);
        
        //Tamanho das colunas
        tablePlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanos.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablePlanos.getColumnModel().getColumn(1).setPreferredWidth(160);
        tablePlanos.getColumnModel().getColumn(2).setPreferredWidth(160);
        tablePlanos.getColumnModel().getColumn(3).setPreferredWidth(160);
        tablePlanos.getColumnModel().getColumn(4).setPreferredWidth(160);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroolPlanos;
    private javax.swing.JTable tablePlanos;
    // End of variables declaration//GEN-END:variables
}
