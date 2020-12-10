/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import views.cart.CartPanel;



/**
 *
 * @author hsnt
 */
public class Test {
    JFrame jFrame = new JFrame();

    public Test(JPanel panel) {
        
        jFrame.setSize(1200, 700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        panel.setBounds(0,0, panel.getWidth(), panel.getHeight());
        jFrame.add(panel);
        
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
    
    public static void main(String[] args) { 
        Test test = new Test(new CartPanel());
        
    }
}
