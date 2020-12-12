/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Cart;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hsnt
 */
public class ShippingInfo {
    private String name;
    private String phone;
    private String delivery_instruction;
    private int user_id;
    private int shipping_info_id;
    private Ward ward;
    private String note;

    public ShippingInfo(int shipping_info_id) {
        this.shipping_info_id = shipping_info_id;
        try {
            ResultSet rs = ConnectSQL.sqlQuery("select * from ShippingInfos where shipping_info_id = " + this.shipping_info_id);
            while (rs.next()) {
                this.ward = new Ward(Integer.parseInt(rs.getString("ward_id")));
                this.name = rs.getString("name");
                this.phone = rs.getString("phone");
                this.user_id = Integer.parseInt(rs.getString("user_id"));
                this.delivery_instruction = rs.getString("delivery_instruction");
            }
        } catch (SQLException ex) {
            
        }
    }

    public void setDelivery_instruction(String delivery_instruction) {
        this.delivery_instruction = delivery_instruction;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
    
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDelivery_instruction() {
        return delivery_instruction;
    }

    public int getUser_id() {
        return user_id;
    }

    public Ward getWardObject() {
        return ward;
    }
    
    public void update(){
        
    }
}
