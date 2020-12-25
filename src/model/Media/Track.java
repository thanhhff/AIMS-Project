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
public class Track {
    private int track_id;
    private String track_name;
    
    public Track(String track_name) {
        this.track_name = track_name;
    }
    
    public Track(int track_id, String track_name) {
        this.track_id = track_id;
        this.track_name = track_name;
    }
    
    public void setTrackId(int id) {
        this.track_id = id;
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
    
    public static ArrayList<Track> getAllTrack() {
        ArrayList<Track> tracks = new ArrayList<Track>();
        String select_query = "SELECT * FROM tracks;";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            while (rs.next()) {
                int track_id = rs.getInt(1);
                String track_name = rs.getString(2);
                Track track = new Track(track_id, track_name);
                tracks.add(track);
            }
            
            return tracks;
        } catch (Exception e) {
            return tracks;
        }
    }
    
    public static String getTrackNameFromDB(int track_id) {
        String select_query = "SELECT track_name FROM tracks WHERE track_id = " + track_id + ";";
        try {
            ResultSet rs = ConnectSQL.sqlQuery(select_query);
            String track_name = "";
            if (rs.next()) {
                track_name = rs.getString(1);
            }
            return track_name;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static boolean checkDuplicateTrackName(String track_name) {
        ArrayList<Track> tracks = Track.getAllTrack();
        boolean result = false;
        for (Track track: tracks) {
            if (track.getTrackName() == track_name) {
                result = true;
                break;
            }
        }
        return result;
    }
}
