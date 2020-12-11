/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;

import javax.swing.JButton;
import javax.swing.JPanel;
import views.cart.ShippingInfo;
import views.cart.ShippingList;

/**
 *
 * @author hsnt
 */
public class ShippingPanel extends JPanel{
   
    public static final int WIDTH = ShippingInfo.WIDTH + 60;
    public static final int HEIGHT = 800;
    private JButton submitButton = new JButton("Submit");
    private JButton cacelButton = new JButton("Cancel");
    
    public ShippingPanel() {
        setLayout(null);
        ShippingList shippingList = new ShippingList();        
        shippingList.setBounds(12, 12, ShippingInfo.WIDTH + 36, 400);
        
        add(shippingList);
        
//        submitButton.setBounds(, ERROR, WIDTH, HEIGHT);
        setSize(WIDTH,HEIGHT);
    }
    
}
