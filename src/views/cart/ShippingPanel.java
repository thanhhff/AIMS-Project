/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.Cart.ShippingInfo;
import model.User.User;

/**
 *
 * @author hsnt
 */
public class ShippingPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShippingPanel1
     */
    public static final int WIDTH = 490;
    public static final int HEIGHT = 500;
    private JPanel listShipInfo = new JPanel(new GridLayout(0,1));
    private ShippingList shippingList ;
    private ButtonGroup buttonGroup = new ButtonGroup();
    public ShippingPanel(User user) {
        initComponents();
        
        List<ShippingInfo> shipping_list_id = user.getShippingList(); // Check NULL
        shippingList = new ShippingList(shipping_list_id);
        shippingList.setBounds(12, 64, 462, 367);
        add(shippingList);
        
        setSize(WIDTH, HEIGHT);
    }
    public JButton getSubmit(){
        return submitButton;
    }
    public JButton getCancel(){
        return cancelButton;
    }
    public ShippingInfo selectedInfo(){
        return shippingList.selectedInfo();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Shipping Infomation");

        submitButton.setText("Submit");
        submitButton.setFocusPainted(false);

        cancelButton.setText("Cancel");
        cancelButton.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addGap(92, 92, 92)
                        .addComponent(cancelButton)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(412, 412, 412)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
