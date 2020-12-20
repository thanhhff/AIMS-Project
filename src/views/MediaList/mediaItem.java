/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.MediaList;

import static aims.AIMS.account;
import aims.FormatNumber;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Cart.CartItem;
import model.Media.Media;

/**
 *
 * @author User
 */
public class mediaItem extends javax.swing.JPanel {
    Media media = new Media() {};
    /**
     * Creates new form mediaItem
     */
    public mediaItem(Media media) {
        this.media = media;
        initComponents();
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/conan-resize.png"))); // NOI18N
        jLabel1.setText(media.getTitle());
        jLabel3.setText(String.valueOf(media.getPrice()) + " VND");
        
    }
    public JLabel getNameLabel(){
        return this.jLabel1;
    }
    public JLabel getPriceLabel(){
        return this.jLabel3;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addCartButton = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        minusMedia1 = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        plusMedia1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jButton1.setText("Thông tin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addCartButton.setText("Thêm giỏ hàng");
        addCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartButtonActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        minusMedia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/negative.png"))); // NOI18N
        minusMedia1.setBorderPainted(false);
        minusMedia1.setContentAreaFilled(false);
        minusMedia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusMedia1.setFocusPainted(false);
        minusMedia1.setName(""); // NOI18N
        minusMedia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMedia1MouseClicked(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        quantityLabel.setText("0");

        plusMedia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/plus1.png"))); // NOI18N
        plusMedia1.setBorderPainted(false);
        plusMedia1.setContentAreaFilled(false);
        plusMedia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusMedia1.setFocusPainted(false);
        plusMedia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMedia1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCartButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(minusMedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quantityLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(plusMedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel62))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityLabel)
                    .addComponent(minusMedia1)
                    .addComponent(plusMedia1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCartButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartButtonActionPerformed
        // TODO add your handling code here:
        CartItem.creat(account.getId(), media.getId(), media.getPrice(),Integer.parseInt(quantityLabel.getText()));
        if(Integer.parseInt(quantityLabel.getText()) != 0)
        JOptionPane.showMessageDialog(null, "Thêm giỏ hàng thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        else
           JOptionPane.showMessageDialog(null, "Bạn phải chọn số lượng!", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_addCartButtonActionPerformed

    private void plusMedia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMedia1MouseClicked
        // TODO add your handling code here:
         int quantity = Integer.parseInt(quantityLabel.getText());
         quantity += 1;
         quantityLabel.setName(""+quantity);
         quantityLabel.setText(String.valueOf(quantity));
    }//GEN-LAST:event_plusMedia1MouseClicked

    private void minusMedia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMedia1MouseClicked
        // TODO add your handling code here:
        int quantity = Integer.parseInt(quantityLabel.getText());
        if(quantity>0){
         quantity -= 1;
         quantityLabel.setName(""+quantity);
         quantityLabel.setText(String.valueOf(quantity));
        }
    }//GEN-LAST:event_minusMedia1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JButton minusMedia1;
    private javax.swing.JButton plusMedia1;
    private javax.swing.JLabel quantityLabel;
    // End of variables declaration//GEN-END:variables
}
