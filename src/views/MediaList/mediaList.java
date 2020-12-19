/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.MediaList;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import model.Media.Media;

/**
 *
 * @author User
 */
public class mediaList extends JPanel{
       JPanel mediaList;
      public  mediaList(ArrayList<Media> listMedia) {
         setLayout(new GridLayout(5,4));
         mediaList = new JPanel(new GridLayout(5,4));
         add(new JScrollPane(mediaList));
        ArrayList<mediaItem> listItemPanel = new ArrayList<mediaItem>();
        for(int i = 0 ; i < listMedia.size(); i++)
        {
            mediaItem mediaItem = new mediaItem(listMedia.get(i));
            listItemPanel.add(mediaItem);
        }  
        for(int i = 0 ; i < listItemPanel.size(); i++)
        {
            mediaList.add(listItemPanel.get(i));

        }
    }
 
   
}
