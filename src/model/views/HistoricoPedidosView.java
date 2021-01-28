/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.views;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.repositories.dao.impl.MacAdressDAO;
import model.repositories.dao.impl.OrderListDAO;
import model.entities.MacAdress;
import model.entities.OrderList;

public class HistoricoPedidosView extends javax.swing.JFrame {

    /**
     * Creates new form Fr_HistoricoPedidos
     */
    public HistoricoPedidosView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ta_pedidosNome = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_pedidosId = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_pedidosPreco = new javax.swing.JTextArea();
        bt_voltar = new javax.swing.JButton();
        lb_total = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_pedidosData = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        tf_dias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bt_filtrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico de Pedidos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ta_pedidosNome.setBackground(new java.awt.Color(240, 240, 240));
        ta_pedidosNome.setColumns(20);
        ta_pedidosNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ta_pedidosNome.setRows(5);
        ta_pedidosNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_pedidosNome.setEnabled(false);
        ta_pedidosNome.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane2.setViewportView(ta_pedidosNome);

        jLabel1.setBackground(new java.awt.Color(220, 220, 220));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("        ID                                DESCRIÇÃO                       PREÇO                    DATA DA COMPRA");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(61, 227));

        ta_pedidosId.setBackground(new java.awt.Color(240, 240, 240));
        ta_pedidosId.setColumns(20);
        ta_pedidosId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ta_pedidosId.setRows(5);
        ta_pedidosId.setTabSize(10);
        ta_pedidosId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_pedidosId.setEnabled(false);
        ta_pedidosId.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane3.setViewportView(ta_pedidosId);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ta_pedidosPreco.setBackground(new java.awt.Color(240, 240, 240));
        ta_pedidosPreco.setColumns(20);
        ta_pedidosPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ta_pedidosPreco.setRows(5);
        ta_pedidosPreco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_pedidosPreco.setEnabled(false);
        ta_pedidosPreco.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane4.setViewportView(ta_pedidosPreco);

        bt_voltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return-lightgray-32x32.jpg"))); // NOI18N
        bt_voltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        lb_total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_total.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL"));
        lb_total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_total.setOpaque(true);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ta_pedidosData.setBackground(new java.awt.Color(240, 240, 240));
        ta_pedidosData.setColumns(20);
        ta_pedidosData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ta_pedidosData.setRows(5);
        ta_pedidosData.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_pedidosData.setEnabled(false);
        ta_pedidosData.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane5.setViewportView(ta_pedidosData);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Último(s)");

        tf_dias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("dia(s)");

        bt_filtrar.setBackground(java.awt.Color.lightGray);
        bt_filtrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_filtrar.setText("Filtrar");
        bt_filtrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_filtrarMouseMoved(evt);
            }
        });
        bt_filtrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_filtrarMouseExited(evt);
            }
        });
        bt_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_filtrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(tf_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(bt_filtrar)
                        .addGap(20, 20, 20)
                        .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tf_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bt_filtrar))
                    .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MacAdress macAdress = new MacAdress();
        OrderList requestList = new OrderList();
        MacAdressDAO macAdressDAO = new MacAdressDAO();
        OrderListDAO requestListDAO = new OrderListDAO();
        List<OrderList> list = new ArrayList<>();

        list = requestListDAO.findByUsername_historico(macAdressDAO.findByUsername(macAdress));

        String textId = "";
        String textNome = "";
        String textPreco = "";
        String textData = "";
        double total = 0;

        if (list != null) {
            for (OrderList lista : list) {
                textId += lista.getId() + "\n\n";
                textNome += lista.getName() + "\n\n";
                textPreco += String.format("R$ %.2f \n\n", lista.getPrice());
                textData += lista.getDate() + "\n\n";
                total += lista.getPrice();
            }
            ta_pedidosId.setText(textId);
            ta_pedidosNome.setText(textNome);
            ta_pedidosPreco.setText(textPreco);
            ta_pedidosData.setText(textData);
            lb_total.setText(String.format("R$ %.2f", total));
        } else {
            lb_total.setText("R$ 0,00");
        }
    }//GEN-LAST:event_formWindowOpened

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        ConfigsView configs = new ConfigsView();
        configs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void bt_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_filtrarActionPerformed
        
        MacAdress macAdress = new MacAdress();        
        MacAdressDAO macAdressDAO = new MacAdressDAO();
        OrderListDAO requestListDAO = new OrderListDAO();
        List<OrderList> list = new ArrayList<>();

        int dia = 0;
        boolean val = true;

        try {
            dia = Integer.parseInt(tf_dias.getText().trim());
        } catch (NumberFormatException e) {
            val = false;
        }

        if (val == true && dia <= 365 && dia > 0) {

            list = requestListDAO.findByDate_historico(dia, macAdressDAO.findByUsername(macAdress));

            String textId = "";
            String textNome = "";
            String textPreco = "";
            String textData = "";
            double total = 0;

            if (list != null) {
                for (OrderList lista : list) {
                    textId += lista.getId() + "\n\n";
                    textNome += lista.getName() + "\n\n";
                    textPreco += String.format("R$ %.2f \n\n", lista.getPrice());
                    textData += lista.getDate() + "\n\n";
                    total += lista.getPrice();
                }
                ta_pedidosId.setText(textId);
                ta_pedidosNome.setText(textNome);
                ta_pedidosPreco.setText(textPreco);
                ta_pedidosData.setText(textData);
                lb_total.setText(String.format("R$ %.2f", total));
            } else {
                lb_total.setText("R$ 0,00");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Formato invalido", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_filtrarActionPerformed

    private void bt_voltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseMoved
        bt_voltar.setBackground(Color.GREEN); 
    }//GEN-LAST:event_bt_voltarMouseMoved

    private void bt_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseExited
        bt_voltar.setBackground(Color.lightGray);
    }//GEN-LAST:event_bt_voltarMouseExited

    private void bt_filtrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_filtrarMouseMoved
        bt_filtrar.setBackground(Color.GREEN); 
    }//GEN-LAST:event_bt_filtrarMouseMoved

    private void bt_filtrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_filtrarMouseExited
        bt_filtrar.setBackground(Color.lightGray);
    }//GEN-LAST:event_bt_filtrarMouseExited

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
            java.util.logging.Logger.getLogger(HistoricoPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoPedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoPedidosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_filtrar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lb_total;
    private javax.swing.JTextArea ta_pedidosData;
    private javax.swing.JTextArea ta_pedidosId;
    private javax.swing.JTextArea ta_pedidosNome;
    private javax.swing.JTextArea ta_pedidosPreco;
    private javax.swing.JTextField tf_dias;
    // End of variables declaration//GEN-END:variables

}
