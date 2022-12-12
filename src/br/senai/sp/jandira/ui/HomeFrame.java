
package br.senai.sp.jandira.ui;

import java.awt.Toolkit;
import java.util.Locale;

public class HomeFrame extends javax.swing.JFrame {

    private EspecialidadesPanel especialidadesPanel;
    
    private final int POS_X = 50;
    private final int POS_Y = 200;
    private final int LARGURA = 800;
    private final int ALTURA = 330;
    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/entrega-agendada.png")));
        initPanels();
    }
    
    private PlanoSaudePanel planosPanel;
    private MedicoPanel medicoPanel;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelSistemaAgendas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonMedico = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonPlanoSaude = new javax.swing.JButton();
        buttonSairEspecialidades = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        separatorEspecialidades1 = new javax.swing.JSeparator();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamentos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(null);

        labelSistemaAgendas.setBackground(new java.awt.Color(0, 0, 0));
        labelSistemaAgendas.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        labelSistemaAgendas.setForeground(new java.awt.Color(102, 102, 102));
        labelSistemaAgendas.setText("Sistema de Agendamento de Consulta");
        jPanel1.add(labelSistemaAgendas);
        labelSistemaAgendas.setBounds(230, 30, 500, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/registo-medico (3).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 0, 64, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 70);

        buttonMedico.setBackground(new java.awt.Color(102, 102, 102));
        buttonMedico.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonMedico.setForeground(new java.awt.Color(255, 255, 255));
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/equipe-medica (1).png"))); // NOI18N
        buttonMedico.setText("Médicos");
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(290, 130, 120, 40);

        buttonAgenda.setBackground(new java.awt.Color(102, 102, 102));
        buttonAgenda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonAgenda.setForeground(new java.awt.Color(255, 255, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/entrega-agendada.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(40, 130, 110, 40);

        buttonEspecialidades.setBackground(new java.awt.Color(102, 102, 102));
        buttonEspecialidades.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/apresentacao.png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(420, 130, 160, 40);

        buttonPaciente.setBackground(new java.awt.Color(102, 102, 102));
        buttonPaciente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonPaciente.setForeground(new java.awt.Color(255, 255, 255));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente (1).png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPaciente);
        buttonPaciente.setBounds(160, 130, 120, 40);

        buttonPlanoSaude.setBackground(new java.awt.Color(102, 102, 102));
        buttonPlanoSaude.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        buttonPlanoSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanoSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano-de-saude.png"))); // NOI18N
        buttonPlanoSaude.setText("Plano de Saúde");
        buttonPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoSaude);
        buttonPlanoSaude.setBounds(590, 130, 170, 40);

        buttonSairEspecialidades.setBackground(new java.awt.Color(255, 0, 0));
        buttonSairEspecialidades.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        buttonSairEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonSairEspecialidades.setText("SAIR");
        getContentPane().add(buttonSairEspecialidades);
        buttonSairEspecialidades.setBounds(840, 130, 70, 40);

        panelHome.setBackground(new java.awt.Color(204, 204, 204));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(255, 255, 255));
        panelHome.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("SISACON");
        panelHome.add(jLabel2);
        jLabel2.setBounds(60, 30, 140, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema de Agendamento de Consultas");
        panelHome.add(jLabel3);
        jLabel3.setBounds(50, 70, 460, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setText("Suporte Técnico:");
        panelHome.add(jLabel4);
        jLabel4.setBounds(610, 150, 150, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail: sisacon@gmail.com");
        panelHome.add(jLabel5);
        jLabel5.setBounds(610, 190, 170, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone: (11)99855-8456");
        panelHome.add(jLabel6);
        jLabel6.setBounds(610, 210, 150, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("www.sisacon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(630, 230, 120, 16);
        panelHome.add(separatorEspecialidades1);
        separatorEspecialidades1.setBounds(30, 100, 750, 10);

        getContentPane().add(panelHome);
        panelHome.setBounds(50, 200, 800, 330);

        buttonHome.setBackground(new java.awt.Color(204, 255, 204));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pagina-inicial (2).png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 80, 40, 30);

        setBounds(0, 0, 938, 708);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        medicoPanel.setVisible(true);
        panelHome.setVisible(false);
        planosPanel.setVisible(false);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        
         buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 204));
         buttonHome.setBackground(new java.awt.Color(246, 246, 246));
         panelHome.setVisible(false);
         especialidadesPanel.setVisible(true);
         planosPanel.setVisible(false);
         medicoPanel.setVisible(false);
         
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoSaudeActionPerformed
        panelHome.setVisible(false);
        planosPanel.setVisible(true);
        especialidadesPanel.setVisible(false);
        medicoPanel.setVisible(false);
    }//GEN-LAST:event_buttonPlanoSaudeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 204));
        buttonHome.setBackground(new java.awt.Color(246, 246, 246));
        panelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
        planosPanel.setVisible(false);
        medicoPanel.setVisible(false);
        
    }//GEN-LAST:event_buttonHomeActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoSaude;
    private javax.swing.JButton buttonSairEspecialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSistemaAgendas;
    private javax.swing.JPanel panelHome;
    private javax.swing.JSeparator separatorEspecialidades1;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(false);
        
        planosPanel = new PlanoSaudePanel();
        planosPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(planosPanel);
        planosPanel.setVisible(false);
        
        medicoPanel = new MedicoPanel();
        medicoPanel.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(medicoPanel);
        medicoPanel.setVisible(false);
    }
    
   
    
    



}
