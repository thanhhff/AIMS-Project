/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart;

import aims.FormatNumber;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hsnt
 */
public class CartPanel extends JPanel {

    private CartList cartList;
    private DeliveryPanel deliveryPanel;
    private BillPanel billPanel;
    private JButton checkoutButton;
    private int totalBill;

    public CartPanel() {
        setLayout(null);
        setSize(1000, 600);
        cartList = new CartList();
        deliveryPanel = new DeliveryPanel();
        billPanel = new BillPanel();
        checkoutButton = new JButton();
        totalBill = cartList.getTotalAll();

        changeBill();

        cartList.setBounds(12, 12, CartList.MAX_WIDTH, CartList.MAX_HEIGHT);
        cartList.getchangeMedia().forEach((button) -> {
            button.addActionListener((ActionEvent e) -> {
                totalBill += Integer.parseInt(button.getName());
                changeBill();
            });
        });

        deliveryPanel.setBounds(cartList.getWidth() + 30, 12, deliveryPanel.getWidth(), deliveryPanel.getHeight());
        billPanel.setBounds(cartList.getWidth() + 30, deliveryPanel.getHeight() + 30, billPanel.getWidth(), billPanel.getHeight());

        checkoutButton.setText("Checkout");
        checkoutButton.setFocusPainted(false);
        checkoutButton.setBounds(cartList.getWidth() + 30, 12 + deliveryPanel.getHeight() + 30 + 30 + billPanel.getHeight(), deliveryPanel.getWidth(), 35);

        checkoutButton.addActionListener((ActionEvent e) -> {         
            if (deliveryPanel.getWardNew() != null) {

                JDialog jDialog = new JDialog();
                CheckOut checkOut = new CheckOut(deliveryPanel.getNameNew(), deliveryPanel.getPhoneNew(),
                        deliveryPanel.getProvinceNew(), deliveryPanel.getDistrictNew(), deliveryPanel.getWardNew(),
                        deliveryPanel.getNoteText(), totalBill, 100000);
                jDialog.setSize(650, 700);
                checkOut.setBounds(0, 0, 650, 700);
                jDialog.setUndecorated(true);
                jDialog.add(checkOut);
                jDialog.setLocationRelativeTo(null);

                checkOut.getcancelButton().addActionListener((ActionEvent e1) -> {
                    jDialog.dispose();
                });

                jDialog.setModal(true);
                jDialog.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please import address");
            }
        });

        add(checkoutButton);
        add(cartList);
        add(deliveryPanel);
        add(billPanel);
    }

    private void changeBill() {
        billPanel.getTotalBillLabel().setName("" + totalBill);
        billPanel.getTotalBillLabel().setText(FormatNumber.formatString("" + totalBill) + " VND");

        billPanel.getProvisialLabel().setName("" + totalBill);
        billPanel.getProvisialLabel().setText(FormatNumber.formatString("" + totalBill) + " VND");
    }
}
