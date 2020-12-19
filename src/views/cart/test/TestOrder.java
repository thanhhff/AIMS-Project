/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Cart.Order;
import model.User.User;
import views.order.OrderDetalPanel;
import views.order.OrderList;
import views.order.OrderMediaDetailPanel;

/**
 *
 * @author hsnt
 */
public class TestOrder {
    JFrame jFrame = new JFrame();
    public TestOrder(JPanel panel) {
        jFrame.setLayout(null);
        jFrame.setSize(1200, 700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        panel.setBounds(0,0, panel.getWidth(), panel.getHeight());
        jFrame.add(panel);
        
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) { 
        User user = new User(1);
        TestOrder test = new TestOrder(new OrderList(user.getOrders()));
        
    }
}
