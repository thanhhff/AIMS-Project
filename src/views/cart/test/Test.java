/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart.test;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Media.Book;
import model.Media.Media;
import model.Media.PhysicalGood;
import model.User.User;
import views.Admin.Sales.MediaSaleItemPanel;
import views.Admin.Sales.MediaSalePanel;

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
//        Test test = new Test(new CartPanel(new User()));
        Media md = new Book();
        md.setValue(100000);
        
//        media.setCategory("Book");
        md.setTitle("Conan tapj 47");
        PhysicalGood media = (PhysicalGood) md;
        media.setQuantity(10);
        List<Media> medias = new ArrayList<Media>();
        medias.add(media);
        medias.add(media);
        medias.add(media);
        medias.add(media);
        medias.add(media);
        medias.add(media);
        medias.add(media);
        Test test = new Test(new MediaSalePanel(medias));
    }
}
