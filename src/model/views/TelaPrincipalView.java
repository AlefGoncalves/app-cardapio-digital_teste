package model.views;

import model.controllers.TelaPrincipalController;
import model.controllers.UniversalController;

public class TelaPrincipalView extends javax.swing.JFrame {

    public TelaPrincipalView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_logo = new javax.swing.JLabel();
        bt_sobreRestaurante = new javax.swing.JButton();
        lb_nomeRestaurante = new javax.swing.JLabel();
        bt_configuracoes = new javax.swing.JButton();
        bt_login = new javax.swing.JButton();
        bt_pedido = new javax.swing.JButton();
        bt_carrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setResizable(false);

        lb_logo.setBackground(new java.awt.Color(255, 255, 255));
        lb_logo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logo.setText("LOGO");
        lb_logo.setAutoscrolls(true);
        lb_logo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        bt_sobreRestaurante.setBackground(java.awt.Color.lightGray);
        bt_sobreRestaurante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_sobreRestaurante.setText("Sobre o Restaurante");
        bt_sobreRestaurante.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_sobreRestauranteMouseMoved(evt);
            }
        });
        bt_sobreRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_sobreRestauranteMouseExited(evt);
            }
        });
        bt_sobreRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sobreRestauranteActionPerformed(evt);
            }
        });

        lb_nomeRestaurante.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_nomeRestaurante.setText("Nome do Restaurante");
        lb_nomeRestaurante.setAlignmentY(0.0F);
        lb_nomeRestaurante.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), java.awt.Color.black));
        lb_nomeRestaurante.setMaximumSize(new java.awt.Dimension(237, 237));
        lb_nomeRestaurante.setMinimumSize(new java.awt.Dimension(33, 33));

        bt_configuracoes.setBackground(java.awt.Color.lightGray);
        bt_configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gears-computer-icons-desktop-lightgray-32x32.png"))); // NOI18N
        bt_configuracoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_configuracoes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_configuracoesMouseMoved(evt);
            }
        });
        bt_configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_configuracoesMouseExited(evt);
            }
        });
        bt_configuracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_configuracoesActionPerformed(evt);
            }
        });

        bt_login.setBackground(java.awt.Color.lightGray);
        bt_login.setText(new TelaPrincipalController().bt_loginSetTxtController());
        bt_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_login.setMaximumSize(new java.awt.Dimension(123, 123));
        bt_login.setMinimumSize(new java.awt.Dimension(23, 23));
        bt_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_loginMouseMoved(evt);
            }
        });
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_loginMouseExited(evt);
            }
        });
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        bt_pedido.setBackground(java.awt.Color.lightGray);
        bt_pedido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_pedido.setText("Faça seu pedido!");
        bt_pedido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_pedidoMouseMoved(evt);
            }
        });
        bt_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_pedidoMouseExited(evt);
            }
        });
        bt_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pedidoActionPerformed(evt);
            }
        });

        bt_carrinho.setBackground(java.awt.Color.lightGray);
        bt_carrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopping-cart-icon-gray-32x32.png"))); // NOI18N
        bt_carrinho.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bt_carrinho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_carrinhoMouseMoved(evt);
            }
        });
        bt_carrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_carrinhoMouseExited(evt);
            }
        });
        bt_carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_carrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lb_nomeRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bt_pedido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(bt_sobreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_configuracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_configuracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_carrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_nomeRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(bt_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(bt_sobreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_configuracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_configuracoesActionPerformed
        new UniversalController().onOffFrame(new ConfigsView(), this);
    }//GEN-LAST:event_bt_configuracoesActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        new TelaPrincipalController().bt_loginActController(bt_login, new LoginView(), this);
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseMoved
        new UniversalController().btMouseMoved(bt_login);
    }//GEN-LAST:event_bt_loginMouseMoved

    private void bt_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseExited
        new UniversalController().btMouseExited(bt_login);
    }//GEN-LAST:event_bt_loginMouseExited

    private void bt_configuracoesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_configuracoesMouseMoved
        new UniversalController().btMouseMoved(bt_configuracoes);
    }//GEN-LAST:event_bt_configuracoesMouseMoved

    private void bt_configuracoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_configuracoesMouseExited
        new UniversalController().btMouseExited(bt_configuracoes);
    }//GEN-LAST:event_bt_configuracoesMouseExited

    private void bt_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pedidoActionPerformed
        new TelaPrincipalController().bt_pedidoController(bt_login, new CardapioView(), this);
    }//GEN-LAST:event_bt_pedidoActionPerformed

    private void bt_pedidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pedidoMouseMoved
        new UniversalController().btMouseMoved(bt_pedido);
    }//GEN-LAST:event_bt_pedidoMouseMoved

    private void bt_pedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pedidoMouseExited
        new UniversalController().btMouseExited(bt_pedido);
    }//GEN-LAST:event_bt_pedidoMouseExited

    private void bt_carrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_carrinhoActionPerformed
        new UniversalController().onOffFrame(new CarrinhoView(), this);
    }//GEN-LAST:event_bt_carrinhoActionPerformed

    private void bt_carrinhoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_carrinhoMouseMoved
        new UniversalController().btMouseMoved(bt_carrinho);
    }//GEN-LAST:event_bt_carrinhoMouseMoved

    private void bt_carrinhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_carrinhoMouseExited
        new UniversalController().btMouseExited(bt_carrinho);
    }//GEN-LAST:event_bt_carrinhoMouseExited

    private void bt_sobreRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sobreRestauranteActionPerformed
        new TelaPrincipalController().bt_sobreRestauranteController();
    }//GEN-LAST:event_bt_sobreRestauranteActionPerformed

    private void bt_sobreRestauranteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sobreRestauranteMouseMoved
        new UniversalController().btNoFunction(bt_sobreRestaurante);
    }//GEN-LAST:event_bt_sobreRestauranteMouseMoved

    private void bt_sobreRestauranteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sobreRestauranteMouseExited
        new UniversalController().btMouseExited(bt_sobreRestaurante);
    }//GEN-LAST:event_bt_sobreRestauranteMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_carrinho;
    private javax.swing.JButton bt_configuracoes;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_pedido;
    private javax.swing.JButton bt_sobreRestaurante;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_nomeRestaurante;
    // End of variables declaration//GEN-END:variables

}
