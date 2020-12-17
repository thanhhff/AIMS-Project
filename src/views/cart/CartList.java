/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart;

import controller.Cart.CartController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Cart.CartItem;


/**
 *
 * @author hsnt
 */
public class CartList extends JPanel{
    private JPanel cartPanel;    
    private List<JButton> changeMedia;
    private int totalAll = 0;
    public static final int MAX_WIDTH = 650;
    public static final int MAX_HEIGHT = 600;
    private int mediaCount = 0;
    private CartController cartController;
    public CartList(List<CartItem> cartItems,CartController cartController) {        
        this.cartController = cartController;
        setLayout(new GridLayout(1,0));
        cartPanel = new JPanel(new GridLayout(0,1));
        add(new JScrollPane(cartPanel));
        changeMedia = new ArrayList<JButton>();
        for(CartItem cartItem : cartItems){
            CartItemPanel cartItemPanel = new CartItemPanel(cartItem,cartController);
            this.addObj(cartItemPanel);
            changeMedia.add(cartItemPanel.getMinusMedia());
            changeMedia.add(cartItemPanel.getPlusMedia());
            changeMedia.add(cartItemPanel.getdeleteButton());
//            cartItemPanel.getdeleteButton().addActionListener((ActionEvent e) -> {
//                int select = JOptionPane.showConfirmDialog(null, "You're sure?");
//                if(select == JOptionPane.YES_OPTION){
//                    this.deleteObj(cartItemPanel);
//                    cartController.deleteCartItem(cartItem);
//                    mediaCount -= 1;
//                    this.revalidate();
//                    this.repaint();
//                }
//            });
            totalAll += cartItemPanel.getTotalPrice();
            mediaCount += 1;
        }  
    }
    public void addObj(JPanel object){
        cartPanel.add(object);
    }
    public void deleteObj(JPanel object){
        cartPanel.remove(object);
    }
    public List<JButton> getchangeMedia(){
        return this.changeMedia;
    }
    public int getTotalAll(){
        return this.totalAll;
    }
    public int getMediaCount() {
    	return this.mediaCount;
    }
}
