/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import views.cart.CartItemPanel;


/**
 *
 * @author hsnt
 */
public class Test {
    JFrame jFrame = new JFrame();
    JPanel cartPanel = new JPanel(new GridLayout(0,1));
    JPanel mainPanel = new JPanel(new GridLayout(1,0));

    public Test() {
        
        jFrame.setSize(700, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cartPanel.setBorder(BorderFactory.createTitledBorder("My Cart"));
        mainPanel.add(new JScrollPane(cartPanel));
        jFrame.add(mainPanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
    public void addObj(JPanel object){
        cartPanel.add(object);
    }
    public void deleteObj(JPanel object){
        cartPanel.remove(object);
    }
    public static void main(String[] args) {
//        CartItemPanel
        
        Test test = new Test();
        for(int i = 0 ; i < 5 ; i++){
            CartItemPanel cartItemPanel = new CartItemPanel();
            cartItemPanel.getdeleteButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    test.deleteObj(cartItemPanel);//To change body of generated methods, choose Tools | Templates.
                }
            });
            test.addObj(cartItemPanel);
            
        }
        
        
    }
}
