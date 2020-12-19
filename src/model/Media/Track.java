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
public class Track {
    private int track_id;
    private String track_name;
    
    public Track(String track_name) {
        this.track_name = track_name;
    }
    
    public int getTrackId() {
        return track_id;
    }
    
    public String getTrackName() {
        return track_name;
    }
    
    public void setTrackName(String track_name) {
        this.track_name = track_name;
    }
}
