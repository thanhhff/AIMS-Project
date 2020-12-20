/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.MediaList;

import controller.Search.SearchController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Media.Media;

/**
 *
 * @author User
 */
public class mediaTest {
     JFrame jFrame = new JFrame();
     public mediaTest(JPanel panel) {
        
        jFrame.setSize(1200, 700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        panel.setBounds(0,0, panel.getWidth(), panel.getHeight());
        jFrame.add(panel);
        
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
     public static void main(String[] args) {

       mediaListPanel mediaItem = new  mediaListPanel();  
       mediaTest test = new mediaTest(mediaItem);
    }
}
