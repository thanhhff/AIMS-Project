/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Admin.Sales;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Media.Media;

/**
 *
 * @author hsnt
 */
public class MediaSaleList extends JPanel{
    
    public static int WIDTH = 700;
    public static int HEIGHT = 500;
    
    private JPanel mediaJPanel;

    public MediaSaleList(List<Media> medias) {
        setLayout(new GridLayout(1,0));
        mediaJPanel = new JPanel(new GridLayout(0,1));
        add(new JScrollPane(mediaJPanel));
        for(Media media : medias){
            MediaSaleItemPanel mediaSaleItemPanel = new MediaSaleItemPanel(media);
            this.addObj(mediaSaleItemPanel); 
        } 
        setSize(WIDTH,HEIGHT);
    }
    public void addObj(JPanel object){
        mediaJPanel.add(object);
    }
    
}
