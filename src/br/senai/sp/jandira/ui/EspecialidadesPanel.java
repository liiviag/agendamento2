
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EspecialidadesPanel extends javax.swing.JPanel {

    private int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidade();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAdicionar = new javax.swing.JButton();
        buttonAtualizar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        scroolEspecilidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Especialidades"));
        setPreferredSize(new java.awt.Dimension(800, 330));
        setLayout(null);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Atualizar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(610, 250, 70, 70);

        buttonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/atualizar (1).png"))); // NOI18N
        buttonAtualizar.setToolTipText("Editar");
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });
        add(buttonAtualizar);
        buttonAtualizar.setBounds(690, 250, 70, 70);

        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira-de-reciclagem.png"))); // NOI18N
        buttonExcluir.setToolTipText("Apagar");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(530, 250, 70, 70);

        tableEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scroolEspecilidades.setViewportView(tableEspecialidades);

        add(scroolEspecilidades);
        scroolEspecilidades.setBounds(40, 20, 710, 220);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
      
        if (getLinha() != -1) {
            excluirEspecialidade();
        }else {
            JOptionPane.showMessageDialog(this, "Por Favor, selecione a "
                    + "epecialidade que você deseja excluir!", 
                    "EXCLUIR", JOptionPane.OK_OPTION);
        
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
  
       if(getLinha() != -1) {
           editarEspecialidade();
       } else {
           JOptionPane.showConfirmDialog(this,
                   "Por Favor, selecione a especialidade que você deseja editar!",
                   "Especialidades",
                   JOptionPane.WARNING_MESSAGE);
       }
    
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    
    
    //Editar Especialidades
    
    private void editarEspecialidade() {
       Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadeDialog especialidadeDialog =
                new EspecialidadeDialog(null, true, especialidade,OperacaoEnum.EDITAR);
        
        especialidadeDialog.setVisible(true);
        preencherTabela();
    }
    
    //Excluir Especialidade
    
    private void excluirEspecialidade() {
    

    int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão?", "Atenção", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
    
    if(resposta == 0) {
       
        EspecialidadeDAO.excluir(getCodigo());
        preencherTabela(); 
     }
    
    }
    
    //Método Código
    
    private Integer getCodigo(){
        
    String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
    Integer codigo = Integer.valueOf(codigoStr);
    return codigo;
    
    }
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
       
        EspecialidadeDialog especialidadeDialog =  
                new EspecialidadeDialog(null, true, OperacaoEnum.ADICIONAR);
       
       especialidadeDialog.setVisible(true);
       preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane scroolEspecilidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

private void preencherTabela() {
 
       tableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesModel());
       ajustarTabela();
   }

    private void ajustarTabela() {
    
        //Impedir que o usuario movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);
        
        //Bloquaer as ediçoes das células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);
        
       //Definir a largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(500);
    }


}
