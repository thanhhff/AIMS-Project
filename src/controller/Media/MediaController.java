/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;
import model.Media.Media;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import db.ConnectSQL;


/**
 *
 * @author Toshiba T75
 */
public class MediaController {
    public static int getNumberOfMedia() throws SQLException {
        int result = 0;
        String query = "SELECT COUNT(*) FROM `medias`;";
        ResultSet rs = ConnectSQL.sqlQuery(query);
        
        while (rs.next()) {
            result = rs.getInt(1);
        }
        
        return result;
    }
    
    public static int createMedia(Media media) {
        String title = media.getTitle();
        int value = media.getValue();
        int price = media.getPrice();
        int category_id = media.getCategoryId();
        String image_path = media.getImagePath();
        int sale_percent = media.getSalePercent();
        String media_query = "INSERT INTO `medias` (title, value, price, category_id, image_path) VALUES ('" + title + "', " + value + ", " + price + ", " + sale_percent
                                + ", " + category_id + ", '" + image_path + "';";
        
        return ConnectSQL.sqlUpdate(media_query);
    }
}
