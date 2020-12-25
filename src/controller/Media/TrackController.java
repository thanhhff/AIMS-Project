/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;

import model.Media.Track;

/**
 *
 * @author Toshiba T75
 */
public class TrackController {
    public static String getTrackNameFromDB(int track_id) {
        return Track.getTrackNameFromDB(track_id);
    }
    
    public static boolean checkDuplicateTrackName(String track_name) {
        return Track.checkDuplicateTrackName(track_name);
    }
}
