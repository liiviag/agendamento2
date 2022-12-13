package br.senai.sp.jandira.ui;


import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoSaudeDAO;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {
    
    private int linha;
    
    public MedicoPanel() {
        initComponents();
        MedicoDAO.criarListaDeMedico();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMedicos = new javax.swing.JPanel();
        buttonAdicionar = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        scroolMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();

        setLayout(null);

        jPanelMedicos.setBorder(javax.swing.BorderFactory.createTitledBorder("Planos de Saúde"));
        jPanelMedicos.setPreferredSize(new java.awt.Dimension(800, 330));
        jPanelMedicos.setLayout(null);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Editar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        jPanelMedicos.add(buttonAdicionar);
        buttonAdicionar.setBounds(610, 250, 70, 70);

        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/atualizar (1).png"))); // NOI18N
        buttonAtualizar.setToolTipText("Atualizar");
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });
        jPanelMedicos.add(buttonAtualizar);
        buttonAtualizar.setBounds(690, 250, 70, 70);

        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira-de-reciclagem.png"))); // NOI18N
        buttonMedicos.setToolTipText("Apagar");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        jPanelMedicos.add(buttonMedicos);
        buttonMedicos.setBounds(530, 250, 70, 70);

        tableMedicos.setBackground(new java.awt.Color(204, 204, 204));
        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scroolMedicos.setViewportView(tableMedicos);

        jPanelMedicos.add(scroolMedicos);
        scroolMedicos.setBounds(40, 20, 710, 220);

        add(jPanelMedicos);
        jPanelMedicos.setBounds(0, 0, 790, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        MedicoDialog medicoDialog =
        new MedicoDialog(null, true, OperacaoEnum.ADICIONAR); 

        medicoDialog.setVisible(true);
        preencherTabela();
      
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed

        if(getLinha() != -1) {
            atualizarMedico();
        } else {
            JOptionPane.showConfirmDialog(this,
                "Por Favor, selecione o que você deseja editar!",
                "Médico",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed

        if (getLinha() != -1) {
            excluirMedico();
        }else {
            JOptionPane.showMessageDialog(
                this,
                "Por Favor, selecione o "
                + "médico que você deseja excluir!",
                "EXCLUIR", JOptionPane.OK_OPTION);

        }
        }

        private void excluirMedico() {

            int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if(resposta == 0) {

                MedicoDAO.excluir(getCodigo());
                preencherTabela();
            }

        }

        //Método Código

        private Integer getCodigo(){

            String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
            Integer codigo = Integer.valueOf(codigoStr);
            return codigo;

    }//GEN-LAST:event_buttonMedicosActionPerformed

        //Editar Especialidades
    
        private void atualizarMedico () {
        Medico medicos = MedicoDAO.getMedico(getCodigo());
        
        MedicoDialog medicoDialog =
                new MedicoDialog(null, true, medicos,OperacaoEnum.EDITAR);
        
        medicoDialog.setVisible(true);
        preencherTabela();
    }
        
       
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JPanel jPanelMedicos;
    private javax.swing.JScrollPane scroolMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
 
       tableMedicos.setModel(MedicoDAO.getMedicoModel());
       ajustarTabela();
   }

    private void ajustarTabela() {
        
        //Impedir que o usuario movimente as colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        
        //Bloquaer as ediçoes das células da tabela
        tableMedicos.setDefaultEditor(Object.class, null);
        
        //Tamanho das colunas
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(170);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(180);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(180);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(180);
    }
}
