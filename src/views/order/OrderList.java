/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.order;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Cart.Order;

/**
 *
 * @author hsnt
 */
public class OrderList extends JPanel{

    public static int WIDTH = 600;
    public static int HEIGHT = 570;
    
    private JPanel orderJPanel;

    public OrderList(List<Order> orders) {
        setLayout(new GridLayout(1,0));
        orderJPanel = new JPanel(new GridLayout(0,1));
        add(new JScrollPane(orderJPanel));
        for(Order order : orders){
            OrderDetalPanel orderDetalPanel = new OrderDetalPanel(order);
            this.addObj(orderDetalPanel); 
        } 
        setSize(WIDTH,HEIGHT);
    }
    public void addObj(JPanel object){
        orderJPanel.add(object);
    }
    
}
