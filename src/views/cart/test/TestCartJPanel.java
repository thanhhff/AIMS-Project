/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;

import javax.swing.JFrame;
import views.cart.CartJPanel;

/**
 *
 * @author hsnt
 */
public class TestCartJPanel {
    public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(1200, 700);
		CartJPanel cartJPanel = new CartJPanel();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cartJPanel.setBounds(0, 0, 1000, 600);
		jFrame.add(cartJPanel);  
                jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);   
	}
}
