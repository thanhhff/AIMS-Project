/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.User;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hsnt
 */
public class User {
    private int user_id;
    
    public User() {
        this.user_id = 1;
    }
    public int [] getShippingList(){
        try {
            int[] tmp = new int[10];
            int index = 0;
            ResultSet rs = ConnectSQL.sqlQuery("select * from ShippingInfos where user_id = " + user_id);
            while(rs.next()){
                tmp[index++] = Integer.parseInt(rs.getString("shipping_info_id"));
            }
            int[] result = new int[index];
            for(int i = 0 ; i < index; i++){
                result[i] = tmp[i];
            }
            return result;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
