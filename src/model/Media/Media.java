/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Media;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hsnt
 */
public abstract class Media {
    private int id;
    private String title;
    private int value;
    private int price;
    private int sale_percent;
    private int category_id;
    private String image_path;
    
    public Media() {
        title = "";
        price = 0;
        value = 0;
        sale_percent = 0;
        category_id = 0;
        image_path = "";
    }
    
    public Media(int id, String title, int value, int price, int category, String image_path) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.price = price;
        this.sale_percent = 0;
        this.category_id = category;
        this.image_path = image_path;
    }
    
//    (title, value, price, sale_percent, category, image_path)
    public Media(String title, int value, int price, int sale_percent, int category, String image_path) {
        this.title = title;
        this.value = value;
        this.price = price;
        this.sale_percent = 0;
        this.category_id = category;
        this.image_path = image_path;
    }
    
     public Media(int id, String title, int value, int price, int category) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.price = price;
        this.sale_percent = 0;
        this.category_id = category;
    }
    public Media(int id, String title, int value, int price, int sale_percent, int category, String image_path) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.price = price;
        this.sale_percent = sale_percent;
        this.category_id = category;
        this.image_path = image_path;
    }
    public void updateMedia(Media media)
    {
        this.id = media.getId();
        this.title = media.getTitle();
        this.value = media.getValue();
        this.price = media.getPrice();
        this.sale_percent = media.getSalePercent();
        this.category_id = media.getCategoryId();
    }
    public static String getTitlebyID(int media_id){
        ResultSet rs = ConnectSQL.sqlQuery("Select * from Medias where media_id = " + media_id);
        try {
            while(rs.next()){
                return rs.getString("title");
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
    public int getId() {
        return id;
    }
     public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalePercent() {
        return sale_percent;
    }

    public void setSalePercent(int sale_percent) {
        this.sale_percent = sale_percent;
    }

    public int getCategoryId() {
        return category_id;
    }

    public void setCategory(int category_id) {
        this.category_id = category_id;
    }
    
    public String getImagePath() {
        return image_path;
    }
    
    public void setImagePath(String image_path) {
        this.image_path = image_path;
    }
    
    public static int getNumberOfMedia() {
        try {
            int result = 0;
            String query = "SELECT COUNT(*) FROM `Medias`;";
            ResultSet rs = ConnectSQL.sqlQuery(query);

            if (rs.next()) {
                result = rs.getInt(1);
            }

            return result;
        } catch (Exception e) {
            return 0;
        }
        
    }
    
    public static int getMaxID() {
        try {
            int result = 0;
            String query = "SELECT MAX(media_id) FROM `Medias`;";
            ResultSet rs = ConnectSQL.sqlQuery(query);
            
            if (rs.next()) {
                result = rs.getInt(1);
            }
            return result;
        } catch (Exception e) {
            return 0;
        }
    }
    
    protected int insertMedia() {
        String media_query = "INSERT INTO `Medias` (title, value, price, sale_percent, category_id, image_path) VALUES ('" + title + "', " + value + ", " + price + ", " + sale_percent
                                + ", " + category_id + ", '" + image_path + "');";
        
        try {
            int result = ConnectSQL.sqlUpdate(media_query);
            return getMaxID();
        } catch (Exception e) {
            return -1;
        }
    }
    
    public abstract void insert();
    
    public static void deleteMedia(int media_id) {
        String delete_query = "DELETE FROM `Medias` WHERE media_id = " + media_id + ";";
        try {
            ConnectSQL.sqlQueryUpdate(delete_query);
        } catch (Exception e) {
            
        }
    }
}
