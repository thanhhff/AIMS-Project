/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart;

import aims.FormatNumber;
import controller.Cart.CartController;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import model.Cart.CartItem;

/**
 *
 * @author hsnt
 */
public class CartItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form CartItemPanel
     */
	public static final int WIDTH = 630;
	public static final int HEIGHT = 190;
        private CartItem cartItem;
        private CartController cartController;
    public CartItemPanel(CartItem cartItem,CartController cartController) {
        this.cartController = cartController;
        initComponents();
        this.cartItem = cartItem;
        
        mediaNameLabel.setText(this.cartItem.getMediaName());
        
        quantityLabel.setName("" + this.cartItem.getQuantity());
        quantityLabel.setText(FormatNumber.formatString(quantityLabel.getName()));
        
        totalPrice.setName("" + (this.cartItem.getPrice() * this.cartItem.getQuantity()));
        totalPrice.setText(FormatNumber.formatString(totalPrice.getName()));
        
        priceLabel.setName("" + this.cartItem.getPrice());
        priceLabel.setText(FormatNumber.formatString(priceLabel.getName()));
        
        imageLabel.setBounds(12, 12, 143, 164);
        imageLabel.setPreferredSize(new Dimension(143, 164));
        imageLabel.setMaximumSize(new Dimension(143, 164));
        imageLabel.setMinimumSize(new Dimension(143, 164));
        try {
            BufferedImage img = ImageIO.read(new File("src/views/images/conan-resize3.png"));
            Image dimg = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            imageLabel.setIcon(imageIcon);
        } catch (IOException e) {
            System.out.println("Can't file"); 
        }
        plusMedia.setName(priceLabel.getName());
        minusMedia.setName("-"+priceLabel.getName());
        setValueButtonDelete();
    }
       public JButton getdeleteButton(){
           return this.deleteButton;
       }
       public JButton getMinusMedia(){
           return this.minusMedia;
       }
       public JButton getPlusMedia(){
           return this.plusMedia;
       }
       public int getTotalPrice(){
           return Integer.parseInt(totalPrice.getName());
       }

    public CartItem getCartItem() {
        return cartItem;
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mediaNameLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        plusMedia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        minusMedia = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(630, 190));
        setPreferredSize(new java.awt.Dimension(630, 190));

        mediaNameLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        mediaNameLabel.setText("Conan");

        imageLabel.setMaximumSize(new java.awt.Dimension(143, 164));
        imageLabel.setMinimumSize(new java.awt.Dimension(143, 164));
        imageLabel.setPreferredSize(new java.awt.Dimension(143, 164));

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/trash.png"))); // NOI18N
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setFocusPainted(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        quantityLabel.setText("8");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("X");

        priceLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(241, 38, 38));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceLabel.setText("100000");

        plusMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/plus1.png"))); // NOI18N
        plusMedia.setBorderPainted(false);
        plusMedia.setContentAreaFilled(false);
        plusMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusMedia.setFocusPainted(false);
        plusMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusMediaActionPerformed(evt);
            }
        });

        jLabel4.setText("=");

        totalPrice.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        totalPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPrice.setText("800000");

        jLabel6.setText("(VND)");

        minusMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/negative.png"))); // NOI18N
        minusMedia.setBorderPainted(false);
        minusMedia.setContentAreaFilled(false);
        minusMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusMedia.setFocusPainted(false);
        minusMedia.setName(""); // NOI18N
        minusMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusMediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minusMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plusMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6))
                            .addComponent(deleteButton))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mediaNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mediaNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(plusMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(minusMedia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void plusMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusMediaActionPerformed
        int quantity = Integer.parseInt(quantityLabel.getName());
        int price = Integer.parseInt(priceLabel.getName());
        int total = Integer.parseInt(totalPrice.getName());
        quantity += 1;
        quantityLabel.setName(""+quantity);
        quantityLabel.setText(FormatNumber.formatString(quantityLabel.getName()));
        totalPrice.setName("" + (price*quantity));
        totalPrice.setText(FormatNumber.formatString(totalPrice.getName()));
        this.cartController.updateQuantity(cartItem, this.cartItem.getQuantity() + 1);
        setValueButtonDelete();
    }//GEN-LAST:event_plusMediaActionPerformed

    private void minusMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusMediaActionPerformed
        int quantity = Integer.parseInt(quantityLabel.getName());
        int price = Integer.parseInt(priceLabel.getName());
        int total = Integer.parseInt(totalPrice.getName());
        if(quantity == 1){
            
        }else{
            quantity -= 1;
            quantityLabel.setName(""+quantity);
            quantityLabel.setText(FormatNumber.formatString(quantityLabel.getName()));
            totalPrice.setName("" + (price*quantity));
            totalPrice.setText(FormatNumber.formatString(totalPrice.getName()));
            this.cartController.updateQuantity(cartItem, this.cartItem.getQuantity() - 1);
            setValueButtonDelete();
        }
    }//GEN-LAST:event_minusMediaActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        setValueButtonDelete();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void setValueButtonDelete(){
        deleteButton.setName("+" + totalPrice.getName());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel mediaNameLabel;
    private javax.swing.JButton minusMedia;
    private javax.swing.JButton plusMedia;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
