/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;
import model.Media.Media;
import java.util.ArrayList;


/**
 *
 * @author Toshiba T75
 */
public class MediaController {
    public static int getNumberOfMedia() {
        return Media.getNumberOfMedia();
    }
    
    public static int insertMedia(String title, int value, int price, int sale_percent, int category_id, String image_path) {
        return Media.insertMedia(title, value, price, sale_percent, category_id, image_path);
    }

     public static void sortLowMediaPrice(ArrayList<Media> list)
     {
       int i, j;
            for (i = (list.size()-1); i >= 0; i--) {
                for (j = 1; j <= i; j++){
                    if (list.get(j-1).getPrice() > list.get(j).getPrice())
                    {   
                        Media media = new Media() {};
                        media.updateMedia(list.get(j));
                        list.get(j).updateMedia( list.get(j-1));
                        list.get(j-1).updateMedia(media);
                    }
                }
            }
     }
      public static void sortHighMediaPrice(ArrayList<Media> list)
     {
       int i, j;
            for (i = (list.size()-1); i >= 0; i--) {
                for (j = 1; j <= i; j++){
                    if (list.get(j-1).getPrice() < list.get(j).getPrice())
                    {   
                        Media media = new Media() {};
                        media.updateMedia(list.get(j));
                        list.get(j).updateMedia( list.get(j-1));
                        list.get(j-1).updateMedia(media);
                    }
                }
            }
     }
}
