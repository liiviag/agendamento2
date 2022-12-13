package br.senai.sp.jandira.ui;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MedicoDialog extends javax.swing.JDialog {

            
    private Medico medicos;
    private OperacaoEnum operacao;

     public MedicoDialog(
            java.awt.Frame parent,
            boolean modal, Medico e,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        medicos = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
        preeencherEspecialidades();

    }

        public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;

        preencherTitulo();
        preeencherEspecialidades();

    }
        
    private void preeencherEspecialidades() {
        jListEspecialidades.setModel(EspecialidadeDAO.preencherEspecialidade());
    }
    private void preencherFormulario() {

        jTextFieldCRM.setText(medicos.getCrm());
        jTextFieldEmail.setText(medicos.getEmail());
        FormattedTextFieldData.setText(medicos.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        jTextFieldMedico.setText(medicos.getNome());
        jTextFieldTelefone.setText(medicos.getTelefone());
 
    }

    private void preencherListaDeEspecialidadesMedico() {
        DefaultListModel<Especialidade> especialidadeMedico = new DefaultListModel<>();
        for (Especialidade e : medicos.getEspecialidade()){
            especialidadeMedico.addElement(e);
        }

        jListEspecialidadeMedico.setModel(especialidadeMedico);
    }
    
    private void preencherTitulo() {

        labelTitulo.setText("MÉDICO - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/atualizar (1).png")));
        } else {

            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/escrevendo.png")));
        }

    }

    private ArrayList<Especialidade> pegarEspecialidades(JList<Especialidade> lista) {

        int tamanho = lista.getModel().getSize();

        ArrayList<Especialidade> listaNova = new ArrayList();
        for (int i = 0; i < tamanho; i++) {
            listaNova.add(lista.getModel().getElementAt(i));
        }
        return listaNova;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jLabelImg = new javax.swing.JLabel();
        jLabelimg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelMedico = new javax.swing.JLabel();
        jTextFieldMedico = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelDataNasc = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCRM = new javax.swing.JLabel();
        jTextFieldCRM = new javax.swing.JTextField();
        jLabelListaEspec = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        jLabelEspecMedico = new javax.swing.JLabel();
        jScrollPaneEspecialidadeMedico = new javax.swing.JScrollPane();
        jListEspecialidadeMedico = new javax.swing.JList<>();
        FormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonSetaRemover = new javax.swing.JButton();
        jButtonMover = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        labelTitulo.setBackground(new java.awt.Color(153, 0, 153));
        labelTitulo.setFont(new java.awt.Font("Vineta BT", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo.setText("MÉDICO - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(160, 20, 300, 30);

        jLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/equipamento-medico (1).png"))); // NOI18N
        jPanel1.add(jLabelImg);
        jLabelImg.setBounds(60, 10, 50, 50);

        jLabelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/farmacia.png"))); // NOI18N
        jPanel1.add(jLabelimg);
        jLabelimg.setBounds(550, 10, 73, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 60);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        jLabelMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelMedico.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMedico.setText(" Médico(a)");
        jPanel2.add(jLabelMedico);
        jLabelMedico.setBounds(340, 50, 70, 16);

        jTextFieldMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMedico);
        jTextFieldMedico.setBounds(340, 70, 160, 22);

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelefone.setText("Telefone");
        jPanel2.add(jLabelTelefone);
        jLabelTelefone.setBounds(30, 110, 50, 20);

        jTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTelefone);
        jTextFieldTelefone.setBounds(30, 130, 120, 22);

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("Email");
        jPanel2.add(jLabelEmail);
        jLabelEmail.setBounds(180, 110, 50, 16);

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(180, 130, 160, 22);

        jLabelDataNasc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDataNasc.setText("Data de Nascimento");
        jPanel2.add(jLabelDataNasc);
        jLabelDataNasc.setBounds(370, 110, 150, 16);

        jLabelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Código");
        jPanel2.add(jLabelCodigo);
        jLabelCodigo.setBounds(30, 50, 50, 16);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(30, 70, 80, 22);

        jLabelCRM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCRM.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCRM.setText("CRM");
        jPanel2.add(jLabelCRM);
        jLabelCRM.setBounds(170, 50, 50, 16);

        jTextFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCRMActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCRM);
        jTextFieldCRM.setBounds(170, 70, 120, 22);

        jLabelListaEspec.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabelListaEspec.setForeground(new java.awt.Color(102, 102, 102));
        jLabelListaEspec.setText("Lista de Especialidades");
        jPanel2.add(jLabelListaEspec);
        jLabelListaEspec.setBounds(50, 180, 170, 17);

        jScrollPane1.setViewportView(jListEspecialidades);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 210, 160, 130);

        jLabelEspecMedico.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabelEspecMedico.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEspecMedico.setText("Especialidades do(a) médico(a)");
        jPanel2.add(jLabelEspecMedico);
        jLabelEspecMedico.setBounds(320, 180, 210, 17);

        jListEspecialidadeMedico.setCellRenderer(null);
        jListEspecialidadeMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneEspecialidadeMedico.setViewportView(jListEspecialidadeMedico);

        jPanel2.add(jScrollPaneEspecialidadeMedico);
        jScrollPaneEspecialidadeMedico.setBounds(340, 210, 160, 130);

        FormattedTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormattedTextFieldDataActionPerformed(evt);
            }
        });
        jPanel2.add(FormattedTextFieldData);
        FormattedTextFieldData.setBounds(370, 130, 140, 22);
        //Macara de formato para o input - Atualiza como esta aqui
        try{
            FormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        }catch(java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonSetaRemover.setBackground(new java.awt.Color(255, 51, 51));
        jButtonSetaRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-esquerda.png"))); // NOI18N
        jButtonSetaRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetaRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSetaRemover);
        jButtonSetaRemover.setBounds(250, 290, 40, 40);

        jButtonMover.setBackground(new java.awt.Color(102, 255, 102));
        jButtonMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/seta-direita (1).png"))); // NOI18N
        jButtonMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMoverActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMover);
        jButtonMover.setBounds(250, 230, 40, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 100, 560, 380);

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(330, 510, 100, 23);

        jButtonSalvar.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(460, 510, 100, 23);

        setBounds(0, 0, 664, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMedicoActionPerformed

    private void jTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefoneActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCRMActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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

        medicos.setCRM(jTextFieldCRM.getText());
        medicos.setEmail(jTextFieldEmail.getText());
        medicos.setNome(jTextFieldMedico.getText());
        medicos.setTelefone(jTextFieldTelefone.getText());
        medicos.setDataNascimento(LocalDate.parse(FormattedTextFieldData.getText(), formatted));
        medicos.setEspecialidade(pegarEspecialidades(jListEspecialidadeMedico));
        

        MedicoDAO.atualizar(medicos);

        JOptionPane.showMessageDialog(null,
                "Médico foi ATUALIZADO com Sucesso!!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }                                             

    private void adicionar() {
        
        if (jTextFieldCRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O crm é obrigatorio", "Medico", JOptionPane.WARNING_MESSAGE);
            jTextFieldCRM.requestFocus();
        } else if (jTextFieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O e-mail é obrigatorio", "Medico", JOptionPane.WARNING_MESSAGE);
            jTextFieldEmail.requestFocus();
        } else if (jTextFieldMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do médico é obrigatorio", "Medico", JOptionPane.WARNING_MESSAGE);
            jTextFieldMedico.requestFocus();
        } else if (jTextFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O número de telefone é obrigatorio", "Medico", JOptionPane.WARNING_MESSAGE);
            jTextFieldTelefone.requestFocus();
        } else if (FormattedTextFieldData.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A data de nascimento é obrigatorio", "Medico", JOptionPane.WARNING_MESSAGE);
            FormattedTextFieldData.requestFocus();
        } else {
       
        Medico novoMedico = new Medico();

        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        novoMedico.setCRM(jTextFieldCRM.getText());
        novoMedico.setEmail(jTextFieldEmail.getText());
        novoMedico.setNome(jTextFieldMedico.getText());
        novoMedico.setTelefone(jTextFieldTelefone.getText());
        novoMedico.setDataNascimento(LocalDate.parse(FormattedTextFieldData.getText(), formatted));
        novoMedico.setEspecialidade(pegarEspecialidades(jListEspecialidadeMedico));
        MedicoDAO.gravar(novoMedico);
        

        JOptionPane.showMessageDialog(this,
                "Médico gravado com SUCESSO!",
                "Médicos",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void FormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormattedTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormattedTextFieldDataActionPerformed

    private void jButtonSetaRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetaRemoverActionPerformed
        if (jListEspecialidadeMedico.isSelectionEmpty() == false) {
            ArrayList<Especialidade> listanova = new ArrayList<>();
            int tamanho = jListEspecialidadeMedico.getModel().getSize();

            for (int o = 0; o < tamanho; o++) {
                listanova.add(jListEspecialidadeMedico.getModel().getElementAt(o));
            }
            listanova.remove(jListEspecialidadeMedico.getSelectedValue());

            DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();

            for (Especialidade e : listanova) {
                especialidadesLista.addElement(e);
            }
            jListEspecialidadeMedico.setModel(especialidadesLista);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma especialidade para ser removida!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonSetaRemoverActionPerformed

    private void jButtonMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMoverActionPerformed
         if (jListEspecialidades.isSelectionEmpty() == false) {

            ArrayList<Especialidade> listaNova = new ArrayList<>();

            int tamanho = jListEspecialidadeMedico.getModel().getSize();

            int i = 0;
            while (tamanho > i) {
                listaNova.add(jListEspecialidadeMedico.getModel().getElementAt(i));
                i++;
            }

            if (listaNova.contains(jListEspecialidades.getSelectedValue()) == false) {
                listaNova.add(jListEspecialidades.getSelectedValue());

                DefaultListModel<Especialidade> listaDeEsp = new DefaultListModel<>();
                for (Especialidade e : listaNova) {
                    listaDeEsp.addElement(e);
                }

                jListEspecialidadeMedico.setModel(listaDeEsp);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Especialidade ja selecionada!",
                        "Médico",
                        JOptionPane.WARNING_MESSAGE,
                        null);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione alguma especialidade!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE,
                    null);

        }
    }//GEN-LAST:event_jButtonMoverActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FormattedTextFieldData;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonMover;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSetaRemover;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEspecMedico;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelListaEspec;
    private javax.swing.JLabel jLabelMedico;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelimg;
    private javax.swing.JList<Especialidade> jListEspecialidadeMedico;
    private javax.swing.JList<Especialidade> jListEspecialidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneEspecialidadeMedico;
    private javax.swing.JTextField jTextFieldCRM;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMedico;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
