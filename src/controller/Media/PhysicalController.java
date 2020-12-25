/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;

import model.Media.PhysicalGood;

/**
 *
 * @author Toshiba T75
 */
public class PhysicalController {
    public static int insertPhysical(String description, int quantity, String input_day, int media_id, int width, int height, int depth, int weight, String barcode) {
        return PhysicalGood.insertPhysical(description, quantity, input_day, media_id, width, height, depth, weight, barcode);
    }
    
    public static String getDescriptionFromDB(int media_id) {
        return PhysicalGood.getDescriptionFromDB(media_id);
    }
    
    public static int getQuantityFromDB(int media_id) {
        return PhysicalGood.getQuantityFromDB(media_id);
    }
    
    public static int getWidthFromDB(int media_id) {
        return PhysicalGood.getWidthFromDB(media_id);
    }
    
    public static int getHeightFromDB(int media_id) {
        return PhysicalGood.getHeightFromDB(media_id);
    }
    
    public static int getDepthFromDB(int media_id) {
        return PhysicalGood.getDepthFromDB(media_id);
    }
    
    public static int getWeightFromDB(int media_id) {
        return PhysicalGood.getWeightFromDB(media_id);
    }
    
    public static String getBarCodeFromDB(int media_id) {
        return PhysicalGood.getBarCodeFromDB(media_id);
    }
    
    public static String getInputDayFromDB(int media_id) {
        return PhysicalGood.getInputDayFromDB(media_id);
    }
}
