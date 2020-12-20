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
}
