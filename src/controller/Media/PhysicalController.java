/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;

import db.ConnectSQL;
import model.Media.PhysicalGood;

/**
 *
 * @author Toshiba T75
 */
public class PhysicalController {
    public static int createPhysical(PhysicalGood media) {
        String description = media.getDescription();
        int quantity = media.getQuantity();
        int media_id = media.getId();
        int width = media.getWidth();
        int height = media.getHeight();
        int depth = media.getDepth();
        int weight = media.getWeight();
        String barcode = media.getBarcode();
        String input_day = media.getInputDay();
        
        String physical_query = "INSERT INTO `physicalgoods` (description, quantity, input_day, media_id, width, height, depth, weight, barcode) VALUES ('" +
                    description + "', " + quantity + ", '" + input_day + "', " + media_id + ", " + width + ", " + height + ", " + depth + ", " + weight + ", '" + barcode + "');";
        
        return ConnectSQL.sqlUpdate(physical_query);
    }
}
