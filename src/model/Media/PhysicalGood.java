/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Media;

import db.ConnectSQL;
import java.sql.ResultSet;

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
    
    public PhysicalGood(String title, int value, int price, int sale_percent, int category, String image_path, String barcode, String description, int quantity, String input_day, int width, int height, int depth, int weight) {
        super(title, value, price, sale_percent, category, image_path);
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
    
    protected void insertPhysical() {
        this.setId(this.insertMedia());
        
        String physical_query = "INSERT INTO `Physicalgoods` (description, quantity, input_day, media_id, width, height, depth, weight, barcode) VALUES ('" +
                    description + "', " + quantity + ", '" + input_day + "', " + this.getId() + ", " + width + ", " + height + ", " + depth + ", " + weight + ", '" + barcode + "');";
        
        try {
            ConnectSQL.sqlQueryUpdate(physical_query);
        } catch (Exception e) {
        }
    }
    
    public static String getDescriptionFromDB(int media_id) {
        String select_query = "SELECT description FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            String description = null;
            if (rs.next()){
                description = rs.getString(1);
            }
            return description;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static int getQuantityFromDB(int media_id) {
        String select_query = "SELECT quantity FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            int quantity = -1;
            if (rs.next()) {
                quantity = rs.getInt(1);
            }
            return quantity;
        } catch (Exception e) {
            return -1;
        }
    }
    
    public static int getWidthFromDB(int media_id) {
        String select_query = "SELECT width FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            int width = -1;
            if (rs.next()) {
                width = rs.getInt(1);
            }
            return width;
        } catch (Exception e) {
            return -1;
        }
    }
    
    public static int getHeightFromDB(int media_id) {
        String select_query = "SELECT height FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            int result = -1;
            if (rs.next()) {
                result = rs.getInt(1);
            }
            return result;
        } catch (Exception e) {
            return -1;
        }
    }
    
    public static int getDepthFromDB(int media_id) {
        String select_query = "SELECT depth FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            int result = -1;
            if (rs.next()) {
                result = rs.getInt(1);
            }
            return result;
        } catch (Exception e) {
            return -1;
        }
    }
    
    public static int getWeightFromDB(int media_id) {
        String select_query = "SELECT weight FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            int result = -1;
            if (rs.next()) {
                result = rs.getInt(1);
            }
            return result;
        } catch (Exception e) {
            return -1;
        }
    }
    
    public static String getBarCodeFromDB(int media_id) {
        String select_query = "SELECT barcode FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            String barcode = null;
            if (rs.next()){
                barcode = rs.getString(1);
            }
            return barcode;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String getInputDayFromDB(int media_id) {
        String select_query = "SELECT input_day FROM `Physicalgoods` WHERE media_id = " + media_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            String input_day = null;
            if (rs.next()){
                input_day = rs.getString(1);
            }
            return input_day;
        } catch (Exception e) {
            return null;
        }
    }
    
}
