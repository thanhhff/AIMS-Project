/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Search;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Media.Media;


/**
 *
 * @author User
 */
public class SearchController {
    public static void SearchRandom(ArrayList<Media> list)
    {   
        
        String sql;
        sql = "SELECT* FROM Medias ORDER BY media_id DESC LIMIT 0,20";
         try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            
            while (rs.next()) {
                Media media = new Media(){};
                media.setTitle(rs.getString(2));
                media.setPrice(rs.getInt(4));
                media.setValue(rs.getInt(3));
                media.setCategory(rs.getInt(5));
                media.setId(rs.getInt(1));
                list.add(media);
            }
           
        } catch (SQLException ex) {
        }
    
     }
     public static void SearchBook(ArrayList<Media> list)
     {
        String sql;
        sql = "SELECT* FROM medias Join books Where medias.media_id = books.media_id"; 
         try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            
            while (rs.next()) {
                Media media = new Media(){};
                media.setTitle(rs.getString(2));
                media.setPrice(rs.getInt(4));
                media.setValue(rs.getInt(3));
                media.setCategory(rs.getInt(5));
                media.setId(rs.getInt(1));
                list.add(media);
            }
           
        } catch (SQLException ex) {
        }
     }

    public static void SearchCd(ArrayList<Media> list) {
         String sql;
        sql = "SELECT* FROM medias Join cds Where medias.media_id = cds.media_id"; 
         try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            
            while (rs.next()) {
                Media media = new Media(){};
                media.setTitle(rs.getString(2));
                media.setPrice(rs.getInt(4));
                media.setValue(rs.getInt(3));
                media.setCategory(rs.getInt(5));
                media.setId(rs.getInt(1));
                list.add(media);
            }
           
        } catch (SQLException ex) {
        }
    }

    public static void SearchDvd(ArrayList<Media> list) {
         String sql;
        sql = "SELECT* FROM medias Join dvds Where medias.media_id = dvds.media_id"; 
         try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            
            while (rs.next()) {
                Media media = new Media(){};
                media.setTitle(rs.getString(2));
                media.setPrice(rs.getInt(4));
                media.setValue(rs.getInt(3));
                media.setCategory(rs.getInt(5));
                media.setId(rs.getInt(1));
                list.add(media);
            }
           
        } catch (SQLException ex) {
        }
    }

    public static void SearchLp(ArrayList<Media> list) {
         String sql;
        sql = "SELECT* FROM medias Join lps Where medias.media_id = lps.media_id"; 
         try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            
            while (rs.next()) {
                Media media = new Media(){};
                media.setTitle(rs.getString(2));
                media.setPrice(rs.getInt(4));
                media.setValue(rs.getInt(3));
                media.setCategory(rs.getInt(5));
                media.setId(rs.getInt(1));
                list.add(media);
            }
           
        } catch (SQLException ex) {
        }
    }
    public static void SearchUser(ArrayList<Media> list,String search) {
         String sql;
        sql = "SELECT* FROM medias  Where medias.title LIKE '%" + search + "%'";
        System.out.print(search);
         try {
            ResultSet rs = ConnectSQL.sqlQuery(sql);
            
            while (rs.next()) {
                Media media = new Media(){};
                media.setTitle(rs.getString(2));
                media.setPrice(rs.getInt(4));
                media.setValue(rs.getInt(3));
                media.setCategory(rs.getInt(5));
                media.setId(rs.getInt(1));
                list.add(media);
            }
           
        } catch (SQLException ex) {
        }
    }
}
