package model.Cart;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hsnt
 */
public class Ward {
    private int ward_id;

    public Ward(int ward_id) {
        this.ward_id = ward_id;
    }
    public String getWard() {
        try {
            ResultSet rs = ConnectSQL.sqlQuery("select * from Wards where ward_id = " + ward_id);
            while (rs.next()) {
                return rs.getString("ward_name");
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
    public String getDistrict() {
        try {
            ResultSet rs = ConnectSQL.sqlQuery("select * from Wards join Districts using (district_id) where ward_id = " + ward_id);
            while (rs.next()) {
                return rs.getString("district_name");
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
    public String getProvince(){
        try {
            ResultSet rs = ConnectSQL.sqlQuery("select * from Wards join Districts using (district_id) join Provinces using (province_id) where ward_id = " + ward_id);
            while (rs.next()) {
                return rs.getString("province_name");
            }
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
}
