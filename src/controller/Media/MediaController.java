/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;
import model.Media.Media;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Toshiba T75
 */
public class MediaController {
    public static int getNumberOfMedia() {
        return Media.getNumberOfMedia();
    }
    
    public static int getMaxID() {
        return Media.getMaxID();
    }
    
    public static void insert(Media media) {
        media.insert();
    }
    
    public static void deleteMedia(int media_id) {
        Media.deleteMedia(media_id);
    }
    
    public static void update(Media media) {
        media.update();
    }
    
    public static ArrayList<Media> getAllMedia() {
        return Media.getAllMedia();
    }

//     public static void sortLowMediaPrice(ArrayList<Media> list)
//     {
//       int i, j;
//            for (i = (list.size()-1); i >= 0; i--) {
//                for (j = 1; j <= i; j++){
//                    if (list.get(j-1).getPrice() > list.get(j).getPrice())
//                    {   
//                        Media media = new Media() {};
//                        media.updateMedia(list.get(j));
//                        list.get(j).updateMedia( list.get(j-1));
//                        list.get(j-1).updateMedia(media);
//                    }
//                }
//            }
//     }
//      public static void sortHighMediaPrice(ArrayList<Media> list)
//     {
//       int i, j;
//            for (i = (list.size()-1); i >= 0; i--) {
//                for (j = 1; j <= i; j++){
//                    if (list.get(j-1).getPrice() < list.get(j).getPrice())
//                    {   
//                        Media media = new Media() {};
//                        media.updateMedia(list.get(j));
//                        list.get(j).updateMedia( list.get(j-1));
//                        list.get(j-1).updateMedia(media);
//                    }
//                }
//            }
//     }
}
