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
    private int value;

    public Media() {
        title = "";
        value = 0;
        price = 0;
    }
    
    public Media(int value, String title, int price) {
        this.media_id = media_id;
        this.title = title;
        this.value = value;
        setPrice(price);
    }
    
    public int getMediaId() {
        return media_id;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setPrice(int price) {
        int value = getValue();
        int min = (int)(value * 0.3);
        int max = (int)(value * 1.5);
        if (price < min) {
            this.price = min;
        } else if (price > max) {
            this.price = max;
        } else {
            this.price = price;
        }
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
