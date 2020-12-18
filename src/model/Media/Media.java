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
    private int id;
    private String title;
    private int value;
    private int price;
    private int sale_percent;
    private String category;
    
    public Media() {
        title = "";
        price = 0;
        value = 0;
        sale_percent = 0;
        category = "";
    }

    public Media(String title, int value, int price, int unit_sale, String category) {
        this.title = title;
        this.value = value;
        setPrice(price);
        this.sale_percent = sale_percent;
        this.category = category;
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

    public int getSalePercent() {
        return sale_percent;
    }

    public void setSalePercent(int sale_percent) {
        this.sale_percent = sale_percent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
