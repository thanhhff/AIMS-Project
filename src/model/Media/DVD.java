/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Media;

/**
 *
 * @author Toshiba T75
 */
public class DVD extends PhysicalGood {
    private String publication_date;
    private int runtime;
    private String subtitle;
    private String language;
    private String studio_name;
    private String dvd_type;
    private String writer_name;
    
    public DVD(String title, int value, int price, int sale_percent, int category, String barcode, String description, int quantity, String date, int width, int height, int depth, int weight, String type, String director, int runtime, String studio, String language, String subtitle, String publication_date) {
        super(title, value, price, sale_percent, category, barcode, description, quantity, date, width, height, depth, weight);
        this.dvd_type = type;
        this.writer_name = director;
        this.runtime = runtime;
        this.studio_name = studio;
        this.language = language;
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
    
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getStudioName(){ 
        return studio_name;
    }
    
    public void setStudioName(String studio_name) {
        this.studio_name = studio_name;
    }
    
    public String getDvdType() {
        return dvd_type;
    }
    
    public void setDvdType(String type) {
        this.dvd_type = type;
    }
    
    public String getWriterName() {
        return writer_name;
    }
    
    public void setWriterName(String writer_name) {
        this.writer_name = writer_name;
    }
}
