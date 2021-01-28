package model.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.controllers.FavoritesController;
import model.controllers.MenuController;
import model.controllers.UniversalController;
import model.entities.Favorites;
import model.entities.Menu;
import model.controllers.enums.DishType;
import model.services.FavoritesService;
import model.services.MenuService;

public class MenuView extends javax.swing.JFrame {

    private List<JPanel> lista_jp = new ArrayList<>();
    private List<JLabel> lista_jlb_nomePrato = new ArrayList<>();
    private List<JLabel> lista_jlb_precoPrato = new ArrayList<>();
    private List<JLabel> lista_jlb_descPrato = new ArrayList<>();
    private List<JLabel> lista_jlb_foto = new ArrayList<>();
    private List<JButton> lista_jbt_adicionar = new ArrayList<>();
    private List<JButton> lista_jbt_favorito = new ArrayList<>();
    private List<JButton> lista_jbt_remover = new ArrayList<>();
    private List<JLabel> lista_jlb_cod = new ArrayList<>();
    private List<JLabel> lista_jlb_tempo = new ArrayList<>();

    public MenuView(DishType type) { //método construtor: cria lista de pratos
        if (type.getId() != 8) {
            createComp(type, new MenuService().findMenu(type));
        } else {
            createCompFavorites(type, new FavoritesService().findFavorites());
        }
    }

    private void bt_verCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {
        new CarrinhoView().setVisible(true);
        this.dispose();
    }

    private void bt_voltarActionPerformed(ActionEvent evt) {
        new CardapioView().setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold desc=" Look and feel setting code (optional) ">
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
            
        } catch (InstantiationException ex) {
            
        } catch (IllegalAccessException ex) {
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView(DishType.CAFE_DA_MANHA).setVisible(true);
            }
        });
    }

    //variaveis de componentes fixos da tela                   
    private javax.swing.JButton bt_verCarrinho;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel jp_principal1;
    private javax.swing.JLabel lb_cabecalho;

    //<editor-fold desc=" Cria os componentes da tela - Referente ao cardapio">
    private void createComp(DishType type, List<Menu> list) {

        //criando componentes fixos
        lb_cabecalho = new javax.swing.JLabel();
        bt_verCarrinho = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jp_principal1 = new javax.swing.JPanel();
        bt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lb_cabecalho.setFont(new java.awt.Font("Arial", 1, 35));
        lb_cabecalho.setText(type.getType().toUpperCase()); //cabeçalho é editado pelo tipo de prato
        lb_cabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bt_verCarrinho.setText("VER CARRINHO");
        bt_verCarrinho.addActionListener((java.awt.event.ActionEvent evt) -> {
            bt_verCarrinhoActionPerformed(evt);
        });
        new UniversalController().btColorPattern(bt_verCarrinho);
        bt_verCarrinho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                new MenuController().globalMouseMoved(bt_verCarrinho);
            }
        });
        bt_verCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new MenuController().globalMouseExited(bt_verCarrinho);
            }
        });

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bt_voltar.setFont(new java.awt.Font("Tahoma", 1, 14));
        bt_voltar.setText("Voltar");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        new UniversalController().btColorPattern(bt_voltar);
        bt_voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                new UniversalController().btMouseMoved(bt_voltar);
            }
        });
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new MenuController().globalMouseExited(bt_voltar);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(113, 113, 113)
                                                                .addComponent(lb_cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(246, 246, 246)
                                                                .addComponent(bt_verCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 91, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lb_cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(bt_verCarrinho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addContainerGap())
        );

        //objeto que cria regra de quantidade de linhas para alocar os pratos(depende do tamanho da lista de pratos)
        try {
            GridLayout gridJp = new GridLayout(list.size(), 1, 0, 5);

            //criando componentes dinâmicos
            list.forEach(lista -> {

                JPanel jp = new JPanel();
                JLabel jlb_nomePrato = new JLabel();
                JLabel jlb_precoPrato = new JLabel();
                JLabel jlb_descPrato = new JLabel();
                JLabel jlb_foto = new JLabel();
                JLabel jlb_cod = new JLabel();
                JLabel jlb_tempo = new JLabel();
                JButton jbt_adicionar = new JButton();
                JButton jbt_favorito = new JButton();

                jp.setBackground(java.awt.Color.white);
                jp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                jp.setPreferredSize(new java.awt.Dimension(612, 266));

                jlb_nomePrato.setFont(new java.awt.Font("Tahoma", 1, 18));
                jlb_nomePrato.setText(lista.getNome());

                jlb_precoPrato.setBackground(new java.awt.Color(255, 255, 255));
                jlb_precoPrato.setFont(new java.awt.Font("Tahoma", 1, 14));
                jlb_precoPrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jlb_precoPrato.setText(String.format("R$ %.2f", lista.getPreco()));
                jlb_precoPrato.setAlignmentY(0.0F);
                jlb_precoPrato.setAutoscrolls(true);
                jlb_precoPrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jlb_descPrato.setBackground(new java.awt.Color(255, 255, 255));
                jlb_descPrato.setFont(new java.awt.Font("Tahoma", 1, 14));
                jlb_descPrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jlb_descPrato.setText(lista.getDescricao());
                jlb_descPrato.setAlignmentY(0.0F);
                jlb_descPrato.setAutoscrolls(true);
                jlb_descPrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                //adiciona foto a partir do endereço gravado no BD
                try {
                    jlb_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource(lista.getEnderecoImg())));
                } catch (NullPointerException e) {
                    e.getMessage();
                }

                jlb_tempo.setFont(new java.awt.Font("Tahoma", 0, 12));
                jlb_tempo.setText(new MenuController().globalTimePrepareSetText(lista.getTempoPreparo()));

                jlb_cod.setFont(new java.awt.Font("Tahoma", 1, 18));
                jlb_cod.setText(lista.getId() + " - ");

                jbt_adicionar.setFont(new java.awt.Font("Tahoma", 1, 13));
                jbt_adicionar.setText("Adicionar");
                new UniversalController().btColorPattern(jbt_adicionar);

                jbt_favorito.setFont(new java.awt.Font("Tahoma", 1, 13));
                jbt_favorito.setText("Favorito");
                new UniversalController().btColorPattern(jbt_favorito);

                javax.swing.GroupLayout jpLayout = new javax.swing.GroupLayout(jp);
                jp.setLayout(jpLayout);
                jpLayout.setHorizontalGroup(
                        jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpLayout.createSequentialGroup()
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jlb_descPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addGap(35, 35, 35)
                                                        .addComponent(jbt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jbt_favorito, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addComponent(jlb_cod)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jlb_nomePrato))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jlb_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(37, 37, 37)
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlb_precoPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(40, Short.MAX_VALUE))
                );
                jpLayout.setVerticalGroup(
                        jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpLayout.createSequentialGroup()
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jlb_cod)
                                                                .addComponent(jlb_nomePrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jlb_descPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jlb_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLayout.createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jlb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jbt_favorito)
                                                        .addComponent(jbt_adicionar))
                                                .addComponent(jlb_precoPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                );

                if (list.indexOf(lista) == 0) {//necessario executar apenas 1x no loop    
                    jp_principal1.setLayout(gridJp);
                }

                jp_principal1.add(jp);

                //expressão lambda: chama as funções para injetar uma ação nos botões 'adicionar' e 'favoritos'
                jbt_adicionar.addActionListener(e -> new MenuController().globalAddbtController(lista));

                //programação funcional: chama função de movimento
                jbt_adicionar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseMoved(jbt_adicionar);
                    }
                });
                jbt_adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseExited(jbt_adicionar);
                    }
                });

                jbt_favorito.addActionListener(e -> new MenuController().globalAddFavoritesController(lista.getId()));

                jbt_favorito.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseMoved(jbt_favorito);
                    }
                });
                jbt_favorito.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseExited(jbt_favorito);
                    }
                });

                //adiciona os componentes as suas respectivas listas
                lista_jp.add(jp);
                lista_jlb_nomePrato.add(jlb_nomePrato);
                lista_jlb_precoPrato.add(jlb_precoPrato);
                lista_jlb_descPrato.add(jlb_descPrato);
                lista_jlb_foto.add(jlb_foto);
                lista_jlb_cod.add(jlb_cod);
                lista_jlb_tempo.add(jlb_tempo);
                lista_jbt_adicionar.add(jbt_adicionar);
                lista_jbt_favorito.add(jbt_favorito);
            });

            //adiciona o painel principal no painel de rolagem
            jScrollPane.setViewportView(jp_principal1);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Categoria " + type.getType() + " não possui pratos registrados!", "ERRO LISTA VAZIA", JOptionPane.ERROR_MESSAGE);
        }
        pack();
        setLocationRelativeTo(null);
    }
    //</editor-fold>

    //<editor-fold desc=" Cria os componentes da tela - Referente a lista de favoritos ">
    private void createCompFavorites(DishType type, List<Favorites> list) {

        //criando componentes fixos
        lb_cabecalho = new javax.swing.JLabel();
        bt_verCarrinho = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jp_principal1 = new javax.swing.JPanel();
        bt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lb_cabecalho.setFont(new java.awt.Font("Arial", 1, 35));
        lb_cabecalho.setText(type.getType().toUpperCase()); //cabeçalho é editado pelo tipo de prato
        lb_cabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bt_verCarrinho.setText("VER CARRINHO");
        new UniversalController().btColorPattern(bt_verCarrinho);
        bt_verCarrinho.addActionListener((java.awt.event.ActionEvent evt) -> {
            bt_verCarrinhoActionPerformed(evt);
        });
        bt_verCarrinho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                new MenuController().globalMouseMoved(bt_verCarrinho);
            }
        });
        bt_verCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new MenuController().globalMouseExited(bt_verCarrinho);
            }
        });

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        bt_voltar.setFont(new java.awt.Font("Tahoma", 1, 14));
        bt_voltar.setText("Voltar");
        new UniversalController().btColorPattern(bt_voltar);
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        bt_voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                new UniversalController().btMouseMoved(bt_voltar);
            }
        });
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new MenuController().globalMouseExited(bt_voltar);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(113, 113, 113)
                                                                .addComponent(lb_cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(246, 246, 246)
                                                                .addComponent(bt_verCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 91, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lb_cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(bt_verCarrinho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addContainerGap())
        );

        //objeto que cria regra de quantidade de linhas para alocar os pratos(depende do tamanho da lista de pratos)
        try {
            GridLayout gridJp = new GridLayout(list.size(), 1, 0, 5);

            //criando componentes dinâmicos
            list.forEach(lista -> {

                JPanel jp = new JPanel();
                JLabel jlb_nomePrato = new JLabel();
                JLabel jlb_precoPrato = new JLabel();
                JLabel jlb_descPrato = new JLabel();
                JLabel jlb_foto = new JLabel();
                JLabel jlb_cod = new JLabel();
                JLabel jlb_tempo = new JLabel();
                JButton jbt_adicionar = new JButton();
                JButton jbt_remover = new JButton();

                jp.setBackground(java.awt.Color.white);
                jp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                jp.setPreferredSize(new java.awt.Dimension(612, 266));

                jlb_nomePrato.setFont(new java.awt.Font("Tahoma", 1, 18));
                jlb_nomePrato.setText(lista.getMenu().getNome());

                jlb_precoPrato.setBackground(new java.awt.Color(255, 255, 255));
                jlb_precoPrato.setFont(new java.awt.Font("Tahoma", 1, 14));
                jlb_precoPrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jlb_precoPrato.setText(String.format("R$ %.2f", lista.getMenu().getPreco()));
                jlb_precoPrato.setAlignmentY(0.0F);
                jlb_precoPrato.setAutoscrolls(true);
                jlb_precoPrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jlb_descPrato.setBackground(new java.awt.Color(255, 255, 255));
                jlb_descPrato.setFont(new java.awt.Font("Tahoma", 1, 14));
                jlb_descPrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jlb_descPrato.setText(lista.getMenu().getDescricao());
                jlb_descPrato.setAlignmentY(0.0F);
                jlb_descPrato.setAutoscrolls(true);
                jlb_descPrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                //adiciona foto a partir do endereço gravado no BD
                try {
                    jlb_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource(lista.getMenu().getEnderecoImg())));
                } catch (NullPointerException e) {
                    e.getMessage();
                }
                
                jlb_tempo.setFont(new java.awt.Font("Tahoma", 0, 12));
                jlb_tempo.setText(new MenuController().globalTimePrepareSetText(lista.getMenu().getTempoPreparo()));

                jlb_cod.setFont(new java.awt.Font("Tahoma", 1, 18));
                jlb_cod.setText(lista.getId() + " - ");

                jbt_adicionar.setFont(new java.awt.Font("Tahoma", 1, 13));
                jbt_adicionar.setText("Adicionar");
                new UniversalController().btColorPattern(jbt_adicionar);

                jbt_remover.setFont(new java.awt.Font("Tahoma", 1, 13));
                jbt_remover.setText("Remover");
                new UniversalController().btColorPattern(jbt_remover);

                javax.swing.GroupLayout jpLayout = new javax.swing.GroupLayout(jp);
                jp.setLayout(jpLayout);
                jpLayout.setHorizontalGroup(
                        jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpLayout.createSequentialGroup()
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jlb_descPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addGap(35, 35, 35)
                                                        .addComponent(jbt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jbt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addComponent(jlb_cod)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jlb_nomePrato))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jlb_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(37, 37, 37)
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlb_precoPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(40, Short.MAX_VALUE))
                );
                jpLayout.setVerticalGroup(
                        jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpLayout.createSequentialGroup()
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpLayout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jlb_cod)
                                                                .addComponent(jlb_nomePrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jlb_descPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jlb_tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLayout.createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jlb_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jbt_remover)
                                                        .addComponent(jbt_adicionar))
                                                .addComponent(jlb_precoPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                );

                if (list.indexOf(lista) == 0) {//necessario executar apenas 1x no loop    
                    jp_principal1.setLayout(gridJp);
                }

                jp_principal1.add(jp);

                //expressão lambda: chama as funções para injetar uma ação nos botões 'adicionar' e 'favoritos'
                jbt_adicionar.addActionListener(e -> new MenuController().globalAddbtController(lista.getMenu()));
                jbt_adicionar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseMoved(jbt_adicionar);
                    }
                });
                jbt_adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseExited(jbt_adicionar);
                    }
                });

                jbt_remover.addActionListener(e -> new FavoritesController().removeFavorites(lista.getId(), this));
                jbt_remover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseMoved(jbt_remover);
                    }
                });
                jbt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseExited(java.awt.event.MouseEvent evt) {
                        new MenuController().globalMouseExited(jbt_remover);
                    }
                });

                //adiciona os componentes as suas respectivas listas
                lista_jp.add(jp);
                lista_jlb_nomePrato.add(jlb_nomePrato);
                lista_jlb_precoPrato.add(jlb_precoPrato);
                lista_jlb_descPrato.add(jlb_descPrato);
                lista_jlb_foto.add(jlb_foto);
                lista_jlb_tempo.add(jlb_tempo);
                lista_jlb_cod.add(jlb_cod);
                lista_jbt_adicionar.add(jbt_adicionar);
                lista_jbt_remover.add(jbt_remover);
            });

            //adiciona o painel principal no painel de rolagem
            jScrollPane.setViewportView(jp_principal1);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Categoria " + type.getType() + " não possui pratos registrados!", "ERRO LISTA VAZIA", JOptionPane.ERROR_MESSAGE);
        }
        pack();
        setLocationRelativeTo(null);
    }
    //</editor-fold>    

}
