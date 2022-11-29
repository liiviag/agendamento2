package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoSaudeDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;

public class MedicoPanel extends javax.swing.JPanel {
    
    private int linha;
    
    public MedicoPanel() {
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

        setLayout(null);

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

        add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        MedicoDialog medicoDialog =
        new MedicoDialog(null, true)
                        OperacaoEnum.ADICIONAR.ADICIONAR);

        medicoDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed

        if(getLinha() != -1) {
            
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
    
        private void atualizarMedico () {
        Medico medicos = MedicoDAO.getMedico(getCodigo());
        
        MedicoDialog medicoDialog =
                new PlanoSaudeDialog(null, true, medicos,OperacaoEnum.EDITAR);
        
        medicoDialog.setVisible(true);
        preencherTabela();
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
