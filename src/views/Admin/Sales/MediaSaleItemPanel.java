/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Admin.Sales;

import aims.FormatNumber;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.Media.Media;
import model.Media.PhysicalGood;
import model.Sale.MediaSale;

/**
 *
 * @author hsnt
 */
public class MediaSaleItemPanel extends javax.swing.JPanel {

    /**
     * Creates new form MediaSaleItem
     */
    private MediaSale mediaSale;
    private Media media;
    private boolean status_pecent = false;
    public static final int WIDTH = 576;
    public static final int HEIGHT = 142;

    public MediaSaleItemPanel(Media md) {
        setSize(WIDTH, HEIGHT);
        if(md instanceof  PhysicalGood){
            PhysicalGood media = (PhysicalGood) md;
            initComponents(); 
            this.media = media;
            mediaSale = new MediaSale(media.getId());
            mediaTitle.setText(media.getTitle());
            int category_index = media.getCategoryId() - 1;
            String[] categories = {"Book", "DVD", "CD", "LP"};
            categoryLabel.setText(categories[category_index]);
            valueLabel.setText(FormatNumber.formatString(media.getValue() + ""));
            valueLabel.setName(media.getValue() + "");
            priceLabel.setText(FormatNumber.formatString(media.getPrice() + ""));
            priceLabel.setName(media.getPrice() + "");
            quantityLabel.setText(media.getQuantity() + "");
            newPriceLabel.setText(priceLabel.getText());
            int min_sale = (int) media.getValue() * 30 / 100;
            int max_sale = (int) media.getValue() * 150 / 100;
            changeValue(min_sale, max_sale);  
            quantitySale.removeAllItems();
            for(int i = 1 ; i <=  media.getQuantity() ; i ++){
                quantitySale.addItem("" + i);
            }
            
        }
    }

    public boolean isStatus() {
        return status_pecent ;
    }   
    public int getQuantitySale(){
        return Integer.parseInt(quantitySale.getSelectedItem().toString());
    }
    public int getPrecentSale(){
        return getValueNumber(precentLabel);
    }
    public void setSaleValue(int value){
       precentLabel.setText("" + value);
    }
    public MediaSale getMediaSale(){
        mediaSale.setQuantity(getQuantitySale());
        mediaSale.setPercent(getPrecentSale());
        return mediaSale;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mediaTitle = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precentLabel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newPriceLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        quantitySale = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mediaTitle.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        mediaTitle.setText("jLabel1");

        categoryLabel.setText("jLabel1");

        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        valueLabel.setText("jLabel1");

        jLabel2.setText("VND");

        jLabel3.setText("Value: ");

        jLabel4.setText("Price: ");

        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceLabel.setText("jLabel5");

        jLabel5.setText("VND");

        jLabel6.setText("Quantity: ");

        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        quantityLabel.setText("jLabel7");

        jLabel7.setText("Sale off: ");

        jLabel8.setText("Quantity sale: ");

        precentLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        precentLabel.setText("0");
        precentLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precentLabelActionPerformed(evt);
            }
        });

        jLabel9.setText("%");

        jLabel10.setText("New Price : ");

        newPriceLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        newPriceLabel.setForeground(new java.awt.Color(247, 25, 25));
        newPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newPriceLabel.setText("jLabel11");

        jLabel12.setText("VND");

        quantitySale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitySaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mediaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(precentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46)
                                .addComponent(quantityLabel)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(quantitySale, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediaTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(categoryLabel)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(valueLabel)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(priceLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(quantitySale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(quantityLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(newPriceLabel)
                        .addComponent(jLabel12)))
                .addGap(4, 4, 4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void precentLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precentLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precentLabelActionPerformed

    private void quantitySaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitySaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitySaleActionPerformed
    private int getValueNumber(JTextField textField) {
        try {
            int value = Integer.parseInt(textField.getText());
            return value;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void changeValue( int min, int max) {
        precentLabel.getDocument().addDocumentListener(new DocumentListener() {
           
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                int precent = getValueNumber(precentLabel);
                int sale = Math.round((100-precent) * media.getPrice() / 100);
                if (precent == 0) {

                } else if (precent == -1 || sale < min || sale > max) {
                    precentLabel.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                    newPriceLabel.setText("NaN");
                    status_pecent = false;
                } else {
                    precentLabel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                    newPriceLabel.setText(FormatNumber.formatString("" + sale));
                    status_pecent = true;
                }
            }
        });
    }

//    private void changeSaleoff() {
//        precentLabel.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                int precent = getPrecent();
//                if (precent == 0) {
//
//                } else if (precent == -1 || precent < 30 || precent > 150) {
//                    precentLabel.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
//                } else {
//                    precentLabel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
//                    newPriceLabel.setText(FormatNumber.formatString("" + (media.getValue() * precent)));
//                }
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mediaTitle;
    private javax.swing.JLabel newPriceLabel;
    private javax.swing.JTextField precentLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JComboBox<String> quantitySale;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
