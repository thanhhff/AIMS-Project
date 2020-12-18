/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Media;

/**
 *
 * @author hsnt
 */
public class Media {
    private int media_id;
    private String title;
    private int price;

    public Media() {
        title = "";
        price = 0;
    }
    
    public Media(int media_id, String title, int price) {
        this.media_id = media_id;
        this.title = title;
        this.price = price;
    }
    
    public Media(String title, int price) {
        this.title = title;
        this.price = price;
    }
    
    public int getMediaId() {
        return media_id;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
}
