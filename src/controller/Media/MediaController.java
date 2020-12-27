/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;
import model.Media.*;
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

     public static ArrayList<Media> sortLowMediaPrice(ArrayList<Media> list)
     {
       ArrayList<Integer> indexes = new ArrayList<Integer>();
       for (int i = 0; i < list.size(); i++) {
           indexes.add(i);
       }
       ArrayList<Media> results = new ArrayList<Media>();
       for (int i = 0; i < list.size()-1; i++) {
           for (int j = i+1; j < list.size(); j++) {
               if (list.get(j).getPrice() < list.get(i).getPrice()) {
                   int tmp = indexes.get(i);
                   indexes.set(i, indexes.get(j));
                   indexes.set(j, tmp);
               }
           }
       }
       
       for (int i = 0; i < indexes.size(); i++) {
           results.add(list.get(indexes.get(i)));
       }
       
       return results;
     }
      public static ArrayList<Media> sortHighMediaPrice(ArrayList<Media> list)
     {
       ArrayList<Integer> indexes = new ArrayList<Integer>();
       for (int i = 0; i < list.size(); i++) {
           indexes.add(i);
       }
       ArrayList<Media> results = new ArrayList<Media>();
       for (int i = 0; i < list.size()-1; i++) {
           for (int j = i+1; j < list.size(); j++) {
               if (list.get(j).getPrice() > list.get(i).getPrice()) {
                   int tmp = indexes.get(i);
                   indexes.set(i, indexes.get(j));
                   indexes.set(j, tmp);
               }
           }
       }
       
       for (int i = 0; i < indexes.size(); i++) {
           results.add(list.get(indexes.get(i)));
       }
       
       return results;
     }
}
