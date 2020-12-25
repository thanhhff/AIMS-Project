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
public class CD extends PhysicalGood {
    private String artist_name;
    private String record_label_name;
    private String publication_date;
    private String genre;
    private ArrayList<Track> track_list;
    
    public CD() {
        
    }
    
    public CD(int id, String title, int value, int price, int sale_percent, int category, String image_path, String barcode, String description, int quantity, String date, int width, int height, int depth, int weight, String artist, String record_label, String publication_date, String genre) {
        super(id, title, value, price, sale_percent, category, image_path, barcode, description, quantity, date, width, height, depth, weight);
        this.artist_name = artist;
        this.record_label_name = record_label;
        this.publication_date = publication_date;
        this.genre = genre;
        this.track_list =  new ArrayList<>();
    }
    
    public String getArtistName() {
        return artist_name;
    }
    
    public void setArtistName(String artist) {
        this.artist_name = artist;
    }
    
    public String getRecordLabelName() {
        return record_label_name;
    }
    
    public void setRecordLabelName(String record) {
        this.record_label_name = record;
    }
    
    public String getPublicationDate() {
        return publication_date;
    }
    
    public void setPublicationDate(String date) {
        this.publication_date = date;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public ArrayList<Track> getTrackList() {
        return track_list;
    }
    
    public void setTrackList(ArrayList<Track> track_list) {
        this.track_list = track_list;
    }
    
    public void addTrack(Track track) {
        this.track_list.add(track);
    }
    
    public void removeTrackList() {
        this.track_list = new ArrayList<>();
    }
    
    public void insert() {
        
    }
}
