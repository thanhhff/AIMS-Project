/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Media;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Toshiba T75
 */
public class DVD extends PhysicalGood {
    private String publication_date;
    private int runtime;
    private String subtitle;
    private int language_id;
    private String studio_name;
    private int dvd_type_id;
    private String writer_name;
    
    public DVD() {
        
    }
    
    public DVD(int id, String title, int value, int price, int sale_percent, int category, String image_path, String barcode, String description, int quantity, String date, int width, int height, int depth, int weight, int type, String director, int runtime, String studio, int language, String subtitle, String publication_date) {
        super(id, title, value, price, sale_percent, category, image_path, barcode, description, quantity, date, width, height, depth, weight);
        this.dvd_type_id = type;
        this.writer_name = director;
        this.runtime = runtime;
        this.studio_name = studio;
        this.language_id = language;
        this.subtitle = subtitle;
        this.publication_date = publication_date;
    }
    
    public String getPublicationDate() {
        return publication_date;
    }
    
    public void setPublicationDate(String date) {
        this.publication_date = date;
    }
    
    public int getRunTime() {
        return runtime;
    }
    
    public void setRunTime(int runtime) {
        this.runtime = runtime;
    }
    
    public String getSubtitle() {
        return subtitle;
    }
    
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    
    public int getLanguageId() {
        return language_id;
    }
    
    public void setLanguageId(int language) {
        this.language_id = language;
    }
    
    public String getStudioName(){ 
        return studio_name;
    }
    
    public void setStudioName(String studio_name) {
        this.studio_name = studio_name;
    }
    
    public int getDvdTypeId() {
        return dvd_type_id;
    }
    
    public void setDvdTypeID(int type) {
        this.dvd_type_id = type;
    }
    
    public String getWriterName() {
        return writer_name;
    }
    
    public void setWriterName(String writer_name) {
        this.writer_name = writer_name;
    }
    
    public static ArrayList<DVD> getAllDVD() {
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        String query = "SELECT `Medias`.title, `Medias`.value, `Medias`.price, `Medias`.category_id, `Medias`.image_path, `Physicalgoods`.*, `Dvds`.* FROM `Dvds` LEFT JOIN `Physicalgoods` ON `Dvds`.media_id = `Physicalgoods`.media_id LEFT JOIN `Medias` ON `Physicalgoods`.media_id = `Medias`.media_id;";
        
        try {
            ResultSet rs = ConnectSQL.sqlQuery(query);
        
            while (rs.next()) {
                String title = rs.getString(1);
                int value = rs.getInt(2);
                int price = rs.getInt(3);
                int category_id = rs.getInt(4);
                String image_path = rs.getString(5);
                String description = rs.getString(6);
                int quantity = rs.getInt(7);
                String input_day = rs.getString(9);
                int media_id = rs.getInt(10);
                int width = rs.getInt(11);
                int height = rs.getInt(12);
                int depth = rs.getInt(13);
                int weight = rs.getInt(14);
                String barcode = rs.getString(15);
                String publication_date = rs.getString(16);
                int runtime = rs.getInt(17);
                String subtitle = rs.getString(18);
                int language_id = rs.getInt(20);
                String studio_name = rs.getString(21);
                int dvd_type_id = rs.getInt(22);
                String writer_name = rs.getString(24);

                int sale_percent = 0;
                DVD dvd = new DVD(media_id, title, value, price, sale_percent, category_id, image_path, barcode, description, quantity, input_day, width, height, depth, weight, dvd_type_id, writer_name, runtime, studio_name, language_id, subtitle, publication_date);
                dvds.add(dvd);
            }
            return dvds;
        } catch (Exception e) {
            return dvds;
        }
    }
    
    public int insertDVD() {
        String dvd_query = "INSERT INTO `Dvds` (publication_date, runtime, subtitle, media_id, language_id, studio_name, dvd_type_id, writer_name) VALUES ('" + 
                publication_date + "', " + runtime + ", '" + subtitle + "', " + this.getId() + ", " + language_id + ", '" + studio_name + "', " + dvd_type_id + ", '" + writer_name + "');";
        try {
            return ConnectSQL.sqlUpdate(dvd_query);
        } catch (Exception e) {
            return 0;
        }
    }
    
    public static String getPublicationDateFromDB(int media_id) {
        ArrayList<DVD> dvds = DVD.getAllDVD();
        for (DVD dvd: dvds) {
            if (dvd.getId() == media_id) {
                return dvd.getPublicationDate();
            }
        }
        return null;
    }
    
    public static String getSubtitleFromDB(int media_id) {
        ArrayList<DVD> dvds = DVD.getAllDVD();
        for (DVD dvd: dvds) {
            if (dvd.getId() == media_id) {
                return dvd.getSubtitle();
            }
        }
        return null;
    }
    
    public static String getStudioNameFromDB(int media_id) {
        ArrayList<DVD> dvds = DVD.getAllDVD();
        for (DVD dvd: dvds) {
            if (dvd.getId() == media_id) {
                return dvd.getStudioName();
            }
        }
        return null;
    }
    
    public static String getWriterNameFromDB(int media_id) {
        ArrayList<DVD> dvds = DVD.getAllDVD();
        for (DVD dvd: dvds) {
            if (dvd.getId() == media_id) {
                return dvd.getWriterName();
            }
        }
        return null;
    }
    
    public static int getRuntimeFromDB(int media_id) {
        ArrayList<DVD> dvds = DVD.getAllDVD();
        for (DVD dvd: dvds) {
            if (dvd.getId() == media_id) {
                return dvd.getRunTime();
            }
        }
        return -1;
    }
    
    public static int getLanguageIdFromDB(int media_id) {
        ArrayList<DVD> dvds = DVD.getAllDVD();
        for (DVD dvd: dvds) {
            if (dvd.getId() == media_id) {
                return dvd.getLanguageId();
            }
        }
        return -1;
    }
    
    public static int getDvdTypeIdFromDB(int media_id) {
        ArrayList<DVD> dvds = DVD.getAllDVD();
        for (DVD dvd: dvds) {
            if (dvd.getId() == media_id) {
                return dvd.getDvdTypeId();
            }
        }
        return -1;
    }
}
