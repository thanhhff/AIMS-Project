/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Cart;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Media.Media;

/**
 *
 * @author hsnt
 */
public class CartItem {
    private int media_id;
    private int quantity;
    private int price;
    private int user_id;
    
    public CartItem(int media_id,int quantily, int price,int user_id) {
        this.media_id = media_id;
        this.price = price;
        this.quantity = quantily;
        this.user_id = user_id;
    }    
    public String getMediaName(){
        try {
            ResultSet rs = ConnectSQL.sqlQuery("select * from Medias where media_id = " + this.media_id);
            while(rs.next()){
                return rs.getString("title");
            }
            return null;
        } catch (SQLException e) {
            return null;
        }        
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
    public void update(int quantily){
        this.quantity = quantily;
        ConnectSQL.sqlQueryUpdate("update CartItems set quantity = " + this.quantity + " where user_id = " + user_id + " and media_id = " + media_id);
    }
}
