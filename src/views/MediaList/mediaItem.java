/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.MediaList;

import static aims.AIMS.account;
import aims.FormatNumber;
import java.awt.Font;
import java.awt.Label;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Cart.CartItem;
import model.Media.Book;
import model.Media.CD;
import model.Media.DVD;
import model.Media.LP;
import model.Media.Media;
import model.Media.MediaItem;
import model.Media.PhysicalGood;
import views.mediaAdmin.MediaAddFrame;
import views.mediaAdmin.MediaItemPanel;

/**
 *
 * @author User
 */
public class mediaItem extends javax.swing.JPanel {
//    Media media = new Media() {};
    MediaItem media;
//    /**
//     * Creates new form mediaItem
//     */
    public mediaItem(MediaItem media) {
        this.media = media;
        initComponents();
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/conan-resize.png"))); // NOI18N
        jLabel1.setText(media.getTitle());
        jLabel3.setText(String.valueOf(media.getPrice()) + " VND");
        if(media.getSalePercent() != 0){
            saleper.setText("-" + media.getSalePercent() + "%");
            jLabel4.setText(""+ (media.getPrice()*(100-media.getSalePercent())/100) +" VND");
            Map attributes = jLabel3.getFont().getAttributes();
            attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
            Font newFont = new Font(attributes);
            jLabel3.setFont(newFont);
        }
        else{
            jLabel4.setText(" ");
            saleper.setText(" ");
        }
        
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
        jLabel4 = new javax.swing.JLabel();
        saleper = new javax.swing.JLabel();

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 18, 18));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sale");

        saleper.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        saleper.setForeground(new java.awt.Color(241, 22, 22));
        saleper.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        saleper.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel62))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(minusMedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quantityLabel)
                .addGap(18, 18, 18)
                .addComponent(plusMedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(saleper, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(addCartButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel68)
                .addGap(6, 6, 6)
                .addComponent(jLabel62)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plusMedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel)
                    .addComponent(minusMedia1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(saleper))
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addGap(6, 6, 6)
                .addComponent(addCartButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         ArrayList<Media> medias = Media.getAllMedia();
            for(int i = 0; i < medias.size() ; i++){
                  if(medias.get(i).getId() == media.getId())
                   {
                        
                    int category_id = medias.get(i).getCategoryId();
                      MediaAddFrame media_frame;

                    switch (category_id) {
                       case 1:
                           Book book = (Book) medias.get(i);
                           media_frame = new MediaAddFrame(book, false);
                           System.out.printf("OK b");
                           break;
                       case 2:
                           DVD dvd = (DVD) medias.get(i);
                           media_frame = new MediaAddFrame(dvd, false);
                            System.out.printf("OK dvd");
                           break;
                       case 3:
                           CD cd = (CD) medias.get(i);
                           media_frame = new MediaAddFrame(cd, false);
                           System.out.printf("OK");
                           break;
                       case 4:
                           LP lp = (LP) medias.get(i);                           
                           System.out.printf("OK cd");
                           media_frame = new MediaAddFrame(lp, false);
                           break;
                       default:
                           Book new_book = (Book) medias.get(i);
                           System.out.printf("OK new");
                           media_frame = new MediaAddFrame(new_book, false);
                   }
                            media_frame.setLocationRelativeTo(null);
                            media_frame.setVisible(true);                 

                }
       }
         
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JButton minusMedia1;
    private javax.swing.JButton plusMedia1;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel saleper;
    // End of variables declaration//GEN-END:variables
}
