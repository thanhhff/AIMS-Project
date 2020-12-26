/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;
import controller.Media.MediaController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Media.Media;
import views.mediaAdmin.MediaPanel;



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
        ArrayList<Media> medias = Media.getAllMedia();
        new Test(new MediaPanel(medias));
//        new Test(new MediaSalePanel(medias));
    }
}
