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
public class PhysicalGood extends Media {
    private String barcode;
    private String description;
    private int quantity;
    private String date;
    private int width;
    private int height;
    private int depth;

    public PhysicalGood(String title, int value, int price, int unit_sale, String category, String barcode, String description, int quantity, String date, int width, int height, int depth) {
        super(title, value, price, unit_sale, category);
        this.barcode = barcode;
        this.description = description;
        this.quantity = quantity;
        this.date = date;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

}
