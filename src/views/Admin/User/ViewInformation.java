/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Admin.User;

import controller.User.UserController;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.Cart.ShippingInfo;
import model.User.Account;
import model.User.User;
import views.cart.ChangeAddress;

/**
 *
 * @author thanhhff
 */
public class ViewInformation extends javax.swing.JFrame {
    UserController userController = new UserController();
    User user = null;
    int user_id = 0;
    /**
     * Creates new form ViewInformation
     */
    public ViewInformation(int user_id) {
        initComponents();
        ShipInforButton.hide();
        
        Account account = userController.getAccount(user_id);

        Username.setText("Username: " + account.getUsername());
        String accType = "null";
        if (account.getLv() == 0){
            accType = "User";
            fillShippingInfor(user_id);
        } else if (account.getLv() == 1)
        {
            accType = "Admin";
            ShippingInfor.hide();
        }
        AccountType.setText("Account Type: " + accType);
    }
    
     public void fillShippingInfor(int user_id)
    {
        user = new User(user_id);
          // Shipping Infor
        ShippingInfo shipInfor = userController.getShipInfor(user_id);
        
        if (shipInfor == null)
        {
            txtName.setText("Name: null");
            txtPhone.setText("Phone: null");
            txtAddress.setText("Address: null");
            ShipInforButton.show();
            ShipInforButton.setText("Add");
        } else 
        {
            txtName.setText("Name: " + shipInfor.getName());
            txtPhone.setText("Phone: " + shipInfor.getPhone());
            txtAddress.setText("Address: " + shipInfor.getWardObject().getWard() + "-" + shipInfor.getWardObject().getDistrict() + "-" + shipInfor.getWardObject().getProvince());
            ShipInforButton.show();
            ShipInforButton.setText("Change");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        AccountType = new javax.swing.JLabel();
        ShippingInfor = new javax.swing.JPanel();
        txtName = new javax.swing.JLabel();
        txtPhone = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        ShipInforButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));

        Username.setText("Username: ");

        AccountType.setText("Account Type:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountType)
                    .addComponent(Username))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Username)
                .addGap(18, 18, 18)
                .addComponent(AccountType)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        ShippingInfor.setBorder(javax.swing.BorderFactory.createTitledBorder("Shipping Information"));

        txtName.setText("Name:");

        txtPhone.setText("Phone:");

        txtAddress.setText("Address:");

        ShipInforButton.setText("jButton1");
        ShipInforButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipInforButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShippingInforLayout = new javax.swing.GroupLayout(ShippingInfor);
        ShippingInfor.setLayout(ShippingInforLayout);
        ShippingInforLayout.setHorizontalGroup(
            ShippingInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShippingInforLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(ShippingInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress)
                    .addComponent(txtPhone)
                    .addComponent(txtName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShippingInforLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ShipInforButton)
                .addContainerGap())
        );
        ShippingInforLayout.setVerticalGroup(
            ShippingInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShippingInforLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtName)
                .addGap(26, 26, 26)
                .addComponent(txtPhone)
                .addGap(32, 32, 32)
                .addComponent(txtAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(ShipInforButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShippingInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ShippingInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(82, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShipInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipInforButtonActionPerformed
        // TODO add your handling code here:

        JDialog jDialog = new JDialog();
        ChangeAddress changeAddress = new ChangeAddress(user);
        jDialog.setSize(ChangeAddress.WIDTH, ChangeAddress.HEIGHT);
        changeAddress.setBounds(0, 0, ChangeAddress.WIDTH, ChangeAddress.HEIGHT);
        jDialog.setUndecorated(true);
        jDialog.add(changeAddress);
        jDialog.setLocationRelativeTo(null);

        changeAddress.getSubmitButton().addActionListener((ActionEvent e) -> {
            if (changeAddress.getNameNew().equals("") || changeAddress.getPhoneNew().equals("")) {
                JOptionPane.showMessageDialog(null, "Plese import name and phone number");
            } else {
                ShippingInfo  shippingInfo = changeAddress.getShippingInfo();

                shippingInfo.create();
                jDialog.dispose();
            }
        });
        changeAddress.getCancelButton().addActionListener((ActionEvent e) -> {
            jDialog.dispose();
        });

        jDialog.setModal(true);

        jDialog.setVisible(true);
        fillShippingInfor(user_id);
    }//GEN-LAST:event_ShipInforButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewInformation().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountType;
    private javax.swing.JButton Back;
    private javax.swing.JButton ShipInforButton;
    private javax.swing.JPanel ShippingInfor;
    private javax.swing.JLabel Username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPhone;
    // End of variables declaration//GEN-END:variables
}
