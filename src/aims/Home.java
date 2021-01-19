/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aims;



import views.HomeUser.*;
import static aims.AIMS.account;
import controller.Cart.CartController;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Cart.ShippingInfo;
import model.User.User;
import views.MediaList.mediaListPanel;
import views.account.Login;
import views.account.UserPanel.AccountPanel;
import views.cart.CartPanel;
import views.cart.CheckOut;

/**
 *
 * @author thanhhff
 */
public final class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLayout(null);
        if (account.getLv() == 1)
        {
            SignIn.setText("Sigout");
            
        }
        else
        {
            DashBoard.hide();
        }
        fill();
    }
    
    public void fill()
    {   
        mediaListPanel media = new mediaListPanel();  
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLayout = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        searchText = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        SignIn = new javax.swing.JLabel();
        DashBoard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpLayoutLayout = new javax.swing.GroupLayout(jpLayout);
        jpLayout.setLayout(jpLayoutLayout);
        jpLayoutLayout.setHorizontalGroup(
            jpLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpLayoutLayout.setVerticalGroup(
            jpLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/magnifying-glass-2.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/logo-resize-1.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        SignIn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/password.png"))); // NOI18N
        SignIn.setText("Sign In");
        SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInMouseClicked(evt);
            }
        });

        DashBoard.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        DashBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/left-arrow.png"))); // NOI18N
        DashBoard.setText("Dashboard");
        DashBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashBoardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Home)
                .addGap(36, 36, 36)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 564, Short.MAX_VALUE)
                .addComponent(DashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(jpLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchText)
                    .addComponent(SignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(search)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(DashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        jpLayout.removeAll();
        mediaListPanel media = new  mediaListPanel();  
        jpLayout.setLayout(new BorderLayout());
        jpLayout.add(media, BorderLayout.CENTER);
        jpLayout.updateUI();
    }//GEN-LAST:event_HomeMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        String searchStr;
        searchStr = searchText.getText();
        jpLayout.removeAll();
        mediaListPanel media = new  mediaListPanel(searchStr);  
        jpLayout.setLayout(new BorderLayout());
        jpLayout.add(media, BorderLayout.CENTER);
        jpLayout.updateUI();
    }//GEN-LAST:event_searchMouseClicked

    private void SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_SignInMouseClicked

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void DashBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashBoardMouseClicked
        // TODO add your handling code here:
        views.Admin.Home adminHome = new views.Admin.Home();
        this.setVisible(false);
        adminHome.setVisible(true);
        adminHome.setLocationRelativeTo(null);
    }//GEN-LAST:event_DashBoardMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DashBoard;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel SignIn;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpLayout;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}