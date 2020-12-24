/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;

import java.util.ArrayList;
import model.Media.DVD;

/**
 *
 * @author Toshiba T75
 */
public class DVDController {
    public static ArrayList<DVD> getAllDVD() {
        return DVD.getAllDVD();
    }
    
    public static void insertDVD(DVD dvd) {
        int mediaResult = MediaController.insertMedia(dvd.getTitle(), dvd.getValue(), dvd.getPrice(), 0, dvd.getCategoryId(), dvd.getImagePath());
        int physicalResult = PhysicalController.insertPhysical(dvd.getDescription(), dvd.getQuantity(), dvd.getInputDay(), dvd.getId(), dvd.getWidth(), dvd.getHeight(), dvd.getDepth(), dvd.getWeight(), dvd.getBarcode());
        int dvdResult = dvd.insertDVD();
    }
    
    public static String getPublicationDateFromDB(int media_id) {
        return DVD.getPublicationDateFromDB(media_id);
    }
    
    public static String getSubtitleFromDB(int media_id) {
        return DVD.getSubtitleFromDB(media_id);
    }
    
    public static String getStudioNameFromDB(int media_id) {
        return DVD.getStudioNameFromDB(media_id);
    }
    
    public static String getWriterNameFromDB(int media_id) {
        return DVD.getWriterNameFromDB(media_id);
    }
    
    public static int getRuntimeFromDB(int media_id) {
        return DVD.getRuntimeFromDB(media_id);
    }
    
    public static int getLanguageIdFromDB(int media_id) {
        return DVD.getLanguageIdFromDB(media_id);
    }
    
    public static int getDvdTypeIdFromDB(int media_id) {
        return DVD.getDvdTypeIdFromDB(media_id);
    }
}
