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
public abstract class Media {
    private int id;
    private String title;
    private int value;
    private int price;
    private int sale_percent;
    private int category_id;
    
    public Media() {
        title = "";
        price = 0;
        value = 0;
        sale_percent = 0;
        category_id = 0;
    }
    
    public Media(String title, int value, int price, int category) {
        this.title = title;
        this.value = value;
        this.price = price;
        this.sale_percent = 0;
        this.category_id = category;
    }

    public Media(String title, int value, int price, int sale_percent, int category) {
        this.title = title;
        this.value = value;
        this.price = price;
        this.sale_percent = sale_percent;
        this.category_id = category;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalePercent() {
        return sale_percent;
    }

    public void setSalePercent(int sale_percent) {
        this.sale_percent = sale_percent;
    }

    public int getCategoryId() {
        return category_id;
    }

    public void setCategory(int category_id) {
        this.category_id = category_id;
    }
}
