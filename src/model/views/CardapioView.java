package model.views;

import model.controllers.UniversalController;
import model.controllers.enums.DishType;
import model.services.MsgService;

public class CardapioView extends javax.swing.JFrame {

    public CardapioView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        lb_Cardapio = new javax.swing.JLabel();
        bt_cafedaManha = new javax.swing.JButton();
        bt_pratoPrincipal = new javax.swing.JButton();
        bt_entrada = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        bt_sobremesa = new javax.swing.JButton();
        bt_Bebidas = new javax.swing.JButton();
        bt_lanchesSalgados = new javax.swing.JButton();
        bt_sanduiches = new javax.swing.JButton();
        bt_favoritos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mb_outras = new javax.swing.JMenu();
        mn_usoInterno = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cardápio");
        setResizable(false);

        lb_Cardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_Cardapio.setText("Cardápio");

        bt_cafedaManha.setText("Café da Manhã");
        bt_cafedaManha.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_cafedaManhaMouseMoved(evt);
            }
        });
        bt_cafedaManha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_cafedaManhaMouseExited(evt);
            }
        });
        bt_cafedaManha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cafedaManhaActionPerformed(evt);
            }
        });

        bt_pratoPrincipal.setText("Prato Principal");
        bt_pratoPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_pratoPrincipalMouseMoved(evt);
            }
        });
        bt_pratoPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_pratoPrincipalMouseExited(evt);
            }
        });
        bt_pratoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pratoPrincipalActionPerformed(evt);
            }
        });

        bt_entrada.setText("Entrada");
        bt_entrada.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_entradaMouseMoved(evt);
            }
        });
        bt_entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_entradaMouseExited(evt);
            }
        });
        bt_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entradaActionPerformed(evt);
            }
        });

        bt_voltar.setText("Voltar");
        bt_voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_voltarMouseMoved(evt);
            }
        });
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_voltarMouseExited(evt);
            }
        });
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        bt_sobremesa.setText("Sobremesa");
        bt_sobremesa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_sobremesaMouseMoved(evt);
            }
        });
        bt_sobremesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_sobremesaMouseExited(evt);
            }
        });
        bt_sobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sobremesaActionPerformed(evt);
            }
        });

        bt_Bebidas.setText("Bebidas");
        bt_Bebidas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_BebidasMouseMoved(evt);
            }
        });
        bt_Bebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_BebidasMouseExited(evt);
            }
        });
        bt_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BebidasActionPerformed(evt);
            }
        });

        bt_lanchesSalgados.setText("Lanches & Salgados");
        bt_lanchesSalgados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_lanchesSalgadosMouseMoved(evt);
            }
        });
        bt_lanchesSalgados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_lanchesSalgadosMouseExited(evt);
            }
        });
        bt_lanchesSalgados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lanchesSalgadosActionPerformed(evt);
            }
        });

        bt_sanduiches.setText("Sanduíches");
        bt_sanduiches.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_sanduichesMouseMoved(evt);
            }
        });
        bt_sanduiches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_sanduichesMouseExited(evt);
            }
        });
        bt_sanduiches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sanduichesActionPerformed(evt);
            }
        });

        bt_favoritos.setText("Favoritos");
        bt_favoritos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_favoritosMouseMoved(evt);
            }
        });
        bt_favoritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_favoritosMouseExited(evt);
            }
        });
        bt_favoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_favoritosActionPerformed(evt);
            }
        });

        mb_outras.setText("Opções");
        mb_outras.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                mb_outrasMouseMoved(evt);
            }
        });
        mb_outras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mb_outrasMouseExited(evt);
            }
        });

        mn_usoInterno.setText("Uso Interno");
        mn_usoInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_usoInternoActionPerformed(evt);
            }
        });
        mb_outras.add(mn_usoInterno);

        jMenuBar1.add(mb_outras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(lb_Cardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_sanduiches, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_lanchesSalgados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Bebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_sobremesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_pratoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_cafedaManha, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(bt_entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_favoritos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_voltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Cardapio)
                .addGap(18, 18, 18)
                .addComponent(bt_cafedaManha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_entrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_pratoPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sobremesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_Bebidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_lanchesSalgados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_sanduiches)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_favoritos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(bt_voltar)
                .addContainerGap())
        );

        new UniversalController().btColorPattern(bt_cafedaManha);
        new UniversalController().btColorPattern(bt_pratoPrincipal);
        new UniversalController().btColorPattern(bt_entrada);
        new UniversalController().btColorPattern(bt_voltar);
        new UniversalController().btColorPattern(bt_sobremesa);
        new UniversalController().btColorPattern(bt_Bebidas);
        new UniversalController().btColorPattern(bt_lanchesSalgados);
        new UniversalController().btColorPattern(bt_sanduiches);
        new UniversalController().btColorPattern(bt_favoritos);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cafedaManhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cafedaManhaActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.CAFE_DA_MANHA), this);
    }//GEN-LAST:event_bt_cafedaManhaActionPerformed

    private void bt_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entradaActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.ENTRADA), this);
    }//GEN-LAST:event_bt_entradaActionPerformed

    private void bt_pratoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pratoPrincipalActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.PRATO_PRICIPAL), this);
    }//GEN-LAST:event_bt_pratoPrincipalActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        new UniversalController().onOffFrame(new TelaPrincipalView(), this);
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void mn_usoInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_usoInternoActionPerformed
        new MsgService().pupupMsg("Frame em manutenção", "Alerta", 0);
    }//GEN-LAST:event_mn_usoInternoActionPerformed

    private void bt_sobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sobremesaActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.SOBREMESA), this);
    }//GEN-LAST:event_bt_sobremesaActionPerformed

    private void bt_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BebidasActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.BEBIDAS), this);
    }//GEN-LAST:event_bt_BebidasActionPerformed

    private void bt_lanchesSalgadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lanchesSalgadosActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.LANCHES_SALGADOS), this);
    }//GEN-LAST:event_bt_lanchesSalgadosActionPerformed

    private void bt_sanduichesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sanduichesActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.SANDUICHES), this);
    }//GEN-LAST:event_bt_sanduichesActionPerformed

    private void bt_favoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_favoritosActionPerformed
        new UniversalController().onOffFrame(new MenuView(DishType.FAVORITOS), this);
    }//GEN-LAST:event_bt_favoritosActionPerformed

    private void bt_cafedaManhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cafedaManhaMouseExited
        new UniversalController().btMouseExited(bt_cafedaManha);
    }//GEN-LAST:event_bt_cafedaManhaMouseExited

    private void bt_cafedaManhaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cafedaManhaMouseMoved
        new UniversalController().btMouseMoved(bt_cafedaManha);
    }//GEN-LAST:event_bt_cafedaManhaMouseMoved

    private void bt_entradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_entradaMouseExited
        new UniversalController().btMouseExited(bt_entrada);
    }//GEN-LAST:event_bt_entradaMouseExited

    private void bt_entradaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_entradaMouseMoved
        new UniversalController().btMouseMoved(bt_entrada);
    }//GEN-LAST:event_bt_entradaMouseMoved

    private void bt_pratoPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pratoPrincipalMouseExited
        new UniversalController().btMouseExited(bt_pratoPrincipal);
    }//GEN-LAST:event_bt_pratoPrincipalMouseExited

    private void bt_pratoPrincipalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pratoPrincipalMouseMoved
        new UniversalController().btMouseMoved(bt_pratoPrincipal);
    }//GEN-LAST:event_bt_pratoPrincipalMouseMoved

    private void bt_sobremesaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sobremesaMouseExited
        new UniversalController().btMouseExited(bt_sobremesa);
    }//GEN-LAST:event_bt_sobremesaMouseExited

    private void bt_sobremesaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sobremesaMouseMoved
        new UniversalController().btMouseMoved(bt_sobremesa);
    }//GEN-LAST:event_bt_sobremesaMouseMoved

    private void bt_BebidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BebidasMouseExited
        new UniversalController().btMouseExited(bt_Bebidas);
    }//GEN-LAST:event_bt_BebidasMouseExited

    private void bt_BebidasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BebidasMouseMoved
        new UniversalController().btMouseMoved(bt_Bebidas);
    }//GEN-LAST:event_bt_BebidasMouseMoved

    private void bt_lanchesSalgadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_lanchesSalgadosMouseExited
        new UniversalController().btMouseExited(bt_lanchesSalgados);
    }//GEN-LAST:event_bt_lanchesSalgadosMouseExited

    private void bt_lanchesSalgadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_lanchesSalgadosMouseMoved
        new UniversalController().btMouseMoved(bt_lanchesSalgados);
    }//GEN-LAST:event_bt_lanchesSalgadosMouseMoved

    private void bt_sanduichesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sanduichesMouseExited
        new UniversalController().btMouseExited(bt_sanduiches);
    }//GEN-LAST:event_bt_sanduichesMouseExited

    private void bt_sanduichesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sanduichesMouseMoved
        new UniversalController().btMouseMoved(bt_sanduiches);
    }//GEN-LAST:event_bt_sanduichesMouseMoved

    private void bt_favoritosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_favoritosMouseExited
        new UniversalController().btMouseExited(bt_favoritos);
    }//GEN-LAST:event_bt_favoritosMouseExited

    private void bt_favoritosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_favoritosMouseMoved
        new UniversalController().btMouseMoved(bt_favoritos);
    }//GEN-LAST:event_bt_favoritosMouseMoved

    private void bt_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseExited
        new UniversalController().btMouseExited(bt_voltar);
    }//GEN-LAST:event_bt_voltarMouseExited

    private void bt_voltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseMoved
        new UniversalController().btMouseMoved(bt_voltar);
    }//GEN-LAST:event_bt_voltarMouseMoved

    private void mb_outrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mb_outrasMouseExited
        new UniversalController().mnMouseExited(mb_outras);
    }//GEN-LAST:event_mb_outrasMouseExited

    private void mb_outrasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mb_outrasMouseMoved
        new UniversalController().mnMouseMoved(mb_outras);
    }//GEN-LAST:event_mb_outrasMouseMoved

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
            java.util.logging.Logger.getLogger(CardapioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardapioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardapioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardapioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardapioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Bebidas;
    private javax.swing.JButton bt_cafedaManha;
    private javax.swing.JButton bt_entrada;
    private javax.swing.JButton bt_favoritos;
    private javax.swing.JButton bt_lanchesSalgados;
    private javax.swing.JButton bt_pratoPrincipal;
    private javax.swing.JButton bt_sanduiches;
    private javax.swing.JButton bt_sobremesa;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lb_Cardapio;
    private javax.swing.JMenu mb_outras;
    private javax.swing.JMenuItem mn_usoInterno;
    // End of variables declaration//GEN-END:variables
}
