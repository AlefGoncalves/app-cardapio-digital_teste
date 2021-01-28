package model.views;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.controllers.UniversalController;
import model.controllers.UserController;
import model.controllers.consistence.DataConsistenceUserTest;
import model.services.MsgService;

public class CadastroView extends javax.swing.JFrame {

    public CadastroView() {
        initComponents();

        //<editor-fold desc="Criando listeners para os TextFields e RadioButtons">
        tf_name.getDocument().addDocumentListener(
                new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {

            }

            @Override
            public void insertUpdate(DocumentEvent e) {

                if (new DataConsistenceUserTest().isValidNameLength(tf_name, lb_name)
                        && new DataConsistenceUserTest().isValidNameFormat(tf_name, lb_name)) {
                    new DataConsistenceUserTest().successAction(lb_name);
                }

                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                if (new DataConsistenceUserTest().isValidNameLength(tf_name, lb_name)
                        && new DataConsistenceUserTest().isValidNameFormat(tf_name, lb_name)) {
                    new DataConsistenceUserTest().successAction(lb_name);
                }

                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

        });

        tf_username.getDocument().addDocumentListener(
                new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidUsernameLength(tf_username, lb_username)) {
                    new DataConsistenceUserTest().successAction(lb_username);
                }

                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidUsernameLength(tf_username, lb_username)) {
                    new DataConsistenceUserTest().successAction(lb_username);
                }

                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {

            }
        });

        tf_cpf.getDocument().addDocumentListener(
                new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidCPFLength(tf_cpf, lb_cpf)
                        && new DataConsistenceUserTest().isValidCPFFormat(tf_cpf, lb_cpf)) {
                    new DataConsistenceUserTest().successAction(lb_cpf);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidCPFLength(tf_cpf, lb_cpf)
                        && new DataConsistenceUserTest().isValidCPFFormat(tf_cpf, lb_cpf)) {
                    new DataConsistenceUserTest().successAction(lb_cpf);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {

            }
        });

        tf_email.getDocument().addDocumentListener(
                new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidEmailLength(tf_email, lb_email)
                        && new DataConsistenceUserTest().isValidEmailAtSign(tf_email, lb_email)) {
                    new DataConsistenceUserTest().successAction(lb_email);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidEmailLength(tf_email, lb_email)
                        && new DataConsistenceUserTest().isValidEmailAtSign(tf_email, lb_email)) {
                    new DataConsistenceUserTest().successAction(lb_email);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {

            }
        });

        tf_password.getDocument().addDocumentListener(
                new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidPasswordLength(tf_password, lb_password)) {
                    new DataConsistenceUserTest().successAction(lb_password);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidPasswordLength(tf_password, lb_password)) {
                    new DataConsistenceUserTest().successAction(lb_password);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {

            }
        });

        tf_birthdate.getDocument().addDocumentListener(
                new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidBirthdateNumber(tf_birthdate, lb_birthdate)
                        && new DataConsistenceUserTest().isValidBirthdateLength(tf_birthdate, lb_birthdate)
                        && new DataConsistenceUserTest().isValidBirthdateOfAge(tf_birthdate, lb_birthdate)) {
                    new DataConsistenceUserTest().successAction(lb_birthdate);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                if (new DataConsistenceUserTest().isValidBirthdateNumber(tf_birthdate, lb_birthdate)
                        && new DataConsistenceUserTest().isValidBirthdateLength(tf_birthdate, lb_birthdate)
                        && new DataConsistenceUserTest().isValidBirthdateOfAge(tf_birthdate, lb_birthdate)) {
                    new DataConsistenceUserTest().successAction(lb_birthdate);
                }
                new DataConsistenceUserTest().enableButton(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar);
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {

            }
        });

        rb_masc.addActionListener(e -> new DataConsistenceUserTest().rbAct(rb_masc, rb_fem, lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar));
        rb_fem.addActionListener(e -> new DataConsistenceUserTest().rbAct(rb_masc, rb_fem, lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender, bt_registrar));
        //</editor-fold>
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        tf_birthdate = new javax.swing.JTextField();
        rb_masc = new javax.swing.JRadioButton();
        rb_fem = new javax.swing.JRadioButton();
        bt_registrar = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_cpf = new javax.swing.JTextField();
        lb_name = new javax.swing.JLabel();
        lb_username = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_birthdate = new javax.swing.JLabel();
        lb_gender = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mb_voltar = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome Completo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome Usuário:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ano de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gênero:");

        tf_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        rb_masc.setText("Masculino");

        rb_fem.setText("Feminino");

        bt_registrar.setBackground(java.awt.Color.lightGray);
        bt_registrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_registrar.setText("Registrar");
        bt_registrar.setEnabled(false);
        bt_registrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_registrarMouseMoved(evt);
            }
        });
        bt_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_registrarMouseExited(evt);
            }
        });
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });

        bt_limpar.setBackground(java.awt.Color.lightGray);
        bt_limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_limpar.setText("Limpar Tudo");
        bt_limpar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_limparMouseMoved(evt);
            }
        });
        bt_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_limparMouseExited(evt);
            }
        });
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CPF:");

        jMenu2.setText("Opções");
        jMenu2.setToolTipText("");

        mb_voltar.setText("Voltar");
        mb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb_voltarActionPerformed(evt);
            }
        });
        jMenu2.add(mb_voltar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_username, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_email, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_password, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tf_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_birthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(rb_masc)
                        .addGap(2, 2, 2)
                        .addComponent(rb_fem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_limpar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_username, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_password, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6))
                    .addComponent(rb_masc)
                    .addComponent(rb_fem)
                    .addComponent(lb_gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_registrar)
                    .addComponent(bt_limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        new UserController().btRegistrar(tf_name, tf_username, tf_cpf, tf_email, tf_password, tf_birthdate, rb_masc, rb_fem);
        new UniversalController().onOffFrame(new TelaPrincipalView(), this);
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        UserController userController = new UserController();
        userController.cleanTextField(tf_name, tf_username, tf_cpf, tf_email, tf_password, tf_birthdate);
        userController.cleanRadioButton(rb_masc, rb_fem);
        userController.cleanLabelDesc(lb_name, lb_username, lb_cpf, lb_email, lb_password, lb_birthdate, lb_gender);
    }//GEN-LAST:event_bt_limparActionPerformed

    private void mb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb_voltarActionPerformed
        new UniversalController().onOffFrame(new TelaPrincipalView(), this);
    }//GEN-LAST:event_mb_voltarActionPerformed

    private void bt_limparMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_limparMouseMoved
        new UniversalController().btMouseMoved(bt_limpar);
    }//GEN-LAST:event_bt_limparMouseMoved

    private void bt_limparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_limparMouseExited
        new UniversalController().btMouseExited(bt_limpar);
    }//GEN-LAST:event_bt_limparMouseExited

    private void bt_registrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarMouseMoved
        if (bt_registrar.isEnabled()) {
            new UniversalController().btMouseMoved(bt_registrar);
        } else {
            new UniversalController().btNoFunction(bt_registrar);
            new MsgService().pupupMsg("Preencha todas as informaçãos corretamente!", "ERRO CONSISTENCIA", 0);
        }
    }//GEN-LAST:event_bt_registrarMouseMoved

    private void bt_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarMouseExited
        new UniversalController().btMouseExited(bt_registrar);
    }//GEN-LAST:event_bt_registrarMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CadastroView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_birthdate;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_gender;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_username;
    private javax.swing.JMenuItem mb_voltar;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_masc;
    private javax.swing.JTextField tf_birthdate;
    private javax.swing.JTextField tf_cpf;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables

}
