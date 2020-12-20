/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Sale;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Media.Media;

/**
 *
 * @author hsnt
 */
public class Sale {
    private int sale_id;
    private String start_day;
    private String end_day;
    public  Sale(String start_day, String end_day, List<MediaSale> mediaSales){
        this.start_day = start_day;
        this.end_day = end_day;
        save();
        this.sale_id = getID();
        for(MediaSale mediaSale : mediaSales){
            mediaSale.setSale_id(sale_id);
            mediaSale.save();
        }  
    }
    public void save(){
        ConnectSQL.sqlQueryUpdate("insert into Sales "
                + "(`start_day`,`end_day`) "
                + "values('"+ start_day+ "','"+ end_day+ "')");
    }
    private int getID(){
        try {
            ResultSet rs = ConnectSQL.sqlQuery("select * from Sales order by sale_id desc");
            while(rs.next()){
                return Integer.parseInt(rs.getString("sale_id"));
            }
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }
}
