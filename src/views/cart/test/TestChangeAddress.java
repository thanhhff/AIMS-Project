/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;

import javax.swing.JFrame;
import views.cart.ChangeAddress;

/**
 *
 * @author hsnt
 */
public class TestChangeAddress {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(500, 550);
		ChangeAddress changeAddress = new ChangeAddress();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                changeAddress.setBounds(0, 0, 500, 450);
		jFrame.add(changeAddress);  
//		jFrame.setUndecorated(true);
		jFrame.setVisible(true);   
	}
}
