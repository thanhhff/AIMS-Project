/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Media;

import db.ConnectSQL;

/**
 *
 * @author Toshiba T75
 */
public abstract class PhysicalGood extends Media {
    private String barcode;
    private String description;
    private int quantity;
    private String input_day;
    private int width;
    private int height;
    private int depth;
    private int weight;
    
    public PhysicalGood() {
        super();
    }

    public PhysicalGood(int id, String title, int value, int price, int sale_percent, int category, String image_path, String barcode, String description, int quantity, String input_day, int width, int height, int depth, int weight) {
        super(id, title, value, price, sale_percent, category, image_path);
        this.barcode = barcode;
        this.description = description;
        this.quantity = quantity;
        this.input_day = input_day;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInputDay() {
        return input_day;
    }

    public void setInputDay(String input_day) {
        this.input_day = input_day;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public static int insertPhysical(String description, int quantity, String input_day, int media_id, int width, int height, int depth, int weight, String barcode) {
        
        
        String physical_query = "INSERT INTO `Physicalgoods` (description, quantity, input_day, media_id, width, height, depth, weight, barcode) VALUES ('" +
                    description + "', " + quantity + ", '" + input_day + "', " + media_id + ", " + width + ", " + height + ", " + depth + ", " + weight + ", '" + barcode + "');";
        
        try {
            int result = ConnectSQL.sqlUpdate(physical_query);
            return result;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public static void deletePhysical(int media_id) {
        String delete_query = "DELETE FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ConnectSQL.sqlQueryUpdate(delete_query);
        } catch(Exception e) {
            
        }
    }
}
