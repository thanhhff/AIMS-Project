/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import aims.FormatNumber;
import controller.Cart.CartController;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import model.Cart.CartItem;
import model.Cart.ShippingInfo;
import model.User.User;

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
    private User user;
    private CartController cartController;

    public CartPanel(User user, CartController cartController) {
        this.user = user;
        this.cartController = cartController;
        setLayout(null);
        setSize(1000, 600);
        List<CartItem> cartItems = user.getCartItems();
        if (cartItems != null) {
            cartList = new CartList(user.getCartItems(), cartController);
            deliveryPanel = new DeliveryPanel(user);
            billPanel = new BillPanel();
            checkoutButton = new JButton();
            totalBill = cartList.getTotalAll();

            changeBill();
            cartList.setBounds(12, 12, CartList.MAX_WIDTH, CartList.MAX_HEIGHT);
            if (cartList.getMediaCount() < 3) {
                cartList.setBounds(12, 12, CartList.MAX_WIDTH, (CartItemPanel.HEIGHT + 20) * cartList.getMediaCount());
            }

            cartList.getchangeMedia().forEach((button) -> {
                button.addActionListener((ActionEvent e) -> {
                    if (button.getName().contains("+")) {
                        int select = JOptionPane.showConfirmDialog(null, "You're sure?");
                        if (select == JOptionPane.YES_OPTION) {
                            totalBill -= Integer.parseInt(button.getName());
                            CartItemPanel cartItemPanel = (CartItemPanel) button.getParent();
                            CartItem cartItem = cartItemPanel.getCartItem();
                            cartList.deleteObj(cartItemPanel);
                            cartController.deleteCartItem(cartItem);
                            cartList.revalidate();
                            cartList.repaint();
                        }                        
                    } else {
                        totalBill += Integer.parseInt(button.getName());
                    }
                    changeBill();
                });
            });

            deliveryPanel.setBounds(CartList.MAX_WIDTH + 30, 12, DeliveryPanel.WIDTH, DeliveryPanel.HEIGHT);
            billPanel.setBounds(CartList.MAX_WIDTH + 30, DeliveryPanel.WIDTH + 30 + 30, BillPanel.WIDTH, BillPanel.HEIGHT);

            checkoutButton.setText("Checkout");
            checkoutButton.setFocusPainted(false);
            checkoutButton.setBounds(CartList.MAX_WIDTH + 30, 12 + DeliveryPanel.HEIGHT + 30 + 30 + BillPanel.HEIGHT, DeliveryPanel.WIDTH, 35);

            checkoutButton.addActionListener((ActionEvent e) -> {
                ShippingInfo shippingInfo = deliveryPanel.getSelected();
                if (shippingInfo != null) {

                    JDialog jDialog = new JDialog();
                    int ship_fee = cartController.getShipFee(user.getCartItems());
                    CheckOut checkOut = new CheckOut(shippingInfo, deliveryPanel.getNoteText(), totalBill, ship_fee);
                    jDialog.setSize(650, 700);
                    checkOut.setBounds(0, 0, 650, 700);
                    jDialog.setUndecorated(true);
                    jDialog.add(checkOut);
                    jDialog.setLocationRelativeTo(null);

                    checkOut.getcancelButton().addActionListener((ActionEvent e1) -> {
                        jDialog.dispose();
                    });
                    checkOut.getConfirmButton().addActionListener((ActionEvent e1) -> {
                        if (checkOut.checkCVV() && checkOut.checkCardNumber() && checkOut.checkDateNumber()) {

                        } else {
                            JOptionPane.showMessageDialog(null, "Card Imput Error.\nCard Number : XXXXXX_groupXX_2020.\n Date: MM/YY.\n CVV has 3 number.");
                        }
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
        } else {
            JOptionPane.showMessageDialog(null, "Cart empty");
        }
    }

    private void changeBill() {
        billPanel.getTotalBillLabel().setName("" + totalBill);
        billPanel.getTotalBillLabel().setText(FormatNumber.formatString("" + totalBill) + " VND");

        billPanel.getProvisialLabel().setName("" + totalBill);
        billPanel.getProvisialLabel().setText(FormatNumber.formatString("" + totalBill) + " VND");
    }
}
