/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;

import javax.swing.JFrame;
import views.cart.CheckOut;

/**
 *
 * @author hsnt
 */
public class TestCheckOut {
    public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(650, 700);
		CheckOut checkout = new CheckOut();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                checkout.setBounds(0, 0, 650, 700);
		jFrame.add(checkout);  
//		jFrame.setUndecorated(true);
                jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);   
	}
}
