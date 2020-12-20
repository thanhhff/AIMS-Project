/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.HomeUser;

import static aims.AIMS.account;
import controller.Search.SearchController;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Media.Media;
import model.User.User;
import views.MediaList.mediaList;
import views.account.UserPanel.AccountPanel;
import views.cart.CartPanel;

/**
 *
 * @author thanhhff
 */
public final class HomeUser extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HomeUser() {
        initComponents();
        setLayout(null);
        fill();
    }

    public void fill() {
        ArrayList<Media> list = new ArrayList<Media>();
        SearchController.SearchRandom(list);
        mediaList media = new mediaList(list);
        jpLayout.setLayout(new BorderLayout());
        jpLayout.add(media, BorderLayout.CENTER);
        jpLayout.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jpLayout = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        Cart = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpLayoutLayout = new javax.swing.GroupLayout(jpLayout);
        jpLayout.setLayout(jpLayoutLayout);
        jpLayoutLayout.setHorizontalGroup(
                jpLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jpLayoutLayout.setVerticalGroup(
                jpLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 698, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/magnifying-glass.png"))); // NOI18N

        Account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/user-resize1.png"))); // NOI18N
        Account.setText("Account");
        Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMouseClicked(evt);
            }
        });

        Cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/shopping-cart.png"))); // NOI18N
        Cart.setText("Cart");
        Cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartMouseClicked(evt);
            }
        });

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/logo-resize-1.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Home)
                                .addGap(36, 36, 36)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 593, Short.MAX_VALUE)
                                .addComponent(Cart, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Account)
                                .addGap(40, 40, 40))
                        .addComponent(jpLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator2)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Account, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addComponent(jLabel2))
                                                .addComponent(Cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(Home)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jpLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void AccountMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jpLayout.removeAll();
        AccountPanel accPanel = new AccountPanel();
        jpLayout.setLayout(new BorderLayout());
        jpLayout.add(accPanel, BorderLayout.CENTER);
        jpLayout.updateUI();
    }

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jpLayout.removeAll();
        ArrayList<Media> list = new ArrayList<Media>();
        SearchController.SearchRandom(list);
        mediaList media = new mediaList(list);
        jpLayout.setLayout(new BorderLayout());
        jpLayout.add(media, BorderLayout.CENTER);
        jpLayout.updateUI();
    }

    private void CartMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        User user = new User(account.getId());
        if (user.getCartItems() == null) {
            JOptionPane.showMessageDialog(null, "Cart empty");
        } else {
            CartPanel cart = new CartPanel(user);

            jpLayout.removeAll();
            jpLayout.setLayout(new BorderLayout());
            cart.setBounds(0, 0, jpLayout.getWidth(), jpLayout.getHeight());
            jpLayout.add(cart);
            jpLayout.updateUI();
        }

    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Account;
    private javax.swing.JLabel Cart;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpLayout;
    // End of variables declaration                   
}
