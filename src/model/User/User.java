/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.User;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cart.ShippingInfo;

/**
 *
 * @author hsnt
 */
public class User {
    private int user_id;
    
    public User() {
        this.user_id = 1;
    }
    public List<ShippingInfo>  getShippingList(){
        try {
            List<ShippingInfo> shippingInfos = new ArrayList<ShippingInfo>();            
            ResultSet rs = ConnectSQL.sqlQuery("select * from ShippingInfos where user_id = " + user_id);
            while(rs.next()){                
                int tmp = Integer.parseInt(rs.getString("shipping_info_id"));
                ShippingInfo shippingInfo = new ShippingInfo(tmp);
                shippingInfos.add(shippingInfo);
            }
            return shippingInfos;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
