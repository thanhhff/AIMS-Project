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
public class Book extends PhysicalGood {
    private String author;
    private String cover_type;
    private String publisher;
    private String publication_date;
    private int page_number;
    private String language;
    private String genre;
    
    public Book(String title, int value, int price, int sale_percent, int category, String barcode, String description, int quantity, String input_day, int width, int height, int depth, int weight, String author, String cover_type, String publisher, String publication_date, int page_number, String language, String genre) {
        super(title, value, price, sale_percent, category, barcode, description, quantity, input_day, width, height, depth, weight);
        this.author = author;
        this.cover_type = cover_type;
        this.publisher = publisher;
        this.publication_date = publication_date;
        this.page_number = page_number;
        this.language = language;
        this.genre = genre;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverType() {
        return cover_type;
    }

    public void setCoverType(String cover) {
        this.cover_type = cover;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public int getPageNumber() {
        return page_number;
    }

    public void setPageNumber(int page_number) {
        this.page_number = page_number;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
