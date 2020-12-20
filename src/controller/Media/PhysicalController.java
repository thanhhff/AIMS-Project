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
    
    public static void deletePhysical(int media_id) {
        PhysicalGood.deleteMedia(media_id);
    }
}
